DROP TABLE if exists book;

create table book (
	id INT PRIMARY KEY,
	name varchar(255), 
	author varchar(255), 
	format varchar(255), 
	price DECIMAL(10,2)
);