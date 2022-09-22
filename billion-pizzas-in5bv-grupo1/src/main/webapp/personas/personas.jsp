<%-- 
    Document   : personas
    Created on : 25/08/2022, 14:02:16
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
                            <a href="#" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addModal">Agregar persona</a>
                        </div>
                    </div>
                </div>
            </section>

            <!-- Modal-->
            <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-primary text-white text-alignt-center">
                            <h5 class="modal-title" id="exampleModalLabel">Agregar personas</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletPersonas" class="was-validated">
                            <div class="modal-body">
                                <div class="mb-3">
                                    <label for="dpi_cui" class="col-form-label">No. DPI</label>
                                    <input type="number" class="form-control" id="id" name="dpi_cui" required>
                                </div>
                                <div class="mb-3">
                                    <label for="nombre1" class="col-form-label">Primer nombre</label>
                                    <input type="text" class="form-control" id="nombre1" name="nombre1" required>
                                </div>
                                <div class="mb-3">
                                    <label for="nombre2" class="col-form-label">Segundo nombre</label>
                                    <input type="text" class="form-control" id="nombre2" name="nombre2" required>
                                </div>
                                <div class="mb-3">
                                    <label for="nombre3" class="col-form-label">Tercer nombre</label>
                                    <input type="text" class="form-control" id="nombre3" name="nombre3" required step="any">
                                </div>
                                <div class="mb-3">
                                    <label for="apellido1" class="col-form-label">Primer apellido</label>
                                    <input type="text" class="form-control" id="apellido1" name="apellido1" required>
                                </div>
                                <div class="mb-3">
                                    <label for="apellido2" class="col-form-label">Segundo apellido</label>
                                    <input type="text" class="form-control" id="apellido2" name="apellido2" required>
                                </div>
                                 <div class="mb-3">
                                    <label for="telefono" class="col-form-label">Teléfono</label>
                                    <input type="tel" class="form-control" id="telefono" name="telefono" required>
                                 </div>
                                 <div class="mb-3">
                                    <label for="correo" class="col-form-label">Correo</label>
                                    <input type="email" class="form-control" id="correo" name="correo" required>
                                </div>
                                 <div class="mb-3">
                                    <label for="direccion" class="col-form-label">Dirección</label>
                                    <input type="text" class="form-control" id="direccion" name="direccion" required>
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
                            
            <!-- Tabla con listado de estudiantes-->
            <section id="persona">
                <div class="container mb-5 pb-5">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <center><h4>Registro de las personas</h4></center>
                                </div>
                            </div>
                            <table class="table table-striped">
                                <thead class="table-dark">
                                    <tr>
                                        <th>DPI</th>
                                        <th>Nombre</th>
                                        <th>Telefono</th>
                                        <th>Correo</th>
                                        <th>Dirección</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="persona" items="${listadoDePersonas}">
                                        <tr>
                                            <td>${persona.dpi}</td>
                                            <td>${persona.nombre1} ${persona.nombre2} ${persona.nombre3} ${persona.apellido1} ${persona.apellido2}</td>
                                            <td>${persona.telefono}</td>
                                            <td>${persona.correo}</td>
                                            <td>${persona.direccion}</td>
                                            <td>
                                                <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/ServletPersonas?accion=editar&dpi=${persona.dpi}">
                                                    <i class="fa-solid fa-user-pen"></i>
                                                </a>
                                            </td>
                                            <td>
                                                <a class="btn btn-secondary" href="${pageContext.request.contextPath}/ServletPersonas?accion=eliminar&dpi=${persona.dpi}">
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
