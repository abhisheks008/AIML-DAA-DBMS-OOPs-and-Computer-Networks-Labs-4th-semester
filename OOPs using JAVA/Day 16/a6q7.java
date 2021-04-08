//Q7. Create an interface called Player. The interface has an abstract method called play() that displays a message describing the meaning of “play” to the class. Create classes  called Child, Musician, and Actor that all implement Player. Create an application  that demonstrates the use of the classes(UsePlayer.java ) 
// @Abhishek Sharma

interface Player{
    abstract public void play();
}
class Child implements Player{
    public void play() {
        System.out.println("This is Child");
    }
}
class Musician implements Player{
    public void play() {
        System.out.println("This is Musician");
    }
}
class Actor implements Player{
    public void play() {
        System.out.println("This is Actor ");
    }
}
public class q1 {
    public static void main(String args[]) {
        Player obj=new Child(); 
        Player obj1=new Musician(); 
        Player obj2=new Actor(); 
        obj.play();
        obj1.play();
        obj2.play();
    }
}
/*
Output :
This is Child
This is Musician
This is Actor
*/
