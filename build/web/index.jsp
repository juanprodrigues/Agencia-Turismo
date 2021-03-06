<%-- 
    Document   : index
    Created on : 12/12/2021, 17:41:13
    Author     : JuanPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Turismo</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="css/elusive-webfont.css">
    <link href="css/animate.css" rel="stylesheet">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>

    <script src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/modernizr.custom.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body data-spy="scroll" data-offset="0" data-target="#navbar-main">


    <div id="navbar-main">
        <!-- Fixed navbar -->
        <div class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	          	<i class="el-icon-lines"></i>
	          </button>
                    <a class="navbar-brand hidden-xs hidden-sm" href="#home">
                        <h1>Turismo Vida</h1>
                    </a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="#home" class="smoothScroll">Inicio</a></li>
                        <li> <a href="#about" class="smoothScroll">Sobre Nosotros</a></li>
                        <li> <a href="#services" class="smoothScroll">Servicio</a></li>
                        <li> <a href="#team" class="smoothScroll">Equipo</a></li>
                        <li> <a href="#contact" class="smoothScroll">Contacto</a></li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>



    <!-- ==== HEADERWRAP ==== -->
    <div id="headerwrap" id="home" name="home">
        <header class="clearfix">
            <h1 class="animated bounceIn">HELLO!</h1>
            <p class="animated slideInLeft">Estas buscando una aventura inolvidable.</p>
            <p class="animated slideInRight">Este es el lugar indicado.</p>
            <a href="login.jsp" class="btn homebtn smoothScroll">Ingresar</a>
        </header>
    </div>
    <!-- /headerwrap -->


    <!-- ==== ABOUT ==== -->
    <div class="container" id="about" name="about">
        <div class="row white">
            <h1 class="fade-down centered">A LITTLE ABOUT US</h1>
            <hr>

            <div class="fade-up col-md-6">
                <p>Insipidity the sufficient discretion imprudence resolution sir him decisively. Proceed how any engaged visitor. Explained propriety off out perpetual his you. Feel sold off felt nay rose met you. We so entreaties cultivated astonished
                    is. Was sister for few longer mrs sudden talent become. Done may bore quit evil old mile. If likely am of beauty tastes. </p>
            </div>
            <!-- col-md-6 -->

            <div class="fade-up col-md-6">
                <p>Arrived totally in as between private. Favour of so as on pretty though elinor direct. Reasonable estimating be alteration we themselves entreaties me of reasonably. Direct wished so be expect polite valley. Whose asked stand it sense
                    no spoil to. Prudent you too his conduct feeling limited and. Side he lose paid as hope so face upon be. Goodness did suitable learning put. </p>
            </div>
            <!-- col-md-6 -->
        </div>
        <!-- row -->
    </div>
    <!-- container -->


    <!-- ==== SECTION DIVIDER2 -->
    <section class="section-divider textdivider divider2">
        <div class="container">
            <h1 class="fade-down">Estadisticas</h1>
            <hr>
            <div class="col-md-3">
                <span class="counter">1041</span>
                <span class="counter-desc">Clientes Satisfechos</span>
            </div>
            <div class="col-md-3">
                <span class="counter">45</span>
                <span class="counter-desc">Lugares para elegir</span>
            </div>
            <div class="col-md-3">
                <span class="counter">26</span>
                <span class="counter-desc">Empresas de trasportes</span>
            </div>
            <div class="col-md-3">
                <span class="counter">800</span>
                <span class="counter-desc">Viajes Concretados</span>
            </div>
        </div>
        <!-- container -->
    </section>
    <!-- section -->




    <!-- ==== TEAM MEMBERS ==== -->
    <div class="container section" id="team" name="team">
        <br>
        <div class="row white centered">
            <h1 class="fade-down centered">Nuestro equipo</h1>
            <hr class="fade-down title-mb">
            <div class="col-md-4 ">
                <div class="col-md-3 col-sm-3 col-xs-3 fade-down team-image-wrapper">
                    <img class="img team-image" src="images/team01.jpg" alt="">
                    <a href="#" class="team-social twitter"><i class="el-icon-twitter"></i></a>
                    <a href="#" class="team-social facebook"><i class="el-icon-facebook"></i></a>
                    <a href="#" class="team-social flickr"><i class="el-icon-flickr"></i></a>
                </div>
                <div class="col-md-9 col-sm-9 col-xs-9 fade-up team-info">
                    <h4>Maria Perez</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia nisi delectus inventore. Consequuntur libero ut accusantium amet, modi nemo iusto nisi voluptatum eos at quibusdam, provident delectus voluptas officiis adipisci nam facilis
                    </p>
                </div>
            </div>

            <div class="col-md-4">
                <div class="col-md-3 col-sm-3 col-xs-3 fade-down team-image-wrapper">
                    <img class="img team-image" src="images/team02.jpg" alt="">
                    <a href="#" class="team-social twitter"><i class="el-icon-twitter"></i></a>
                    <a href="#" class="team-social facebook"><i class="el-icon-facebook"></i></a>
                    <a href="#" class="team-social flickr"><i class="el-icon-flickr"></i></a>
                </div>
                <div class="col-md-9 col-sm-9 col-xs-9 fade-up team-info">
                    <h4>Lucas GOnzales</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia nisi delectus inventore. Consequuntur libero ut accusantium amet, modi nemo iusto nisi voluptatum eos at quibusdam, provident delectus voluptas officiis adipisci nam facilis
                    </p>
                </div>
            </div>

            <div class="col-md-4">
                <div class="col-md-3 col-sm-3 col-xs-3 fade-down team-image-wrapper">
                    <img class="img team-image" src="images/team03.jpg" alt="">
                    <a href="#" class="team-social twitter"><i class="el-icon-twitter"></i></a>
                    <a href="#" class="team-social facebook"><i class="el-icon-facebook"></i></a>
                    <a href="#" class="team-social flickr"><i class="el-icon-flickr"></i></a>
                </div>
                <div class="col-md-9 col-sm-9 col-xs-9 fade-up team-info">
                    <h4>Cristian Perez</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia nisi delectus inventore. Consequuntur libero ut accusantium amet, modi nemo iusto nisi voluptatum eos at quibusdam, provident delectus voluptas officiis adipisci nam facilis
                    </p>
                </div>
            </div>

        </div>
        <!-- row -->
    </div>
    <!-- container -->



    <div class="container" id="contact" name="contact">
        <div class="row row white">
            <br>
            <h1 class="centered fade-down">THANKS FOR VISITING US</h1>
            <hr class="fade-down title-mb">
            <div class="col-md-4 fade-up">
                <h3>Contact Information</h3>
                <p><span class="icon icon-home"></span>Time Square, New York<br/>
                    <span class="icon icon-phone"></span>+12 12345 123<br/>
                    <span class="icon icon-mobile"></span>+12 12345 123<br/>
                    <span class="icon icon-envelop"></span> <a href="#">email@templatestock.com</a> <br/>
                    <span class="icon icon-twitter"></span> <a href="#">@templatestock.com</a> <br/>
                    <span class="icon icon-facebook"></span> <a href="#">templatestock</a> <br/>
                </p>
            </div>
            <!-- col -->

            <div class="col-md-4 fade-up">
                <h3>Newsletter</h3>
                <p>Register to our newsletter and be updated with the latests information regarding our services, offers and much more.</p>

                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label for="inputEmail1" class="col-md-4 control-label"></label>
                        <div class="col-md-10">
                            <input type="email" class="form-control" id="inputEmail1" placeholder="Email">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="text1" class="col-md-4 control-label"></label>
                        <div class="col-md-10">
                            <input type="text" class="form-control" id="text1" placeholder="Your Name">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-10">
                            <button type="submit" class="btn btn-success">Sign in</button>
                        </div>
                    </div>
                </form>
                <!-- form -->

            </div>
            <!-- col -->

            <div class="col-md-4 fade-up">
                <h3>Support Us</h3>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen
                    book.
                </p>
            </div>
            <!-- col -->

        </div>
        <!-- row -->

    </div>
    <!-- container -->

    <div id="footerwrap">
        <div class="container">
            <div class="btt-wrapper fade-down"><a class="btt-link smoothScroll" href="#home"><i class="el-icon-chevron-up"></i></a></div>
            <ul id="footer-social" class="fade-down">
                <li><a href="#" target="_blank" title="Like Us"><i class="el-icon-twitter"></i></a></li>
                <li><a href="#" target="_blank" title="Like Us"><i class="el-icon-facebook"></i></a></li>
                <li><a href="#" target="_blank" title="Like Us"><i class="el-icon-googleplus"></i></a></li>
                <li><a href="#" target="_blank" title="Like Us"><i class="el-icon-flickr"></i></a></li>
                <li><a href="#" target="_blank" title="Like Us"><i class="el-icon-youtube"></i></a></li>
                <li><a href="#" target="_blank" title="Like Us"><i class="el-icon-rss"></i></a></li>
            </ul>
            <h4 class="fade-up">Created by <a href="http://templatestock.co">Template Stock</a> - Copyright 2016</h4>
        </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/plugins.js"></script>
    <script type="text/javascript" src="js/init.js"></script>
</body>

</html>