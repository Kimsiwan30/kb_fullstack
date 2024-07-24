use world;

insert into `city` (name, countrycode, district, population)
value('tetz', 'kor', 'tetz', 1);

select * from city where name = 'tetz';

update city set population = 0 where name = 'tetz';

delete from city where name = 'tetz';

select name from city order by name desc;

select name,countrycode,population from city
order by Population asc;

select * from country;
select name, ifnull(indepyear, "독립 연도 없음")from country;
select lower(code)from country;
select lower(code) from country order by code asc;
select upper(code) as '대문자나라' from country;
