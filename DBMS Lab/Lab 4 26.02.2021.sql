-- Author : Abhishek Sharma
-- Database Management Systems Lab 4
-- Date : 26.02.2021
-- Assignment 4



-- Creating the tables of employee and department

create table emp(empid number(2), f_name varchar2(20), l_name varchar2(20), job_type varchar2(20), salary number(10), comm number(10), d_name varchar2(30), manager_id number(4), doj date);

insert into emp values (1, 'arun', 'khan', 'manager', 90000, '', 'production', '', '04-jan-1998');

insert into emp values (2, 'barun', 'kumar', 'manager', 80000, '', 'marketing', '', '09-feb-1998');

insert into emp values (3, 'chitra', 'kapoor', 'engineer', 60000, '', 'production', 1, '08-jan-1998');

insert into emp values (4, 'dheeraj', 'mishra', 'manager', 75000, '', 'sales', 4, '27-dec-2001');

insert into emp values (5, 'emma', 'dutt', 'engineer', 55000, '', 'production', 1, '20-mar-2002');

insert into emp values (6, 'floki', 'dutt', 'accountant', 70000, '', 'accounts', '', '16-jul-2000');

insert into emp values (7, 'dheeraj', 'kumar', 'clerk', 40000, '', 'accounts', 6, '01-jul-2016');

insert into emp values (8, 'soul', 'sood', 'engineer', 60000, '', 'rnd', '', '06-sep-2014');

insert into emp values (9, 'mou', 'bhat', 'clerk', 30000, '', 'sales', 4, '08-mar-2018');

insert into emp values (10, 'sunny', 'deol', 'salesman', 20000, 10000, 'marketing', 2, '31-mar-2001');

insert into emp values (11, 'bobby', 'deol', 'engineer', 35000, '', 'rnd', 8, '17-oct-2017');

insert into emp values (12, 'aamir', 'khan', 'salesman', 15000, 5000, 'marketing', 2, '11-jan-2013');

select * from emp order by empid;

create table dept (d_name varchar2(20), d_loc varchar2(20), hod_id number(2));

insert into dept values ('sales','kol',4);
insert into dept values ('accounts', 'delhi',6);
insert into dept values ('production', 'kol',1);
insert into dept values ('marketing','kol',2);
insert into dept values ('rnd', 'marketing',8);

select * from dept;

-- Show the values of departmental table.
select * from dept;

-- Select the department names and their locations.
select d_name, d_loc from dept;

-- Show the employees f_name ,l_name , salary and the salary after 1000rs. Bonus.
select f_name, l_name, salary, salary+1000 as incremented_salary from emp;

-- Show the employees annual salary with a 1000rs. Yearly bonus and the annual salary with a
100rs. Monthly bonus.
select f_name, l_name, (salary*12)+1000 as annual_incremented_salary, (salary+100)*12 as monthly_incremented_salary from emp;

-- Show f_name as NAME and annual salary as ANNSAL from the employee table.
select f_name as NAME, (salary*12) as ANNSAL from emp;

-- Show the l_name as LasT AND 100rs. Incremented salary as NewSal.
select l_name as LasT, (salary+100) as NewSaL from emp;

-- Show the emp_id, f_name, l_name, job_type of the employee getting highest salary.
select empid,f_name,l_name, salary from emp 
where salary in (select max(salary) from emp);

-- Show the emp_id, f_name, l_name, job_type of the employee getting minimum salary.
select empid,f_name,l_name, salary from emp 
where salary in (select min(salary) from emp);

-- Show the average salary of employees in the employee table.
select avg(salary) "Average Salary" from emp;

-- Show f_name, l_name and job_type as employees.
select f_name||' '|| l_name||' - '||job_type "Employees" 
from emp;

-- Show employee details in the following fashion
select f_name||' is a '||job_type "Employee Details" from emp;

-- Show the monthly salary details in the following fashion
select f_name || q'['s monthly salary is ]' || salary "Monthly Salary deatils" from emp;

-- Show the different department names from department table
select distinct(d_name) "Department Names" from dept;

-- Show the employee names who works in ‘Sales’
select f_name||' '||l_name "Sales employees" from emp
where d_name = 'sales';

-- Show the employee names who gets salary of more than 50000 per month
select f_name||' '||l_name "Salary more than 50000" from emp
where salary > 50000;

-- Show the details of the employee whose manager id is not 1
select * from emp where not manager_id = 1;

-- Show the employee details whose salary ranges between 40000 and 70000
select * from emp
where salary between 40000 and 70000;

