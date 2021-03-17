// 19. Write a program to demonstrate use of 'static' keyword. 
// Author : Abhishek Sharma


class Demo{
   static void m1(){
      System.out.println("Demo of static");
   }
}
public class q19 {
   public static void main(String[] args) {
      Demo.m1();
   }
}

// Output :
// Demo of static
