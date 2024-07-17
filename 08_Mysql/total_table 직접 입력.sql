CREATE DATABASE `mydb`;

use mydb;

CREATE TABLE total_table (
order_id int,
customer_id int,
customer_name varchar(100),
order_date date,
product_id int,
product_name varchar(100),
product_price int,
category_id int,
category_name varchar(100),
quantity int
 );
 
 
INSERT INTO total_taBLE (order_id, customer_id, customer_name, order_DATE, PRODuct_id, produCt_name, Product_price, category_id, Category_namE, quantity) VALUES
(1, 1, '김시완', '2024-06-01', 1, '맥북에어', 650000, 1, '전자기기', 1),
(1, 1, '김시완', '2024-06-01', 4, '맥북 파우치', 10000, 2, '주변기기', 1),
(2, 2, '이효석', '2024-06-02', 2, '맥북프로', 700000, 1, '전자기기', 1),
(3, 3, '김연비', '2024-06-03', 3, '맥북프로맥스', 750000, 1, '전자기기', 1),
(4, 4, '최호진', '2024-06-04', 5, 'DT-35키보드', 20000, 2, '주변기기', 1),
(5, 5, '최현수', '2024-06-05', 6, '독거미키보드', 50000, 2, '주변기기', 1),
(6, 6, '김동준', '2024-06-06', 6, '독거미키보드', 50000, 2, '주변기기', 1),
(7, 7, '권오현', '2024-06-07', 6, '독거미키보드', 50000, 2, '주변기기', 1);

DROP TABLE total_table;
DELETE FROM total_table;

SELECT * FROM total_table;


DELETE FROM total_table WHERE customer_name = '이효석';