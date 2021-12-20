<%-- 
    Document   : login
    Created on : 18/12/2021, 12:52:26
    Author     : JuanPC
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
             <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
    </head>
    <body>
        
<!--        <form action="login" method="POST">
          <label for="text1" class="col-md-4 control-label">Nombre</label>
            <input type="text" name="name" placeholder="Nombre" />
            <br>
            <label for="text1" class="col-md-4 control-label">Usuario</label>
            <input type="text" name="user" placeholder="usuario" />
             <br>
            <label for="text1" class="col-md-4 control-label">Contrseña</label>
            <input type="password" name="password"  />
             <br>
            <input type="submit" value="Enviar" />
        </form>
        <a href="registro.jsp" class="btn homebtn smoothScroll">Ingresar</a>-->
        <style>

            .bg-image-vertical {
                position: relative;
                overflow: hidden;
                background-repeat: no-repeat;
                background-position: right center;
                background-size: auto 100%;
            }

            @media (min-width: 1025px) {
                .h-custom-2 {
                    height: 60%;
                }
            }
        </style>

        <section class="vh-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-6 text-black">



                        <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

                            <form action="login" method="POST" style="width: 23rem;">

                                <h3 class="fw-normal mb-3 pb-3 text-center" style="letter-spacing: 1px;">REGISTRO DE EMPLEADO ${hola}</h3>

                                <div class="form-outline mb-4">
                                    <input type="text" name="name" placeholder="Nombre de Usuario" id="form2Example18" class="form-control form-control-lg" />
                                   
                                      ${nombreInvalido}
                                </div>
                                
                                
                                <div class="form-outline mb-4">
                                    <input type="email" name="user" placeholder="Correo Electronico" id="form2Example18" class="form-control form-control-lg" />
                                   
                                    ${correoInvalido}
                                </div>
                                

                                <div class="form-outline mb-4">
                                    <input type="password" name="password" placeholder="Contraseña" id="form2Example28" class="form-control form-control-lg" />
                                      ${contrasenia}
                                </div>

                                <div class="pt-1 mb-4">
                                    <input class="btn btn-info btn-lg btn-block" type="submit" value="Registar" >
                                </div>


                                <p>Have an account? <a href="login.jsp" class="link-info">Login</a></p>

                            </form>
                            
                          

                        </div>

                    </div>
                    <div class="col-sm-6 px-0 d-none d-sm-block">
                        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img3.jpg" alt="Login image" class="w-100 vh-100" style="object-fit: cover; object-position: left;">
                    </div>
                </div>
            </div>
        </section>



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    </body>
</html>
