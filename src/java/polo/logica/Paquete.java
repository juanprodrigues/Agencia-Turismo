/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

/**
 *
 * @author Leo Martinez
 */
@Entity
@Table(name = "paquete")
public class Paquete implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPaquete;
    /**
     * El costo del paquete es igual a la suma de los costos de los servicios
     * que lo componen menos un 10% de descuento por contratarlos en forma de
     * paquete.
     */
    private double costoPaquete;

    /**
     * El descuento está asignado inicialmente al 10%
     * <p>
     * Se podrá cambar este valor desde la administración.
     *
     */
    private double descuento = 10 / 100;

    /**
     * Los servicios conforman una lista de cada servicio que tiene cada uno un
     * valor del mismo.
     *
     * Puede contener un solo servicio o mas de uno.
     */
    @ManyToMany
    private List<Servicio> servicios;

    public Paquete() {
    }

    public Paquete(int idPaquete, double costoPaquete, List<Servicio> servicios) {
        this.idPaquete = idPaquete;
        this.costoPaquete = costoPaquete;
        this.servicios = servicios;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public double getCostoPaquete() {
        return costoPaquete;
    }

    public void setCostoPaquete(double costoPaquete) {
        this.costoPaquete = costoPaquete;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", costoPaquete=" + costoPaquete + ", descuento=" + descuento + ", servicios=" + servicios + '}';
    }

}
