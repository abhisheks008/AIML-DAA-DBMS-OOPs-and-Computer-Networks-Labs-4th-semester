// Q45. Write a Java Program to Validate an Email Address Format. 

import java.util.*;
//Author : Abhishek Sharma
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.regex.*;    
import java.util.*;    
public class q45{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("abhishek@domain.co.in");  
        emails.add("abhishek@domain.com");  
        emails.add("abhishek.name@domain.com");  
        emails.add("abhishek#@domain.co.in");  
        emails.add("abhishek@domain.com");  
        emails.add("abhishek@domaincom");  
        emails.add("@yahoo.com");  
        emails.add("abhishek#domain.com");  
        String regex = "^(.+)@(.+)$";  
        Pattern pattern = Pattern.compile(regex);   
        for(String email : emails){    
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  

/*
Output :
abhishek@domain.co.in : true

abhishek@domain.com : true

abhishek.name@domain.com : true

abhishek#@domain.co.in : true

abhishek@domain.com : true

abhishek@domaincom : true

@yahoo.com : false

abhishek#domain.com : false
*/
