DROP TABLE if exists app_users;

create table app_users (
    username varchar(50) not null primary key,
    password varchar(50) not null,
    enabled boolean not null,
    roles varchar(250) not null
);