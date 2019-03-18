# --- !Ups
insert into department (dept_name) values ('Finance');
insert into department (dept_name) values ('Catering');
insert into department (dept_name) values ('Mining');
insert into department (dept_name) values ('Repairs');
insert into department (dept_name) values ('Logistics');
insert into department (dept_name) values ('Security');

insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('JohnSmith@jmc.com',1,'employee','John Smith','Secretary','08512345678',25000.00, 'password',1);
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('SeanWilliams@jmc.com',2,'employee','Sean Williams','Accountant','0855662616',27000.00, 'password',1);  
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('BillMorris@jmc.com',3,'employee','Bill Morris','Auditor','085573755474',35000.00, 'password',1);  
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('HenriettaFord@jmc.com',4,'manager','HenriettaFord','manager','0855843975',40000.00, 'password',1);     

insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('ChrisBarrie@jmc.com',1,'employee','Chris Barrie','Technician','08556654566',14000.00, 'password',4);
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('CraigCharles@jmc.com',2,'employee','Craig Charles','Technician','0857456556',14500.00, 'password',4);  
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('Robert Llewyn@jmc.com',3,'employee','Robert Llewyn','Cleaner','08598824447',19000.00, 'password',2);  
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('DannyJohn-Jules@jmc.com',4,'manager','Danny John-Jules','manager','0854646564',42000.00, 'password',3); 

insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('ClareGrogan@jmc.com',1,'employee','Clare Grogan','Secretary','0856545567',25000.00, 'password',5);
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('ChloeArnett@jmc.com',2,'employee','Chloe Arnett','Clerk','0857454464',27000.00, 'password',5);  
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('NormanLovett@jmc.com',3,'employee','Bill Morris','Clerk','08599547934',35000.00, 'password',5);  
insert into employee (email, id, role, name, job_Title, work_Phone, salary, password,department_id)
            values ('HattieHayridge@jmc.com',4,'manager','Hattie Hayridge','manager','0854574398',40000.00, 'password',4); 

insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('123 The Crescent','Beechbrook Gardens','Newbridge', 'S12 D354','JohnSmith@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('7565 The View','Babel Gardens','Navan', 'R32 D311','SeanWilliams@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('4 larch Rise','The Demesne','Kilcullen', 'S14 X180','BillMorris@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('The Manor','Kilbride','Port Laoise', 'DC2 S40','HenriettaFord@jmc.com');

insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('935 Ballysax','The Curragh','Newbridge', 'R32 RB26','ChrisBarrie@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('11 The Precint','Gardener Square','Donaghmede', 'S33 P321','CraigCharles@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('4 Oak Rise','Demesne View','Rostrevor', 'S11 F120','Robert Llewyn@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('Holyfield','Bloomfield','Tullamore', 'A90 2JZ','DannyJohn-Jules@jmc.com');

insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('123 The Crescent','Beechbrook Gardens','Newbridge', 'S12 D354','ClareGrogan@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('7565 The View','Babel Gardens','Navan', 'R32 D311','ChloeArnett@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('4 larch Rise','The Demesne','Kilcullen', 'S14 X180','NormanLovett@jmc.com');
insert into address (address1, address2, town_city, eircode, employee_email)  
            values  ('The Manor','Kilbride','Port Laoise', 'DC2 S40','HattieHayridge@jmc.com');


UPDATE employee
SET aid = ('1')
where email = 'JohnSmith@jmc.com';

UPDATE employee
SET aid = ('2')
where email = 'ChrisBarrie@jmc.com';

UPDATE employee
SET aid = ('3')
where email = 'HattieHayridge@jmc.com';

UPDATE employee
SET aid = ('4')
where email = '	NormanLovett@jmc.com';

UPDATE employee
SET aid = ('5')
where email = 'ChloeArnett@jmc.com';

UPDATE employee
SET aid = ('6')
where email = 'ClareGrogan@jmc.com';

UPDATE employee
SET aid = ('7')
where email = 'DannyJohn-Jules@jmc.com';

UPDATE employee
SET aid = ('8')
where email = 'Robert Llewyn@jmc.com';

UPDATE employee
SET aid = ('9')
where email = 'CraigCharles@jmc.com';

UPDATE employee
SET aid = ('10')
where email = 'HenriettaFord@jmc.com';


UPDATE employee
SET aid = ('11')
where email = 'BillMorris@jmc.com';

UPDATE employee
SET aid = ('12')
where email = 'SeanWilliams@jmc.com';



insert into project (project_name, start_date, finish_date, allocated_budget)
            values  ('Testing', TO_DATE('17/12/2015', 'DD/MM/YYYY'), TO_DATE('23/03/2019', 'DD/MM/YYYY'), 1000000.00);