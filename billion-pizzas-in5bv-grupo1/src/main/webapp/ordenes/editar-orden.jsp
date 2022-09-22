<%-- 
    Document   : editar-orden
    Created on : 25/08/2022, 14:14:25
    Author     : informatica
--%>

@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">
    <head>
        <title> Editar Ordenes</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../assets/css/hoja-estilo-kinal.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/flexslider.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        <script src="../assets/js/a6e787f963.js"></script>
    </head>
    <body>
        <header>
            <!-- Encabezado de la página-->
            <div class="container" >
                <div class="row">
                    <div class="col-12">
                    </div>
                </div>
            </div>
        </header>

        <jsp:include page="../WEB-INF/paginas/comunes/cabecera-login.jsp" />

        <main>
            <div class="container">
                <div class="row mt-5 mb-5 pb-5">
                    <div class="col-1">

                    </div>
                    <div class="col-10">
                        <div class="card">
                            <div class="card-header">
                                <h4>Editar Empleado</h4>
                            </div>
                        </div>
                        <a class="btn btn-dark mt-5" href="${pageContext.request.contextPath}/ordenes/ordenes.jsp">
                            <i class="fa fa-arrow-left"></i>  Regresar/Cancelar
                        </a>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletEmpleado">
                            <div class="modal-body">
                                <div class="mb-3">
                                    <label for="id" class="col-form-label">ID</label>
                                    <input type="number" class="form-control" id="id" name="Id" value="$${orden.id_orden}" readonly="true" required>
                                </div>
                                <div class="mb-3">
                                    <label for="hora_entrega" class="col-form-label">Hora Entrega</label>
                                    <input type="time" class="form-control" id="hora_entrega" name="hora_entrega" value="${orden.hora_entrega} " required>
                                </div>
                                <div class="mb-3">
                                    <label for="cliente_id" class="col-form-label">Cliente Id</label>
                                    <input type="text" class="form-control" id="cliene_id" name="cliente_id value="${orden.cliente_id}" required>
                                </div>
                                <div class="mb-3">
                                    <label for="menu_id" class="col-form-label">Menu Id</label>
                                    <input type="text" class="form-control" id="menu_id" name="cliente_id value="${orden.menu_id}" required>
                                </div>
                                
                                </div>
                                <input type="hidden" id="accion" name="accion" value="actualizar">

                                <center> <button type="submit" class="btn btn-success ">
                                    <i class="fas fa-check"></i>
                                    Guardar Cambios </button>

                                <a class="btn btn-danger center " href="${pageContext.request.contextPath}/ServletEstudiante?accion=eliminar=&idEstudiante=${estudiante.id}">
                                    <i class="fas fa-trash"></i>Eliminar</a></center>
                        </form>
                    </div>
                    <div class="col-1">

                    </div>
                </div>
            </div>
        </main>

        

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-3.4.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery-migrate-1.4.1.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>


