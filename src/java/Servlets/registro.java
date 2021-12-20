/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.print.DocFlavor;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import polo.logica.Controladora;
import polo.logica.Empleado;

/**
 *
 * @author JuanPC
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class registro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    //Login
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Parametros ingresados desde el jsp
        String nombre = request.getParameter("name");
        String usuario = request.getParameter("user");
        String contra = request.getParameter("password");
        Controladora controladora = new Controladora();

        //busco el correo para que sea unico por cada empleado-usuario
        boolean autorizado = controladora.buscarPorEmail(usuario);

        if (nombre.isEmpty() || contra.isEmpty() || usuario.isEmpty()) {
            request.setAttribute("nombreInvalido", "<p style='color:red;'> Nombre se encuentra vacio</p>");
            request.setAttribute("correoInvalido", "<p style='color:red;'> El correo se encuentra Vacio</p>");
            request.setAttribute("contrasenia", "<p style='color:red;'> La contraseña se encuentra vacia</p>");
        }

        if (autorizado) {
            System.out.println("estamos en el bucle");
            controladora.crearEmpleado(nombre, usuario, contra);

            request.getRequestDispatcher("login.jsp").forward(request, response);


        } else {
            request.setAttribute("correoInvalido", "<p style='color:red;'> El correo ya se encuentra registrado</p>");

            request.getRequestDispatcher("registro.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