-- Show the details of the employees who works under the manager having id 1, 6 and 8
select * from emp
where manager_id in (1,6,8);

-- Select the f_name and salary of those employees whose last name starts with ‘K’
select f_name, salary from emp
where l_name like 'k%';

-- Select the f_name and salary of those employees whose last name starts with ‘K’ and ends with ‘R’
select f_name, salary from emp
where l_name like 'k%' and l_name like '%r';

-- Show the details of those employees where 3rd letter of l_name is ‘o’
select * from emp
where l_name like '__o%';

-- Select the details of those employees who works as an engineer with monthly salary more than 50000
select * from emp
where job_type = 'engineer' and salary > 50000;

-- Select the employees whose department is ‘Production’ or monthly salary is more than 60000 per month.
select * from emp
where d_name = 'production' and salary > 60000;

-- Show the use of upper and lower function.
select lower(f_name)||' '||upper(l_name) "Upper and Lower" from emp;

-- Show the use of concat, instr and length function
select concat(f_name, d_name) "concat func", instr (l_name, 'r') "contains r in Last name?", length (job_type) "Length of characters" from emp;

-- Show the use of the following functions on numeric values:
-- sqrt()
select sqrt(4) "Sqrt of 4" from dual;

-- power()
select power(4,2) "4 Power of 2" from dual;

-- ceil()
select ceil(17.222222) "ceil values" from dual;

-- substr ()
SELECT SUBSTR('SQL Assignments', 0, 3) AS ExtractString from dual;

-- max()
select max(salary) "Maximum Salary" from emp;

-- min()
select min(salary) "Minimum Salary" from emp;

-- round()
select round(458.55578458,2) "Round by 2 position" from dual;

-- avg()
select avg(salary) "Average Salary" from emp;

-- count ()
select count(empid) "counting the empid" from emp;

-- exp()
select exp(4) "Exp of 4" from dual;

-- mod()
select mod(112,2) "Mod value wrt 2" from dual;

-- Solve the following queries
-- Find the ceiling and floor value of 14.887.
select ceil(14.887) "Ceil value", floor(14.887) "Floor value" from dual;

-- Find out the round-off 17.49989
select round(17.49989) "round off value" from dual;

-- Calculate 8^7
select power(8,7) "value of 8^7" from dual; 

-- Show the current date
select sysdate "current date" from dual;

-- Find the total experience of the employees in weeks who works in Sales department
select f_name||' '||l_name "Employees", round(months_between(sysdate,doj)*4.33,2) "Work Exp in weeks" from emp
where  d_name = 'sales';

-- Display the use of the following functions on date
-- months_between()
select months_between(sysdate, date '2000-08-12') "My age in months" from dual;

-- add_months()
select add_months (sysdate, 3) "date after 3 months" from dual;

-- Next_day()
select next_day(sysdate, 'monday') "Next date" from dual;

-- last_day()
select last_day(sysdate) "Last Day" from dual;

-- round()
select round (sysdate, 'month') "round off date" from dual;

-- trunc()
select trunc (sysdate, 'month') "truncate date" from dual;

-- to_char()
CREATE TABLE date_tab (
   ts_col      TIMESTAMP,
   tsltz_col   TIMESTAMP WITH LOCAL TIME ZONE,
   tstz_col    TIMESTAMP WITH TIME ZONE);
