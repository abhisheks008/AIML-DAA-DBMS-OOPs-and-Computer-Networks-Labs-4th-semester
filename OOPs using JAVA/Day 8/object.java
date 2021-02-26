
// author : Abhishek Sharma

class Calculator {
    int num1;
    int num2;
    void setValue(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }
    int getResult(){
        return (num1 + num2);
    }
}

class object {
    public static void main(String[] args) {
        int res;
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.setValue(4,5);
        res = c1.getResult();
        System.out.println("The result is : " + res);
        
        c2.setValue(5,6);
        res = c2.getResult();
        System.out.println("The another result is : "+ res);

    }
}


// output :
// The result is : 9
// The another result is : 11
