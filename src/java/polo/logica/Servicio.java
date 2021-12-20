/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.logica;

import java.io.Serializable;
import java.util.Date;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 *
 * @author Leo Martinez
 */
@Entity
@Table(name = "servicio")
public class Servicio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoServicio;
    private String nombreS;
    private String descripcionS;
    private String destinoS;

    @Temporal(TemporalType.DATE)
    private Date fechaServicio;

    private double costoS;

    /**
     * Cada Servicio puede estar en uno o mas paquetes.
     */
    @ManyToMany
    private List<Paquete> paquetes;

    public Servicio() {
    }

    public Servicio(int codigoServicio, String nombreS, String descripcionS, String destinoS, Date fechaServicio, double costoS, List<Paquete> paquetes) {
        this.codigoServicio = codigoServicio;
        this.nombreS = nombreS;
        this.descripcionS = descripcionS;
        this.destinoS = destinoS;
        this.fechaServicio = fechaServicio;
        this.costoS = costoS;
        this.paquetes = paquetes;
    }

    public int getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getDescripcionS() {
        return descripcionS;
    }

    public void setDescripcionS(String descripcionS) {
        this.descripcionS = descripcionS;
    }

    public String getDestinoS() {
        return destinoS;
    }

    public void setDestinoS(String destinoS) {
        this.destinoS = destinoS;
    }

    public Date getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(Date fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public double getCostoS() {
        return costoS;
    }

    public void setCostoS(double costoS) {
        this.costoS = costoS;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    @Override
    public String toString() {
        return "Servicio{" + "codigoServicio=" + codigoServicio + ", nombreS=" + nombreS + ", descripcionS=" + descripcionS + ", destinoS=" + destinoS + ", fechaServicio=" + fechaServicio + ", costoS=" + costoS + ", paquetes=" + paquetes + '}';
    }

}
