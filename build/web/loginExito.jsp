<%-- 
    Document   : loginExito
    Created on : 18/12/2021, 12:54:54
    Author     : JuanPC
--%>

<%@page import="polo.logica.Empleado"%>
<%@page import="polo.logica.Controladora"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            HttpSession sesion = request.getSession();

            if (sesion.getAttribute("usuario") == null) {
                out.print("<script>location.replace('login.jsp');</script>");
            }
        %>

        <a href="formularioDatosPersonales.jsp" class="btn homebtn smoothScroll">Cargar un cliente</a>
        <br>
        <a href="formularioDatosPersonales.jsp" class="btn homebtn smoothScroll">Editar Mi perfil </a>
        <br>
        <a href="cerrarSession" class="btn homebtn smoothScroll">Listar Mis clientes</a>
        <br>
        <a href="cerrarSession" class="btn homebtn smoothScroll">Listar mis ventas</a>

        <a href="cerrarSession" class="btn homebtn smoothScroll">Cerrar cesion</a>
    </body>
</html>
