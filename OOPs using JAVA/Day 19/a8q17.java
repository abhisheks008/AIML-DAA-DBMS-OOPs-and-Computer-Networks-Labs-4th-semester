// 17. Consider a Library Management System, where a user wants to find a book. If the book is present in Library (Hint: Use predefined array), then it will print the book. Otherwise it will throw an exception “BookNotFoundException”. 
// Author : Abhishek Sharma, 2021
import java.awt.print.Book;
import java.util.Scanner;
class BookNotFoundException extends Exception{
    BookNotFoundException(){
        super("Book not found exception");
    }
}
public class q17 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int books[]={101,202,303,404,505};
        System.out.println("Enter the book no.:");
        int key=sc.nextInt();
        int flag=0;
        for(int i=0;i<books.length;i++){
            if(books[i]==key)
                flag=1;
        }
        try{
            if(flag==0)
                throw new BookNotFoundException();
            else
                System.out.print("Book found");
        }
        catch(BookNotFoundException e){
            System.out.print(e);
        }
    }
}

/*
Output :
Enter the book no.:
1111
BookNotFoundException: Book not found exception

Enter the book no.:
101
Book found
*/
