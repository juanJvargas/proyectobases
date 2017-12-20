
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  juan
 * Created: 15-dic-2017
 */

DROP TABLE IF EXISTS area CASCADE;
CREATE TABLE area(
	codigo_area INTEGER PRIMARY KEY,
	nombre VARCHAR(100),
	descripcion VARCHAR(1000),
        estado VARCHAR(50)
);
DROP TABLE IF EXISTS cama CASCADE;
CREATE TABLE cama(
	numero_cama INTEGER PRIMARY KEY,
	descripcion VARCHAR(100),
	estado VARCHAR(100),
	codigo_area INTEGER,
	FOREIGN KEY (codigo_area) REFERENCES area(codigo_area)
);

DROP TABLE IF EXISTS paciente CASCADE;
CREATE TABLE paciente(
	identificacion_paciente INTEGER PRIMARY KEY,
        nombre VARCHAR(100),
	direccion VARCHAR(100),
	telefono VARCHAR(100),
	fecha_nacimiento DATE,
	actividad_economica VARCHAR(100),
	seguridad_social VARCHAR(100),
	fecha_apertura DATE
);



DROP TABLE IF EXISTS empleado CASCADE;
CREATE TABLE empleado(
	identificacion_empleado INTEGER PRIMARY KEY,
	direccion VARCHAR(100),
	telefono VARCHAR(50),
	nombre VARCHAR(100),
	email VARCHAR(50),
	salario VARCHAR(100),
	codigo_area INTEGER,
	identificacion_jefe INTEGER,
        estado VARCHAR(50),
	FOREIGN KEY (codigo_area) REFERENCES area(codigo_area),
	FOREIGN KEY (identificacion_jefe) REFERENCES empleado(identificacion_empleado)

);

DROP TABLE IF EXISTS registro CASCADE;
CREATE TABLE registro(
        numero_registro SERIAL PRIMARY KEY,
	identificacion_paciente INTEGER,
	identificacion_empleado INTEGER,
	fecha_consulta DATE,
	observaciones VARCHAR(200),
        codigo_causa INTEGER,
	FOREIGN KEY (identificacion_paciente) REFERENCES paciente(identificacion_paciente),
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado),
        FOREIGN KEY (codigo_causa) REFERENCES causa(codigo_causa),
	unique(numero_registro)
);

DROP TABLE IF EXISTS causa CASCADE;
CREATE TABLE causa(
	codigo_causa INTEGER PRIMARY KEY,
	nombre VARCHAR(100),
	descripcion VARCHAR(500)
);



DROP TABLE IF EXISTS campana_prevencion CASCADE;
CREATE TABLE campana_prevencion(
	codigo_campana INTEGER PRIMARY KEY,
	nombre VARCHAR(100),
	objetivo VARCHAR(500),
	fecha_realizacion DATE,
	identificacion_empleado INTEGER,
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado)
);

DROP TABLE IF EXISTS medicamento CASCADE;
CREATE TABLE medicamento(
	codigo_medicamento INTEGER PRIMARY KEY,
	nombre VARCHAR(100),
	descripcion VARCHAR(500),
	costo INTEGER,
	cantidad INTEGER
);



DROP TABLE IF EXISTS formula CASCADE;
CREATE TABLE formula(
	codigo_formula SERIAL PRIMARY KEY,
	identificacion_empleado INTEGER,
	identificacion_paciente INTEGER,
        fecha DATE,
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado),
	FOREIGN KEY (identificacion_paciente) REFERENCES paciente(identificacion_paciente)
);

DROP TABLE IF EXISTS formula_medicamento CASCADE;
CREATE TABLE formula_medicamento(
	codigo_formula INTEGER,
	codigo_medicamento INTEGER,
        cantidad INTEGER,
	PRIMARY KEY(codigo_formula,codigo_medicamento),
	FOREIGN KEY (codigo_formula) REFERENCES formula(codigo_formula),
	FOREIGN KEY (codigo_medicamento) REFERENCES medicamento(codigo_medicamento)
);

DROP TABLE IF EXISTS enfermera CASCADE;
CREATE TABLE enfermera(
	identificacion_empleado INTEGER,
	anos_experiencia INTEGER,
        codigo_habilidad VARCHAR(50),
        PRIMARY KEY(identificacion_empleado),
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado)
);

