--liquibase formatted sql
--changeset codecentric-docs:release_1.create_user_table.sql

USE rentabook;
create table  user (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(16) NOT NULL,
    lastName  VARCHAR(16) NOT NULL,
    version INT(6),
    email VARCHAR(50),
    password VARCHAR(20)
);

--rollback DROP TABLE user;