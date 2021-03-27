// Q7. An educational institution maintains a database of its employees. The database is divided into a number of classes whose hierarchical relationships are shown below. Write all the classes and define the methods to create the database and retrieve individual information as and when needed. 
// Write a driver program to test the classes.

// +----------------------------------------------------------------------------------+
// | Staff (code, name) Teacher (subject, publication) is a Staff                     |  
// +----------------------------------------------------------------------------------+
// | Officer (grade) is a Staff Typist (speed) is a Staff                             |
// +----------------------------------------------------------------------------------+
// | RegularTypist (remuneration) is a Typist CasualTypist (daily wages) is a Typist. |
// +----------------------------------------------------------------------------------+


// Author : Abhishek Sharma
import java.io.*;
class staff
{
         String code,name;
         void getStaff()
         {   
              try{
                  BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                  System.out.print("Enter Code : ");
                  System.out.flush();
                  code=obj.readLine();

                  System.out.print("Enter Name : ");
                  System.out.flush();
                  name=obj.readLine();
                 }
            catch(Exception e)
                {    }
        }   
    void displayStaff()
    {
           System.out.println("\nCODE :  "+code);
           System.out.println("NAME  :  "+name);
    }
}
class teacher extends staff
{
         String subject,publication;
          void getTeacher()
           {   
                 getStaff(); 
                 try{
                    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Enter Subject : ");
                    System.out.flush();
                    subject=obj.readLine();
                    System.out.print("Enter Publication : ");
                    System.out.flush();
                    publication=obj.readLine();
                  }
             catch (Exception e)
                {    }
          }
    
        void displayTeacher()
        {
            displayStaff();  
           System.out.println("SUBJECT :  "+subject);
           System.out.println("PUBLICATION  :  "+publication);
        }
}
class typist extends staff
{
        String speed;
         void getTypist()
         {   
            getStaff(); 
            try{
                  BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                  System.out.print("Enter Speed : ");
                  System.out.flush();
                  speed=obj.readLine();
                  }
            catch(Exception e)
                {    }
        }
    
    void displayTypist()
    {
            displayStaff();
           System.out.println("SPEED :  "+speed);
    }
}

class officer extends staff
{
     String grade;
      void getOfficer()
         {   
              getStaff();
              try{
                  BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                  System.out.print("Enter Grade : ");
                  System.out.flush();
                  grade=obj.readLine();
                }
            catch(Exception e)
                {    }
        }
    
    void displayOfficer()
    {
           displayStaff();   
           System.out.println("GRADE :  "+grade);
    }
}
class regular extends typist
{
}

class casual extends typist
{
      String wages;
       void getCasual()
         {   
              getTypist(); 
              try
                {
                    BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Enter Daily Wages : ");
                    System.out.flush();
                    wages=obj.readLine();
                }
            catch(Exception e)
                { }
        }   
    void displayCasual()
    {
           displayTypist(); 
           System.out.println("WAGES :  "+wages);
    }
}

class Education
{
      public static void main(String args[])
      {
           int choice=1;
           String str;
           while(choice!=0){
                 System.out.println("\n\nChoose Your Choice...");
                 System.out.println("1) Teacher Details");
                 System.out.println("2) Typist Details ");
                 System.out.println("3) Officer Details");
                 System.out.println("Press 0 (ZERO) to exit ");
                 System.out.print("Enter your choice :  ");
                 System.out.flush();
                 try{
                       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                       str=obj.readLine();
                       choice=Integer.parseInt(str);
                }catch(Exception e) {}
                  
                  if(choice==0)
                  {
                      System.out.println("\n\nThanks for Visiting\nDo Visit next time....\n");
                       System.exit(1);
                  }

                 switch(choice){
                       case 1 :     
                            System.out.println("\n=====TEACHER DETAILS=====");
                            System.out.println("\nInputing Data");
                            teacher obj_teacher=new teacher();
                            obj_teacher.getTeacher();
                            System.out.println("\nDisplaying Data");
                            obj_teacher.displayTeacher();
                            break;
                        case 2 :    
                            System.out.println("\n=====TYPIST DETAILS=====\n");
                            System.out.println("\nInputing Data");
                            casual obj_casual=new casual();
                            obj_casual.getCasual();
                            System.out.println("\nDisplaying Data");
                            obj_casual.displayCasual();
                            break;
                        case 3 :    
                            System.out.println("\n=====OFFICER DETAILS=====\n");
                            System.out.println("\nInputing Data");
                            officer obj_officer=new officer();
                            obj_officer.getOfficer();
                            System.out.println("\nDisplaying Data");
                            obj_officer.displayOfficer();
                            break; 
                }
          }
    }
}


/*
Output :
Choose Your Choice...
1) Teacher Details
2) Typist Details
3) Officer Details
Press 0 (ZERO) to exit
Enter your choice :  1

=====TEACHER DETAILS=====

Inputing Data
Enter Code : 001
Enter Name : Prof. Suklayan Goswami
Enter Subject : Computer Networks
Enter Publication : nil

Displaying Data

CODE :  001
NAME  :  Prof. Suklayan Goswami
SUBJECT :  Computer Networks
PUBLICATION  :  nil


Choose Your Choice...
1) Teacher Details
2) Typist Details
3) Officer Details
Press 0 (ZERO) to exit
Enter your choice :  0


Thanks for Visiting
Do Visit next time....
*/
