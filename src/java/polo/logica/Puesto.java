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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Leo Martinez
 */
@Entity
@Table(name = "puesto")
public class Puesto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPuesto;
    /**
     * Cada puesto tiene un nombre. Puede derivar en lista de puestos.
     */
    private String mombrePuesto;

    /**
     * Cada puesto tiene una tarea. Puede revivar en una lista de tareas.
     */
    private String tarea;

    /**
     * El sueldo base es la base de cada puesto. En este caso se asignará como
     * sueldo base al momento de asignar un nuevo puesto.
     */
    private double sueldoBase;

    /**
     * Se podria revisar los emleados que estan en este puesto.
     */
    @OneToMany
    private List<Empleado> listaEmpleados;

    public Puesto() {
    }

    public Puesto(int idPuesto, String mombrePuesto, String tarea, double sueldoBase, List<Empleado> listaEmpleados) {
        this.idPuesto = idPuesto;
        this.mombrePuesto = mombrePuesto;
        this.tarea = tarea;
        this.sueldoBase = sueldoBase;
        this.listaEmpleados = listaEmpleados;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getMombrePuesto() {
        return mombrePuesto;
    }

    public void setMombrePuesto(String mombrePuesto) {
        this.mombrePuesto = mombrePuesto;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public String toString() {
        return "Puesto{" + "idPuesto=" + idPuesto + ", mombrePuesto=" + mombrePuesto + ", tarea=" + tarea + ", sueldoBase=" + sueldoBase + ", listaEmpleados=" + listaEmpleados + '}';
    }

}
