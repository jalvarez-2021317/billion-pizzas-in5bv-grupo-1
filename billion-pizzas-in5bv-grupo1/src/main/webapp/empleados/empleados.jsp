<%-- 
    Document   : empleados
    Created on : 25/08/2022, 14:09:18
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
                                Agregar Empleado 
                            </a>
                        </div>

                    </div>
                </div>

            </section>

            <section id="estudiante">
                <div class="container  mb-5 pb-5">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4> <center>Listado de Empleados</center></h4>
                                </div>
                            </div>
                            <table class="table table-dark table-striped">
                                <thead class="table-secondary">
                                    <tr>
                                        <th>ID</th>
                                        <th>Persona id</th>
                                        <th>Tipo de empleado id</th>
                                        <th>editar</th>
                                        <th>eliminar</th>

                                    </tr>
                                </thead>
                                <tbody>

                                    <c:forEach var="empleado" items = "${listarEmpleado}">                                
                                               <tr>
                                                   <td>${empleado.id_empleado}</td>
                                                   <td>${empleado.persona_id}</td>
                                                   <td>${empleado.tipo_empleado_id}</td>                        <td>
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


            <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
            <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
            <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
            <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
            <script type="text/javascript" src="../assets/js/script.js"></script>
            <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
            <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
        </body>
    </html>
