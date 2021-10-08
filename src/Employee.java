
public abstract class Employee implements IPayable
{

    private String firstName;
    private String lastName;
    private long ssn;

    Employee(String firstName, String lastName, long ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String toString()
    {
        return firstName + " " + lastName + " " + "security number " + ssn;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public long getSsn()
    {
        return ssn;
    }

    abstract double earning();

    @Override
    public double getPaymentAmount()
    {
        return earning() * 4;
    }

}
