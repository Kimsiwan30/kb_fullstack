SELECT * FROM my_db.user;

INSERT INTO user (name, user_id, password, age)
  VALUES ('김시완', 'ID', '1234', 30);
  
DELETE FROM user WHERE id_pk = 2;

UPDATE user SET	age = age + 1 WHERE id_pk = 2;