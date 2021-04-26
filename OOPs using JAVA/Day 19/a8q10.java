
/*
10. Consider a Student examination database system that prints the mark sheet of students. Input the following from the command line. 
(a) Student’s Name 
(b) Marks in six subjects 
These marks should be between 0 to 50. If the marks are not in the specified range, raise a RangeException, else find the total marks and prints the percentage of the students. 
*/
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class RangeException extends Exception{
    RangeException(){
        super("Marks should be between 0 to 50");
    }
}
public class q10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student name");
        String str=sc.next();
        System.out.println("enter "+6+" marks");
        int[] arr=new int[6];
        for(int i=0;i<6;i++)
            arr[i]=sc.nextInt();
        try{
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<0 || arr[i]>50)
                    throw new RangeException();
                sum+=arr[i];
            }
            System.out.print("Percentage is : "+(sum/6)*2);
        }
        catch(RangeException e){
            System.out.print(e);
        }
    }
}

/*
Output :
Enter the Student name
Abhishek
enter 6 marks
23
15
10
1000
10
23
RangeException: Marks should be between 0 to 50

Enter the Student name
Abhishek
enter 6 marks
50
50
50
40
40
40
Percentage is : 90
*/
