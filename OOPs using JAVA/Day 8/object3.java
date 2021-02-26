// Author : Abhishek Sharma
// Object oriented programming using JAVA
// Example of Object in JAVA (3)

class Calculator2
{
    int num1;
    int num2;

    Calculator2() {
        num1 = 2;
        num2 = 3;
    }

    Calculator2 (int n1, int n2){
        num1 = n1;
        num2 = n2;
    }

    int getResult(){
        return (num1 + num2);
    }
}

class object3 {

    public static void main(String[] args) {
        int res;
        Calculator2 c1 = new Calculator2 ();
        Calculator2 c2 = new Calculator2 (4,5);

        res = c1.getResult();
        System.out.println("The result is : " + res);
        res = c2.getResult();
        System.out.println("The result is : " + res);
    }
}


// Output :
// The result is : 5
// The result is : 9
