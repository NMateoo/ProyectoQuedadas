drop database if exists quedadas;

create database quedadas;

use quedadas;

create table persona(
	email varchar(50),
    nombre varchar(100),
    telefono int(10),
    genero character(1),
    contraseña varchar(50),
    mascota varchar(40),
    primary key(email)
);

create table mascota(
	nombre varchar(50),
    animal varchar(20),
    dueño varchar(50),
    primary key(nombre,dueño)
);

create table perro(
	nombre varchar(50),
    animal varchar(20),
    dueño varchar(50),
    raza varchar(20)
);

create table gato(
	nombre varchar(50),
    animal varchar(20),
    dueño varchar(50),
    raza varchar(20)
);

create table actividadEquipos(
	nombre varchar(200),
	lugar varchar(100),
    privada boolean,
    precio float,
    momento timestamp,
    contraseña varchar(100),
    minParticipantes int(3),
    maxParticipantes int(3),
    categoria varchar(100),
    constraint claveActividad primary key(nombre,lugar,momento)
);

create table equipo(
	nombre varchar(100),
	tamañoMaximo int(3),
    nombreActividad varchar(200),
    lugarActividad varchar(100),
    momentoActividad timestamp,
    primary key(nombre,nombreActividad,lugarActividad,momentoActividad),
    constraint actividadEquipos FOREIGN KEY (nombreActividad, lugarActividad, momentoActividad) 
        REFERENCES actividadEquipos(nombre, lugar, momento)
);