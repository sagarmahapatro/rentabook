--liquibase formatted sql
--changeset rent_a_book:release_0.0.2.add_user_role_table.sql

USE rentabook;
create  table role (
	id INT(6) UNSIGNED AUTO_INCREMENT,
	version INT(6),
	role_name VARCHAR(20),
    role_description VARCHAR(200),
	PRIMARY KEY (Id)
);
create table  user_role (
    id INT(6) UNSIGNED AUTO_INCREMENT,
	version INT(6),
	user_id INT(6) UNSIGNED NOT NULL,
	role_id INT(6) UNSIGNED NOT NULL,
	PRIMARY KEY (Id),
	FOREIGN KEY (user_id) REFERENCES user(id),
	FOREIGN KEY (role_id) REFERENCES role(id)
);

--rollback DROP TABLE user_role;
--rollback DROP TABLE role;