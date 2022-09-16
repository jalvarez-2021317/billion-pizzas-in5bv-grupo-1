USE db_billion_pizzas;

INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(152364879,'Maria','Juana','Ernestina','Solis','Aldana','48562314','SmariaJ12@gmail.com','57 Calle 35-67 Zona 24, Guatemala, Guatemala');
INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(598756321,'Ulises','Eduardo','Manuel','Canales','Cabeza','45689231','Ulcanales150@gmail.com','30 Avenida 25-12 Zona 7 Guatemala, San Miguel Petapa');
INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(789652314,'Diana','Paola','','Acevedo','Marquez','52135689','Acevedo12@gmail.com','15 Avenida 42-23 Zona 16 Guatemala, Villa Lobos');
INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(489652314,'Guillermo','Omar','Edson','Manami','Chaparro','34876954','GOEmanami@gmail.com','25 Avenida 25-28 Zona 6 Guatemala, Villa Nueva');
INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(784596321,'Aldo','Bruno','','Salas','Cuyan','10258469','aldosalas@gmail.com','20 Avenida 23-25 Zona 7 Guatemala, San Miguel Petapa');
INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(145823679,'Jose','Carlos','Antonio','Alvarez','Calderon','55224438','alvarezc60@gmail.com','6 Avenida 12-20 Zona 17 Guatemala, Villa Nueva');
INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(125368495,'Jackeline','Marleny','Alina','Carranza','Cano','33548679','canojackeline2022@gmail.com','8 Avenida 45-23 Zona 16 Guatemala, Mixco');
INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(200544387,'Yuliana','Del Rosario','','Salazar','Acosta','64800532','salazaryuliana@gmail.com','26 Avenida 7-12 Zona 20 Guatemala, Santa Catarina');
INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(998564300,'Leo','Omar','','Hermogenes','Hurtado','23465876','lh1523601@gmail.com','60 Avenida 47-33 Zona 21 Guatemala, Guatemala');
INSERT INTO personas(dpi_cui, nombre1, nombre2, nombre3, apellido1, apellido2, telefono, correo, direccion) 
VALUES(235678945,'Edy','Leonel','','Duarte','Mayen','12345678','edymayen25@gmail.com','45 Avenida 42-30 Zona 1 Guatemala, Guatemala');

INSERT INTO tipos_empleados(puesto) VALUES('Cocinero');
INSERT INTO tipos_empleados(puesto) VALUES('Repartidor');
INSERT INTO tipos_empleados(puesto) VALUES('Gerente');
INSERT INTO tipos_empleados(puesto) VALUES('Administrador');
INSERT INTO tipos_empleados(puesto) VALUES('Cliente');
INSERT INTO tipos_empleados(puesto) VALUES('Proveedor');

INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza de pepperoni',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza margarita',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza cuatro quesos',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza cuatro estaciones',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza con champiñones',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza hawaiana',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza napolitana',100);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza neoyorquina',100);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza americana',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza de jamon',60);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza dobe jamon',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza deluxe',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza de carne molida',75);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza de carne y tocino',75);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza 5 carnes',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza vegetariana',60);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza de queso',60);
INSERT INTO comidas(nombre_comida, precio) VALUES('Pizza doble queso',80);
INSERT INTO comidas(nombre_comida, precio) VALUES('Muffin',25);
INSERT INTO comidas(nombre_comida, precio) VALUES('Panqueques',50);
INSERT INTO comidas(nombre_comida, precio) VALUES('Alitas',40);
INSERT INTO comidas(nombre_comida, precio) VALUES('Calzzone',60);

INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Molinos Central-Helvetia, S.A','56894231','helvetiaSA@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('MOLINO VENECIA S.A','20357684','molinovenecia@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Sal La Fina','12005846','sallafina@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Distribuidora Oasis','77765231','daguaOasis@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Propaca','42305687','propaca00@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Carnicentro','23056784','carnicentroCC@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Estasa','75315902','estasaoficial@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Pepsi','86425973','pepsiguatemala@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('SigmaQ Cajas y Empaques','13579468','cajasyempaques_sigma@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Distribuidora Centroamericana Emanuel','23567842','distribuidora13@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Plásticos San José, S.A','45236786','plasticossa@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Cristal Mobiliario Para Restaurantes','45230066','mobiliarioRestaurantes@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Celco','45121276','celcopinta@gmail.com');
INSERT INTO proveedores(nombre_empresa, telefono, correo) VALUES('Z Gas Distribuidora Rizzo','45451676','zgasGuatemala@gmail.com');

-- -------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(152364879,5);
INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(598756321,5);
INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(789652314,6);
INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(489652314,6);
INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(784596321,4);
INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(145823679,3);
INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(125368495,1);
INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(200544387,1);
INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(998564300,2);
INSERT INTO empleados(persona_id, tipo_empleado_id) VALUES(235678945,2);




INSERT INTO usuarios(user, password, empleado_id) VALUES('BPcocina2021','59*dfg5', 1);
INSERT INTO usuarios(user, password, empleado_id) VALUES('BPrepartidor2021','lp956*d', 2);
INSERT INTO usuarios(user, password, empleado_id) VALUES('BPgerente2020','rtd985d', 3);
INSERT INTO usuarios(user, password, empleado_id) VALUES('BPadmin2021','wqpls562', 4);
INSERT INTO usuarios(user, password, empleado_id) VALUES('BPcliente2022','ñfgt1234f', 5);
INSERT INTO usuarios(user, password, empleado_id) VALUES('BPprov2021','dupl58*d', 6);
INSERT INTO usuarios(user, password, empleado_id) VALUES('BPcocina2022','6f8gd', 1);
INSERT INTO usuarios(user, password, empleado_id) VALUES('BPadmin2022','k8ph*gd', 4);
INSERT INTO usuarios(user, password, empleado_id) VALUES('BPprov2020','pd52s0', 6);
INSERT INTO usuarios(user, password, empleado_id) VALUES('BPgerente2019','alp6e5d', 3);

INSERT INTO clientes(nit, persona_id) VALUES('1234567845',152364879);
INSERT INTO clientes(nit, persona_id) VALUES('8564352170',598756321);
INSERT INTO clientes(nit, persona_id) VALUES('3005647821',789652314);
INSERT INTO clientes(nit, persona_id) VALUES('2364897521',489652314);
INSERT INTO clientes(nit, persona_id) VALUES('3025689452',784596321);
INSERT INTO clientes(nit, persona_id) VALUES('2356688795',145823679);
INSERT INTO clientes(nit, persona_id) VALUES('4658211357',125368495);
INSERT INTO clientes(nit, persona_id) VALUES('5786895234',200544387);
INSERT INTO clientes(nit, persona_id) VALUES('2103456789',998564300);
INSERT INTO clientes(nit, persona_id) VALUES('1002345879',235678945);

INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('7 UP','2023-10-07',12,8);
INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('Mirinda','2023-07-25',12,8);
INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('Pepsi','2023-02-28',12,8);
INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('Pepsi Light','2023-10-23',12,8);
INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('Lipton','2024-01-01',12,8);
INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('Cerveza Corona','2024-03-12',12,8);
INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('Salutaris','2022-12-28',12,8);
INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('Aqua','2023-05-18',12,8);
INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('Petit','2023-06-14',12,8);
INSERT INTO bebidas(nombre_bebidas, fecha_caducida, precio, proveedor_id) VALUES('Gatorade','2023-11-30',12,8);

INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('07:00:00','07:00:00','19:30:00',19,9);
INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('07:00:00','07:00:00','19:30:00',20,10);
INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('12:30:00','07:00:00','19:30:00',5,1);
INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('17:00:00','07:00:00','19:30:00',21,6);
INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('13:00:00','07:00:00','19:30:00',16,7);
INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('12:00:00','07:00:00','19:30:00',12,10);
INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('14:00:00','07:00:00','19:30:00',13,4);
INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('11:00:00','07:00:00','19:30:00',7,3);
INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('12:00:00','07:00:00','19:30:00',8,8);
INSERT INTO menu(horario_comida, horario_apertura, horario_cierre, comidas_id, bebidas_id) VALUES('12:00:00','07:00:00','19:30:00',3,2);

INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('10:30:00',1,1);
INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('11:20:00',2,2);
INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('17:45:00',3,3);
INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('18:50:00',4,4);
INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('16:15:00',5,5);
INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('13:20:00',6,6);
INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('15:30:00',7,7);
INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('16:40:00',8,8);
INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('18:50:00',9,4);
INSERT INTO orden(hora_entrega, cliente_id, menu_id) VALUES('17:25:00',10,10);

INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('N-1239580','2023-04-18','Maria Solis','57 Calle 35-67 Zona 24, Guatemala, Guatemala','1012445879',160.00,1,1);
INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('NP-1234-GHF823','2023-02-15','Ulises Canales','30 Avenida 25-12 Zona 7 Guatemala, San Miguel Petapa','1689721079',125.00,2,2);
INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('NJ-401-EF-4','2023-09-30','Diana Acevedo','15 Avenida 42-23 Zona 16 Guatemala, Villa Lobos','4856231574',75.00,3,3);
INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('NF-4875-TP-231','2023-11-05','Guillermo Manami','25 Avenida 25-28 Zona 6 Guatemala, Villa Nueva','2456375239',90.00,4,4);
INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('N-15200','2022-12-25','Aldo Cuyan','20 Avenida 23-25 Zona 7 Guatemala, San Miguel Petapa','5721248635',120.00,5,5);
INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('NTT-987652','2023-03-12','Jose Alvarez','6 Avenida 12-20 Zona 17 Guatemala, Villa Nueva','1534867685',250.00,6,6);
INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('NS-8459-PPT-6127','2022-09-09','Jackeline Carranza','8 Avenida 45-23 Zona 16 Guatemala, Mixco','2356897451',50.00,7,7);
INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('N-487-SGF1260','2023-11-12','Yuliana Salazar','26 Avenida 7-12 Zona 20 Guatemala, Santa Catarina','5236478592',85.00,8,8);
INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('NEFT-1784-HG-561','2023-05-20','Leo Hermogenes','60 Avenida 47-33 Zona 21 Guatemala, Guatemala','5478936523',75.00,9,9);
INSERT INTO factura(serie, fecha, nombre, direccion, nit, total, cliente_id, orden_id) 
VALUES('NFT-4879-UTS-562','2022-10-25','Edy Duarte','45 Avenida 42-30 Zona 1 Guatemala, Guatemala','1054786325',150.00,10,10);

SELECT * FROM personas;
SELECT * FROM tipos_empleados;
SELECT * FROM comidas;
SELECT * FROM proveedores;
SELECT * FROM empleados;
SELECT * FROM usuarios;
SELECT * FROM clientes;
SELECT * FROM bebidas;
SELECT * FROM menu;
SELECT * FROM orden;
SELECT * FROM factura;