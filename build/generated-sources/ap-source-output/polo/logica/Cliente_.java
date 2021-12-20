package polo.logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import polo.logica.FormaDPago;
import polo.logica.Pago;
import polo.logica.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-19T19:43:37")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> direccionP;
    public static volatile SingularAttribute<Cliente, String> nombreP;
    public static volatile ListAttribute<Cliente, Venta> compras;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> apellidoP;
    public static volatile SingularAttribute<Cliente, Date> fechaNacio;
    public static volatile SingularAttribute<Cliente, String> celular;
    public static volatile ListAttribute<Cliente, FormaDPago> formasDPago;
    public static volatile ListAttribute<Cliente, Pago> pagos;
    public static volatile SingularAttribute<Cliente, Integer> dni;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile SingularAttribute<Cliente, String> nacionalidad;

}