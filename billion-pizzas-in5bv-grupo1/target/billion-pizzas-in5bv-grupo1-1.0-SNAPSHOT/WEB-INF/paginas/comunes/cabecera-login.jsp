<nav class="navbar navbar-expand-lg bg-light p-2" id="menu"> 
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <span class="text-warning fs-5 fw-bolder">Billion</span> 
            <span class="fs-5 fw-bolder">Pizza´s</span>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/menu/menu.jsp">Menú</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/bebidas/bebidas.jsp">Bebidas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/clientes/clientes.jsp">Clientes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/ServletComidas?accion=listar">Comidas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/ServletEmpleados?accion=listar">Empleados</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/ServletFacturas?accion=listar">Factura</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/menus/menus.jsp">Menu</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/ServletOrdenes?accion=listar">Ordenes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/ServletPersonas?accion=listar">Personas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/provedores/provedores.jsp">Provedores</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/ServletTipo_empleados?accion=listar">Cargo</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="${pageContext.request.contextPath}/usuarios/usuarios.jsp">Usuarios</a>
                </li>
            </ul>
            <form class="d-flex" role="search">                                          

            </form>
        </div> 
    </div>
</nav>
