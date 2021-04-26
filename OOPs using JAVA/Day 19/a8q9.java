// 9. Create a user-defined exception named CheckArgument to check the number of arguments passed through the command line. If the number of argument is less than 5, throw the CheckArgumentexception,else print the addition of all the five numbers. 
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class CheckArgumentexception extends Exception{
    CheckArgumentexception(String s){
        super(s);
    }
}
public class q9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=sc.nextInt();
        System.out.println("enter "+n+" numbers");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        try{
            if(n<5)
                throw new CheckArgumentexception("n is less than 5");   
            else{                
                int sum=0;
                for(int i=0;i<n;i++)
                    sum+=arr[i];
                System.out.println("Sum is:"+sum);
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}

/*
Output :
enter the limit
4
enter 4 numbers
1
2
3
4
CheckArgumentexception: n is less than 5
*/
