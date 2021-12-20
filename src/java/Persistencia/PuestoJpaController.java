/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import polo.logica.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import polo.logica.Puesto;

/**
 *
 * @author JuanPC
 */
public class PuestoJpaController implements Serializable {

    public PuestoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public PuestoJpaController() {
       
         emf=Persistence.createEntityManagerFactory("AgeciaDeTurismoPU");
    }

    public void create(Puesto puesto) {
        if (puesto.getListaEmpleados() == null) {
            puesto.setListaEmpleados(new ArrayList<Empleado>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Empleado> attachedListaEmpleados = new ArrayList<Empleado>();
            for (Empleado listaEmpleadosEmpleadoToAttach : puesto.getListaEmpleados()) {
                listaEmpleadosEmpleadoToAttach = em.getReference(listaEmpleadosEmpleadoToAttach.getClass(), listaEmpleadosEmpleadoToAttach.getIdEmpleado());
                attachedListaEmpleados.add(listaEmpleadosEmpleadoToAttach);
            }
            puesto.setListaEmpleados(attachedListaEmpleados);
            em.persist(puesto);
            for (Empleado listaEmpleadosEmpleado : puesto.getListaEmpleados()) {
                Puesto oldSuPuestoOfListaEmpleadosEmpleado = listaEmpleadosEmpleado.getSuPuesto();
                listaEmpleadosEmpleado.setSuPuesto(puesto);
                listaEmpleadosEmpleado = em.merge(listaEmpleadosEmpleado);
                if (oldSuPuestoOfListaEmpleadosEmpleado != null) {
                    oldSuPuestoOfListaEmpleadosEmpleado.getListaEmpleados().remove(listaEmpleadosEmpleado);
                    oldSuPuestoOfListaEmpleadosEmpleado = em.merge(oldSuPuestoOfListaEmpleadosEmpleado);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Puesto puesto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Puesto persistentPuesto = em.find(Puesto.class, puesto.getIdPuesto());
            List<Empleado> listaEmpleadosOld = persistentPuesto.getListaEmpleados();
            List<Empleado> listaEmpleadosNew = puesto.getListaEmpleados();
            List<Empleado> attachedListaEmpleadosNew = new ArrayList<Empleado>();
            for (Empleado listaEmpleadosNewEmpleadoToAttach : listaEmpleadosNew) {
                listaEmpleadosNewEmpleadoToAttach = em.getReference(listaEmpleadosNewEmpleadoToAttach.getClass(), listaEmpleadosNewEmpleadoToAttach.getIdEmpleado());
                attachedListaEmpleadosNew.add(listaEmpleadosNewEmpleadoToAttach);
            }
            listaEmpleadosNew = attachedListaEmpleadosNew;
            puesto.setListaEmpleados(listaEmpleadosNew);
            puesto = em.merge(puesto);
            for (Empleado listaEmpleadosOldEmpleado : listaEmpleadosOld) {
                if (!listaEmpleadosNew.contains(listaEmpleadosOldEmpleado)) {
                    listaEmpleadosOldEmpleado.setSuPuesto(null);
                    listaEmpleadosOldEmpleado = em.merge(listaEmpleadosOldEmpleado);
                }
            }
            for (Empleado listaEmpleadosNewEmpleado : listaEmpleadosNew) {
                if (!listaEmpleadosOld.contains(listaEmpleadosNewEmpleado)) {
                    Puesto oldSuPuestoOfListaEmpleadosNewEmpleado = listaEmpleadosNewEmpleado.getSuPuesto();
                    listaEmpleadosNewEmpleado.setSuPuesto(puesto);
                    listaEmpleadosNewEmpleado = em.merge(listaEmpleadosNewEmpleado);
                    if (oldSuPuestoOfListaEmpleadosNewEmpleado != null && !oldSuPuestoOfListaEmpleadosNewEmpleado.equals(puesto)) {
                        oldSuPuestoOfListaEmpleadosNewEmpleado.getListaEmpleados().remove(listaEmpleadosNewEmpleado);
                        oldSuPuestoOfListaEmpleadosNewEmpleado = em.merge(oldSuPuestoOfListaEmpleadosNewEmpleado);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = puesto.getIdPuesto();
                if (findPuesto(id) == null) {
                    throw new NonexistentEntityException("The puesto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Puesto puesto;
            try {
                puesto = em.getReference(Puesto.class, id);
                puesto.getIdPuesto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The puesto with id " + id + " no longer exists.", enfe);
            }
            List<Empleado> listaEmpleados = puesto.getListaEmpleados();
            for (Empleado listaEmpleadosEmpleado : listaEmpleados) {
                listaEmpleadosEmpleado.setSuPuesto(null);
                listaEmpleadosEmpleado = em.merge(listaEmpleadosEmpleado);
            }
            em.remove(puesto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Puesto> findPuestoEntities() {
        return findPuestoEntities(true, -1, -1);
    }

    public List<Puesto> findPuestoEntities(int maxResults, int firstResult) {
        return findPuestoEntities(false, maxResults, firstResult);
    }

    private List<Puesto> findPuestoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Puesto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Puesto findPuesto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Puesto.class, id);
        } finally {
            em.close();
        }
    }

    public int getPuestoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Puesto> rt = cq.from(Puesto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
