--liquibase formatted sql
--changeset rent_a_book:release_0.0.2.add_user_role_table.sql

insert into user(firstName,lastName,email,password) values('appadmin','app!@#','sagar.mahapatro@gmail.com','superuser123');

insert into role(role_name,role_description) values('superuser','user having all powers');
insert into role(role_name,role_description) values('admin','user manage app');
insert into role(role_name,role_description) values('customer','user use app');


insert into user_role(user_id,role_id)values((select id from user where firstName = 'appadmin'),(select id from role where role_name = 'superuser'));

insert into user_role(user_id,role_id)values((select id from user where firstName = 'appadmin'),(select id from role where role_name = 'admin'));