DROP TABLE IF EXISTS habilidad CASCADE;
CREATE TABLE habilidad(
	codigo_habilidad INTEGER PRIMARY KEY NOT NULL,
	descripcion VARCHAR(500)
	
);
INSERT INTO habilidad VALUES(1,'INYECTARLE LAS NALGAS A CARLOS');


DROP TABLE IF EXISTS  especialidad CASCADE;
CREATE TABLE  especialidad(
	codigo_especialidad INTEGER PRIMARY KEY NOT NULL,
	descripcion VARCHAR (500)	
);
INSERT INTO especialidad VALUES(1, 'EXPERTO EN CIRUGIA PLASTICA DEL DEDO GORDO DEL PIE');

DROP TABLE IF EXISTS medico CASCADE;
CREATE TABLE medico(
	identificacion_empleado INTEGER,
	numero_licencia VARCHAR(100),
	codigo_especialidad VARCHAR(100),
	universidad VARCHAR(100),
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado)

);

DROP TABLE IF EXISTS asignado CASCADE;
CREATE TABLE asignado(
	numero_cama INTEGER,
	identificacion_paciente INTEGER,
	fecha_asignacion DATE,
	fecha_retiro DATE,
	estado_asignacion VARCHAR(100),
	PRIMARY KEY (numero_cama, identificacion_paciente, fecha_asignacion),
	FOREIGN KEY (numero_cama) REFERENCES cama(numero_cama)
	--, FOREIGN KEY (identificacion_paciente) REFERENCES paciente(identificacion_paciente)
);


DROP TABLE IF EXISTS cita CASCADE;
CREATE TABLE cita(
	identificacion_paciente INTEGER,
	identificacion_empleado INTEGER,
        fecha DATE,
	hora INTEGER,
	
	PRIMARY KEY (identificacion_paciente, identificacion_empleado, fecha),
	FOREIGN KEY (identificacion_paciente) REFERENCES paciente(identificacion_paciente),
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado)
);

DROP TABLE IF EXISTS incluye CASCADE;
CREATE TABLE incluye(
	identificacion_paciente INTEGER,
	numero_registro INTEGER,
	codigo_causa INTEGER,
	PRIMARY KEY(identificacion_paciente, numero_registro, codigo_causa),
	FOREIGN KEY (identificacion_paciente) REFERENCES paciente(identificacion_paciente),
	FOREIGN KEY (numero_registro) REFERENCES registro(numero_registro),
	FOREIGN KEY (codigo_causa) REFERENCES causa(codigo_causa)
);

DROP TABLE IF EXISTS usuarios CASCADE;
CREATE TABLE usuarios(
	login VARCHAR(20) PRIMARY KEY NOT NULL,
	contrasena VARCHAR(20),
	tipo VARCHAR(20),
	estado VARCHAR(10)
);




--- AREAS
INSERT INTO area VALUES (1, 'GINECOLOGIA Y OBSTETRICIA', 'Todo relacionado con embarazos y ginecologia','activa');
INSERT INTO area VALUES (2, 'MEDICINA INTERNA', 'Especialidad médica que se dedica al estudio, diagnóstico y tratamiento de las enfermedades propias del adulto.','activa');
INSERT INTO area VALUES (3, 'INFECTOLOGIA', 'Se dedica al estudio, diagnóstico y tratamiento del paciente de cualquier edad que cursa con enfermedades infecciosas tanto agudas como crónicas.','activa');
INSERT INTO area VALUES (4, 'PEDIATRIA', 'La rama de la Medicina Clínica que se encarga de todos los aspectos médicos de la salud de los niños.','activa');
INSERT INTO area VALUES (5, 'UNIDAD CUIDADOS INTENSIVOS', 'Area especial dentro del área hospitalaria que proporciona medicina intensiva','activa');
--- FIN AREAS

