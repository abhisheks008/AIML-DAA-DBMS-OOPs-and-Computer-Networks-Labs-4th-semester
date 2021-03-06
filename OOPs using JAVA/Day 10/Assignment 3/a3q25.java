// Write a Java program to show parameterized constructor.


class Main {
    String languages;
    Main(String lang) {
      languages = lang;
      System.out.println(languages + " Programming Language");
    }
  
    public static void main(String[] args) {
        Main obj1 = new Main("Java");
        Main obj2 = new Main("Python");
        Main obj3 = new Main("C");
    }
  }

/*
Output :
Java Programming Language
Python Programming Language
C Programming Language
*/
