CREATE SEQUENCE hibernate_sequence START 1;

DROP TABLE if exists user_dtl;

create table user_dtl (
	id INT PRIMARY KEY,
	firstName varchar(255), 
	lastName varchar(255), 
	email varchar(255), 
	photo varchar(255)
);
