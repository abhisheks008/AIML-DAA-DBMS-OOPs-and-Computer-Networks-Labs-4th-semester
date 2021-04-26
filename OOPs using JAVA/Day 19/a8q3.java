// 3. Define an exception called “NoMatchFoundException” that is thrown when a string is not equal to “University”. Write a program that uses this exception. 
// Author : Abhishek Sharma, 2021
class NoMatchFoundException extends Exception{ 
    NoMatchFoundException(String s){
        super(s);
    }
}
public class q3 {
    public static void Match(String z) throws NoMatchFoundException{
        if(z!="University"){
            throw new NoMatchFoundException("NoMatchFoundException Gen");
        }
    }
    public static void main(String args[]){
        String z="abc"; 
        try {
            Match(z);
        } 
        catch (Exception e) { 
            System.out.println(e);
        }
        System.out.print("Rest Code");
    }
}

/*
Output :
NoMatchFoundException: NoMatchFoundException Gen
Rest Code
*/
