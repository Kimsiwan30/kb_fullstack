CREATE DATABASE `mydb`;
CREATE TABLE user (
 `id_pk` int not null primary key auto_increment,
 `name` varchar(10) not null,
 `userId` varchar(10) not null unique,
 `password` varchar(10) not null,
 `address` varchar(10) not null,
 `age` tinyint unsigned,
 `membership` tinyint default 0,
 `register_date` datetime default current_timestamp,
 `update_date` datetime default current_timestamp on update current_timestamp
 );




use mydb;

insert into user (name, userid, password, address, age)
values(
'김시완', 'kim', '123', '서울', '30');
insert into user (name, userid, password, address, age)
values(
'장경욱', 'jang', '163', '서울', '30');
insert into user (name, userid, password, address, age)
values(
'최혁준', 'choi', '156', '김해', '30');
insert into user (name, userid, password, address, age)
values(
'윤영민', 'yoon', '254', '광주', '30');
insert into user (name, userid, password, address, age)
values(
'정원식', 'jeong', '305', '울산', '30');

delete from user where id_pk = 4;
rollback;

update user set address = '양양' where id_pk = 1;



select * from user;