/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import polo.logica.Controladora;
import polo.logica.Empleado;
import polo.logica.User;

/**
 *
 * @author JuanPC
 */
@WebServlet(name = "registro", urlPatterns = {"/registro"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Parametros ingresados desde el jsp

        String usuario = request.getParameter("user");
        String contra = request.getParameter("password");

        System.out.println("Pass desde do post: " + contra);
        Controladora controladora = new Controladora();
        User autorizado = controladora.verificarUsuario(usuario, contra);

        if (autorizado != null) { //obtengo la session y le asigno el usuario contraseña

            Empleado empleado = controladora.traerEmpleado(autorizado.getIsUsuario());

            //seteamos el correo del usuario con el correo del empleado
            empleado.setEmail(usuario);
            HttpSession misession = request.getSession(true);
            misession.setAttribute("Empledo", empleado);

            misession.setAttribute("id", empleado.getIdEmpleado());
            misession.setAttribute("nombre", empleado.getNombreP());
            misession.setAttribute("apellido", empleado.getApellidoP());
            misession.setAttribute("celular", empleado.getCelular());
            misession.setAttribute("direcion", empleado.getDireccionP());
            misession.setAttribute("nacionalidad", empleado.getNacionalidad());
            misession.setAttribute("fechaIngreso", empleado.getFechaIngreso());

            misession.setAttribute("DNI", empleado.getDni());
            misession.setAttribute("email", empleado.getEmail());

            misession.setAttribute("idUsuario", autorizado.getIsUsuario());
            misession.setAttribute("usuario", usuario);

            misession.setAttribute("contra", contra);

            response.sendRedirect("loginExito.jsp");

        } else {
            response.sendRedirect("index.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
