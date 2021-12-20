package polo.logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import polo.logica.Puesto;
import polo.logica.User;
import polo.logica.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-19T19:43:37")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> nombreP;
    public static volatile SingularAttribute<Empleado, String> apellidoP;
    public static volatile SingularAttribute<Empleado, Date> fechaNacio;
    public static volatile SingularAttribute<Empleado, Double> sueldo;
    public static volatile SingularAttribute<Empleado, String> nacionalidad;
    public static volatile SingularAttribute<Empleado, String> direccionP;
    public static volatile SingularAttribute<Empleado, Date> fechaIngreso;
    public static volatile SingularAttribute<Empleado, Puesto> suPuesto;
    public static volatile SingularAttribute<Empleado, Integer> idEmpleado;
    public static volatile SingularAttribute<Empleado, String> celular;
    public static volatile ListAttribute<Empleado, Venta> ventas;
    public static volatile SingularAttribute<Empleado, User> user;
    public static volatile SingularAttribute<Empleado, Integer> dni;
    public static volatile SingularAttribute<Empleado, String> email;

}