/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import polo.logica.Cliente;
import polo.logica.Empleado;
import polo.logica.FormaDPago;
import polo.logica.Pago;
import polo.logica.User;
import polo.logica.Venta;

/**
 *
 * @author JuanPC
 */
public class ControladoraPersistencia {

    ClienteJpaController clieJPA = new ClienteJpaController();
    EmpleadoJpaController empleJPA = new EmpleadoJpaController();
    FormaDPagoJpaController frmPaJPA = new FormaDPagoJpaController();
    PagoJpaController pagoJPA = new PagoJpaController();
    PaqueteJpaController paqueJPA = new PaqueteJpaController();
    PuestoJpaController puestJPA = new PuestoJpaController();
    ServicioJpaController serviJPA = new ServicioJpaController();
    VentaJpaController ventaJPA = new VentaJpaController();
    UserJpaController userJPA = new UserJpaController();

    public void crearCliente(Cliente cliente) {
        try {
            clieJPA.create(cliente);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void crearEmpleado(Empleado empledao) {
        try {
            System.out.println("Desde COntroladora persistencia crear empleado" + empledao.toString());
            empleJPA.create(empledao);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public List<User> traerUsuarios() {
        try {
            return userJPA.findUserEntities();
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }

    }

    public Empleado traerEmpleado(int id) {
        try {

            return empleJPA.findIdUsuario(id);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }

    }

    public User buscarPorEmail(String email) {
        try {
            return userJPA.findIdUsuarioByEmail(email);
        } catch (Exception e) {
            System.out.println("Error en la controladora");
            return null;
        }

    }

    public void actualizarEmpleado(Empleado empleado) {
        try {
             System.err.println("desde la contrladoda persistencia modificar: "+empleado.toString());
            empleJPA.edit(empleado);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);

        }

    }

}
