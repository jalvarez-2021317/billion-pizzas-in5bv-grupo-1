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
        
        <jsp:include page="./WEB-INF/paginas/comunes/cabecera-login.jsp"/>
       
        <!-- Slider -->
        <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="./assets/images/pizzas6.webp" class="d-block w-100" alt="Slider 1">
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
        
        
        <!-- Introducción -->      
        <section class="w-50 mx-auto text-center pt-5" id="intro">
            <h1 class="p-3 fs-2 border-top border-3">Pide en línea en la mejor pizzeria del
                <span class="text-warning">Mundo</span>
            </h1>
            
            <p class="p-3 fs-4">
                <span class="text-warning">Billion Pizza´s </span>
                encuentras pizzas de especialidades, pizzas Prémium,
                combos y Promociones, todo esto para satisfacer tus
                necesidades y cumplir con tus expectativas.
            </p>
        </section>
        
        
        <!-- Servicios Prestados -->
        <section class="container-fluid">
            <div class="row w-75 mx-auto servicio-fila">
                <div class="col-lg-6 col-md-12 col-sm-12 d-flex my-3 icono-wrap">
                    <img src="./assets/images/servicios1.jpg" alt="alt" width="180" height="160"/>
                    <div>
                        <h3 class="fs-5 mt-4 px-4 pb-1">Entrega a Domicilio</h3>
                        <p class="px-4">Entregamos a Domicilio donde se nos sea posible
                            para que puedas disfrutar de nuestras Pizzas</p>
                    </div>
                </div>
                <div class="col-lg-6 col-md-12 col-sm-12 d-flex my-3 icono-wrap">
                    <img src="./assets/images/servicios2.png" alt="alt" width="180" height="160"/>
                    <div>
                        <h3 class="fs-5 mt-4 px-4 pb-1">Tiempo Record</h3>
                        <p class="px-4">Se promete entregar en el rango de 30 minutos
                            o la pizza es Gratis</p>
                    </div>
                </div>
            </div>
            
            <div class="row w-75 mx-auto servicio-fila">
                <div class="col-lg-6 col-md-12 col-sm-12 d-flex my-3 icono-wrap">
                    <img src="./assets/images/pizzaCupon.webp" alt="alt" width="180" height="160"/>
                    <div>
                        <h3 class="fs-5 mt-4 px-4 pb-1">Uso de Cupones</h3>
                        <p class="px-4">Puede hacer uso de cupones para adquirir nuestros
                        productos, los mejores son de fechas especiales</p>
                    </div>
                </div>
                <div class="col-lg-6 col-md-12 col-sm-12 d-flex my-3 icono-wrap"> 
                    <img src="./assets/images/pizzaPromociones.webp" alt="alt" width="180" height="160"/>
                    <div>
                        <h3 class="fs-5 mt-4 px-4 pb-1">Promociones</h3>
                        <p class="px-4">Lanzamiento continuo de promociones, dando ofertas
                        asequibles para nuestros clientes</p>
                    </div>                  
                </div>
            </div>
        </section>

        
        <!-- Acerca de -->
        <section class="p-5">
            <div class="w-75 m-auto text-center" id="equipo">
                <h1 class="p-3 mb-2 fs-2 border-top border-3">
                    Pizzeria pequeña pero con<span class="text-warning"> Grandes Resultados</span>
                </h1>
                
                <p class=" fs-4">Siempre buscamos lo mejor en cualquier
                    ámbito, contratando a las personas adecuadas para
                    el servicio a los clientes, y buscando los mejores
                    ingredientes para complacerte con tus alimentos, te
                    esperamos para que te unas a nosotros.</p>
            </div>
            <div class="mt-5 text-center">
                <img class="img-fluid" src="assets/images/pizzas2.webp" alt=""/>
            </div>
        </section>


        <!-- Importaciones Javascript -->
        <script type="text/javascript" src="./assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="./assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="./assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="./assets/js/script.js"></script>
        <script type="text/javascript" src="./assets/js/bootstrap.bundle.js"></script>    

    </body>

</html>
