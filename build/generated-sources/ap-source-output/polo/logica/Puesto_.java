package polo.logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import polo.logica.Empleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-19T19:43:37")
@StaticMetamodel(Puesto.class)
public class Puesto_ { 

    public static volatile ListAttribute<Puesto, Empleado> listaEmpleados;
    public static volatile SingularAttribute<Puesto, String> tarea;
    public static volatile SingularAttribute<Puesto, Integer> idPuesto;
    public static volatile SingularAttribute<Puesto, Double> sueldoBase;
    public static volatile SingularAttribute<Puesto, String> mombrePuesto;

}