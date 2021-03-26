-- Database Management Systems Lab 7 
-- Assignemt 7
-- Date : 26.03.2021
-- Platform used : Oracle 10G Express
-- Code Contributed by, Abhishek Sharma, 2021
-- Department of CSE, UEM, Kolkata



-- Table Schema :

+---------------------------------------------------------------------------------------------------------+
| Object Type TABLE Object EMP                                                                            |
+---------------------------------------------------------------------------------------------------------+
| Table |  Column   | Data Type | Length | Precision | Scale | Primary Key | Nullable | Default | Comment |
|  EMP  | EMPNO     | Number    |    -   | 4         | 0     |      -      |     -    |    -    |    -    |
|       | ENAME     | Varchar2  | 10     |     -     |   -   |      -      |     √    |    -    |    -    |
|       | JOB       | Varchar2  | 10     |     -     |   -   |      -      |     √    |    -    |    -    |
|       | MGR       | Number    |    -   | 4         | 0     |      -      |     √    |    -    |    -    |
|       | HIREDATE  | Date      | 7      |     -     |   -   |      -      |     √    |    -    |    -    |
|       | SAL       | Number    |    -   | 7         | 2     |      -      |     √    |    -    |    -    |
|       | COMM      | Number    |    -   | 7         | 2     |      -      |     √    |    -    |    -    |
|       | DEPTNO    | Number    |    -   | 2         | 0     |      -      |     √    |    -    |    -    |
+---------------------------------------------------------------------------------------------------------+
|                                                                                                   1 - 8 |
+---------------------------------------------------------------------------------------------------------+


+------------------------------------------------------------------------------------------------------------+
| Object Type TABLE Object LOCATION                                                                          |
+------------------------------------------------------------------------------------------------------------+
|  Table   |  Column   | Data Type | Length | Precision | Scale | Primary Key | Nullable | Default | Comment |
| LOCATION | DLOC_ID   | Number    |    -   | 2         | 0     |      -      |     √    |    -    |    -    |
|          | CITY      | Varchar2  | 14     |     -     |   -   |      -      |     √    |    -    |    -    |
+------------------------------------------------------------------------------------------------------------+
|                                                                                                      1 - 2 |
+------------------------------------------------------------------------------------------------------------+


+--------------------------------------------------------------------------------------------------------------+
| Object Type TABLE Object DEPARTMENTS                                                                         |
+--------------------------------------------------------------------------------------------------------------+
|    Table    |  Column  | Data Type | Length | Precision | Scale | Primary Key | Nullable | Default | Comment |
| DEPARTMENTS | DEPTNO   | Number    |    -   | 2         |   0   |      -      |     √    |    -    |    -    |
|             | DNAME    | Varchar2  | 14     |     -     |   -   |      -      |     √    |    -    |    -    |
|             | DLOC_ID  | Number    |    -   | 4         |   0   |      -      |     √    |    -    |    -    |
+--------------------------------------------------------------------------------------------------------------+
|                                                                                                        1 - 3 |
+--------------------------------------------------------------------------------------------------------------+




-- Q1. The HR department needs a list of department IDs for departments that do not contain the job ID ST_CLERK. Use set operators to create this report.

SELECT DLOC_ID FROM DEPARTMENTS
MINUS
SELECT DLOC_id FROM LOCATION
WHERE JOB = 'ST_CLERK';

-- Q2. Display the country ID and the name of the countries. Use set operators to create this report.

SELECT COUNTRY_ID, COUNTER_NAME
FROM COUNTRIES
MINUS
SELECT L.COUNTRY_ID, C.COUNTRY_NAME
FROM LOCATIONS L JOIN COUNTRIES C
ON (L.COUNTRY_ID = C.COUNTRY_ID)
JOIN DEPARTMENTS D
ON D.LOCATION_ID = L.LOCATION_ID;

-- Q3. Produce a list of jobs for departments 10, 50, and 20, in that order. Display the job ID and department ID using set operators.

