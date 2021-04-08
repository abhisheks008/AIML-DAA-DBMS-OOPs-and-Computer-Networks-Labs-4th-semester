// Q11. Implement the below Diagram. Here AbstractProduct is only abstract class.
// @Abhishek Sharma
abstract class AbstractProduct{
    protected int productId; 
    protected String name; 
    protected String description;
    public AbstractProduct(int productId, String name, String description) {
        super();
        this.productId = productId; 
        this.name = name; 
        this.description = description;
    }
}
class Product extends AbstractProduct{
    protected int price;
    public Product(int productId, String name, String description, int price) {
        super(productId, name, description);
        this.price = price;
    }
}
class Book extends Product{
    protected int ISBN;
    protected String Author,Title;
    public Book(int productId, String name, String description, int price, int iSBN, String author, String title) {
        super(productId, name, description, price); 
        ISBN = iSBN;
        Author = author; 
        Title = title;
    }
    public String display() {
        return "Book [ISBN=" + ISBN + ", Author=" + Author + ", Title=" + Title + ", price=" + price + ", productId="    + productId + ", name=" + name + ", description=" + description + "]";
    }
}

class Travel_Guide extends Book{
    protected String Country;
    public Travel_Guide(int productId, String name, String description, int price, int iSBN, String author, String title, String country) {
        super(productId, name, description, price, iSBN, author, title); 
        Country = country;
    }
    public String display() {
        return "Travel guide [Country = "+ Country + ", ISBN = " + ISBN + ", Author = " + Author + ", Title = " + Title + ", price = "+price + ", product id = "+productId+", name = "+name+", description = "+description+"]";
    }
}

class CompactDisc extends Product{
    protected String Artist;
    protected String Title;

    public CompactDisc(int productId, String name, String description, int price, String artist, String title){
        super(productId, name, description, price); 
        Artist = artist;
        Title = title;
    }
    public String display() {
        return "CompactDisc [Artist=" + Artist + ", Title=" + Title + ", price=" + price + ", productId=" + productId + ", name=" + name + ", description=" + description + "]";
    }
}
public class q1 {
    public static void main(String args[]) {
        Book obj=new Book(101,"Chronicles","Chronicles, Volume One is a memoir written by American musician Bob Dylan.",700,1786,"Bob Dylan","The Chronicles:Vol 1");
        Travel_Guide obj1=new Travel_Guide(102,"My Travel Journal","My Travel Journal:1st Edition",300,1786,"by The Unscripted Life (Author)","My Travel Journal","India");
        CompactDisc obj2=new CompactDisc(103,"Abbey Road","Abbey Road:1969/The Beatles",5000,"The Beatles","Abbey Road:1969");
        System.out.println(obj.display()); 
        System.out.println(obj1.display()); 
        System.out.println(obj2.display());
    }
}

/*
Output :
Book [ISBN=1786, Author=Bob Dylan, Title=The Chronicles:Vol 1, price=700, productId=101, name=Chronicles, description=Chronicles, Volume One is a memoir written by American musician Bob Dylan.]
Travel guide [Country = India, ISBN = 1786, Author = by The Unscripted Life (Author), Title = My Travel Journal, price = 300, product id = 102, name = My Travel Journal, description = My Travel Journal:1st Edition]
CompactDisc [Artist=The Beatles, Title=Abbey Road:1969, price=5000, productId=103, name=Abbey Road, description=Abbey Road:1969/The Beatles]
*/
