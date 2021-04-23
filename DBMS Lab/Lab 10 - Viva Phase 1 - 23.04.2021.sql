-- Database Management System Lab 10
-- Assignment on Query Solving Viva Exam Phase 1
-- Platform used : Oracle 10G Express
-- Code contributed by, Abhishek Sharma, 2021


-- Q1. Consider the following relations for the details maintained by a book dealer.
-- AUTHOR (Author-id: int, Name: string, City: string, Country: string)
-- PUBLISHER (Publisher-id: int, Name: string, City: string, Country: string)
-- CATALOG (Book-id: int, title: string, author-id: int, Publisher-id: int, Category-id:
-- int, Year: int, Price: int)
-- CATEGORY (Category-id: int, Description: string)
-- ORDER-DETAILS (Order-no: int, Book-id: int, Quantity: int)
-- i) Create the above tables by properly specifying the primary keys and the foreign keys.
-- ii) Enter at least five tuples for each relation.
-- iii) Give the details of the authors who have 2 or more books in the catalog and the price of the books is greater than the average price of the books in the catalog and the year of publication is after 2000.
-- iv) Find the author of the book which has maximum sales.

CREATE TABLE AUTHOR(AUTHOR_ID NUMBER(5), NAME VARCHAR2(20), CITY VARCHAR2(10), COUNTRY VARCHAR2(10), CONSTRAINT AUTHOR_PK PRIMARY KEY (AUTHOR_ID)); 

CREATE TABLE PUBLISHER (PUBLISHER_ID NUMBER(5), NAME VARCHAR2(30), CITY VARCHAR2(10), COUNTRY VARCHAR2(10), CONSTRAINT PUBLISHER_PK PRIMARY KEY(PUBLISHER_ID));
 
CREATE TABLE CATEGORY(CATEGORY_ID NUMBER(5), DESCRIPTION VARCHAR2(20), 
CONSTRAINT CATEGORY_PK PRIMARY KEY (CATEGORY_ID));
 
CREATE TABLE CATALOG1 (BOOK_ID NUMBER(10), TITLE VARCHAR2(20), AUTHORID NUMBER(5), PUBLISHERID NUMBER(5), CATEGORYID NUMBER(5), YEAR NUMBER(4), PRICE NUMBER(10,2),
CONSTRAINT CATALOG_PK PRIMARY KEY (BOOK_ID),
CONSTRAINT CAT_FK_1 FOREIGN KEY (AUTHORID) REFERENCES AUTHOR (AUTHOR_ID),
CONSTRAINT CAT_FK_2 FOREIGN KEY (PUBLISHERID) REFERENCES PUBLISHER (PUBLISHER_ID),
CONSTRAINT CAT_FK_3 FOREIGN KEY (CATEGORYID) REFERENCES CATEGORY (CATEGORY_ID));
 
CREATE TABLE ORDER_DETAILS (ORDER_NO NUMBER(5), BOOK_ID NUMBER(5), QUANTITY NUMBER(10),
CONSTRAINT ORDER_PK PRIMARY KEY (ORDER_NO),
CONSTRAINT ORDER_FK FOREIGN KEY (BOOK_ID) REFERENCES CATALOG1 (BOOK_ID));
 
INSERT INTO AUTHOR VALUES(1, 'ABC', 'KOLKATA', 'INDIA');
INSERT INTO AUTHOR VALUES(2, 'ABC2', 'MUMBAI', 'INDIA');
INSERT INTO AUTHOR VALUES(3, 'ABC3', 'CHENNAI', 'INDIA');
INSERT INTO AUTHOR VALUES(4, 'ABC4', 'NEW YORK', 'USA');
INSERT INTO AUTHOR VALUES(5, 'ABC5', 'WASHINGTON', 'USA');
 
+--------------------------------------------------+
| TABLE AUTHOR                                     |
+--------------------------------------------------+
| AUTHOR_ID | NAME       |   CITY     | COUNTRY    |
| 1         | ABC        | KOLKATA    | INDIA      |
| 2         | ABC2       | MUMBAI     | INDIA      |
| 3         | ABC3       | CHENNAI    | INDIA      |
| 4         | ABC4       | NEW YORK   | USA        |
| 5         | ABC5       | WASHINGTON | USA        |
+--------------------------------------------------+

INSERT INTO PUBLISHER VALUES(11, 'XYZ1', 'KOLKATA', 'INDIA');
INSERT INTO PUBLISHER VALUES(12, 'XYZ2', 'KOLKATA', 'INDIA');
INSERT INTO PUBLISHER VALUES(13, 'XYZ3', 'KOLKATA', 'INDIA');
INSERT INTO PUBLISHER VALUES(14, 'XYZ4', 'KOLKATA', 'INDIA');
INSERT INTO PUBLISHER VALUES(15, 'XYZ5', 'KOLKATA', 'INDIA');

+-----------------------------------------------------+
| TABLE PUBLISHER                                     |
+-----------------------------------------------------+
| PUBLISHER_ID | NAME       |   CITY     | COUNTRY    |
| 11           | XYZ1       | KOLKATA    | INDIA      |
| 12           | XYZ2       | KOLKATA    | INDIA      |
| 13           | XYZ3       | KOLKATA    | INDIA      |
| 14           | XYZ4       | KOLKATA    | INDIA      |
| 15           | XYZ5       | KOLKATA    | INDIA      |
+-----------------------------------------------------+ 

