<header class="bg-warning">
    <nav class="container-xxl bd-gutter flex-wrap flex-lg-nowrap navbar navbar-expand-lg bg-warning p-2" id="menu"> 
        <div class="container-fluid">
            <a class="navbar-brand " href="#">
                <img src="${pageContext.request.contextPath}/assets/images/logo.png" alt="" width="33" height="30" class="d-inline-block align-text-top">
                <span class="text-light fs-5 fw-bolder">Billion</span> 
                <span class="fs-5 fw-bolder">Pizza´s</span>
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav"> <!-- align-items-center -->
                <ul class="navbar-nav">
                    <li class="nav-item col-6 col-lg-auto">
                        <a class="nav-link active py-2 px-0 px-lg-2" aria-current="page" href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
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

                <ul class="navbar-nav flex-row flex-wrap ms-md-auto">
                    <li class="nav-item py-1 col-12 col-lg-auto">
                        <div class="vr d-none d-lg-flex h-100 mx-lg-2 text-black"></div>
                        <hr class="d-lg-none text-black-50">
                    </li>
                    <a class="btn btn-outline-dark" href="${pageContext.request.contextPath}/menus/menu.jsp" role="button"> Login </a>
                </ul>

                <form class="d-flex" role="search">                                          

                </form>
            </div> 
        </div>
    </nav>
</header>