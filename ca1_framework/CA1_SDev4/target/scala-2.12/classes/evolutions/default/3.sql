# --- !Ups
insert into department (dept_name) values ('Finance');

insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('JohnSmith@jmc.com',1,'employee','John Smith','Secretary','08512345678',25000.00, 'password',1);
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('SeanWilliams@jmc.com',2,'employee','Sean Williams','Accountant','0855662616',27000.00, 'password',1);  
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('BillMorris@jmc.com',3,'employee','Bill Morris','Auditor','08512345678',35000.00, 'password',1);  
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('HenriettaFord@jmc.com',4,'manager','HenriettaFord','manager','08512345678',40000.00, 'password',1);      

insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('123 The Crescent','Beechbrook Gardens','Newbridge', 'S12 D354','JohnSmith@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('7565 The View','Babel Gardens','Navan', 'R32 D311','SeanWilliams@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('4 larch Rise','The Demesne','Kilcullen', 'S14 X180','BillMorris@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('The Manor','Kilbride','Port Laoise', 'DC2 S40','HenriettaFord@jmc.com');
