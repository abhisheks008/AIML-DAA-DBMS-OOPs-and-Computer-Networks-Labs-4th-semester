-- Q1. Display your name 5 times using for loop.
declare
v_ename varchar2(200);
begin
v_ename:='ABHISHEK';
for i in 1..5
loop
dbms_output.put_line(v_ename);
end loop;
end;
/

Output :
+----------------+
| ABHISHEK       |
| ABHISHEK       |
| ABHISHEK       |
| ABHISHEK       |
| ABHISHEK       |
+----------------+
 

-- Q2. Invert the number 12345.
declare
 num varchar2(5):='12345';              
 len number(2);             
 revnum varchar2(5);         
   
  
begin
 len := length(num);                 
  
 for i in reverse 1.. len 
 loop            
 revnum := revnum || substr(num,i,1); 
 end loop; 

dbms_output.put_line('given number = '|| num);  
dbms_output.put_line('reverse number = '|| revnum);  
 end;   

-- Output :
-- GIVEN NUMBER = 12345
-- REVERSE NUMBER = 54321
 






-- Q3. Write a pl/sql code block to calculate the area of circle for a value of radius varying from 3 to 7. Store the radius &amp; the corresponding values of calculated area in an empty table named areas, consisting of two columns, radius and area.

create table areas ( r number(2), area number (14,2));

declare
r number(5);
area number(14,2);
pi constant number (4,2):=3.14;
begin
r:=3;
while r<=7
loop
area:=pi*power(r,2);
insert into areas values(r,area );
r:=r+1;
end loop;
end;

select * from areas;

-- Output :
+-------------------+
| 3   |    28.26    |
| 4   |    50.24    |
| 5   |    78.50    |
| 6   |   113.04    |
| 7   |   153.86    |
+-------------------+
                                               
-- Q4. Create a simple loop such that a message is displayed when a loop exceeds a particular value (while loop).

declare
v_ename varchar2(200);
v_start varchar2(20) := 'Started!';
v_end varchar2(20) := 'Program Ended!';
begin
v_ename:='ABHISHEK';
dbms_output.put_line(v_start);
for i in 1..5
loop
dbms_output.put_line(v_ename);
end loop;
dbms_output.put_line(v_end);
end;

Output :
Started!
ABHISHEK
ABHISHEK
ABHISHEK
ABHISHEK                                               
ABHISHEK                                               
Program Ended!
                                               
                                               
-- Q5. Write a pl/sql block code that will accept an account number from the user, check if the user’s balance is less than the minimum balance, only then deduct rs. 100/- from the available balance. The process is fired on the accounts table. (Hint: create a table ACCOUNTS with necessary attributes, like ACC NO,NAME,LAST DATE OF TRANSACTION,CREDIT,DEBIT,CURRENT BAL, ETC,.).
SQL> create table Accounts3(Account_id varchar(5), Name varchar(20), Bal number(7,2));
Table created.
 
SQL>insert into Accounts3 values ('AC001','Anuj',5000);
insert into Accounts3 values ('AC002','Robert',10000);
insert into Accounts3 values ('AC003','Mita',5000);
insert into Accounts3 values ('AC004','Sunita',15000);
insert into Accounts3 values ('AC005','Melba',10000);
1 row deleted.
1 row deleted.
1 row deleted.
1 row deleted.
1 row deleted.
 
SQL> SELECT * FROM accounts3;
 
ACCOUNT_ID      NAME                             BAL
------------           --------------------         ----------
AC001                           Anuj                          5000
AC002                           Robert                       10000
AC003                           Mita                          3000
AC004                           Sunita                       15000
AC005                           Melba                        10000
 
SQL> set serveroutput on;
SQL> declare
  2  acct_balance number(7,2);
  3  acct_no varchar2(6);
  4  debit_amt number(7,2):=2000.00;
  5  min_bal constant number(7,2):=500.00;
  6  Begin
  7  acct_no:=&acct_no;
  8  select bal into acct_balance
  9  from accounts3
 10  where account_id=acct_no;
 11  acct_balance:=acct_balance-debit_amt;
 12  if acct_balance>=min_bal then
 13  update accounts3 set bal=bal-debit_amt
 14  where account_id=acct_no;
 15  end if;
 16  end;
 17  /
 
Enter value for acct_no: 'AC003'
old   7: acct_no:=&acct_no;
new   7: acct_no:='AC003';
 
PL/SQL procedure successfully completed.
 
SQL> SELECT * FROM accounts3;
 
ACCOUNT_ID            NAME                                  BAL
------------           --------------------         ----------
AC001                           Anuj                          5000
AC002                           Robert                       10000
AC003                           Mita                          3000
AC004                           Sunita                       15000
AC005                           Melba                        10000

-- Q6. Write a PL/SQL program to find factorial of a number.
declare
fac1 number := 1;
n number :=5;

begin			
while n > 0 loop
fac1:= n*fac1;		
n:=n-1;		
end loop;		
dbms_output.put_line(fac1);
end;

Output :
120

-- Q7. Write a PL/SQL program to check whether a number is prime or not.
declare
       num number;
       i number:=1;
       c number:=0;
  begin
        num:=15;
       for i in 1..num
       loop
          if((mod(num,i))=0)
           then
              c:=c+1;
         end if;
      end loop;
     if(c>2)
     then
         dbms_output.put_line(num||' not a prime');
     else
        dbms_output.put_line(num||' is prime');
     end if;
  end;
   /

Output :
15 is not prime







-- Q8. Write a PL/SQL program to display the Fibonacci series up to 20000.
declare
first1 number := 0;
second1 number := 1;
temp1 number;

n1 number := 5;
i1 number;

begin
	dbms_output.put_line(first1);
	dbms_output.put_line(second1);
	while (n1>0)
	loop
		temp1:=first1+second1;

first1 := second1;
second1 := temp1;
if (temp1< 20000)
then
dbms_output.put_line(temp1);
else
exit;
end if;
end loop;
end;

Output :
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
1597
2584
4181
6765
10946
17711

Statement processed.
