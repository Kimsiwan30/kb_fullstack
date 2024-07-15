USE buytbl;
SELECT * FROM sqldb.buytbl;

START TRANSACTION;

DELETE FROM buytbl WHERE num = 1;
DELETE FROM buytbl where num = 2;

SELECT * FROM buytbl;

ROLLBACK;

SELECT @@autocommit;