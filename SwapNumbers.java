public class SwapNumbers 
{
    public static void main(String[] args)
 {
        int xyz1 = 10;
        int xyz2 = 20;
        int temp;

        temp = xyz1;
        xyz1 = xyz2;
        xyz2 = temp;

        System.out.println("xyz1 = " + xyz1);
        System.out.println("xyz2 = " + xyz2);
    }
}