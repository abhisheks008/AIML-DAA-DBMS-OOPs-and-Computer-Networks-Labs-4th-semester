/*
13. Consider an Employee recruitment system that prints the candidate name based on the age criteria. The name and age of the candidate are taken as Input.Create two user-defined exceptions named “TooOlder” and “TooYounger” 
• If age>45, throw exception “TooOlder”. 
• If age<20, throw exception “TooYounger”. 
• Otherwise, print “Eligible” and print the name of the candidate. 
*/
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class TooYounger extends Exception{
    TooYounger(){
        super("TooYounger");
    }
}
class TooOlder extends Exception{
    TooOlder(){
        super("TooOlder");
    }
}
public class q13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name=sc.next();
        System.out.println("Enter the age:");
        int x=sc.nextInt();
        try{
            if(x<20)
                throw new TooYounger();
            if(x>40)
                throw new TooOlder();
            System.out.println("(Eligible) Name :"+name);
        }
        catch(TooYounger e){
            System.out.print(e);
        }
        catch(TooOlder e){
            System.out.print(e);
        }
    }
}

/*
Output :
Enter the Name:
Abhishek
Enter the age:
21
(Eligible) Name :Abhishek

Enter the Name:
Nabarun
Enter the age:
19
TooYounger: TooYounger

Enter the Name:
Sayan
Enter the age:
45
TooOlder: TooOlder
*/
