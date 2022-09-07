<%-- 
    Document   : comida
    Created on : 25/08/2022, 14:00:27
    Author     : Isai Subuyuj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value = "es_GT"/>

<!DOCTYPE html>
<html>
    <head>
        <title>Comidas</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../assets/css/estilos-billon-pizzas.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        <script src="../assets/js/06804efeea.js"></script>
        <jsp:include page="../WEB-INF/paginas/comunes/cabecera-login.jsp"/>
    </head>
    <body>
        <header>
            <!-- Encabezado de la página-->

        </header> 
        <main>
            <!-- Contenido principal-->
            <section id="accions" class="py-4 mb-4">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <a href="#" class="btn btn-warning"> Agregar comida </a>
                        </div>
                    </div>
                </div>
            </section>

            <section id="estudiante">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <center><h4>Listado de disponibilidad de comida</h4></center>
                                </div>
                            </div>
                        </div>
                        <table class="table table-dark table-striped">
                            <thead class="table-secondary">
                                <tr>

                                    <th>#</th>
                                    <th>Nombre</th>
                                    <th>precio</th>
                                    <th>Editar</th>
                                    <th>Eliminar</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="comida" items="${listarComidas}">
                                    <tr>
                                        <td>${comida.id_comidas}</td>
                                        <td>${comida.nombre_comida}</td>
                                        <td>${comida.precio}</td>
                                        <td><i class="far fa-edit"></i> Editar</td>
                                        <td><i class="far fa-trash-alt"></i> Eliminar</td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>   
                </div>
            </section>

        </main>

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js" ></script>
        <script type="text/javascript" src="../assets/js/script.js"></script>

        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
