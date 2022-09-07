<%-- 
    Document   : menu
    Created on : 25/08/2022, 13:49:10
    Author     : Grúpo 1
    Código técnico : IN5BV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">

    <!-- Cabeza de la página-->
    <head>
        <title> Menu</title>
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
            <!-- Contenido principal -->
            <section id="accions" class="p-4">
                <div class="container">                    
                    <div class="row">
                        <div class="col-12">
                            <a class="btn btn-primary" href="#">Agregar Menu</a>
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
                                    <h4>Listado de Menus</h4>
                                </div>
                            </div>

                            <table class="table table-striped table-success">
                                <thead class="table-dark"> <!-- Encabezodo de la table thead -->
                                    <tr>
                                        <th>Id Menu</th>
                                        <th>Horario Comida</th>
                                        <th>Horario Apertura</th>
                                        <th>Horario Cierre</th>
                                        <th>Comidas Id</th>
                                        <th>Bebidas Id</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <c:forEach var="menu" items="${listadoDeMenu}">
                                        <tr>
                                            <th scope="row">${menu.id_menu}</th>
                                            <td>${menu.horario_comida}</td>
                                            <td>${menu.horario_apertura}</td>
                                            <td>${menu.horario_cierre}</td>
                                            <td>${menu.comidas_id}</td>
                                            <td>${menu.bebidas_id}</td>                                            
                                            <td>
                                                <i class="fa-solid fa-pen-to-square"></i>
                                            </td>
                                            <td>
                                                <i class="fa-solid fa-trash-arrow-up"></i>
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
