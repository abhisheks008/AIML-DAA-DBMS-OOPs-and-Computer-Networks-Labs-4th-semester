-- Database Management Systems Lab 2
-- Date : 12.02.2021
-- Author : Abhishek Sharma
-- Platform : Oracle 10G Express
-- Assignment 2



-- CREATING THE TABLE EMP
create table emp (empno number(4) not null, ename varchar2(10), job varchar2(9), mgr number(4), hire_date date, sal number(7,2), comm number(7,2), dept_no number(2));

desc emp;



-- INSERTING THE DATA IN THE TABLE EMP
insert into emp values(7369, 'SMITH', 'CLERK', 7902, to_date('17/12/1980','DD/MM/YYYY'), 800, NULL ,20);

insert into emp values(7499, 'ALLEN', 'SALESMAN', 7698, to_date('20/02/1981','DD/MM/YYYY'), 1600, 300 ,30);

insert into emp values(7521, 'WARD', 'SALESMAN', 7698, to_date('22/02/1981','DD/MM/YYYY'), 1250, 500 ,30);

insert into emp values(7566, 'JONES', 'MANAGER', 7839, to_date('02/04/1981','DD/MM/YYYY'), 2975, NULL ,20);

insert into emp values(7654, 'MARTIN', 'SALESMAN', 7698, to_date('28/09/1981','DD/MM/YYYY'), 1250, 1400 ,30);

insert into emp values(7698, 'BLAKE', 'MANAGER', 7839, to_date('01/05/1981','DD/MM/YYYY'), 2850, NULL ,30);

insert into emp values(7782, 'CLARK', 'MANAGER', 7839, to_date('09/06/1981','DD/MM/YYYY'), 2450, NULL ,10);

insert into emp values(7788, 'SCOTT', 'ANALYST', 7566, to_date('19/04/1987','DD/MM/YYYY'), 3000, NULL ,20);

insert into emp values(7839, 'KING', 'PRESIDENT', NULL, to_date('17/11/1981','DD/MM/YYYY'), 5000, NULL ,10);

insert into emp values(7844, 'TURNER', 'SALESMAN', 7698, to_date('08/09/1981','DD/MM/YYYY'), 1500, 0 ,30);

insert into emp values(7876, 'ADAMAS', 'CLERK', 7788, to_date('23/05/1987','DD/MM/YYYY'), 1100, NULL ,20);

insert into emp values(7900, 'JAMES', 'CLERK', 7698, to_date('03/12/1981','DD/MM/YYYY'), 950, NULL ,30);

insert into emp values(7902, 'FORD', 'ANALYST', 7566, to_date('03/12/1981','DD/MM/YYYY'), 3000, NULL ,20);

insert into emp values(7934, 'MILLER', 'CLERK', 7782, to_date('23/01/1982','DD/MM/YYYY'), 1300, NULL ,10);


-- select all columns from the emp table
select * from emp;


-- write query to select only Employees name, id and Job
select empno,ename,job from emp; 


-- write query to select unique Jobs
select distinct job from emp;


-- write query to select only those employees who are salesman
select * from emp where job = 'SALESMAN';


-- select employee name , empno and salary , in the order of their salary
select empno, ename, sal from emp order by sal asc;


-- Mgmt. is considering a pay raise, however they want to find out, if they give a flat 200/- increment to all, then what % each person is getting. So in your result display, ename , salary and pctincr
select ename, sal,round(((200*100)/sal),2) as pctincr from emp;


-- Express work experience of each of the employees by using sysdate and hiredate in terms of no of years.
desc dual;
select sysdate from dual;
select extract (year from sysdate) from dual;
select empno, ename, round(months_between(sysdate,hire_date)/12,2) as work_experience_in_years from emp order by work_experience_in_years;


-- Select only those employees who are a clerk or a manager.(using in operator)
select * from emp where job in ('CLERK','MANAGER');


-- Select only those employees who are a clerk or a manager.(using or operator)
select * from emp where (job = 'CLERK' or job = 'MANAGER');


-- Select employee name whose job is not manager
select * from emp where not (job = 'MANAGER');


-- Select employee name whose job are salesman or clerk and department number is 30 or 20.
select *
from emp
where (job in ('CLERK','SALESMAN')) and (dept_no in (20,30));


-- Extract year from table employee
select extract (year from hire_date) from emp;


-- Use like statement to display name of the employees which start with ‘A’
select ename
from emp
where ename like 'A%';


-- Select employee name whose 3rd alphabet is “a”
select ename
from emp
where ename like '__A%';


-- Select employee name whose last alphabet is “n”
select ename
from emp
where ename like '%N';


-- Select those employees , who has joined on or before 31st December 1982 and is either a clerk or having a salary greater than 2500
select *
from emp
where (hire_date <= '31-DEC-1982') and (job = 'CLERK' or sal > 2500);


-- Display all employee names in upper case.
select Upper(ename)  "Employee names in Upper Case" from emp;