INSERT INTO CATEGORY VALUES(111, 'COMICS');
INSERT INTO CATEGORY VALUES(112, 'SCIFI');
INSERT INTO CATEGORY VALUES(113, 'COMICS');
INSERT INTO CATEGORY VALUES(114, 'FIGHT');
INSERT INTO CATEGORY VALUES(115, 'ACTION');

+----------------------------+
| TABLE CATEGORY             |
+----------------------------+
| CATEGORY_ID  | DESCRIPTION |
| 111          | COMICS      |
| 112          | SCIFI       |
| 113          | COMICS      |
| 114          | FIGHT       | 
| 115          | ACTION      |
+----------------------------+ 
 

INSERT INTO CATALOG1 VALUES(1111, 'DEF1', 1, 14, 111, 1999, 450);
INSERT INTO CATALOG1 VALUES(1112, 'DEF2', 2, 11, 112, 1996, 400);
INSERT INTO CATALOG1 VALUES(1113, 'DEF3', 3, 15, 115, 2004, 424);
INSERT INTO CATALOG1 VALUES(1114, 'DEF4', 4, 12, 111, 2003, 220);
INSERT INTO CATALOG1 VALUES(1115, 'DEF5', 5, 13, 113, 2001, 300);
INSERT INTO CATALOG1 VALUES(1116, 'DEF6', 1, 11, 111, 2007, 450);
INSERT INTO CATALOG1 VALUES(1117, 'DEF7', 1, 11, 111, 2008, 490);

 

INSERT INTO ORDER_DETAILS VALUES (1001, 1111, 6);
INSERT INTO ORDER_DETAILS VALUES (1002, 1112, 5);
INSERT INTO ORDER_DETAILS VALUES (1003, 1113, 3);
INSERT INTO ORDER_DETAILS VALUES (1004, 1114, 3);
INSERT INTO ORDER_DETAILS VALUES (1005, 1115, 2);
INSERT INTO ORDER_DETAILS VALUES (1006, 1116, 1);
INSERT INTO ORDER_DETAILS VALUES (1007, 1117, 0);
 

SELECT * FROM AUTHOR WHERE AUTHOR_ID IN 
(SELECT AUTHORID FROM CATALOG1 WHERE YEAR>2000 AND PRICE > (SELECT AVG(PRICE) FROM CATALOG1) GROUP BY AUTHORID HAVING COUNT (*) > 1);
 

SELECT * FROM AUTHOR, CATALOG1 WHERE
AUTHOR.AUTHOR_ID = CATALOG1.AUTHORID AND BOOK_ID IN (SELECT BOOK_ID FROM ORDER_DETAILS WHERE QUANTITY = (SELECT MAX(QUANTITY) FROM ORDER_DETAILS));
 


-- Q2. Create a table Student(s_no, s_name, dept_no, s_dob) to store records about 10 students:
-- i) Add a column s_yr to the table.
-- ii) Add a column s_roll to the table.
-- iii) Set (s_dept,s_roll,s_yr) as primary key.
-- iv) Update the date of birth of a student in the table.
-- Add one extra column grade_point.

CREATE TABLE STUDENT1 (S_NO NUMBER(5), SNAME VARCHAR2(10), DEPTNO NUMBER(5), SDOB VARCHAR2(20));

ALTER TABLE STUDENT1 ADD S_YR VARCHAR2(5);

ALTER TABLE STUDENT1 ADD S_ROLL NUMBER(2);

ALTER TABLE STUDENT1 
ADD CONSTRAINT STU_PK PRIMARY KEY(DEPTNO, S_ROLL, S_YR);
 

INSERT INTO STUDENT1 VALUES(1,'ABC1', 12, '12-JAN-2000', '1ST', 13);
INSERT INTO STUDENT1 VALUES(2,'ABC2', 14, '12-JAN-1999', '2ND', 14);
INSERT INTO STUDENT1 VALUES(3,'ABC3', 11, '12-JAN-1998', '3RD', 15);
INSERT INTO STUDENT1 VALUES(4,'ABC4', 10, '12-JAN-1997', '4TH', 16);

UPDATE STUDENT1 SET SDOB = '11-JAN-2000' WHERE S_ROLL = 13;
 
ALTER TABLE STUDENT1 ADD GRADE VARCHAR2(5);
 

-- Q3. Create a table Loan (l_id,l_name,s_dept,l_type,user_id) to store records of 10 loans.
-- i) Assign l_id as the primary key.
-- ii) Assign user_id as foreign key.
-- iii)Add one extra column loan_apply_date.

CREATE TABLE LOAN (LID NUMBER(10), LNAME VARCHAR2(10), DEPT VARCHAR2(10), LTYPE VARCHAR2(10), USERID NUMBER(5));

ALTER TABLE LOAN ADD CONSTRAINT LOAN_PK PRIMARY KEY (LID);

ALTER TABLE LOAN ADD CONSTRAINT LOAN_FK FOREIGN KEY (USERID) REFERENCES STUDENT1 (S_ROLL);

ALTER TABLE LOAN ADD LOAN_APPLY_DATE DATE;

DESC LOAN;
 

-- Q4. Solve the following queries
-- i) Issue a query to calculate ceiling and floor value of 17.445.
-- ii) Issue a query to calculate the 443 mod 12.

-- (i)
SELECT CEIL (17.445) FROM DUAL;
+----------------+
| CEIL (17.445)  |
| 18             |
+----------------+

SELECT FLOOR (17.445) FROM DUAL;
+----------------+
| FLOOR (17.445) |
| 17             |
+----------------+ 

-- (ii)
SELECT MOD (443, 12) FROM DUAL;
+----------------+
| MOD (443, 12)  |
| 11             |
+----------------+ 
