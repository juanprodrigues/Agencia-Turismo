/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import polo.logica.Controladora;
import polo.logica.User;

/**
 *
 * @author JuanPC
 */
@WebServlet(name = "editarEmpleado", urlPatterns = {"/editarEmpleado"})
public class editarEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

//        String usuario = request.getParameter("user");
//        String contra = request.getParameter("password");
//      
        String idempleado = request.getParameter("idempleado");
        int idEmpleado= Integer.parseInt(idempleado);
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String direcion = request.getParameter("direcion");
        String nacionalidad = request.getParameter("nacionalidad");
        String celular = request.getParameter("celular");
        String ndocumento = request.getParameter("ndocumento");
        int dni= Integer.parseInt(ndocumento);
        
        String email = request.getParameter("email");
        String fechaNacio = request.getParameter("nacimiento");

        Controladora controladora = new Controladora();

      
         
    

        try {
            controladora.actualizarEmpleado(idEmpleado, nombre, apellidos, direcion,dni, fechaNacio, nacionalidad, celular, email);
        
         response.sendRedirect("formularioDatosPersonales.jsp");
        } catch (ParseException ex) {
            Logger.getLogger(editarEmpleado.class.getName()).log(Level.SEVERE, null, ex);
              response.sendRedirect("loginExito.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
