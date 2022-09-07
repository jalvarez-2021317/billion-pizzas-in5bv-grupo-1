<%-- 
    Document   : factura
    Created on : 25/08/2022, 14:02:48
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fnt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">

    <!-- Cabeza de la página-->

    <head>
        <title>Billion Pizza´s</title>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Importaciones CSS y Javascript(necesarios) -->
        <link rel="stylesheet" type="text/css" href="../assets/css/estilos-billon-pizzas.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/flexslider.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        <script src="../assets/js/b0a86746f8.js"></script>
    </head>
    <!-- Cuerpo de la página-->

    <body>
        <!-- header encabezado -->


        <!-- Menú -->
        <jsp:include page="../WEB-INF/paginas/comunes/cabecera-login.jsp" />

        <!-- Slider -->

        <main>
            <!-- Contenido principal-->
            <section id="accions" class="py-4 mb-4">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <a href="#" class="btn btn-primary">Agregar Factura</a>
                        </div>
                    </div>
                </div>
            </section>

            <section id="factura">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Registro de facturas</h4>
                                </div>
                            </div>
                            <table class="table table-striped">
                                <thead class="table-dark">
                                    <tr>
                                        <th>No.Factura</th>
                                        <th>Serie</th>
                                        <th>Fecha</th>
                                        <th>Nombre</th>
                                        <th>Dirección</th>
                                        <th>NIT</th>
                                        <th>Total</th>
                                        <th>Cliente ID</th>
                                        <th>Orden ID</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="factura" items="${listadoDeFacturas}">
                                        <tr>
                                            <td>${factura.noFactura}</td>
                                            <td>${factura.serie}</td>
                                            <td>${factura.fecha}</td>
                                            <td>${factura.nombre}</td>
                                            <td>${factura.direccion}</td>
                                            <td>${factura.nit}</td>
                                            <td>${factura.total}</td>
                                            <td>${factura.clienteId}</td>
                                            <td>${factura.ordenId}</td>
                                            <td>
                                                <i class="fa-solid fa-user-pen"></i>
                                            </td>
                                            <td>
                                                <i class="fa-solid fa-user-xmark"></i>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>   
                </div>
            </section>
        </main>
        <!-- conexion con una página común -->

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="../assets/js/script.js"></script>
        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
