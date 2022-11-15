
DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

create table peliculas(
	codigo_pelicula int auto_increment primary key,
	nombre varchar(100),
	calificacion_edad int
);

create table salas(
	codigo_sala int auto_increment primary key,
	nombre varchar(100),
	codigo_pelicula int,
	foreign key (codigo_pelicula) references peliculas(codigo_pelicula) on delete cascade on update cascade
);

insert into peliculas (nombre, calificacion_edad) values ('Pelicula 1', 3);
insert into peliculas (nombre, calificacion_edad) values ('Pelicula 2', 6);
insert into peliculas (nombre, calificacion_edad) values ('Pelicula 3', 9);
insert into peliculas (nombre, calificacion_edad) values ('Pelicula 4', 12);
insert into peliculas (nombre, calificacion_edad) values ('Pelicula 5', 15);

insert into salas (nombre, codigo_pelicula) values ('Sala 1', 1);
insert into salas (nombre, codigo_pelicula) values ('Sala 2', 2);
insert into salas (nombre, codigo_pelicula) values ('Sala 3', 3);
insert into salas (nombre, codigo_pelicula) values ('Sala 4', 4);
insert into salas (nombre, codigo_pelicula) values ('Sala 5', 5);
