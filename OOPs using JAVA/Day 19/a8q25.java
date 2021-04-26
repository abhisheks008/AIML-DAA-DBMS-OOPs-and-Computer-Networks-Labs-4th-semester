// 25. Write an application that displays a series of at least five student ID numbers (that  you have stored in an array) and asks the user to enter a numeric test score for the student. Create a ScoreException class, and throw a ScoreException for the class if the user does not enter a valid score (zero to 100). Catch the ScoreException and then display an appropriate message. In addition, store a 0 for the student’s score. At the end of the application, display all the student IDs and scores.
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class ScoreException extends Exception{
    ScoreException (){
        super("Invaid Score");
    }
}
public class q25{
    public static void main(String arrg[]){
        int enroll[]={101,102,103,104,105};
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<enroll.length;i++){
            System.out.println("Enter marks of Enrollment no:"+enroll[i]);
            int a=sc.nextInt();
            if(a<0 || a>100){
                try {
                    throw new ScoreException();
                } 
                catch (ScoreException e) {
                    System.out.println(e);
                }
                marks[i]=0;
            }
            else{
                marks[i]=a;
            }
        }
        for(int i=0;i<enroll.length;i++){
            System.out.println("Enrollment no:"+enroll[i]+" Marks:"+marks[i]);
        }
    }
}

/*
Output :
Enter marks of Enrollment no:101
98
Enter marks of Enrollment no:102
56
Enter marks of Enrollment no:103
-45
ScoreException: Invaid Score
Enter marks of Enrollment no:104
80
Enter marks of Enrollment no:105
-65
ScoreException: Invaid Score
Enrollment no:101 Marks:98
Enrollment no:102 Marks:56
Enrollment no:103 Marks:0
Enrollment no:104 Marks:80
Enrollment no:105 Marks:0
*/
