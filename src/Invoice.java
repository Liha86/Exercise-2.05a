
public class Invoice implements IPayable
{

    private String invoiceNumber;
    private int quantity;
    private double pricePerItem;
   

    Invoice(String invoiceNumber, int quantity, double pricePerItem)
    {
        this.invoiceNumber = invoiceNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPaymentAmount()
    {
        return quantity * pricePerItem;
    }
    public String toString()
    {
        return "The employee has bought " +  invoiceNumber + " and the quantity is " + quantity + " , the price per item is " 
                + pricePerItem + " which results in the total payment amount of " + getPaymentAmount() + " kr";
        
        
        
    }
    
    
    
}
