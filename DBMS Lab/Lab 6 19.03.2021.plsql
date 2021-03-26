-- ASSIGNMENT : 5 [CONTINUED FROM LAB 5]
-- Q2. a) Create a table Depart with the columns dept_id, dept_name, location_name where dept_id is primary key.
-- b) Create another table Employ with the columns empid, name, salary, address, hire_date, department_no where empid is primary key.
-- ► Make a referential integrity between department_no and dept_id. Also make sure that salary must contain some values in all rows and each department’s name is different.
-- ►  Give appropriate names to all the constraints being imposed on both the tables. Insert at least 3 rows in departments table. Insert at least 5 rows in the employees table with different department names.

CREATE TABLE DEPART ( DEPT_ID NUMBER PRIMARY KEY,
DEPT_NAME VARCHAR2(20),
LOCATION_NAME VARCHAR2(20));

CREATE TABLE EMPLOY (EMPID NUMBER PRIMARY KEY,
NAME VARCHAR2 (20),
SALARY NUMBER(5,2),
ADDRESS VARCHAR2(30),
HIRE_DATE DATE,
DEPARTMENT_NO NUMBER);

ALTER TABLE EMPLOY
ADD CONSTRAINT EMPLOY_FK FOREIGN KEY (DEPARTMENT_NO) REFERENCES DEPART (DEPT_ID);

ALTER TABLE EMPLOY MODIFY SALARY NOT NULL;

INSERT INTO DEPART VALUES (123, 'SALES', 'KOLKATA');
INSERT INTO DEPART VALUES (456, 'MANAGER', 'DELHI');
INSERT INTO DEPART VALUES (987, 'CUSTOMER', 'BANGALORE');

INSERT INTO EMPLOY VALUES (1, 'RAM', 560, 'KOLKATA', '02-DEC-1987', 123);
INSERT INTO EMPLOY VALUES (2, 'SHYAM', 300, 'DELHI', '05-JUN-1988', 456);
INSERT INTO EMPLOY VALUES (3, 'RAJA', 500, 'DELHI', '05-AUG-2000', 456);
INSERT INTO EMPLOY VALUES (4, 'ABHI', 580, 'DELHI', '05-AUG-2000', 456);
INSERT INTO EMPLOY VALUES (5, 'SAYAN', 700, 'BANGALORE', '25-AUG-2002', 987);


-- Q3. a) Create a table Departments with the columns dept_id, dept_name, loc_name where dept_id is primary key.
-- b) Create other table locations with the columns location_id, location_name, area where location_id is primary key.
-- ► Ensure that location_name acts as another candidate key of the locations table. Make a referential integrity between loc_name of departments table and location_name of locations table.
-- ► Ensure that dept_name should starts with ‘C’
-- ► Give appropriate names to all the constraints being imposed on the tables. Insert at least three rows in both the tables.

CREATE TABLE DEPARTMENTS (DEPTID NUMBER PRIMARY KEY, DEPT_NAME VARCHAR2(20), LOC_NAME VARCHAR2(30));

CREATE TABLE LOCATIONS (LOCATION_ID NUMBER PRIMARY KEY, LOCATION_NAME VARCHAR2(20), AREA NUMBER(8,2));

ALTER TABLE LOCATIONS 
MODIFY LOCATION_NAME NOT NULL;

ALTER TABLE LOCATIONS
ADD CONSTRAINT LOC_NAME_CAN UNIQUE (LOCATION_NAME);

ALTER TABLE DEPARTMENTS
ADD CONSTRAINT DEPARTMENTS_FK FOREIGN KEY (LOC_NAME) REFERENCES LOCATIONS (LOCATION_NAME);

ALTER TABLE DEPARTMENTS
ADD CONSTRAINT DEPT_NAME_UPDATE CHECK (DEPT_NAME LIKE 'C%');

INSERT INTO LOCATIONS VALUES (56, 'KOLKATA', 5600);
INSERT INTO LOCATIONS VALUES (98, 'DELHI', 7800);
INSERT INTO LOCATIONS VALUES (101, 'CHENNAI', 9800);

