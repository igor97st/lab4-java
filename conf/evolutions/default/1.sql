# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            bigint not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);
create sequence category_seq;

create table product (
  id                            bigint not null,
  name                          varchar(255),
  description                   varchar(255),
  stock                         integer,
  price                         double,
  constraint pk_product primary key (id)
);
create sequence product_seq;

create table user (
  role                          varchar(255),
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  department                    varchar(255),
  street1                       varchar(255),
  street2                       varchar(255),
  town                          varchar(255),
  post_code                     varchar(255),
  credit_card                   varchar(255),
  constraint pk_user primary key (email)
);


# --- !Downs

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists product;
drop sequence if exists product_seq;

drop table if exists user;

