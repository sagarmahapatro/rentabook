--liquibase formatted sql
--changeset rent_a_book:release_0.0.2.add_user_role_table.sql

insert into user(firstName,lastName,email,password) values('superuser','superuser','sagar.mahapatro@gmail.com','superuser123');

insert into user_role(user_id,isAdmin,isSuperUser)values(select id from user where firstName = 'superuser',true,true);
