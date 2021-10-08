
public class Main
{

    public static void main(String[] args)
    {
        SalariedEmployee Hana = new SalariedEmployee("Hana", "Lihovic", 870626, 2800);
        System.out.println(Hana);

        HourlyEmployee Sanjin = new HourlyEmployee("Sanjin", "Lihovic", 1860702, 2, 3000);
        System.out.println(Sanjin);

        Invoice pens = new Invoice("pens", 40, 0.5);
        System.out.println(pens);

        Invoice paper = new Invoice("paper", 1000, 5);
        System.out.println(paper);
        
        Invoice laptop = new Invoice("laptop", 1, 15000);
        System.out.println(laptop);
        
        Invoice projector = new Invoice("projector", 2, 6000);
        System.out.println(paper);

        IPayable[] IPay = new IPayable[4];

        IPay[0] = pens;
        IPay[1] = paper;
        IPay[2] = laptop;
        IPay[3] = projector;

        for (int i = 0; i < IPay.length; i++)
        {
            System.out.println("The employee purchases for a month are " + i
                    + " : " + IPay[i]);
        }

    }

}
