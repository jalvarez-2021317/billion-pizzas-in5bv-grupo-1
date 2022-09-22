<%-- 
    Document   : editar-persona
    Created on : 25/08/2022, 14:14:41
    Author     : Carlos Pérez
    Código técnico : IN5BV G1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Editar Persona</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="../assets/css/estilos-billon-pizzas.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/flexslider.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/bootstrap.css" />
        <script src="../assets/js/b0a86746f8.js"></script>
    </head>
    <body>
        <jsp:include page="../WEB-INF/paginas/comunes/cabecera-login.jsp" />

        <main>
            <div class="container">
                <div class="row mt-5 mb-5 pb-5">
                    <div class="col-1">

                    </div>
                    <div class="col-10">
                        <div class="card">
                            <div class="card-header bg-black bg-opacity-25">
                                <center><h4>Editar persona</h4></center>
                            </div>
                        </div>
                        <a class="btn btn-secondary mt-3" href="${pageContext.request.contextPath}/personas/personas.jsp">
                            <i class="fa fa-arrow-left"></i> Regresar/Cancelar
                        </a>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletPersonas">
                            <div class="mb-3">
                                <label for="id" class="col-form-label">ID Persona</label>
                                <input type="number" class="form-control" id="id" name="id" value="${persona.dpi}" readonly="true" required>
                            </div>
                            <div class="mb-3">
                                <label for="nombre1" class="col-form-label">Primer nombre</label>
                                <input type="text" class="form-control" id="nombre1" name="nombre1" value="${persona.nombre1}" readonly="true" required>
                            </div>
                            <div class="mb-3">
                                <label for="nombre2" class="col-form-label">Segundo nombre</label>
                                <input type="text" class="form-control" id="nombre2" name="nombre2" value="${persona.nombre2}" readonly="true" required>
                            </div>
                            <div class="mb-3">
                                <label for="nombre3" class="col-form-label">Tercer nombre</label>
                                <input type="text" class="form-control" id="nombre3" name="nombre3" value="${persona.nombre3}" readonly="true" required step="any">
                            </div>
                            <div class="mb-3">
                                <label for="apellido1" class="col-form-label">Primer apellido</label>
                                <input type="text" class="form-control" id="apellido1" name="apellido1" value="${persona.apellido1}" readonly="true" required>
                            </div>
                            <div class="mb-3">
                                <label for="apellido2" class="col-form-label">Segundo apellido</label>
                                <input type="text" class="form-control" id="apellido2" name="apellido2" value="${persona.apellido1}" readonly="true" required>
                            </div>
                            <div class="mb-3">
                                <label for="telefono" class="col-form-label">Teléfono</label>
                                <input type="tel" class="form-control" id="telefono" name="telefono" value="${persona.telefono}" readonly="true" required>
                            </div>
                            <div class="mb-3">
                                <label for="correo" class="col-form-label">Correo</label>
                                <input type="email" class="form-control" id="correo" name="correo" value="${persona.correo}" readonly="true" required>
                            </div>
                            <div class="mb-3">
                                <label for="direccion" class="col-form-label">Dirección</label>
                                <input type="text" class="form-control" id="direccion" name="direccion" value="${persona.direccion}" readonly="true" required>
                            </div>
                            <input type="hidden" id="accion" name="accion" value="actualizar">
                            <div class="text-center">
                                <button type="submit" class="btn btn-success">
                                    <i class="fa-sharp fa-solid fa-check"></i> Guardar cambios
                                </button>
                                <a class="btn btn-danger" href="${pageContext.request.contextPath}/ServletPersonas?accion=eliminar&idPersonas=${persona.dpi}">
                                    <i class="fa-regular fa-trash-can"></i> Eliminar estudiante
                                </a>
                            </div>
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
        <script type="text/javascript" src="https://unpkg.com/@popperjs/core@2"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
