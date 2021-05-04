/**
 * Database creation - v0.0.1
 */
create database if not exists dev;

/**
 * Tables
 */
create table if not exists dev.roles (
	role_id int not null,
	role_type char(5) not null,
	primary key(role_id)
);
create table if not exists dev.users (
	user_id int not null auto_increment,
	user_name varchar(50) not null,
	user_email varchar(75) not null,
	user_password varchar(50) not null,
	user_city varchar(50),
	user_state_uf char(2),
	user_bios varchar(128),
	role_id int not null,
	primary key(user_id),
	foreign key(role_id) references dev.roles(role_id)
);
create table if not exists dev.games (
	game_id int not null auto_increment,
	game_name varchar(50) not null,
	game_genre varchar(20) not null,
	game_platform varchar(32) not null,
	game_description varchar(128),
	game_cover_url varchar(256),
	game_release_date date,
	primary key (game_id)
);
create table if not exists dev.movies (
	movie_id int not null auto_increment,
	movie_name varchar(50) not null,
	movie_genre varchar(20) not null,
	movie_description varchar(128),
	movie_cover_url varchar(256),
	movie_release_date date,
	primary key (movie_id)
);
create table if not exists dev.users_v_movies (
	id int not null auto_increment,
	user_id int not null,
	movie_id int not null,
	primary key (id),
	foreign key(user_id) references dev.users(user_id),
	foreign key(movie_id) references dev.movies(movie_id)
);
create table if not exists dev.users_v_games (
	id int not null auto_increment,
	user_id int not null,
	game_id int not null,
	primary key (id),
	foreign key(user_id) references dev.users(user_id),
	foreign key(game_id) references dev.games(game_id)
);

/**
 * Some dummy data
 */

insert into dev.roles (role_id, role_type) values
(1, "admin"),(2, "basic");
insert into dev.users (user_name, user_email, user_password, user_city, user_state, user_bios, role_id) values
("Admin user", "adm@adm.com", "123", "Sorocaba", "sp", "", 1),
("João Garcia", "joao.garcia@test.com.br", "123","Rio de Janeiro", "rj", "Amante de filmes de ação", 2),
("Amanda Pereira", "am_pereira33@test.com.br", "123", "Goiânia", "go", "Crepúsculo forever", 2);
insert into dev.games (game_name, game_genre, game_platform, game_description, game_cover_url, game_release_date) values
("God Of War I", "action", "Playstation 2","God of War is an action-adventure game franchise created by David Jaffe at Sony's Santa Monica Studio", "https://www.mobygames.com/images/covers/l/198187-god-of-war-playstation-2-front-cover.png", cast('2005-03-22' as date));
insert into dev.movies (movie_name, movie_genre, movie_description, movie_cover_url, movie_release_date) values
("Scary Movie", "comedy", "Scary Movie (Brasil: Todo Mundo em Pânico) é um filme norte-americano do gênero comédia de terror do ano 2000", "https://upload.wikimedia.org/wikipedia/en/2/29/Movie_poster_for_%22Scary_Movie%22.jpg", cast('2000-10-06' as date));
insert into dev.users_v_games (user_id, game_id) values (1,1);
insert into dev.users_v_movies (user_id, movie_id) values (1,1), (3,1);