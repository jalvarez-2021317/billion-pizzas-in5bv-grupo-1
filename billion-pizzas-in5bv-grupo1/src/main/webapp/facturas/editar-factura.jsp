<%-- 
    Document   : editar-factura
    Created on : 25/08/2022, 14:13:58
    Author     : Carlos Pérez
    Código técnico : IN5BV G1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT" />

<!DOCTYPE html>
<html>
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
                                <center><h4>Editar factura</h4></center>
                            </div>
                        </div>
                        <a class="btn btn-secondary mt-3" href="${pageContext.request.contextPath}/facturas/facturas.jsp">
                            <i class="fa fa-arrow-left"></i> Regresar/Cancelar
                        </a>
                        <form method="POST" action="${pageContext.request.contextPath}/ServletFacturas">
                            <div class="mb-3">
                                <label for="noFactura" class="col-form-label">No. Factura</label>
                                <input type="number" class="form-control" id="noFactura" name="noFactura" value="${factura.getNoFactura()}" readonly="true" required>
                            </div>
                            <div class="mb-3">
                                <label for="serie" class="col-form-label">Serie</label>
                                <input type="text" class="form-control" id="serie" name="serie" value="${factura.getSerie()}" required>
                            </div>
                            <div class="mb-3">
                                <label for="fecha" class="col-form-label">Fecha</label>
                                <input type="date" class="form-control" id="fecha" name="fecha" value="${factura.getFecha()}" required>
                            </div>
                            <div class="mb-3">
                                <label for="nombre" class="col-form-label">Nombre</label>
                                <input type="text" class="form-control" id="nombre" name="nombre" value="${factura.getNombre()}" required step="any">
                            </div>
                            <div class="mb-3">
                                <label for="direccion" class="col-form-label">Dirección</label>
                                <input type="text" class="form-control" id="direccion" name="direccion" value="${factura.getDireccion()}" required>
                            </div>
                            <div class="mb-3">
                                <label for="nit" class="col-form-label">NIT</label>
                                <input type="text" class="form-control" id="nit" name="nit" value="${factura.getNit()}" required>
                            </div>
                            <div class="mb-3">
                                <label for="total" class="col-form-label">Total</label>
                                <input type="number" class="form-control" id="total" name="total" value="${factura.getTotal()}" required>
                            </div>
                            <div class="mb-3">
                                <label for="cliente" class="col-form-label">Cliente ID</label>
                                <input type="number" class="form-control" id="cliente" name="cliente" value="${factura.getClienteId()}" required>
                            </div>
                            <div class="mb-3">
                                <label for="orden" class="col-form-label">Orden ID</label>
                                <input type="number" class="form-control" id="orden" name="orden" value="${factura.getOrdenId()}" required>
                            </div>
                            <input type="hidden" id="accion" name="accion" value="actualizar">
                            <div class="text-center">
                                <button type="submit" class="btn btn-success">
                                    <i class="fa-sharp fa-solid fa-check"></i> Guardar cambios
                                </button>
                                <a class="btn btn-danger" href="${pageContext.request.contextPath}ServletFacturas?accion=eliminar&noFactura=${factura.noFactura}">
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
