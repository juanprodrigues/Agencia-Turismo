<%-- 
    Document   : formularioDatosPersonales
    Created on : 19/12/2021, 17:07:33
    Author     : JuanPC
--%>

<%@page import="polo.logica.Empleado"%>
<%@page import="polo.logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos personas</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    </head>
    <body>


        <%
            HttpSession sesion = request.getSession();

            if (sesion.getAttribute("usuario") == null) {
                out.print("<script>location.replace('login.jsp');</script>");
            }
        %>
        ${sessionScope.Empledo}
        --
        ${id}
        <br>
        ${email}
        <br>
        ${nombre}
        <br>
        ${apellido}
        <br>
        ${celular}
        <br>
        ${direcion} 
        <br>
        ${nacionalidad}  
        <br>
        ${fechaIngreso} 
        <br>
        ${DNI} 
        <br>
        ${email}



        <div class="container" >
            <form action="editarEmpleado" method="post" style="margin:5%; background-color:#F2F2F2; padding: 5%; ">
                <input  class="form-control"type="text" name="idempleado" value="${id}" >
                <!-- primera fila -->
                <div class="form-group">
                    <div class="row">
                        <!-- primera columna -->
                        <div class="col-md-4">
                            <input  class="form-control"type="text" name="nombre" value="${nombre}" placeholder="Nombres">
                        </div>
                        <!-- segunda columna -->
                        <div class="col-md-4">
                            <input  class="form-control"type="text" name="apellidos" value="${apellido}"placeholder="Apellidos">
                        </div>
                        <!-- tercera columna -->
                        <div class="col-md-4">
                            <input  class="form-control"type="date" name="nacimiento" placeholder="Fecha de nacimiento">
                        </div>
                    </div>
                </div>
                <!-- segunda fila -->
                <div class="form-group">
                    <div class="row">
                        <!-- primera columna -->

                        <div class="col-md-4">
                            <input  class="form-control"type="text" name="direcion" placeholder="Direcion" value="${direcion}">
                        </div>
                        <!-- segunda columna -->
                        <div class="col-md-4">
                            <input  class="form-control" type="text" name="nacionalidad" placeholder="Nacionalidad" value="${nacionalidad}">
                        </div>
                        <!-- tercera columna -->
                        <div class="col-md-4">	
                        </div>
                    </div>
                </div>
                <!-- tercera fila -->
                <div class="form-group">
                    <div class="row">
                        <!-- primera columna -->
                        <div class="col-md-4">
                            <input  class="form-control" type="number"  value="  ${celular}" name="celular" placeholder="Celular">
                        </div>
                        <!-- segunda columna -->
                        <div class="col-md-4">
                            <input  class="form-control"type="number" name="ndocumento" placeholder="DNI" value="${DNI}">
                        </div>
                        <!-- tercera columna -->
                        <div class="col-md-4">
                            <input class="form-control" type="email" name="email" value="${email}" placeholder="Correo Electronico">
                        </div>
                    </div>
                </div>
                <button class="btn btn-success" type="submit">Guardar</button>
            </form>
        </div>
    </body>
</html>
