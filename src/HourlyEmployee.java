
public class HourlyEmployee extends Employee
{

    private double hoursWorkedPerWeek;
    private double paymentPerHour;

    HourlyEmployee(String firstName, String lastName, long ssn, double hoursWorkedPerWeek, double paymentPerHour)            
    {
        super(firstName, lastName, ssn);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;  
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    double earning()//OVERRIDAR från parentClass
    {
        return hoursWorkedPerWeek * paymentPerHour;//ny metod
    }

    @Override
    public String toString()
    {
        return "The employee " + super.getFirstName() + " " + super.getLastName() + " with the ssn " + super.getSsn()
                + " has a montly salary of " + getPaymentAmount() + " kr";
      
    }
    @Override
    public double getPaymentAmount()
    {
        return earning() * 4;
    }

}