--- CAUSAS
INSERT INTO causa VALUES (1, 'Diarrea extrema', 'El paciente se está secando de tantas cagadas');
INSERT INTO causa VALUES (2, 'Conjuntivitis', 'El paciente presenta infección ocular');
INSERT INTO causa VALUES (3, 'Herpes Genital', 'Sin comentarios');
INSERT INTO causa VALUES (4, 'Varicela con pus', 'El paciente fue a la india y le salio eso');
INSERT INTO causa VALUES (5, 'Dolor de cabeza psicologico', 'El paciente cree que le duele la cabeza pero en realidad no');
INSERT INTO causa VALUES (6, 'Desorden mental extremo por ver memes', 'El paciente debe ser remitido inmediatamente a psiquiatria');
--- FIN CAUSAS

--- USUSARIOS
INSERT INTO usuarios VALUES ('admin', 'admin', 'administrador', 'activa');
INSERT INTO usuarios VALUES ('enfermera', 'enfermera', 'enfermera', 'activa');
INSERT INTO usuarios VALUES ('114401', '114401', '1144099304medico', 'activa');
INSERT INTO usuarios VALUES ('114402', '114402', 'medico', 'activa');
INSERT INTO usuarios VALUES ('114404', '114404', 'medico', 'activa');


--- FIN USUARIOS

--- EMPLEADOS
insert into empleado VALUES (114401, 'cr 40 # 71 - 12', '30434501' , 'Carlos Tovar', 'carlos.tovar@gmail.com', '1000000', 1, NULL, 'activa');
insert into empleado VALUES (114402, 'cr 39 # 8x - 82', '30434502' , 'Juan Jose', 'juan.jose@gmail.com', '1500000', 2, 114401, 'activa');
insert into empleado VALUES (114403, 'cr 28 # 92 - 43', '30434503' , 'Juan David', 'juan.david@gmail.com', '2000000', 3, 114401, 'inactiva');
insert into empleado VALUES (114404, 'cr 17 # 01 - 13', '30434504' , 'Alexandra Lopez', 'alexandra.lopez@gmail.com', '2500000', 1, NULL, 'activa');
insert into empleado VALUES (114405, 'cr 06 # 10 - 15', '30434505' , 'Melissa Millares', 'melissa.millares@gmail.com', '3000000', 4, 114404, 'activa');
insert into empleado VALUES (114406, 'cr 95 # 29 - 26', '30434506' , 'Felipe Montoya', 'felipe.montoya@gmail.com', '3500000', 5, 114404, 'activa');
insert into empleado VALUES (114407,'cr 96 # 30-27','3218552604','Jose David','jose.david.mamian@correounivalle.edu.co','1000',1,114402,'inactiva');

--- FIN EMPLEADOS

--- MEDICOS
insert into medico VALUES(114401,'1000123','1,2,3','UNIVALLE');
insert into medico VALUES(114402,'1000124','1,3,4','UNILIBRE');
insert into medico VALUES(114404,'1000125','2,3,4','UNIANDES');
--- FIN MEDICOS
--- ENFERMERA
INSERT INTO enfermera VALUES(114407,'5','1'); 

--- FIN ENFERMERA
--- CAMAS
insert into cama values (1, 'Partos 1', 'activa', 1);
insert into cama values (2, 'Partos 2', 'activa', 1);
insert into cama values (3, 'Partos 3', 'inactiva', 1);
insert into cama values (4, 'Partos 4', 'inactiva', 1);
insert into cama values (5, 'Habitacion 1 - Ginecologia ', 'activa', 1);
insert into cama values (6, 'Habitacion 2 - Ginecologia', 'inactiva', 1);
insert into cama values (7, 'Habitacion 3 - Ginecologia', 'activa', 1);

insert into cama values (8, 'Cirugia 1 - Medicina Interna', 'activa', 2);
insert into cama values (9, 'Cirugia 2 - Medicina Interna', 'activa', 2);
insert into cama values (10, 'Cirugia 3 - Medicina Interna', 'inactiva', 2);
insert into cama values (11, 'Cirugia 4 - Medicina Interna', 'activa', 2);
insert into cama values (12, 'Habitacion 1 - Medicina Interna ', 'activa', 2);
insert into cama values (13, 'Habitacion 2 - Medicina Interna', 'inactiva', 2);
insert into cama values (14, 'Habitacion 3 - Medicina Interna', 'activa', 2);

