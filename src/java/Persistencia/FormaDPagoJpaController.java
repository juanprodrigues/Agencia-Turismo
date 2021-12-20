/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import polo.logica.FormaDPago;

/**
 *
 * @author JuanPC
 */
public class FormaDPagoJpaController implements Serializable {

    public FormaDPagoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public FormaDPagoJpaController() {
         emf=Persistence.createEntityManagerFactory("AgeciaDeTurismoPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(FormaDPago formaDPago) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(formaDPago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(FormaDPago formaDPago) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            formaDPago = em.merge(formaDPago);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = formaDPago.getIdFormaDPago();
                if (findFormaDPago(id) == null) {
                    throw new NonexistentEntityException("The formaDPago with id " + id + " no longer exists.");
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
            FormaDPago formaDPago;
            try {
                formaDPago = em.getReference(FormaDPago.class, id);
                formaDPago.getIdFormaDPago();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The formaDPago with id " + id + " no longer exists.", enfe);
            }
            em.remove(formaDPago);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<FormaDPago> findFormaDPagoEntities() {
        return findFormaDPagoEntities(true, -1, -1);
    }

    public List<FormaDPago> findFormaDPagoEntities(int maxResults, int firstResult) {
        return findFormaDPagoEntities(false, maxResults, firstResult);
    }

    private List<FormaDPago> findFormaDPagoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(FormaDPago.class));
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

    public FormaDPago findFormaDPago(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(FormaDPago.class, id);
        } finally {
            em.close();
        }
    }

    public int getFormaDPagoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<FormaDPago> rt = cq.from(FormaDPago.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
