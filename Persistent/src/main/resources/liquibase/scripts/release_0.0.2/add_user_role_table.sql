--liquibase formatted sql
--changeset rent_a_book:release_0.0.2.add_user_role_table.sql

create table  user_role (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	user_id INT(6) UNSIGNED NOT NULL,
    isAdmin BOOLEAN, 
	isSuperUser BOOLEAN,
	PRIMARY KEY (Id),
	FOREIGN KEY (user_id) REFERENCES user(id)
);

--rollback DROP TABLE user;