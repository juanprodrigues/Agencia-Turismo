/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Leo Martinez
 */
@Entity
@Table(name = "formadpago")
public class FormaDPago implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFormaDPago;

    private String medioDPago;

    public FormaDPago() {
    }

    public FormaDPago(int idFormaDPago, String medioDPago) {
        this.idFormaDPago = idFormaDPago;
        this.medioDPago = medioDPago;
    }

    public int getIdFormaDPago() {
        return idFormaDPago;
    }

    public void setIdFormaDPago(int idFormaDPago) {
        this.idFormaDPago = idFormaDPago;
    }

    public String getMedioDPago() {
        return medioDPago;
    }

    public void setMedioDPago(String medioDPago) {
        this.medioDPago = medioDPago;
    }

    @Override
    public String toString() {
        return "FormaDPago{" + "idFormaDPago=" + idFormaDPago + ", medioDPago=" + medioDPago + '}';
    }

    /**
     * elegirFormaDPago:
     *
     * Elegir la forma de pago sirve para identificar el modo en que se realiza
     * un pago.<p>
     *
     * @Param idFormaDPago contine un entero qcorrespondiente al valor de la
     * forma de pago.
     * <p>
     *
     * public void elegirFormaDPago(int idFormaDPago) {
     *
     * switch (idFormaDPago) { case 0: { this.medioDPago = "Efectivo"; break; }
     * case 1: { this.medioDPago = "Débito"; break; } case 2: { this.medioDPago
     * = "Crédito"; break; } case 3: { this.medioDPago = "Monedero"; break; }
     * case 4: { this.medioDPago = "Transferencia"; break; }
     *
     * }
     *
     * }
     */
}
