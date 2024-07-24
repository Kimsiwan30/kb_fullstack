use world;

select * from city;
select * from country;
select * from countrylanguage;

#crud
#create
insert into `city` (name, countrycode, district, population)
values ('tetz', 'kor', 'tetz', 1);

select * from city where Name = 'tetz';

#update
update `city` set Population = 0 where Name = 'tetz';

#delete
delete from `city` where Name = 'tetz';

#정렬
select name,CountryCode,Population from city
order by  Population asc ;

#함수
select * from country;
select name, ifnull(IndepYear, "독립 연도 없음")from country;
select lower(Code)from country;
select upper(Code) as '대문자나라' from country;
select * from city;
select concat(ID, "/", Name, "/", Population)from city;
select * from country;
select replace(Continent, 'asia', '아시아당') from country;
select Name, ceiling(LifeExpectancy) from country;
select Name, floor(LifeExpectancy) from country;
select Name, round(LifeExpectancy) from country;
select Name, length(Name) from country;
select max(Population) from city;
select min(Population) from city;
select avg(Population) from city;

select CountryCode, sum(Population) from city
group by CountryCode;


#join
select co.code, ci.name, co.name
from city ci
inner join country co on ci.CountryCode = co.Code;

select * from countrylanguage;

select co.code, co.name, cl.Language
from country co
left join countrylanguage cl
on co.Code = cl.CountryCode;

#join 함수
select ci.CountryCode, co.Name, avg(ci.Population)
from city ci
inner join country co
on ci.CountryCode = co.Code
group by ci.CountryCode;

#서브 쿼리
select * from city;
select *
from city
where Population > (select Population from city where Name = 'Amsterdam');