INSERT INTO DEPARTMENTS VALUES (1, 'CASH', 'KOLKATA');
INSERT INTO DEPARTMENTS VALUES (2, 'CIVIC', 'DELHI');
INSERT INTO DEPARTMENTS VALUES (3, 'CENTRAL', 'CHENNAI');

-- Q4. a) Create a table Employees with the columns empid, name, salary, address, hire_date, mgr_no,dept_name where empid is primary key.
-- ► Make a referential integrity between emp_id and mgr_no.
-- ► Give appropriate names to all the constraints being imposed on the tables. Insert at least 10 rows in the employees table with different department names (Make one department name BCA).

CREATE TABLE EMPLOYEES (EMPID NUMBER, NAME VARCHAR2(20), SALARY NUMBER(10,2), ADDRESS VARCHAR2(30), HIRE_DATE DATE, MGR_NO NUMBER, DEPT_NAME VARCHAR2(20),
CONSTRAINT EMP_PK PRIMARY KEY(EMPID));

ALTER TABLE EMPLOYEES
ADD CONSTRAINT EMP_FK FOREIGN KEY (MGR_NO) REFERENCES EMPLOYEES (EMPID);

INSERT INTO EMPLOYEES VALUES (56, 'ABHISHEK', 56000, 'KOLKATA', '05-JUN-2001', 56, 'SALES');
INSERT INTO EMPLOYEES VALUES (58, 'SAYAN', 56000, 'KOLKATA', '05-JUL-2001', 58, 'CURRENCY');
INSERT INTO EMPLOYEES VALUES (60, 'NABARUN', 60000, 'DELHI', '06-AUG-2002', 60, 'SALES');
INSERT INTO EMPLOYEES VALUES (62, 'SUBHA', 75000, 'BANGALORE', '06-AUG-2001', 62, 'BCA');
INSERT INTO EMPLOYEES VALUES (64, 'RUPAM', 56000, 'DELHI', '26-JAN-1999', 64, 'BCA');
INSERT INTO EMPLOYEES VALUES (66, 'RAJA', 68000, 'KOLKATA', '15-FEB-2000', 66, 'BCA');
INSERT INTO EMPLOYEES VALUES (68, 'SAM', 70000, 'DELHI', '14-FEB-2000', 68, 'BTECH');
INSERT INTO EMPLOYEES VALUES (70, 'SUNNY', 56120, 'KOLKATA', '15-MAR-2002', 70, 'BCA');
INSERT INTO EMPLOYEES VALUES (72, 'NIL', 45800, 'BANGALORE', '17-JAN-2005', 72, 'BCA');
INSERT INTO EMPLOYEES VALUES (74, 'RAJENDRA', 48555, 'KOLKATA', '27-MAR-2002', 74, 'CASH');

SELECT * FROM EMPLOYEES;


-- ****************************************************************************************************************************************************************************


-- ASSIGNMENT : 6
-- Q1. Create the tables and add the constraints.

CREATE TABLE SAILOR (SID VARCHAR2(4), SNAME VARCHAR2(15), MNAME VARCHAR2(15), SURNAME VARCHAR2(15) NOT NULL, RATING NUMBER(2) DEFAULT 0, AGE NUMBER(3,1) NOT NULL,
CONSTRAINT SAILOR_PK PRIMARY KEY(SID),
CONSTRAINT SAILOR_SID_NAME CHECK (SID LIKE 's%'),
CONSTRAINT SAILOR_SID_SNAME CHECK (SNAME =  INITCAP (SNAME)));

DESC SAILOR;

SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'SAILOR';

CREATE TABLE BOAT (BID VARCHAR2(5), BNAME VARCHAR2(10), COLOR VARCHAR2(6),
CONSTRAINT BOAT_PK PRIMARY KEY (BID),
CONSTRAINT BOAT_BID_START CHECK (BID LIKE 'b%'),
CONSTRAINT BOAT_BNAME_UPPER CHECK (BNAME = UPPER(BNAME)),
CONSTRAINT BOAT_COLOR CHECK (COLOR IN ('RED','GREEN','BLUE')));

