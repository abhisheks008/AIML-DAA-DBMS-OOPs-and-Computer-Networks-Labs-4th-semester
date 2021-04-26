// Q44. Write a Java Program to Check Whether Date is in Proper Format or Not. 
import java.util.*;
//Author : Abhishek Sharma
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class q44{
   public static boolean validateJavaDate(String strDate)
   {
    if (strDate.trim().equals(""))
    {
        return true;
    }
    else
    {
        SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
        sdfrmt.setLenient(false);
        try
        {
            Date javaDate = sdfrmt.parse(strDate); 
            System.out.println(strDate+" is valid date format");
        }
        catch (ParseException e)
        {
            System.out.println(strDate+" is Invalid Date format");
            return false;
        }
        return true;
    }
   }
   public static void main(String args[]){
    validateJavaDate("09/04/2021");
    validateJavaDate("04-09-2021");
    validateJavaDate("04,09,2021");
   }
}

/*
Output :
09/04/2021 is valid date format
04-09-2021 is Invalid Date format
04,09,2021 is Invalid Date format
*/
