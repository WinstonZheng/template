-- mysql userinfo
CREATE USER 'test'@'%' IDENTIFIED BY '110';
GRANT ALL ON test.* TO 'test'@'%';

CREATE database test;
SHOW DATABASE;
USE test;
SHOW TABLES;

-- test
DROP TABLE student;
create table student (
  id int not null PRIMARY KEY ,
  name varchar(20) not null,
  age int not NULL
);

SHOW COLUMNS FROM student;

insert into student (id, name, age) values (1, 'haha', 12);
insert into student (id, name, age) values (2, 'hehe', 18);
