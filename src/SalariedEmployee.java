
public class SalariedEmployee extends Employee
{

    double weeklySalary;//additional attribute

    SalariedEmployee(String firstName, String lastName, long ssn, double weeklySalary)
    {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;                 
    }

    @Override
    double earning()
    {
        return weeklySalary;
    }

    @Override
    public String toString()// overidar toString från parentClass
    {
        return "The employee " + super.getFirstName() + " " + super.getLastName() + " with the ssn " + super.getSsn()
                + " has a monthly salary of " + getPaymentAmount() + " kr"; 
    }

    @Override
    public double getPaymentAmount()
    {
        return earning() * 4;
    }

}
