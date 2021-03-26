select * from emp;

-- Display the employee name from the table Employee whose salary is in the range of 2500,5000
select empno,ename, sal
from emp
where sal between 2500 and 5000;


-- Display the employee name whose salary is in the range of 2500,4500 and do not show employee name with a employee id 7788,7839
select *
from emp
where (sal between 2500 and 4000) and (not (empno = 7788 or empno = 7839));


-- Display the employee name whose salary is not in the range of 2500,5000
select ename, sal
from emp
where not (sal between 2500 and 5000);


-- Find the minimum salary from the table employee
select min(sal) "Minimum Salary"
from emp;


-- Find the maximum salary from the table employee
select max(sal) "Maximum Salary"
from emp;


-- Find average salary from the table employee
select round(avg(sal),2) "Average Salary"
from emp;


-- Find sum of the salary from the table employee
select sum(sal) "Sum of the Salary"
from emp;


-- Count commission from table employee
select count(comm) "Commision Count"
from emp;
