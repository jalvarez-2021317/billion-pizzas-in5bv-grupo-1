<%-- 
    Document   : tipo-empleado
    Created on : 25/08/2022, 14:01:46
    Author     : Isai Subuyuj 
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value = "es_GT"/>

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
                            <a class="btn btn-warning" href="#" data-bs-toggle="modal" data-bs-target="#addModal">
                                Agregar Cargo
                            </a>
                        </div>

                    </div>
                </div>
            </section>

            <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-warning text-white">
                            <h5 class="modal-title" id="exampleModalLabel">Llena esta información:</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletEmpleados" class="was-validated">
                            <div class="modal-body">

                                <div class="mb-3">
                                    <label for="puesto" class="col-form-label">puesto:</label>
                                    <input type="text" class="form-control" id="puesto" name="puesto" required>
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

            <section id="tipo_empleado">
                <div class="container  mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4> <center>Listado de Cargos</center></h4>
                                </div>
                            </div>
                            <table class="table table-dark table-striped">
                                <thead class="table-secondary">
                                    <tr>

                                        <th>ID</th>
                                        <th>Puesto</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="tipo_empleados" items="${listarTipos_empleados}">
                                        <tr>
                                            <td>${tipo_empleados.id}</td>
                                            <td>${tipo_empleados.puesto}</td>
                                            <td>
                                                <a>
                                                    <i class="btn btn-secondary" href="{pageContext.request.contextPath}/ServletTipo_empleados?accion=editar">
                                                    </i> Editar
                                                </a>
                                            </td>
                                            <td>
                                                <a class="btn btn-secondary" href="{pageContext.request.contextPath}/ServletTipo_empleados?accion=eliminar&id=${tipo_empleados.id}">
                                                    <i class="far fa-trash-alt"></i> Eliminar
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                </tbody>
                            </table>
                        </div>
                        <div class = "col-3">
                            <div class="card text-center bg-warning text-white mb-3">
                            </div>
                            <div class="card text-center bg-danger text-white mb-5">
                                <div class="card-body">
                                    <h3>Total de Empleados</h3>
                                    <h4>${totalEmpleados}</h4>
                                </div>

                            </div>
                        </div>

                    </div>
                </div>
            </section>
        </main>


        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>

        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>

