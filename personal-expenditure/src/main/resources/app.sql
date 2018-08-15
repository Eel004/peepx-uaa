use `personal-expenditure`

drop table if exists hibernate_sequence;
drop table if exists TBL_AUTHORITIES;
drop table if exists TBL_BUDGET;
drop table if exists TBL_CATEGORY;
drop table if exists TBL_TRANSACTION;
drop table if exists TBL_USERS;
create table hibernate_sequence (next_val bigint)
insert into hibernate_sequence values ( 1 );
insert into hibernate_sequence values ( 1 );
insert into hibernate_sequence values ( 1 );

create table TBL_AUTHORITIES (
AUTHORITY varchar(255) not null, 
USERNAME varchar(255), 
primary key (AUTHORITY));

create table TBL_BUDGET (
BUDGET_ID bigint not null, 
AMOUNT double precision not null, 
FROM_DATE datetime not null, 
SPENT_AMOUNT double precision, 
TO_DATE datetime not null, 
primary key (BUDGET_ID));

create table TBL_CATEGORY (
CATEGORY_ID bigint not null, 
description varchar(255), 
ICON varchar(255), 
NAME varchar(255), 
primary key (CATEGORY_ID));

create table TBL_TRANSACTION (
TRANSACTION_ID bigint not null, 
AMOUNT double precision not null, 
CURRENCY varchar(255), 
SPEND_DATE datetime not null, 
BUDGET_ID bigint not null, 
CATEGORY_ID bigint not null, 
primary key (TRANSACTION_ID));

create table TBL_USERS (
USERNAME varchar(255) not null, 
ENABLED bit not null, 
PASSWORD varchar(255) not null, 
primary key (USERNAME));

alter table TBL_AUTHORITIES add constraint FK60cngxvnvu03ybjpt5ohuspk3 foreign key (USERNAME) references TBL_USERS (USERNAME);

alter table TBL_TRANSACTION add constraint FK3u298vj76ywpo4dygdwr6pamw foreign key (BUDGET_ID) references TBL_BUDGET (BUDGET_ID);

alter table TBL_TRANSACTION add constraint FKr5yTBL_USERSy4wieq0cywmjjhm6ro8myu foreign key (CATEGORY_ID) references TBL_CATEGORY (CATEGORY_ID);

insert into TBL_USERS(username,password,enabled)
	values('admin','$2a$10$hbxecwitQQ.dDT4JOFzQAulNySFwEpaFLw38jda6Td.Y/cOiRzDFu',true);
    
insert into TBL_AUTHORITIES(username,authority) 
	values('admin','ROLE_ADMIN');
    
String encoded=new BCryptPasswordEncoder().encode("admin@123");



