/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.logica;

import java.io.Serializable;
import java.util.Date;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
@Table(name = "empleado")
public class Empleado implements Serializable {

    /**
     * Los datos de los Empleados son de las personas. En este caso cada
     * empleado tiene su ID y ademas su DNI
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    private String nombreP;
    private String apellidoP;
    private String direccionP;
    private int dni;

    @Temporal(TemporalType.DATE)
    private Date fechaNacio;
    
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    private String nacionalidad;
    private String celular;
    private String email;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user; 
          

    /**
     * El sueldo del empleado es calculado a base del sueldo base segun su
     * puesto.
     *
     */
    private double sueldo;

    /**
     * El puesto empleado es calculado se asigna al momento de cargar un nuevo
     * empleado. Este podria tener un sueldo base y agregarle otras
     * asignaciones. Por ejemplo que antiguedad. puesto. Para eso hay que
     * calcular la antiguedad, a base de la fecha de ingreso. Cada empleado
     * tiene uno solo puesto.
     * <p>
     * Si llegara a cambiar el puesto de un empleado, iniciaria nuevamente la
     * fecha de ingreso y su correspondiente antiguedad.
     *
     *
     */
    @OneToOne
    private Puesto suPuesto;

    /**
     * Cada empleado tiene asignado una o mas ventas
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
     * Customer getCustomer() //{ return customer; }
     */
    @OneToMany(mappedBy = "empleado")
    private List<Venta> ventas;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombreP, String apellidoP, String direccionP, int dni, Date fechaNacio, Date fechaIngreso, String nacionalidad, String celular, String email, User user, double sueldo, Puesto suPuesto, List<Venta> ventas) {
        this.idEmpleado = idEmpleado;
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.direccionP = direccionP;
        this.dni = dni;
        this.fechaNacio = fechaNacio;
        this.fechaIngreso = fechaIngreso;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.user = user;
        this.sueldo = sueldo;
        this.suPuesto = suPuesto;
        this.ventas = ventas;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Puesto getSuPuesto() {
        return suPuesto;
    }

    public void setSuPuesto(Puesto suPuesto) {
        this.suPuesto = suPuesto;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombreP=" + nombreP + ", apellidoP=" + apellidoP + ", direccionP=" + direccionP + ", dni=" + dni + ", fechaNacio=" + fechaNacio + ", fechaIngreso=" + fechaIngreso + ", nacionalidad=" + nacionalidad + ", celular=" + celular + ", email=" + email + ", user=" + user + ", sueldo=" + sueldo + ", suPuesto=" + suPuesto + ", ventas=" + ventas + '}';
    }

  
    

}
