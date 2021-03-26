-- Database Management Systems Lab 1
-- Date : 05.02.2021
-- Author : Abhishek Sharma
-- User : System
-- Platform : Oracle 10g



-- 1. Create and insert data in table customer
create table customer(cust_id number(8),cust_fname varchar2(20),cust_lname varchar2(20),territory varchar2(20),cred_lmt number(9,2),mngr_id number(3),marital_status varchar2(20),sex varchar2(10),income number(8));

insert into customer values(147, 'Aishwaria', 'Roberts', 'AMERICA', 600.34, 147, 'single', 'female',130000);

insert into customer values(148, 'Gaurav', 'Shah', 'AMERICA', 600, 148, 'married', 'male',240000);

insert into customer values(352, 'Ken', 'Reid', 'ITALY', 3600.65, 147, 'single', 'male',30000);

insert into customer values(360, 'Helmet', 'Capshaw', 'CHINA', 3600.65, 148, 'married', 'male',240000);

insert into customer values(363, 'Cathy', 'Lambert', 'ITALY', 2400, 147, 'married', 'male',50000);

insert into customer values(378, 'Meg', 'Sen', 'THAILAND', 3700.78, 159, 'married', 'male',50000);

insert into customer values(380, 'Meryl', 'Holden', 'INDIA', 3700, 148, 'single', 'female',160000);

insert into customer values(447, 'Richard', 'Cappola', 'ITALY', 500.76, 147, 'married', 'female',50000);

insert into customer values(449, 'Rick', 'Romero', 'ITALY', 1500, 147, 'single', 'female',30000);

insert into customer values(451, 'Ridley', 'Hackman', 'ITALY', 700.59, 147, 'single', 'female',150000);

insert into customer values(454, 'Rob', 'Russell', 'INDIA', 5000, 148, 'married', 'male',90000);

insert into customer values(458, 'Robert', 'De-Niro', 'INDIA', 3700, 148, 'single', 'female',150000);

insert into customer values(463, 'Robin', 'Adjani', 'INDIA', 1500, 148, 'married', 'female',50000);

select * from customer;



-- 2. Alter table and Add column stay_from_year.

alter table customer add stay_from_year number(4);



-- 3. Set value of stay_from_year as 2001 for Italy.

update customer set stay_from_year = 2001 where territory = 'ITALY';



-- 4. Display credit limit attribute for America.

select cred_lmt from customer where territory = 'AMERICA';



-- 5. Delete the record corresponding to Meg Sen.

delete from customer where cust_fname='Meg';



-- 6. Show all attributes for Italy// Show all data in the territory Italy.

select * from customer where territory = 'ITALY';



-- 7. If territory is India then set value of credit to 7000

update customer set cred_lmt = 7000 where territory = 'INDIA'



-- 8. Rename cust_fname to first_name.

alter table customer rename column cust_fname to first_name;

-- 9. Rename cust_lname to last_name.

alter table customer rename column cust_lname to last_name;




-- 10. Create table cust1 from the old table customer(copy structure as well as data using CTAS [create table as select] statement).

create table cust1(cust_id number(8),cust_fname varchar2(20),cust_lname varchar2(20),territory varchar2(20),cred_lmt number(9,2),mngr_id number(3),marital_status varchar2(20),sex varchar2(10),income number(8), stay_from_year number(4));

insert into cust1 select cust_id, first_name, last_name, territory, cred_lmt, mngr_id, marital_status, sex, income, stay_from_year from customer;

select * from cust1;




-- 11. Create tables cust2 without values of cust1 using CTAS statement.

create table cust2(cust_id number(8),cust_fname varchar2(20),cust_lname varchar2(20),territory varchar2(20),cred_lmt number(9,2),mngr_id number(3),marital_status varchar2(20),sex varchar2(10),income number(8), stay_from_year number(4));




-- 12. Create tables cust4 with attributes name customer_id, firstname,lastname, income from old customer table(using CTAS statement).

create table cust4 (cust_id number(3),f_name varchar2(15),l_name varchar2(15),income number(10,2));




-- 13. Drop column income from cust1.
	
alter table cust1 drop column income;




-- 14. Rename table cust1 to cust_one

alter table cust1 rename to cust_one;




-- 15. Insert values into cust2 table from customer table.

insert into cust2 select cust_id,first_name,last_name, territory, cred_lmt, mngr_id, marital_status, sex, income, stay_from_year from customer;



-- 16. Delete all values from table cust1 where mngr_id is 7001

delete from cust_one where mngr_id = 7001;





