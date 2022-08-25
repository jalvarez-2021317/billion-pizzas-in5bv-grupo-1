<%-- 
    Document   : menu
    Created on : 25/08/2022, 13:49:10
    Author     : Grúpo 1
    Código técnico : IN5BV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">

    <head>
        <title>Billion Pizza´s Menú</title>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Importaciones CSS y Javascript(necesarios) -->
        <link rel="stylesheet" type="text/css" href="../assets/css/estilos-billon-pizzas.css"/>
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css"/>

    </head>
    <body>
        <!-- header encabezado -->

        <!-- Menú -->
        <jsp:include page="../WEB-INF/paginas/comunes/cabezera.jsp"/>

        <main>
            <!-- Contenido principal -->
            <section>
                <article id="contenido">  
                    
                    <div class="container">                      
                        <div class="row">
                            
                            <section id="accions" class="p-4">
                                <div class="card bg-dark text-center">
                                    <div class="card-header text-light">
                                        <h4>Especialidades</h4>
                                    </div>
                                </div>
                             </section>
                                
                            <div class="col-12 col-sm-6 col-md-4 col-lg-3">
                                <div class="container">
                                    <div class="row">
                                        <div class="card" style="width: 18rem;">
                                            <img src="../assets/images/pizza-pepperoni.webp" class="card-img-top pt-2" alt="...">
                                            <div class="card-body">
                                              <h5 class="card-title">Pizza de Pepperoni</h5>
                                              <p class="card-text">
                                                  Delicioso pan de trigo bañado en salsa,
                                                  queso mosarela y delicioso pepperoni.
                                              </p>
                                              <h6>Tamaño: Grande, Mediano</h6>
                                              <a href="https://www.dominos.com.gt/es/pages/order/menu#!/menu/category/entrees/" class="btn btn-danger">PIDE YA</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-sm-6 col-md-4 col-lg-3">
                                <div class="container">
                                    <div class="row">
                                        <div class="card" style="width: 18rem;">
                                            <img src="../assets/images/pizza-estaciones.png" class="card-img-top pt-2" alt="...">
                                            <div class="card-body">
                                              <h5 class="card-title">Pizza 4 Estaciones</h5>
                                              <p class="card-text">
                                                  Delicioso pan de trigo bañado en salsa,
                                                  queso mosarela, jamon con piña, carne y peperoni
                                              </p>
                                              <h6>Tamaño: Grande, Mediano</h6>
                                              <a href="https://www.dominos.com.gt/es/pages/order/menu#!/menu/category/entrees/" class="btn btn-danger">PIDE YA</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="col-12 col-sm-6 col-md-4 col-lg-3">
                                <div class="container">
                                    <div class="row">
                                        <div class="card" style="width: 18rem;">
                                            <img src="../assets/images/pizza-hawaiana.jpg" class="card-img-top pt-2" alt="...">
                                            <div class="card-body">
                                              <h5 class="card-title">Pizza Hawaiana</h5>
                                              <p class="card-text">
                                                  Delicioso pan de trigo bañado en salsa,
                                                  queso mosarela y jamon con piña.
                                              </p>
                                              <h6>Tamaño: Grande, Mediano</h6>
                                              <a href="https://www.dominos.com.gt/es/pages/order/menu#!/menu/category/entrees/" class="btn btn-danger">PIDE YA</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="col-12 col-sm-6 col-md-4 col-lg-3">
                                <div class="container">
                                    <div class="row">
                                        <div class="card" style="width: 18rem;">
                                            <img src="../assets/images/pizza-bbq.jpg" class="card-img-top pt-2" alt="...">
                                            <div class="card-body">
                                              <h5 class="card-title">Pizza Barbacoa</h5>
                                              <p class="card-text">
                                                  Delicioso pan de trigo bañado en salsa,
                                                  queso mosarela, salsa BBQ y dos tipos de carne.
                                              </p>
                                              <h6>Tamaño: Grande, Mediano</h6>
                                              <a href="https://www.dominos.com.gt/es/pages/order/menu#!/menu/category/entrees/" class="btn btn-danger">PIDE YA</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>

                        </div>
                    </div>

                </article> 
            </section>
        </main>




        <!-- Importaciones Javascript -->
        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/script.js"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>    

    </body>

</html>
