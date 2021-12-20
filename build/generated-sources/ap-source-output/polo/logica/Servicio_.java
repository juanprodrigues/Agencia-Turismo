package polo.logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import polo.logica.Paquete;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-19T19:43:37")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, Double> costoS;
    public static volatile SingularAttribute<Servicio, Integer> codigoServicio;
    public static volatile ListAttribute<Servicio, Paquete> paquetes;
    public static volatile SingularAttribute<Servicio, String> destinoS;
    public static volatile SingularAttribute<Servicio, Date> fechaServicio;
    public static volatile SingularAttribute<Servicio, String> descripcionS;
    public static volatile SingularAttribute<Servicio, String> nombreS;

}