/*
Q9. Create an abstract class MotorVehicle with the following details: 
Data Members: 
(a) modelName (b)modelNumber (c) modelPrice 
Methods: 
(a) display() to show all the details 
Create a subclass of this class Carthat inherits the class MotorVehicle and add the following details: 
Data Members: 
(b) discountRate 
Methods: 
(a) display() method to display the Car name, model number, price and the discount rate. 
(b) discount() method to compute the discount. 
*/
// @Abhishek Sharma

abstract class MotorVehicle {
    protected String modelName; 
    protected int mmdelPrice; 
    protected int modelNumber;
    public MotorVehicle(String modelName, int mmdelPrice, int modelNumber) {
        super();
        this.modelName = modelName; 
        this.mmdelPrice = mmdelPrice; 
        this.modelNumber = modelNumber;
    }
    abstract public String display();
}
class Carthat extends MotorVehicle{
    double discountRate;
    public Carthat(String modelName, int mmdelPrice, int modelNumber, double d) {
        super(modelName, mmdelPrice, modelNumber);
        this.discountRate = d;
    }
    public String display() {
        return "Carthat [discountRate=" + discountRate + ", modelName=" + modelName + ", mmdelPrice=" + mmdelPrice + ", modelNumber=" + modelNumber + "]";
    }
    public void discount()
    {
        System.out.println("Discount Price:"+(mmdelPrice-(discountRate*mmdelPrice)));
    }
}
public class q1 {
    public static void main(String args[]) {
        Carthat obj=new Carthat("i20", 1200000, 7768, 0.2); obj.discount();
        System.out.println(obj.display());
    }
}
/*
Output :
Discount Price:960000.0
Carthat [discountRate=0.2, modelName=i20, mmdelPrice=1200000, modelNumber=7768]
*/
