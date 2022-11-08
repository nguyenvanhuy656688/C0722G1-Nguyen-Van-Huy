CREATE DATABASE if not exists demo ;
USE demo;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);
insert into users(name,email,country) values ("Nguyễn Huy","xpham9668","Đà Nẵng");
insert into users(name,email,country) values("Lê Huy","huynv5666","Đà Nẵng");