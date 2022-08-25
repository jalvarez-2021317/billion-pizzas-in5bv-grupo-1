<%-- 
    Document   : index
    Created on : 24/08/2022, 20:26:17
    Author     : Grúpo 1
    Código técnico : IN5BV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">

    <head>
        <title>Billion Pizza´s</title>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Importaciones CSS y Javascript(necesarios) -->
        <link rel="stylesheet" type="text/css" href="./assets/css/estilos-billon-pizzas.css"/>
        <link rel="stylesheet" type="text/css" href="./assets/css/bootstrap.css"/>

    </head>
    <body>
        <!-- header encabezado -->
        <header class="container-fluid bg-warning d-flex justify-content-center">
            <p class="text-dark mb-0 p-1 fs-6">Bienvenidos</p>
        </header>

        <jsp:include page="./WEB-INF/paginas/comunes/cabecera-login.jsp"/>

        <!-- Slider -->
        <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="./assets/images/slider1.jpg" class="d-block w-100" alt="Slider 1">
                </div>
                
                <div class="carousel-item">
                    <img src="./assets/images/slider2.png" class="d-block w-100" alt="Slider 2">
                </div>
                
                <div class="carousel-item">
                    <img src="./assets/images/slider3.jpg" class="d-block w-100" alt="Slider 3">
                </div>
            </div>
            
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>



        <!-- Importaciones Javascript -->
        <script type="text/javascript" src="./assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="./assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="./assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="./assets/js/script.js"></script>
        <script type="text/javascript" src="./assets/js/bootstrap.bundle.js"></script>    

    </body>

</html>

