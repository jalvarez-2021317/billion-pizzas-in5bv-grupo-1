<nav class="navbar navbar-expand-lg bg-warning p-2" id="menu"> 
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <span class="text-light fs-5 fw-bolder">Billion</span> 
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

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Menú
                    </a>
                    <ul class="dropdown-menu bg-warning">
                        <li><a class="dropdown-item"  href="${pageContext.request.contextPath}/menus/menu.jsp">Pizzas</a></li>
                        <li><a class="dropdown-item"  href="#">Bebidas</a></li>
                    </ul>
                </li>
          
            </ul>
            <form class="d-flex" role="search">                                          

            </form>
        </div> 
    </div>
</nav>