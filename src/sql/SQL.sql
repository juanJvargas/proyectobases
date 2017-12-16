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
	descripcion VARCHAR(100),
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

DROP TABLE IF EXISTS historia_clinica CASCADE;
CREATE TABLE historia_clinica(
	numero_historia INTEGER PRIMARY KEY,
	fecha_apertura DATE
);

DROP TABLE IF EXISTS paciente CASCADE;
CREATE TABLE paciente(
	identificacion_paciente INTEGER PRIMARY KEY,
	direccion VARCHAR(100),
	telefono VARCHAR(100),
	fecha_nacimiento DATE,
	actividad_economica VARCHAR(100),
	seguridad_social VARCHAR(100),
	numero_historia integer,
	FOREIGN KEY (numero_historia) REFERENCES historia_clinica(numero_historia)
);

DROP TABLE IF EXISTS empleado CASCADE;
CREATE TABLE empleado(
	identificacion_empleado INTEGER PRIMARY KEY,
	direccion VARCHAR(100),
	telefono VARCHAR(50),
	nombre VARCHAR(100),
	email VARCHAR(50),
	salario VARCHAR(100),
        cargo VARCHAR(20) NOT NULL,
	codigo_area INTEGER,
	identificacion_jefe INTEGER,
        Estado VARCHAR(50) NOT NULL,
	FOREIGN KEY (codigo_area) REFERENCES area(codigo_area),
	FOREIGN KEY (identificacion_jefe) REFERENCES empleado(identificacion_empleado)

);



DROP TABLE IF EXISTS registro CASCADE;
CREATE TABLE registro(
	numero_historia INTEGER ,
	numero_registro INTEGER,
	fecha_consulta DATE,
	valor INTEGER,
	identificacion_empleado INTEGER,
	PRIMARY KEY(numero_historia , numero_registro ),
	FOREIGN KEY (numero_historia) REFERENCES historia_clinica(numero_historia),
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado),
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
	costo VARCHAR(6),
	cantidad INTEGER
);

DROP TABLE IF EXISTS formula CASCADE;
CREATE TABLE formula(
	codigo_formula INTEGER PRIMARY KEY,
	identificacion_empleado INTEGER,
	identificacion_paciente INTEGER,
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado),
	FOREIGN KEY (identificacion_paciente) REFERENCES paciente(identificacion_paciente)
);

DROP TABLE IF EXISTS formula_medicamento CASCADE;
CREATE TABLE formula_medicamento(
	codigo_formula INTEGER,
	codigo_medicamento INTEGER,
	PRIMARY KEY(codigo_formula,codigo_medicamento),
	FOREIGN KEY (codigo_formula) REFERENCES formula(codigo_formula),
	FOREIGN KEY (codigo_medicamento) REFERENCES medicamento(codigo_medicamento)
);

DROP TABLE IF EXISTS enfermera CASCADE;
CREATE TABLE enfermera(
	identificacion_empleado INTEGER,
	anos_experiencia INTEGER,
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado)
);

DROP TABLE IF EXISTS habilidad CASCADE;
CREATE TABLE habilidad(
	codigo_habilidad INTEGER PRIMARY KEY NOT NULL,
	descripcion VARCHAR(500)
	
);

DROP TABLE IF EXISTS habilidad_empleado CASCADE;
CREATE TABLE habilidad_empleado(
	identificacion_empleado INTEGER,
	codigo_habilidad INTEGER,
	PRIMARY KEY(identificacion_empleado, codigo_habilidad),
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado),
	FOREIGN KEY (codigo_habilidad) REFERENCES habilidad(codigo_habilidad)
);

DROP TABLE IF EXISTS  especialidad CASCADE;
CREATE TABLE  especialidad(
	codigo_especialidad INTEGER PRIMARY KEY NOT NULL,
	descripcion VARCHAR (500)	
);

DROP TABLE IF EXISTS medico CASCADE;
CREATE TABLE medico(
	identificacion_empleado INTEGER,
	numero_licencia VARCHAR(100),
	codigo_especialidad INTEGER,
	universidad VARCHAR(100),
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado),
	FOREIGN KEY (codigo_especialidad) REFERENCES especialidad(codigo_especialidad)
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
	identificacion_empleado INTEGER,fecha DATE,
	hora VARCHAR(10),
	
	PRIMARY KEY (identificacion_paciente, identificacion_empleado, fecha),
	FOREIGN KEY (identificacion_paciente) REFERENCES paciente(identificacion_paciente),
	FOREIGN KEY (identificacion_empleado) REFERENCES empleado(identificacion_empleado)
);

DROP TABLE IF EXISTS incluye CASCADE;
CREATE TABLE incluye(
	numero_historia INTEGER,
	numero_registro INTEGER,
	codigo_causa INTEGER,
	PRIMARY KEY(numero_historia, numero_registro, codigo_causa),
	FOREIGN KEY (numero_historia) REFERENCES historia_clinica(numero_historia),
	FOREIGN KEY (numero_registro) REFERENCES registro(numero_registro),
	FOREIGN KEY (codigo_causa) REFERENCES causa(codigo_causa)
);

DROP TABLE IF EXISTS usuarios CASCADE;
CREATE TABLE usuarios(
	login VARCHAR(20) PRIMARY KEY NOT NULL,
	contraseña VARCHAR(20),
	tipo VARCHAR(20),
	estado VARCHAR(10)
);

INSERT INTO usuarios VALUES ('admin', 'admin', 'administrador', 'activo');
INSERT INTO usuarios VALUES ('1144099304', 'user', 'enfermera', 'activo');
INSERT INTO usuarios VALUES ('1144099305', 'user', 'medico', 'activo');


insert into area values (51, 'Ovinis voladores', 'jojo que miedo');
INSERT INTO area VALUES (1, 'prueba', 'prueba','activa');

insert into cama values (123, 'Cama para gente rara', 'activa', 1);
insert into cama values (124, 'Cama para locos', 'inactiva',51);

insert into asignado (numero_cama, identificacion_paciente, fecha_asignacion, fecha_retiro, estado_asignacion) values(123, 1144197211, NOW(), NULL, 'activa');
select * from cama;

select numero_cama from cama
EXCEPT
select numero_cama from asignado WHERE estado_asignacion = 'activa';