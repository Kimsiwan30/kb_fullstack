create schema `user_ex`;
create table user (
`id` int not null primary key auto_increment,
`email` varchar(100) not null unique,
`password` varchar(100) not null
);


insert into user (email, password)
values ('tetz', '1234');
insert into user (id, email, password)
values ('siwan', '1234');
insert into user (id, email, password)
values ('na', '1234');

select * from user;


