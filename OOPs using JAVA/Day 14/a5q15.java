// Q15. Write a Java program to explain “multilevel inheritance.”
// Author : Abhishek Sharma

import java.io.*;
import java.lang.*;
import java.util.*;

class one {
    public void print_fname()
    {
        System.out.println("Abhishek");
    }
}

class two extends one {
    public void print_lname() 
    { 
        System.out.println("Sharma"); 
    }
}

class three extends two {
    public void print_dept()
    {
        System.out.println("Department of Computer Science and Engineering");
    }
}

public class q15 {
    public static void main(String[] args)
    {
        three g = new three();
        g.print_fname();
        g.print_lname();
        g.print_dept();
    }
}

/*
Output :
Abhishek
Sharma
Department of Computer Science and Engineering
*/
