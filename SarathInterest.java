public class SarathInterest 
{
    public static void main(String[] args) 
   {
        double p = 500000;
        double t = 5;
        double r = 6.8;
        double interestAmount = (p * t * r) / 100;
        double finalAmount = p + interestAmount;
        System.out.println("Interest Amount = " + interestAmount);
        System.out.println("Final Amount = " + finalAmount);
    }
}