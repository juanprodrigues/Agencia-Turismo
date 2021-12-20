package polo.logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import polo.logica.Cliente;
import polo.logica.Empleado;
import polo.logica.Pago;
import polo.logica.Paquete;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-19T19:43:37")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> horaVenta;
    public static volatile SingularAttribute<Venta, Empleado> empleado;
    public static volatile SingularAttribute<Venta, String> tipoContratacion;
    public static volatile SingularAttribute<Venta, Cliente> comprador;
    public static volatile ListAttribute<Venta, Pago> pagos;
    public static volatile SingularAttribute<Venta, Paquete> paquete;
    public static volatile SingularAttribute<Venta, Integer> idVenta;
    public static volatile SingularAttribute<Venta, Date> fechaVenta;

}