DESC BOAT;

SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'BOAT';

CREATE TABLE RESERVE (SID VARCHAR2(4), BID VARCHAR2(5), DAY DATE, 
CONSTRAINT RESERVE_PK PRIMARY KEY(SID, BID),
CONSTRAINT RESERVE_FK_SID FOREIGN KEY (SID) REFERENCES SAILOR(SID),
CONSTRAINT RESERVE_FK_BID FOREIGN KEY (BID) REFERENCES BOAT (BID),
CONSTRAINT DATE_CHECK CHECK (DAY < '01-JAN-2000'));

DESC RESERVE;

SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'RESERVE';

-- Q2. Insert the values in the table so that it can satisfy the above constraints.
INSERT INTO SAILOR VALUES ('s1', 'Rammy', '', 'FRED', 1, 45);
INSERT INTO SAILOR VALUES ('s2', 'Sam', 'BENJAMIN', 'HENRY', 5, 26);
INSERT INTO SAILOR VALUES ('s3', 'Sachin', 'RAMESH', 'TENDULKAR', 8, 41);
INSERT INTO SAILOR VALUES ('s4', 'Mahendra', 'SINGH', 'DHONI', '', 52);
INSERT INTO SAILOR VALUES ('s5', 'Ajay', '', 'JADEJA', 0, 52);

SELECT * FROM SAILOR;

INSERT INTO BOAT VALUES ('b1', 'SAM', 'RED');
INSERT INTO BOAT VALUES ('b2', 'SUNNY', 'GREEN');
INSERT INTO BOAT VALUES ('b3', 'HENRY', 'BLUE');

SELECT * FROM BOAT;

INSERT INTO RESERVE VALUES ('s1', 'b1', '05-AUG-1998');
INSERT INTO RESERVE VALUES ('s2', 'b2', '12-SEP-1995');
INSERT INTO RESERVE VALUES ('s3', 'b3', '11-OCT-1997');

SELECT * FROM RESERVE;

-- Q3. Show names under the heading of names_of_sailors and add 2 to age.
SELECT SNAME AS NAME_OF_SAILORS, (AGE+2) AS NEW_AGE
FROM SAILOR;

-- Q4. Select all records from sailors in ascending order by name
SELECT * FROM SAILOR ORDER BY SNAME ASC;

-- Q5. Show all sailors name.
SELECT SNAME||' '||MNAME||' '||SURNAME "NAMES" FROM SAILOR;

-- Q6. Select all distinct sailors name.
SELECT DISTINCT SNAME FROM SAILOR;

-- Q7. Show all distinct sailors names, ratings that have rating between 5 and 10.
SELECT DISTINCT SNAME, RATING FROM SAILOR WHERE RATING BETWEEN 5 AND 10;

-- Q8. Select all records from sailors in ascending order by rating and descending order by age.
SELECT * FROM SAILOR ORDER BY RATING ASC;
SELECT * FROM SAILOR ORDER BY AGE DESC;

-- Q9. Select all records from sailors whose rating>7.
SELECT * FROM SAILOR WHERE RATING>7;

-- Q10. Find records for sailor name Horatio and age=35.4.
SELECT * FROM SAILOR WHERE SNAME = 'HORATIO' AND AGE = 35.4;

-- Q11. Select records for name beginning with 'S'.
SELECT * FROM SAILOR WHERE SNAME LIKE 'S%';

-- Q12. Select records for name containing 'a'/'A'.
SELECT * FROM SAILOR WHERE SNAME LIKE '%A%' OR SNAME LIKE '%a%';

-- Q13. Select names for rating present
SELECT * FROM SAILOR WHERE RATING IS NOT NULL;

-- Q14. Select names for rating absent.
SELECT * FROM SAILOR WHERE RATING IS NULL;

-- Q15. Find sid of sailor who has reserved boat ‘b1’.
SELECT SAILOR.SID FROM SAILOR, BOAT
WHERE BOAT.BID = 'b1';

-- Code Contributed By, Abhishek Sharma, 2021, @abhisheks008
