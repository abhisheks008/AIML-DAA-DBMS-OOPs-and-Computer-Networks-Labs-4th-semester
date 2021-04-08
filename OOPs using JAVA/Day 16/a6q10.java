// Q10. Implement the below Diagram.  Here, Asset class is an abstract class containing an abstract method displayDetails() method. Stock, bond and Savings class inherit the Asset class and displayDetails() method is defined in every class. 
// @Abhishek Sharma

abstract class Asset{
    protected String descriptor; 
    protected String date; 
    protected int currentvalue;
    public Asset(String descriptor, String date, int currentvalue) {
        super();
        this.descriptor = descriptor; 
        this.date = date; 
        this.currentvalue = currentvalue;
    }
    abstract public String display();
}
class Stock extends Asset{
    int num_share; 
    int share_price; 
    int asset;

    public Stock(String descriptor, String date, int currentvalue, int num_share, int share_price, int asset){
        super(descriptor, date, currentvalue); 
        this.num_share = num_share; 
        this.share_price = share_price; 
        this.asset = asset;
    }
    public String display() {
        return "Stock [num_share=" + num_share + ", share_price=" + share_price + ", asset=" + asset + ", descriptor=" + descriptor + ", date=" + date + ", currentvalue=" + currentvalue + "]";
    }
}
class Bond extends Asset{
    int intrest_rate;
    int asset;
    public Bond(String descriptor, String date, int currentvalue, int intrest_rate, int asset) {
        super(descriptor, date, currentvalue); 
        this.intrest_rate = intrest_rate; 
        this.asset = asset;
    }
    public String display() {
        return "Bond [intrest_rate=" + intrest_rate + ", asset=" + asset + ", descriptor=" + descriptor + ", date=" + date + ", currentvalue=" + currentvalue + "]";
    }
}
class Savings extends Asset{
    int intrest_rate;
    int asset;
    public Savings(String descriptor, String date, int currentvalue, int intrest_rate, int asset) {
        super(descriptor, date, currentvalue); 
        this.intrest_rate = intrest_rate; 
        this.asset = asset;
    }
    public String display() {
    return "Savings [intrest_rate=" + intrest_rate + ", asset=" + asset + ", descriptor=" + descriptor + ", date=" + date + ", currentvalue=" + currentvalue + "]";
    }
}
public class q1 {
    public static void main(String args[]) {
        Asset obj=new Stock("Bruce", "07-04-2021", 50000, 10, 2500, 25000);
        Asset obj1=new Bond("Barry", "06-04-2021", 40000, 5, 75000);
        Asset obj2=new Savings("Abhishek", "07-04-2021", 70000, 3,50000);
        System.out.println(obj.display());
        System.out.println(obj1.display()); 
        System.out.println(obj2.display());
    }
}

/*
Output :
Stock [num_share=10, share_price=2500, asset=25000, descriptor=Bruce, date=07-04-2021, currentvalue=50000]
Bond [intrest_rate=5, asset=75000, descriptor=Barry, date=06-04-2021, currentvalue=40000]
Savings [intrest_rate=3, asset=50000, descriptor=Abhishek, date=07-04-2021, currentvalue=70000]
*/
