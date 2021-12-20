/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Leo Martinez
 */
@Entity
@Table(name = "pago")
public class Pago implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPago;

    /**
     * La comisión depende de la forma de pago
     */
    private double comision;

    @Temporal(TemporalType.DATE)
    private Date fechaPago;

    @Temporal(TemporalType.TIME)
    private Date horaPago;

    /**
     * El importe es el valor que se ha pagado por una venta o parte de ella
     */
    private double importe;

    /**
     * Para cada pago hay una venta asignada. es decir corresponde: Un pago
     * corresponde a una venta
     */
    

    public Pago() {
    }

    public Pago(int idPago, double comision, Date fechaPago, Date horaPago
            , double importe) {
        this.idPago = idPago;
        this.comision = comision;
        this.fechaPago = fechaPago;
        this.horaPago = horaPago;
        this.importe = importe;
        
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getHoraPago() {
        return horaPago;
    }

    public void setHoraPago(Date horaPago) {
        this.horaPago = horaPago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", comision=" + comision 
                + ", fechaPago=" + fechaPago + ", horaPago=" + horaPago 
                + ", importe=" + importe  + '}';
    }

}
