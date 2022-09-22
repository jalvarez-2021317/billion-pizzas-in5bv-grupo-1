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
                            <a href="#" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#addModal"> 
                                Agregar comida 
                            </a>
                        </div>
                    </div>
                </div>
            </section>
            <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-warning text-white">
                            <h5 class="modal-title" id="exampleModalLabel">Llena esta información: </h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletComidas" class="was-validated">
                            <div class="modal-body">

                                <div class="mb-3">
                                    <label for="nombre_comida" class="col-form-label">Nombre del platillo:</label>
                                    <input type="text" class="form-control" id="nombre_comida" name="nombre_comida" required>
                                </div>
                                <div class="mb-3">
                                    <label for="precio" class="col-form-label">precio:</label>
                                    <input type="text" class="form-control" id="precio" name="precio" required>
                                </div>
                                <input type="hidden" class="form-control" id="accion" name="accion" value="insert">

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">Send message</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <section id="comida">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12 col-md-9">
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
                                        <td>
                                            <a>
                                                <i class="far fa-edit" href="{pageContext.request.contextPath}/ServletComidas?accion=editar"></i> Editar</td>
                                            </a>
                                            
                                        <td>
                                            <a class="btn btn-secondary" href="{pageContext.request.contextPath}/ServletComidas?accion=eliminar&id_comidas=${comida.id_comidas}">
                                                <i class="far fa-trash-alt"></i> Eliminar
                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>  
                    <div class = "col-12 col-md-3">
                        <div class="card text-center bg-warning text-white mb-3">
                            <div class="card-body">
                                <h3>Precio de todo el menú</h3>
                                <h4>Q900.00</h4>
                            </div>

                        </div>
                        <div class="card text-center bg-danger text-white mb-5">
                            <div class="card-body">
                                <h3>Total de Opciones: </h3>
                                <h4>5</h4>
                            </div>

                        </div>
                    </div>
                </div>
            </section>

        </main>

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js" ></script>


        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
