CREATE DATABASE `mydb`;
CREATE TABLE class_user (
 `id_pk` int not null primary key auto_increment,
 `name` varchar(10) not null,
 `age` tinyint unsigned,
 `register_date` datetime default current_timestamp,
 `update_date` datetime default current_timestamp on update current_timestamp
 );
 
 insert into class_user (name, age)
 value('김이수', 123);
 insert into class_user (name, age)
  value('정지희', 45);
 insert into class_user (name, age)
  value('최민준', 234);
 insert into class_user (name, age)
  value('권오현', 89);
 insert into class_user (name, age)
  value('이효석', 56);
  
  delete from class_user where name ='이효석';
  
  
  
  update class_user set age = 40 where name = '이효석';
  select * from class_user where name like '%이%';
  
 
 select * from class_user;