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

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Leo Martinez
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

    /**
     * Los datos de los clientes son de las personas. en este caso cada cliente
     * tiene su ID y ademas su DNI
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    private String nombreP;
    private String apellidoP;
    private String direccionP;
    private int dni;

    @Temporal(TemporalType.DATE)
    private Date fechaNacio;

    private String nacionalidad;
    private String celular;
    private String email;

    /**
     * Cada Cliente tiene una mas formas de Pago. deberán asignarle a cada
     * cliente la forma de pagar.
     */
    @ManyToMany
    List<FormaDPago> formasDPago;

    /**
     * Los clientes realizan distintos pagos para UNA venta o para distintas
     * ventas
     */
    @OneToMany
    List<Pago> pagos;

    /**
     * Los clientes realizan compras puede haber una o varias Las compras son
     * las ventas de la AGENCIA
     *
     */
    @OneToMany
    List<Venta> compras;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombreP, String apellidoP, String direccionP, int dni, Date fechaNacio, String nacionalidad, String celular, String email, List<FormaDPago> formasDPago, List<Pago> pagos, List<Venta> compras) {
        this.idCliente = idCliente;
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.direccionP = direccionP;
        this.dni = dni;
        this.fechaNacio = fechaNacio;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.formasDPago = formasDPago;
        this.pagos = pagos;
        this.compras = compras;
    }

    public Cliente(int idCliente, String nombreP, String apellidoP, String direccionP, int dni, Date fechaNacio, String nacionalidad, String celular, String email, List<FormaDPago> formasDPago, List<Pago> pagos, List<Venta> compras, Integer isUsuario, String usuario, String pasword) {
        
        this.idCliente = idCliente;
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.direccionP = direccionP;
        this.dni = dni;
        this.fechaNacio = fechaNacio;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.formasDPago = formasDPago;
        this.pagos = pagos;
        this.compras = compras;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getDireccionP() {
        return direccionP;
    }

    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaNacio() {
        return fechaNacio;
    }

    public void setFechaNacio(Date fechaNacio) {
        this.fechaNacio = fechaNacio;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<FormaDPago> getFormasDPago() {
        return formasDPago;
    }

    public void setFormasDPago(List<FormaDPago> formasDPago) {
        this.formasDPago = formasDPago;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    public List<Venta> getCompras() {
        return compras;
    }

    public void setCompras(List<Venta> compras) {
        this.compras = compras;
    }



    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreP=" + nombreP + ", apellidoP=" + apellidoP + ", direccionP=" + direccionP + ", dni=" + dni + ", fechaNacio=" + fechaNacio + ", nacionalidad=" + nacionalidad + ", celular=" + celular + ", email=" + email + ", formasDPago=" + formasDPago + ", pagos=" + pagos + ", compras=" + compras + '}';
    }

    
    
  

}
