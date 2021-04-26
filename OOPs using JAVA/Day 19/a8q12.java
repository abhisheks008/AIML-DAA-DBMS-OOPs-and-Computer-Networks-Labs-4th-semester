/*
12. Create two user-defined exceptions named “TooHot” and “TooCold” to check the temperature (in Celsius) given by the user passed through the command line is too hot or too cold. 
• If temperature > 35, throw exception “TooHot”. 
• If temperature <5, throw exception “TooCold”. 
• Otherwise, print “Normal” and convert it to Farenheit.
*/
// Author : Abhishek Sharma, 2021
import java.util.Scanner;
class TooHot extends Exception{
    TooHot(){
        super("Temperature is too-hot");
    }
}
class TooCold extends Exception{
    TooCold(){
        super("Temperature is too-cold");
    }
}
public class q12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x,y,p,q,z,l;
        System.out.println("Enter the temperature (Celsius):");
        x=sc.nextInt();
        try{
            if(x<0)
                throw new TooCold();
            if(x>35)
                throw new TooHot();
            System.out.println("Temperature is (Celsius):"+x);
            System.out.print("Temperature is (Fahrenheit ):"+(x*(9/5)+32));
        }
        catch(TooHot e){
            System.out.print(e);
        }
        catch(TooCold e){
            System.out.print(e);
        }
    }
}

/*
Output :
Enter the temperature (Celsius):
12
Temperature is (Celsius):12
Temperature is (Fahrenheit ):44

Enter the temperature (Celsius):
-20
TooCold: Temperature is too-cold

Enter the temperature (Celsius):
40
TooHot: Temperature is too-hot
*/