insert into cama values (15, 'Cirugia 1 - Infectologia', 'activa', 3);
insert into cama values (16, 'Cirugia 2 - Infectologia', 'activa', 3);
insert into cama values (17, 'Cirugia 3 - Infectologia', 'activa', 3);
insert into cama values (18, 'Cirugia 4 - Infectologia', 'inactiva', 3);
insert into cama values (19, 'Habitacion 1 - Infectologia ', 'activa', 3);
insert into cama values (20, 'Habitacion 2 - Infectologia', 'inactiva', 3);
insert into cama values (21, 'Habitacion 3 - Infectologia', 'activa', 3);

insert into cama values (22, 'Cirugia 1 - Pediatria', 'inactiva', 4);
insert into cama values (23, 'Cirugia 2 - Pediatria', 'activa', 4);
insert into cama values (24, 'Cirugia 3 - Pediatria', 'inactiva', 4);
insert into cama values (25, 'Cirugia 4 - Pediatria', 'inactiva', 4);
insert into cama values (26, 'Habitacion 1 - Infectologia ', 'activa', 4);
insert into cama values (27, 'Habitacion 2 - Infectologia', 'activa', 4);
insert into cama values (28, 'Habitacion 3 - Infectologia', 'activa', 4);

insert into cama values (29, 'Cirugia 1 - UCI', 'activa', 5);
insert into cama values (30, 'Cirugia 2 - UCI', 'activa', 5);
insert into cama values (31, 'Cirugia 3 - UCI', 'activa', 5);
insert into cama values (32, 'Cirugia 4 - UCI', 'inactiva', 5);
insert into cama values (33, 'Habitacion 1 - UCI ', 'activa', 5);
insert into cama values (34, 'Habitacion 2 - UCI', 'activa', 5);
insert into cama values (35, 'Habitacion 3 - UCI', 'inactiva', 5);
--- FIN CAMAS

--- PACIENTES
insert into paciente values(1523382, 'Luis Granja', 'cr 17 # 31 - 29', '3701720', NOW(), 'Obrero', 'Coomeva', NOW());
insert into paciente values(1526750, 'Victor Gomez', 'cr 26 # 42 - 38', '3702639', NOW(), 'Ingeniero de sistemas', 'Comfandi', NOW());
insert into paciente values(1530267, 'Melissa Millares', 'cr 35 # 53 - 46', '3703548', NOW(), 'Comerciante', 'Cafesalud', NOW());
insert into paciente values(1527471, 'Ivan Toro', 'cr 44 # 64 - 56', '3704457', NOW(), 'Secretaria', 'Coomeva', NOW());
insert into paciente values(1527472, 'Jose David', 'cr 53 # 75 - 65', '3705366', NOW(), 'Contadora', 'Colsalud', NOW());
insert into paciente values(1527473, 'Javier Palacios', 'cr 62 # 86 - 74', '3706275', NOW(), 'Medico', 'Emssanar', NOW());
insert into paciente values(1527474, 'Sebastian Villegas', 'cr 71 # 97 - 83', '3707184', NOW(), 'Psicologa', 'Sura', NOW());
--- FIN PACIENTES

--- CITAS
insert into cita values(1527471, 114401, '2017-12-18', 7);
insert into cita values(1527472, 114401, '2017-12-19', 10);
insert into cita values(1527473, 114402, '2017-12-20', 13);
insert into cita values(1527474, 114404, '2017-12-20', 16);
--- FIN CITAS

--- ASIGNACIONES
insert into asignado values(1, 1523382, NOW(), NULL, 'activa');
insert into asignado values(19, 1526750, NOW(), NULL, 'activa');
insert into asignado values(29, 1530267, NOW(), NULL, 'activa');
insert into asignado values(14, 1527471, NOW(), NULL, 'activa');
insert into asignado values(9, 1527472, NOW(), NOW(), 'inactiva');
insert into asignado values(34, 1527473, NOW(), NOW(), 'inactiva');
insert into asignado values(26, 1527474, NOW(), NOW(), 'inactiva');

INSERT INTO medicamento VALUES (1, 'Tramadol', 'Medicamento oral para dolores fuertes', '5000', 5);
INSERT INTO medicamento VALUES (2, 'Acetaminofen', 'Medicamento oral para dolores comunes', '1000', 10);
INSERT INTO medicamento VALUES (3, 'Amoxicilina', 'Antibiotico de uso general', '3000', 5);

