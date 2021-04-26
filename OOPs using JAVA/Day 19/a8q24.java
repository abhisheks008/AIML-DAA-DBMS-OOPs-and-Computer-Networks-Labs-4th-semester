// 24. Design a stack class. Provide your own stack exceptions namely push exception and pop exception, which throw exceptions when the stack is full and when the stack is empty respectively. Show the usage of these exceptions in handling a stack object in the main. 
// Author : Abhishek Sharma, 2021
class StackException extends Exception{
    public StackException(){
        super("Stack size exception");
    }
}
class Stack_{
    static int arr[]=new int[5];
    static int max=arr.length;
    static int top=-1;
    static void push(int a){
        top++;
        if(top<max){
            arr[top]=a;
            System.out.println(a+" pushed");
        }
        else{
            top--;
            try {
                throw new StackException();
            } 
            catch (StackException e) {
                System.out.println(e);
            }
        }
    }

    static void pop(){
        if(top>=0)
            System.out.println(arr[top--]+" Popped");
        else{
            top++;
            try {
                throw new StackException();
            } 
            catch (StackException e) {
                System.out.println(e);
            }
        }
    }
}
public class q24 {
    public static void main(String[] args) {
        Stack_.push(10);
        Stack_.push(20);
        Stack_.push(30);
        Stack_.push(40);
        Stack_.push(50);
        Stack_.push(50);
        Stack_.pop();
        Stack_.pop();
        Stack_.pop();
        Stack_.pop();
        Stack_.pop();
        Stack_.pop();
    }
}

/*
Output :
10 pushed
20 pushed
30 pushed
40 pushed
50 pushed
StackException: Stack size exception
50 Popped
40 Popped
30 Popped
20 Popped
10 Popped
StackException: Stack size exception
*/
