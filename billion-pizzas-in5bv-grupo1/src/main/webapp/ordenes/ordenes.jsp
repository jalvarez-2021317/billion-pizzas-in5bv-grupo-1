<%-- 
    Document   : ordenes
    Created on : 25/08/2022, 14:05:07
    Author     : informatica
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value = "es_GT"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <!-- Cabeza de la página-->
    <head>
        <title> Billion Pizzas</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../assets/css/estilos-billon-pizzas.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/flexslider.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        <script src="../assets/js/b0a86746f8.js"></script>
    </head>
    <!-- Cuerpo de la página-->



    <body>
        <header>
            <!-- Encabezado de la página-->
            <div class="container">
                <div class="row">
                </div>
            </div>
        </header>


        <jsp:include page="../WEB-INF/paginas/comunes/cabecera-login.jsp" />
        <aside>
            <!-- Información secundaria-->
        </aside>
        <main>
            <!-- Contenido principal-->
            <section id="accions"  class="py-4 mb-4">
                <div class="container" >
                    <div class="row">
                        <div class="col-12" >
                            <a class="btn btn-primary" href="#">
                                Agregar Orden 
                            </a>
                        </div>

                    </div>
                </div>

            </section>

            <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-primary text-white text-alignt-center">
                            <h5 class="modal-title" id="exampleModalLabel">Agregar Orden</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletOrdenes" class="was-validated">
                            <div class="modal-body">
                                <div class="mb-3">
                                    <label for="hora_entrega" class="col-form-label">hora de Entrega</label>
                                    <input type="Time" class="form-control" id="hora_entrega" name="hora_entrega" required>
                                </div>
                                <div class="mb-3">
                                    <label for="cliente_id" class="col-form-label">Cliente Id</label>
                                    <input type="number" class="form-control" id="cliente_id" name="cliente_id" required>
                                </div>
                                <div class="mb-3">
                                    <label for="menu_id" class="col-form-label">Menu ID</label>
                                    <input type="number" class="form-control" id="menu_id" name="menu_id" required>
                                </div>
                                <input type="hidden" class="form-control" id="accion" name="accion" value="insertar">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                <button type="submit" class="btn btn-primary">Guardar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <section id="estudiante">
                <div class="container  mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4> <center>Listado de Ordenes</center></h4>
                                </div>
                            </div>
                            <table class="table table-dark table-striped">
                                <thead class="table-secondary">
                                    <tr>
                                        <th>#</th>
                                        <th>Hora de entrega</th>
                                        <th>Cliente </th>
                                        <th>Menu</th><th>editar</th>
                                        <th>eliminar</th>

                                    </tr>
                                </thead>
                                <tbody>

                                    <c:forEach var="orden" items = "${listadoDeOrdenes}">                                
                                        <tr>
                                            <td>${orden.id_orden}</td>
                                            <td>${orden.hora_entrega} </td>
                                            <td>${orden.cliente_id}</td>   
                                            <td>${orden.menu_id}</td>
                                            <td>
                                                 <a class="btn btn-danger" href="${pageContext.request.contextPath}/ServletOrdenes?accion=editar&idOrden=${orden.id_orden}">
                                                    <is class="fa-solid fa-user-pen"></i>  </a>
                                            </td>
                                            <td>
                                                <a class="btn btn-secondary" href="${pageContext.request.contextPath}/ServletOrdenes?accion=eliminar&id_orden=${orden.id_orden}">
                                                    <i class="fa-solid fa-user-xmark"></i>
                                                </a>
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


        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="../assets/js/script.js"></script>
        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
