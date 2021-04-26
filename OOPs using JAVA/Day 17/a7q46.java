// Q46. Write a Java Program to Store String Literals Using String Buffer. 

import java.util.*;
//Author : Abhishek Sharma
class q46 {
    public static void concat3(StringBuffer s3)
    {
        s3.append(" sharma");
    }

    public static void main(String[] args)
    {
        String s1 = "abhishek";
        StringBuffer s3 = new StringBuffer(s1);
        concat3(s3);
        System.out.println("StringBuffer: " + s3);
    }
}

/*
Output :
StringBuffer: abhishek sharma
*/
