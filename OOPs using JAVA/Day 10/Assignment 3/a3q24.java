// Write a Java program to show 0-arguments constructor.

import java.util.*;
import java.lang.*;
import java.io.*;
// Author : Abhishek Sharma
class Main {
    int i;
    private Main() {
      i = 5;
      System.out.println("Constructor is called");
    }
  
    public static void main(String[] args) {
  
      // calling the constructor without any parameter
      Main obj = new Main();
      System.out.println("Value of i: " + obj.i);
    }
}


/*
Output :
Constructor is called
Value of i: 5
*/
