// Author : Abhishek Sharma
// example 2 of Constructor in JAVA

class Calculator1
{
    int num1;
    int num2;

    Calculator1() {
        num1 = 2;
        num2 = 3;
    }

    int getResult(){
        return (num1 + num2);
    }
}
class object2 {
    public static void main(String[] args) {
        int res;
        Calculator1 c1 = new Calculator1 ();

        res = c1.getResult();
        System.out.println("The result is : " + res);
        //res = c2.getResult();
        //System.out.println("The result is : " + res);
    }
    
}
