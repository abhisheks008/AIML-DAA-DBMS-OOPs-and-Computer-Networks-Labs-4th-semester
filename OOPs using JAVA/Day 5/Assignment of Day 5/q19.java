// Admission to a professional course is subject to the following conditions. Write a Java program on these following conditions.


import java.util.*;
// Author : Abhishek Sharma
public class q19 {
    public static void main (String[] args){
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the no. of students : ");
        int student = s.nextInt();
        for (int z=1;z<=student;z++)
        {
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter the name of the student : ");
            String fname = sc.nextLine();
            System.out.print("Enter the marks of Mathematics : ");
            float maths = sc.nextFloat();
            System.out.print("Enter the marks of Chemistry : ");
            float chem = sc.nextFloat();
            System.out.print("Enter the marks of Physics : ");
            float phy = sc.nextFloat();
            float total = maths + chem + phy;
            float mp = maths + phy;
            System.out.print("\n");
            if ((maths>=60 && chem>= 40 && phy >= 50 && total >= 200) || (mp>=150)){
                System.out.println("STATUS " + fname + " is Eligible for the admission");
            }
            else {
                System.out.println("STATUS " +fname + " is Not eligible for the admission. Better luck next time");
            }
	     System.out.print("\n");
        }
    }
}




// Output :
// Enter the no. of students : 3
// Enter the name of the student : Abhishek
// Enter the marks of Mathematics : 59
//Enter the marks of Chemistry : 60
// Enter the marks of Physics : 78

// STATUS Abhishek is Not eligible for the admission. Better luck next time

// Enter the name of the student : Nabarun
// Enter the marks of Mathematics : 89
// Enter the marks of Chemistry : 90
// Enter the marks of Physics : 80

// STATUS Nabarun is Eligible for the admission

// Enter the name of the student : Sayan
// Enter the marks of Mathematics : 85
// Enter the marks of Chemistry : 45
// Enter the marks of Physics : 90

// STATUS Sayan is Eligible for the admission
