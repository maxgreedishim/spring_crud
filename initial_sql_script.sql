create database users_management;

\c users_management;

create table users_table
(
    id serial
        constraint users_table_pk
            primary key,
    name varchar(50),
    login varchar(50),
    column_4 int,
    email varchar(50)
);

