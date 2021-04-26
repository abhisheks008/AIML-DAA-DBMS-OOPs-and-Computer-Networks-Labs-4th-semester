// 18. Consider a Quiz Management System, where a user needs to answer 5 questions. If any of the answer is wrong, throw an exception “NotCorrectException”. If the answer is correct give a message “good! The answer is correct”. 
// Author : Abhishek Sharma, 2021

import java.util.Scanner;
class NotCorrectException extends Exception{
    NotCorrectException(){
        super("Wrong answer");
    }
}
public class q18 {
    public static void main(String arrg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Captain of Indian Cricket team?");
        System.out.println("1: Virat Kohli");
        System.out.println("2: MS. Dhoni");
        if(sc.nextInt()==1)
            System.out.println("Good");
        else
        try {
            throw new NotCorrectException();
        } 
        catch (NotCorrectException e) {
            System.out.println(e);
        }
        System.out.println("EX Prime Minister of India?");
        System.out.println("1: Dr. Manmohan Singh");
        System.out.println("2: Arvind Kejriwal");
        if(sc.nextInt()==1)
            System.out.println("Good");
        else
        try {
            throw new NotCorrectException();
        }
        catch (NotCorrectException e) {
            System.out.println(e);
        }
        System.out.println("Who wrote the C language?");
        System.out.println("1: Bill Gates");
        System.out.println("2: Dennis Ritchie");
        if(sc.nextInt()==2)
            System.out.println("Good");
        else
        try {
            throw new NotCorrectException();
        } 
        catch (NotCorrectException e) {
            System.out.println(e);
        }
        System.out.println("JAVA is written in which year?");
        System.out.println("1: 1992");
        System.out.println("2: 1995");
        if(sc.nextInt()==2)
            System.out.println("Good");
        else
        try {
            throw new NotCorrectException();
        } 
        catch (NotCorrectException e) {
            System.out.println(e);
        }
        System.out.println("When was TCS established?");
        System.out.println("1: 1 April 1968");
        System.out.println("2: 1 April 1972");
        if(sc.nextInt()==1)
            System.out.println("Good");
        else
        try {
            throw new NotCorrectException();
        } 
        catch (NotCorrectException e) {
            System.out.println(e);
        }
    }
}

/*
Output :
Captain of Indian Cricket team?
1: Virat Kohli
2: MS. Dhoni
1
Good
EX Prime Minister of India?
1: Dr. Manmohan Singh
2: Arvind Kejriwal
1
Good
Who wrote the C language?
1: Bill Gates
2: Dennis Ritchie
2
Good
JAVA is written in which year?
1: 1992
2: 1995
1
NotCorrectException: Wrong answer
When was TCS established?
1: 1 April 1968
2: 1 April 1972
1
Good
*/
