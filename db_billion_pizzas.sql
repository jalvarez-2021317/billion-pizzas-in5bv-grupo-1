DROP DATABASE IF EXISTS db_billion_pizzas;
CREATE DATABASE IF NOT EXISTS db_billion_pizzas;
USE db_billion_pizzas;

-- Entidades fuertes ---------------------------------------

DROP TABLE IF EXISTS personas;
CREATE TABLE IF NOT EXISTS personas(
	dpi_cui INT NOT NULL,
    nombre1 VARCHAR(55),
    nombre2 VARCHAR(55),
    nombre3 VARCHAR(55),
    apellido1 VARCHAR(55),
    apellido2 VARCHAR(55),
    telefono VARCHAR(8),
    correo VARCHAR(150),
    direccion VARCHAR(150),
    
    PRIMARY KEY(dpi_cui)
);

DROP TABLE IF EXISTS tipos_empleados;
CREATE TABLE IF NOT EXISTS tipos_empleados(
	id INT AUTO_INCREMENT,
    puesto VARCHAR(50),
    
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS comidas;
CREATE TABLE IF NOT EXISTS comidas(
	id_comidas INT AUTO_INCREMENT,
    nombre_comida VARCHAR(50),
    precio INT NOT NULL,
    
    PRIMARY KEY(id_comidas)
);

DROP TABLE IF EXISTS proveedores;
CREATE TABLE IF NOT EXISTS proveedores(
	id INT AUTO_INCREMENT,
    nombre_empresa VARCHAR(50),
    telefono VARCHAR(8),
    correo VARCHAR(150),
    
    PRIMARY KEY(id)
);

-- Entidades débiles ---------------------------------------

DROP TABLE IF EXISTS empleados;
CREATE TABLE IF NOT EXISTS empleados(
	id_empleado INT AUTO_INCREMENT,
    persona_id INT NOT NULL,
	tipo_empleado_id INT NOT NULL,
    
    PRIMARY KEY(id_empleado),
    CONSTRAINT fk_empleados_id FOREIGN KEY (tipo_empleado_id) REFERENCES tipos_empleados(id)
);

DROP TABLE IF EXISTS usuarios;
CREATE TABLE IF NOT EXISTS usuarios(
	user VARCHAR(255),
    password VARCHAR(255),
    empleado_id INT NOT NULL,
    
    PRIMARY KEY(user),
    CONSTRAINT fk_usuarios_id FOREIGN KEY (empleado_id) REFERENCES empleados(id_empleado)
);

DROP TABLE IF EXISTS clientes;
CREATE TABLE IF NOT EXISTS clientes(
	id_cliente INT AUTO_INCREMENT,
    nit VARCHAR(10),
    persona_id INT NOT NULL,
    
    PRIMARY KEY(id_cliente),
    CONSTRAINT fk_clientes_id FOREIGN KEY (persona_id) REFERENCES personas(dpi_cui)
);

DROP TABLE IF EXISTS bebidas;
CREATE TABLE IF NOT EXISTS bebidas(
	id_bebidas INT AUTO_INCREMENT,
    nombre_bebidas VARCHAR(50),
    fecha_caducida DATE,
    precio INT NOT NULL,
    proveedor_id INT NOT NULL,
    
    PRIMARY KEY(id_bebidas),
    CONSTRAINT fk_bebidas FOREIGN KEY (proveedor_id) REFERENCES proveedores(id) ON DELETE CASCADE
);

DROP TABLE IF EXISTS menu;
CREATE TABLE IF NOT EXISTS menu(
	id_menu INT AUTO_INCREMENT,
    horario_comida TIME,
    horario_apertura TIME,
    horario_cierre TIME,
    comidas_id INT NOT NULL,
    bebidas_id INT NOT NULL,
    
    PRIMARY KEY(id_menu),
    CONSTRAINT fk_comidas_id FOREIGN KEY (comidas_id) REFERENCES comidas(id_comidas) ON DELETE CASCADE,
    CONSTRAINT fk_bebidas_id FOREIGN KEY (bebidas_id) REFERENCES bebidas(id_bebidas) ON DELETE CASCADE
);

DROP TABLE IF EXISTS orden;
CREATE TABLE IF NOT EXISTS orden(
	id_orden INT AUTO_INCREMENT,
    hora_entrega TIME,
    cliente_id INT NOT NULL,
    menu_id INT NOT NULL,
    
    PRIMARY KEY(id_orden),
    CONSTRAINT fk_menu_id FOREIGN KEY (menu_id) REFERENCES menu(id_menu)
);

DROP TABLE IF EXISTS factura;
CREATE TABLE IF NOT EXISTS factura(
	no_factura INT AUTO_INCREMENT,
    serie VARCHAR(55),
    fecha DATE,
    nombre VARCHAR(55),
    direccion VARCHAR(55),
    nit VARCHAR(55),
    total INT NOT NULL,
    cliente_id INT NOT NULL,
    orden_id INT NOT NULL,
    
    PRIMARY KEY(no_factura),
    CONSTRAINT fk_cliente_id FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente),
    CONSTRAINT fk_orden_id FOREIGN KEY (orden_id) REFERENCES orden(id_orden)
);

SELECT id_orden,hora_entrega,cliente_id,menu_id FROM orden