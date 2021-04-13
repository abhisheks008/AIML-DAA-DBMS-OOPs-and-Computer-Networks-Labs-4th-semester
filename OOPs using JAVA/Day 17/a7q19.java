// Q19. Write a Java Program to Replace a Substring Inside a String by Another One
import java.util.*;
//Author : Abhishek Sharma
public class q19 {
    public static void main(String args[]) {
        String str="Hello World";
        System.out.println( str.replace( 'H','W' ) );
        System.out.println( str.replaceFirst("He", "Wa") );
        System.out.println( str.replaceAll("He", "Ha") );
    }
}

/*
Output :
Wello World
Wallo World
Hallo World
*/
