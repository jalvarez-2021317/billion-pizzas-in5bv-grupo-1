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
            <section id="accions" class="p-2">
                <div class="container">                    
                    <div class="row">
                        <div class="col-12">
                            <a href="#" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#addModal">Agregar Bebias</a>
                        </div>
                    </div>
                </div>
            </section>

            <!<!-- Modal -->
            <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header bg-warning text-white">
                            <h5 class="modal-title" id="exampleModalLabel">Agregar Menú</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletMenu" class="was-validated">
                            <div class="modal-body">

                                <div class="mb-3">
                                    <label for="horarioComida" class="col-form-label">Horario Comida</label>
                                    <input type="datetime" class="form-control" id="horarioComida" name="horarioComida" required>
                                </div>
                                <div class="mb-3">
                                    <label for="horarioApertura" class="col-form-label">Horario Apertura</label>
                                    <input type="datetime" class="form-control" id="horarioApertura" name="horarioApertura" required>
                                </div>
                                <div class="mb-3">
                                    <label for="horarioCierre" class="col-form-label">Horario Cierre</label>
                                    <input type="datetime" class="form-control" id="horarioCierre" name="horarioCierre" required>
                                </div>
                                <div class="mb-3">
                                    <label for="comidasId" class="col-form-label">Comidas Id</label>
                                    <input type="number" class="form-control" id="comidasId" name="comidasId" required step="any">
                                </div>
                                <div class="mb-3">
                                    <label for="bebidasId" class="col-form-label">Bebidas Id</label>
                                    <input type="number" class="form-control" id="bebidasId" name="bebidasId" required step="any">
                                </div>

                                <input type="hidden" class="form-control" id="accion" name="accion" value="insertar">


                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                <!-- Al conectar botones a una acciones deben de ser tipo "submit" -->
                                <button type="submit" class="btn btn-primary">Guardar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <section id="estudiante">
                <div class="container mb-5 pb-5">
                    <div class="row">

                        <div class=" col-12 col-md-9">

                            <section id="accions" class="p-3">
                                <div class="card">
                                    <div class="card-header text-center">
                                        <h4>Listado de Menus</h4>
                                    </div>
                                </div>
                            </section>                           

                            <table class="table table-striped table-warning">
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
                                                <a class="btn btn-secondary" href="${pageContext.request.contextPath}/ServletMenu?accion=editar&idMenu=${menu.id_menu}">    
                                                    <i class="fa-solid fa-pen-to-square"></i>
                                                    Editar
                                                </a>
                                            </td>
                                            <td>
                                                <a class="btn btn-danger" href="${pageContext.request.contextPath}/ServletMenu?accion=eliminar&idMenu=${menu.id_menu}">    
                                                    <!-- //accion y despues lo que realizara Eliminar, para un segunda parametro es con "&" -->
                                                    <i class="fa-solid fa-trash-arrow-up"></i> Eliminar
                                                </a>                                                
                                            </td>
                                        </tr> 
                                    </c:forEach>

                                </tbody>
                            </table>
                        </div>

                        <div class="col-12 col-md-3">
                            <div class="card text-center bg-success text-white mb-3">
                                <div class="card-body">
                                    <h3>Total Menús</h3>
                                    <h4 class="display-6">
                                        ${totalMenus}
                                    </h4>
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
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
