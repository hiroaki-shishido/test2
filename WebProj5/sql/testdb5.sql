drop database if exists testdb5;
create database testdb5;
use testdb5;

create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);
insert into users values
(1,"taro","123"),
(2,"jiro","456"),
(3,"hanako","789");

create table inquiry(
name varchar(255),
qtyep varchar(255),
body varchar(255)
);