SELECT DISTINCT JOB, DLOC_ID
FROM EMP
WHERE DLOC_ID = 10
UNION ALL
SELECT DISTINCT JOB, DLOC_ID
FROM EMP
WHERE DLOC_ID = 50
UNION ALL
SELECT DISTINCT JOB, DLOC_ID
FROM EMP
WHERE DLOC_ID = 20;

-- Q4. Display the employee name and department name for all employees who have an ‘a’ (lowercase) in their last names.

SELECT ENAME, DNAME FROM EMP, DEPARTMENTS
WHERE EMP.DEPTNO = DEPARTMENTS.DEPTNO AND ENAME LIKE "%a%";

-- Q5. Write a query to display the employee name, department name, location id and city of employees who earn a commission.

SELECT EMP.ENAME, DEPARTMENTS.DNAME, DEPARTMENTS.DLOC_ID, LOCATION.CITY FROM EMP, LOCATION, DEPARTMENTS
WHERE EMP.DEPTNO = DEPARTMENTS.DEPTNO AND LOCATION.DLOC_ID = DEPARTMENTS.DLOC_ID AND COMM IS NOT NULL;

-- Q6. Display the employee name and employee number along with their manager’s name and manager number. Label the columns employee, emp#, manager, and mgr# resp.

SELECT w.last_name "Employee", w.employee_id "EMP#", m.last_name "Manager", m.employee_id "Mgr#"
FROM employees w join employees m
ON (w.manager_id = m.employee_id);


-- Q7. Modify the above query to display all employees including king who has no manager.
Order the results by the employee number.

SELECT w.last_name "Employee", w.employee_id "EMP#",
m.last_name "Manager", m.employee_id "Mgr#"
FROM employees w
LEFT OUTER JOIN employees m
ON (w.manager_id = m.employee_id);

-- Q8. Create a query that displays employee name, department numbers and all the employees who work in the same department as the given employee. Give each column an appropriate label.
SELECT e.department_id department, e.last_name employee,
c.last_name colleague
FROM employees e JOIN employees c
ON (e.department_id = c.department_id)
WHERE e.employee_id <> c.employee_id
ORDER BY e.department_id, e.last_name, c.last_name;

-- Q9. Create a query to display the name and hire date of any employee hired after employee Davies.
SELECT e.last_name, e.hire_date
FROM employees e, employees davies
WHERE davies.last_name = ’Davies’
AND davies.hire_date < e.hire_date

-- Q10. Display the names and hiredate for all employees who were hired before their managers, along with their manager’s names and hire dates. (Hint: Use self join)

SELECT E.LAST_NAME, E.HIREDATE, M.HIREDATE, M.LAST_NAME
FROM EMPLOYEE E
JOIN EMPLOYEE M
ON (E.MANAGER_ID = M.EMPLOYEE_ID)
WHERE (E.HIREDATE < M.HIREDATE);

-- Q11. Write a query to display the last name, department number, and department name for all employees. 

SELECT e.last_name, e.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id;

-- Q12. Create a unique listing of all jobs that are in department 80.Include the location of the department in the output.

SELECT DISTINCT job_id, location_id
FROM employees, departments
WHERE employees.department_id = departments.department_id
AND employees.department_id = 80;

-- Q13. Write a query to display the last name, job, department number, and department name for all employees who work in Toronto.
SELECT 	e.last_name, e.job_id, e.department_id,d.department_name
FROM 	employees e JOIN departments d
ON 	(e.department_id = d.department_id)
JOIN 	locations l
ON 	(d.location_id = l.location_id)
WHERE 	LOWER(l.city) = ’toronto’;

-- Q14. Write a query to display each department’s name, location, number of employees and the average salary for all employees in that department for those departments where the average salary is greater than or equal to 10000. Label the columns. Department’s Name, Department’s Location, Number of People and salary, respectively.

SELECT DEPARTMENTS.DNAME "DEPARTMENT'S NAME", LOCATION.CITY "DEPARTMENTS' LOCATION", COUNT (EMP.EMPID) "NUMBER OF PEOPLE", AVG (EMP.SALARY) "SALARY"
FROM DEPARTMENTS, LOCATION
GROUP BY (DEPARTMENTS.DNAME)
WHERE (AVG (EMP.SALARY) >= 10000);
