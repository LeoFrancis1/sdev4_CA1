# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigint auto_increment not null,
  address1                      varchar(255),
  address2                      varchar(255),
  town_city                     varchar(255),
  eircode                       varchar(255),
  employee_email                varchar(255),
  constraint uq_address_employee_email unique (employee_email),
  constraint pk_address primary key (id)
);

create table department (
  id                            bigint auto_increment not null,
  dept_name                     varchar(255),
  constraint pk_department primary key (id)
);

create table employee (
  role                          varchar(255),
  email                         varchar(255) not null,
  id                            bigint,
  name                          varchar(255),
  job_title                     varchar(255),
  work_phone                    varchar(255),
  salary                        double not null,
  password                      varchar(255),
  aid                           bigint,
  department_id                 bigint,
  constraint uq_employee_aid unique (aid),
  constraint pk_employee primary key (email)
);

create table project (
  id                            bigint auto_increment not null,
  project_name                  varchar(255),
  start_date                    timestamp,
  finish_date                   timestamp,
  allocated_budget              double not null,
  constraint pk_project primary key (id)
);

alter table address add constraint fk_address_employee_email foreign key (employee_email) references employee (email) on delete restrict on update restrict;

alter table employee add constraint fk_employee_aid foreign key (aid) references address (id) on delete restrict on update restrict;

alter table employee add constraint fk_employee_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_employee_department_id on employee (department_id);


# --- !Downs

alter table address drop constraint if exists fk_address_employee_email;

alter table employee drop constraint if exists fk_employee_aid;

alter table employee drop constraint if exists fk_employee_department_id;
drop index if exists ix_employee_department_id;

drop table if exists address;

drop table if exists department;

drop table if exists employee;

drop table if exists project;

