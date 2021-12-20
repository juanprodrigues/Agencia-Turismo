/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.logica;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Leo Martinez
 */
@Entity
@Table(name = "venta")
public class Venta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVenta;

    @Temporal(TemporalType.DATE)
    private Date fechaVenta;

    @Temporal(TemporalType.TIME)
    private Date horaVenta;

    /**
     * Cada venta tiene un cliente como comprador
     */
    @ManyToOne
    private Cliente comprador;

    /**
     * Cada venta tiene un empleado como empleado
     *
     * 
     * https://docs.oracle.com/javaee/7/api/toc.htm
     *
     * Example 1: One-to-Many association using generics
     *
     * // In Customer class:
     *
     * //@OneToMany(cascade=ALL, mappedBy="customer") public Set<Order>
     * //getOrders() { return orders; }
     *
     * In Order class:
     *
     * //@ManyToOne //@JoinColumn(name="CUST_ID", nullable=false) public
     * //Customer getCustomer() //{ return customer; }
     *
     *
     */
    @ManyToOne
    private Empleado empleado;

    /**
     * Cada venta se realiza en forma individual o de forma de paquete.
     */
    private String tipoContratacion;

    /**
     * Un paquete puede tener un solo servicio o puede tener varios servicios
     * juntos. De forma que todas las ventas tienen un paquete.<p>
     * Todas las ventas tienen un solo paquete
     */
    @OneToOne
    private Paquete paquete;

    /**
     * Cada venta puede tenr una lista de pagos, segun la forma de pagar o bien
     * porque puede ser que el cliente pueda pagar en distintos momentos.
     */
    @OneToMany
    private List<Pago> pagos;

    public Venta() {
    }

    public Venta(int idVenta, Date fechaVenta, Date horaVenta, Cliente comprador, Empleado empleado, String tipoContratacion, Paquete paquete, List<Pago> pagos) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.horaVenta = horaVenta;
        this.comprador = comprador;
        this.empleado = empleado;
        this.tipoContratacion = tipoContratacion;
        this.paquete = paquete;
        this.pagos = pagos;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(Date horaVenta) {
        this.horaVenta = horaVenta;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Empleado getVendedor() {
        return empleado;
    }

    public void setVendedor(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(String tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fechaVenta=" + fechaVenta + ", horaVenta=" + horaVenta + ", comprador=" + comprador + ", empleado=" + empleado + ", tipoContratacion=" + tipoContratacion + ", paquete=" + paquete + ", pagos=" + pagos + '}';
    }

}
