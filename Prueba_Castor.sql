-- Database: prueba_Castor

-- DROP DATABASE IF EXISTS "prueba_Castor";

CREATE DATABASE "prueba_Castor"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Colombia.1252'
    LC_CTYPE = 'Spanish_Colombia.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

CREATE TABLE CARGOS(
	IdCargo SERIAL not null,
	Nombre VARCHAR(80) not null,
	PRIMARY KEY(IdCargo)
);


CREATE TABLE EMPLEADOS(
	Id BIGSERIAL not null,
	Cedula INT not null,
	Nombre VARCHAR(80) not null,
	Foto varchar(200),
	Fecha_Ingreso DATE,
	Cargo int not null,
	PRIMARY KEY(Id),
	CONSTRAINT CARGOS
		FOREIGN key(Cargo)
			REFERENCES CARGOS(IdCargo)
);

