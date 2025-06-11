public class HimaSalary 
{
    public static void main(String[] args) 
   {
        double basic = 85000;
        double ta = basic * 0.15;
        double da = basic * 0.20;
        double hra = basic * 0.18;
        double pf = basic * 0.20;
        double tax = basic * 0.25;

        double gross = basic + ta + da + hra;
        double net = gross - pf - tax;

        System.out.println("Gross Amount = " + gross);
        System.out.println("Net Amount = " + net);
    }
}