ALTER SESSION SET TIME_ZONE = '-8:00';
INSERT INTO date_tab VALUES (  
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00');
INSERT INTO date_tab VALUES (
   TIMESTAMP'1999-12-02 10:00:00 -8:00', 
   TIMESTAMP'1999-12-02 10:00:00 -8:00',
   TIMESTAMP'1999-12-02 10:00:00 -8:00');
SELECT TO_CHAR(ts_col, 'DD-MON-YYYY HH24:MI:SSxFF') AS ts_date,
   TO_CHAR(tstz_col, 'DD-MON-YYYY HH24:MI:SSxFF TZH:TZM') AS tstz_date
   FROM date_tab
   ORDER BY ts_date, tstz_date;

SELECT SESSIONTIMEZONE, 
   TO_CHAR(tsltz_col, 'DD-MON-YYYY HH24:MI:SSxFF') AS tsltz
   FROM date_tab
   ORDER BY sessiontimezone, tsltz;

ALTER SESSION SET TIME_ZONE = '-5:00';
SELECT TO_CHAR(ts_col, 'DD-MON-YYYY HH24:MI:SSxFF') AS ts_col,
   TO_CHAR(tstz_col, 'DD-MON-YYYY HH24:MI:SSxFF TZH:TZM') AS tstz_col
   FROM date_tab
   ORDER BY ts_col, tstz_col;
   
SELECT SESSIONTIMEZONE,
TO_CHAR(tsltz_col, 'DD-MON-YYYY HH24:MI:SSxFF') AS tsltz_col
   FROM date_tab
   ORDER BY sessiontimezone, tsltz_col;


-- Show the employee details with a revised salary. The salary is incremented in the following way:
h. 10% for sales department
i. 20% for marketing department
j. No increment for others

select f_name||' '||l_name "Employees", salary "Old Salary",
case
when d_name = 'sales' then (1.10*salary)
when d_name = 'marketing' then (1.20*salary)
else (1*salary)
end "New Salary"
from emp;


-- Determine the tax for each employee in production department based on the monthly salary.
The tax rate are as per the following data:

select f_name||' '||l_name "Employees", salary "Salary",
case
when d_name = 'production' and salary between 0 and 19999 then (0*salary)/100
when d_name = 'production' and salary between 20000 and 39999 then (9*salary)/100
when d_name = 'production' and salary between 40000 and 59999 then (20*salary)/100
when d_name = 'production' and salary between 60000 and 79999 then (30*salary)/100
when d_name = 'production' and salary > 80000 then (45*salary)/100
else 0*salary
end "Tax"
from emp;


-- Find the Cartesian product between Employee and Department table.
select * from emp
cross join dept;

-- Show the employee names and the respective department location.
select f_name, d_loc from emp, dept where emp.d_name = dept.d_name;

-- Give an example of the following joins considering employee and department tables.
-- Natural Join
select * from emp
natural join dept;

-- inner join
select *
from emp
inner join dept
on emp.d_name = dept.d_name;

-- Left Outer join
select *
from emp
left join dept
on emp.d_name = dept.d_name;

-- Right outer join
select *
from emp
right join dept
on emp.d_name = dept.d_name;

-- Full Outer Join
select *
from emp
full outer join dept
on emp.d_name = dept.d_name;

-- Find the employee name and date of joining who are working in Delhi
select upper(emp.f_name)||' '||upper(emp.l_name) "Employee of Delhi", emp.doj from emp, dept
where emp.d_name = dept.d_name and d_loc = 'delhi';

-- Create a table ‘Emp_Address’ for storing the permanent address of the employees and insert
the following values:

create table emp_address (empid number(2), city varchar2(20), district varchar2(20), state varchar2(20));
insert into emp_address values (1, 'suri', 'birbhum', 'wb');
insert into emp_address values (2, 'kolkata', 'kolkata', 'wb');
insert into emp_address values (3, 'bhubaneshwar', 'khurda', 'odisha');
insert into emp_address values (4, 'durgapur', 'burdwan', 'wb');
insert into emp_address values (5, 'noida', 'g b nagar', 'up');
insert into emp_address values (6, 'secunderabad', 'hyderabad', 'telengana');
insert into emp_address values (7, 'dehradun', 'dehradun', 'uttarakhand');
insert into emp_address values (8, 'asansol', 'burdwan', 'wb');
insert into emp_address values (9, 'siliguri', 'darjeeling', 'wb');
insert into emp_address values (10, 'kolkata', 'kolkata', 'wb');
insert into emp_address values (11, 'jalpaiguri', 'jalpaiguri', 'wb');
insert into emp_address values (12, 'new delhi', 'new delhi', 'delhi');


select * from emp_address;

-- Display the name of employees, department location and the city name the employee belongs
to, from the Employee, Department and Emp_Address tables.

select upper(emp.f_name) "Name", dept.d_loc "Location", emp_address.city "City"
from emp, dept, emp_address 
where emp.d_name = dept.d_name and emp.empid = emp_address.empid;

-- Find the name of each department’s manager.
select upper(f_name)||' '||upper(l_name) "Name of the Managers", d_name "Department"
from emp
where job_type = 'manager';

-- Create ‘Job_Grades’ table and insert the following values:
create table job_grades (grade varchar2(3), lowest_sal number(10), highest_sal number(10));
insert into job_grades values('A', 10000, 24999);
insert into job_grades values ('B', 25000, 49999);
insert into job_grades values ('C', 50000, 100000);

select * from job_grades;

-- Display the employee names with their respective job grades and salary.
SELECT upper(emp.f_name)||' '||upper(emp.l_name) "Employees", emp.salary "Salary", job_grades.grade "Job Grade"
from  emp 
JOIN job_grades
ON emp.salary BETWEEN job_grades.lowest_sal AND job_grades.highest_sal 
order by emp.empid;
