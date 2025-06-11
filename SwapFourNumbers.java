public class SwapFourNumbers 
{
    public static void main(String[] args)
    {
        int xyz1 = 10;
        int xyz2 = 20;
        int xyz3 = 30;
        int xyz4 = 40;
        int temp;

        temp = xyz1;
        xyz1 = xyz2;
        xyz2 = xyz3;
        xyz3 = xyz4;
        xyz4 = temp;

        System.out.println("xyz1 = " + xyz1);
        System.out.println("xyz2 = " + xyz2);
        System.out.println("xyz3 = " + xyz3);
        System.out.println("xyz4 = " + xyz4);
     }
}