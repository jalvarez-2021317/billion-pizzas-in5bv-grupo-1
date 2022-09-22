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
                            <a href="#" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addModal">Agregar factura</a>
                        </div>
                    </div>
                </div>
            </section>
            
            <!-- Modal-->
            <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-primary text-white text-alignt-center">
                            <h5 class="modal-title" id="exampleModalLabel">Agregar factura</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletFacturas" class="was-validated">
                            <div class="modal-body">
                                <div class="mb-3">
                                    <label for="serie" class="col-form-label">Serie</label>
                                    <input type="text" class="form-control" id="serie" name="serie" required>
                                </div>
                                <div class="mb-3">
                                    <label for="fecha" class="col-form-label">Fecha</label>
                                    <input type="date" class="form-control" id="fecha" name="fecha" required>
                                </div>
                                <div class="mb-3">
                                    <label for="nombre" class="col-form-label">Nombre</label>
                                    <input type="text" class="form-control" id="nombre" name="nombre" required>
                                </div>
                                <div class="mb-3">
                                    <label for="direccion" class="col-form-label">Dirección</label>
                                    <input type="text" class="form-control" id="direccion" name="direccion" required>
                                </div>
                                <div class="mb-3">
                                    <label for="nit" class="col-form-label">NIT</label>
                                    <input type="text" class="form-control" id="nit" name="nit" required>
                                </div>
                                <div class="mb-3">
                                    <label for="total" class="col-form-label">Total</label>
                                    <input type="number" class="form-control" id="total" name="total" required step="any">
                                </div>
                                <div class="mb-3">
                                    <label for="cliente" class="col-form-label">Cliente ID</label>
                                    <input type="number" class="form-control" id="cliente" name="cliente" required step="any">
                                </div>
                                <div class="mb-3">
                                    <label for="orden" class="col-form-label">Orden ID</label>
                                    <input type="number" class="form-control" id="orden" name="orden" required step="any">
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

            <section id="factura">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <center><h4>Registro de facturas</h4></center>
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
                                                <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletFacturas?accion=editar&noFactura=${factura.noFactura}">
                                                    <i class="fa-solid fa-user-pen"></i>
                                            </td>
                                            <td>
                                                <a class="btn btn-secondary" href="${pageContext.request.contextPath}/ServletFacturas?accion=eliminar&noFactura=${factura.noFactura}">
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
