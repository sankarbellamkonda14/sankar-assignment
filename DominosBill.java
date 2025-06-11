public class DominosBill 
{
    public static void main(String[] args) 
    {
        double pizzaCost = 399.0;
        int quantity = 2;
        double total = pizzaCost * quantity;
        double discount = 0.20;
        double finalBill = total - (total * discount);

        System.out.println("Final Bill Amount = " + finalBill);
     }
}