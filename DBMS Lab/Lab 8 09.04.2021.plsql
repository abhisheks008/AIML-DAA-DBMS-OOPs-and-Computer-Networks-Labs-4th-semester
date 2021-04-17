CREATE TABLE EMP(EMPNO NUMBER(4), ENAME VARCHAR2(10), JOB VARCHAR2(9), MGR NUMBER(4), HIREDATE DATE, SAL NUMBER(7,2), COMM NUMBER(7,2), DEPTNO NUMBER(2));

INSERT INTO EMP VALUES(100, 'ABHISHEK', 'MARKETING', 5, '11-JAN-2019', 75000.00, 300, 1);
INSERT INTO EMP VALUES(101, 'NABARUN', 'SALESMAN', 6, '11-JAN-2019', 65000.00, 330, 2);
INSERT INTO EMP VALUES(102, 'SAYAN', 'ENGINEER', 7, '12-FEB-2019', 70000.00, 200, 3);
INSERT INTO EMP VALUES(103, 'SUBHA', 'SALESMAN', 6, '22-JAN-2018', 65000.00, 330, 2);
INSERT INTO EMP VALUES(104, 'SAYAK', 'MANAGER', 1, '12-DEC-2017', 90000.00, 500, 4);
INSERT INTO EMP VALUES(105, 'RAHUL', 'MARKETING',5, '11-JAN-2019', 75000.00, 300, 1);
INSERT INTO EMP VALUES(106, 'SIMA', 'DESIGN', 3, '12-MAR-2020', 55000.00, 120, 5);
INSERT INTO EMP VALUES(107, 'AMAN', 'CLERK',1, '14-FEB-2020', 25000.00, 100, 4);
 
SELECT * FROM EMP;

CREATE TABLE LOCATION(DLOCID NUMBER(4), CITY VARCHAR2(14));

INSERT INTO LOCATION VALUES(50, 'KOLKATA');
INSERT INTO LOCATION VALUES(51, 'BENGALURU');
INSERT INTO LOCATION VALUES(52, 'CHENNAI');
INSERT INTO LOCATION VALUES(53, 'MADURAI');

SELECT * FROM LOCATION;

CREATE TABLE DEPARTMENTS(DEPTNO NUMBER(2), DNAME VARCHAR2(14), DLOCID NUMBER(4));

INSERT INTO DEPARTMENTS VALUES(1, 'MARKETING', 50);
INSERT INTO DEPARTMENTS VALUES(2, 'SALES', 51);
INSERT INTO DEPARTMENTS VALUES(3, 'ENGINEER', 50);
INSERT INTO DEPARTMENTS VALUES(4, 'MANAGER', 52);
INSERT INTO DEPARTMENTS VALUES(5, 'DESIGN', 53);

SELECT * FROM DEPARTMENTS;

+------------------------------------------------------------+
|                     TABLES ARE CREATED                     |
+------------------------------------------------------------+ 
                                                                             
-- Q1. Display the name of the employee who earns highest salary.
SELECT EMP.ENAME AS NAME, EMP.SAL AS SALARY FROM EMP
WHERE  EMP.SAL = (SELECT MAX(EMP.SAL) FROM EMP);

-- Q2. Display the employee number and name for employee working as clerk and earning
highest salary among clerks.
SELECT E.EMPNO,E.ENAME FROM EMP E WHERE E.JOB='CLERK' AND E.SAL=(SELECT MAX(E.SAL) FROM EMP E WHERE E.JOB='CLERK');

-- Q3. Display the names of salesman who earns a salary more than the Highest Salary of the clerk?
SELECT E.ENAME FROM EMP E WHERE E.JOB='SALESMAN' AND E.SAL>(SELECT MAX(E.SAL) FROM EMP E WHERE E.JOB='CLERK');
 

-- Q4. Display the names of clerks who earn a salary more than the lowest salary of any
salesman.
SELECT E.ENAME FROM EMP E WHERE E.JOB='CLERK' AND E.SAL>(SELECT MIN(E.SAL) FROM EMP E WHERE E.JOB='SALESMAN');

-- Q5. Display the names of employees who earn a salary more than that of SAYAN or that of
salary greater than that of AMAN.
SELECT E.ENAME FROM EMP E WHERE E.SAL>(SELECT E.SAL FROM EMP E WHERE E.ENAME='SAYAN') AND E.SAL>(SELECT E.SAL FROM EMP E WHERE E.ENAME='AMAN');
 

SELECT E.ENAME FROM EMP E WHERE E.SAL>(SELECT MAX(E.SAL) FROM EMP E WHERE E.ENAME IN ('SAYAN','AMAN'));
 
-- Q6. Display the names of the employees who earn highest salary in their respective departments.
SELECT E.ENAME, E.DEPTNO FROM EMP E WHERE SAL IN (SELECT MAX(SAL) FROM EMP E GROUP BY DEPTNO);
 

-- Q7. Display the names of the employees who earn highest salaries in their respective jobgroups.
SELECT E.ENAME, E.JOB FROM EMP E WHERE SAL IN (SELECT MAX(SAL) FROM EMP E GROUP BY JOB);
 

-- Q8. Display the employee names who are working in DESIGN department.
SELECT E.ENAME FROM EMP E, DEPARTMENTS D WHERE E.DEPTNO=D.DEPTNO AND D.DNAME='DESIGN';
 

-- Q9. Display the employee names who are Working in KOLKATA?
SELECT E.ENAME FROM EMP E, DEPARTMENTS D, LOCATION L 
WHERE E.DEPTNO=D.DEPTNO AND D.DLOCID = L.DLOCID AND L.CITY='KOLKATA';
 

-- Q10. Display the Job groups having total salary greater than the maximum salary for managers.
SELECT E.JOB FROM EMP E GROUP BY E.JOB HAVING SUM(E.SAL)>(SELECT MAX(E.SAL) FROM EMP E WHERE E.JOB='MANAGER');
 

-- Q11. Display the names of employees from department number 5 with salary greater than
that of any employee working in other department.
SELECT E.ENAME FROM EMP E WHERE E.DEPTNO=5 AND E.SAL > ANY (SELECT E2.SAL FROM EMP E2 WHERE E2.DEPTNO!=E.DEPTNO);
 

-- Q12. Display the names of the employees from department number 1 with salary greater than that of all employee working in other departments.
SELECT E.ENAME FROM EMP E WHERE E.DEPTNO=1 AND E.SAL > ANY (SELECT E2.SAL FROM EMP E2 WHERE E2.DEPTNO!=E.DEPTNO);
 

-- Q13. Display the name, department number, and job id of all employees whose department location id 50
SELECT ENAME, JOB, DEPTNO
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO
			FROM DEPARTMENTS
			WHERE DLOCID = 50);
 

-- Q14. Display the name and salary of every employee who reports to king.
SELECT ENAME, SAL
FROM EMP
WHERE MGR = (SELECT EMPID FROM EMP WHERE ENAME = 'SAYAK');

-- Q15. Display the department number, name, and job id for every employee in the MANAGER department.
SELECT DEPTNO, ENAME, JOB
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO FROM DEPARTMENTS WHERE DNAME = 'MANAGER');
 

-- Q16. Display the name of the 4th highest paid employee.
SELECT * FROM (SELECT ENAME, SAL, RANK() OVER (ORDER BY SAL DESC)R FROM EMP) WHERE R = 4;
                                                                             
                                                                             
