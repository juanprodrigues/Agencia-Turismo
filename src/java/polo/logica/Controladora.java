/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polo.logica;

import Persistencia.ControladoraPersistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Leo Martinez
 */
//comunica el servler y el controladoraPerisstensia
public class Controladora {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void crearCliente() {
        List<FormaDPago> formasDPago = new ArrayList<>();
        formasDPago.add(new FormaDPago(1, "medioDPago"));
        List<Pago> pagos = new ArrayList<>();

        pagos.add(new Pago(1, 1, new Date(), new Date(), 1));

        List<Venta> compras = new ArrayList<>();
        compras.add(new Venta(1, new Date(), new Date(), new Cliente(), new Empleado(), "tipoContratacion", new Paquete(), pagos));

        Cliente sd = new Cliente(0, "vds", "apellidoP", "direccionP", 0, new Date(), "nacionalidad", "celular", "email", formasDPago, pagos, compras);
        controladoraPersistencia.crearCliente(sd);
    }

    public void crearEmpleado(String nombreP, String usuario, String pasword) {

        Empleado empleado = new Empleado();
        User use = new User();
        use.setUsuario(usuario);
        use.setPasword(pasword);
        System.out.println("contraseña " + pasword);
        empleado.setNombreP(nombreP);
        empleado.setUser(use);
        System.out.println("Usuario " + use.toString());
        System.out.println("desde controladora" + empleado.toString());
        controladoraPersistencia.crearEmpleado(empleado);
    }

    public User verificarUsuario(String usuario, String contrasenia) {
        List<User> users = controladoraPersistencia.traerUsuarios();
        for (User user : users) {

            if (usuario.equals(user.getUsuario()) && contrasenia.equals(user.getPasword())) {
                System.out.println("REGISTRO EXITOSO");
                return user;
            }

        }
        System.out.println("REGISTRO FALLIDO");
        return null;
    }

    public Empleado traerEmpleado(Integer id) {
        Empleado empleado = controladoraPersistencia.traerEmpleado(id);
        System.out.println("empeladoad: " + empleado.toString());
        return empleado;
    }

    public boolean buscarPorEmail(String email) {
        User user = controladoraPersistencia.buscarPorEmail(email);
        if (user == null) {
            System.out.println("Si se encuntra en usuario");
            return true;
        } else {
            System.out.println("Si se encuntra en usuario");
            return false;
        }

    }

    public void actualizarEmpleado(int idEmpleado, String nombreP, String apellidoP, String direccionP, int dni, String fechaNacio, String nacionalidad, String celular, String email) throws ParseException {

        Empleado empleado = traerEmpleado(idEmpleado);
        System.out.println("Empleado traido: "+empleado.toString());
        
        
        empleado.setNombreP(nombreP);
        empleado.setApellidoP(apellidoP);
        empleado.setCelular(celular);
        empleado.setDireccionP(direccionP);
        empleado.setDni(dni);
        empleado.setEmail(email);
        empleado.setNacionalidad(nacionalidad);

        empleado.setFechaNacio(string2LocalDate(fechaNacio));
        System.out.println("Empleado que se va: "+empleado.toString());
        controladoraPersistencia.crearEmpleado(empleado);
    }

    private Date string2LocalDate(String stringDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(stringDate);
        return date;

    }
}
