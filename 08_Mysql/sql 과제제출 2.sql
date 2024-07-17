# 1번 문제

use sqldb;

create table tbl1(
a int primary key,
b int,
c int
);

show index from tbl1;

# 2번 문제

create table tbl2(
a int primary key,
b int unique,
c int unique,
d int
);

show index from tbl2;

# 3번 문제

create table tbl3(
a int unique,
b int unique,
c int unique,
d int
);

show index from tbl3;

# 4번 문제

create table tbl4(
a int unique not null,
b int unique,
c int unique,
d int 
);

show index from tbl4;

# 5번 문제

create table tbl5(
a int unique not null,
b int unique,
c int unique,
d int primary key
);

show index from tbl5;

# 6번 문제

create database if not exists testdb;
use testdb;

drop table if exists usertbl;
create table usertbl(
userid char(8) not null primary key,
name varchar(10) not null,
birthyear int not null,
addr char(2) not null
);

 INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울');
 INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남');
 INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남');
 INSERT INTO usertbl VALUES('JYP', '조용필', 1950, '경기');
 INSERT INTO usertbl VALUES('SSK', '성시경', 1979, '서울'); 
 
 select * from usertbl;
 show index from usertbl;
 
 
 # 7번 문제
 
 alter table usertbl drop primary key;
alter table usertbl add constraint pk_name primary key(name);

 select * from usertbl;
 show index from usertbl;
