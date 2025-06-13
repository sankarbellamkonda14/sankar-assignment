import java.util.Scanner;
public class PositiveNegDemo
{
 public static void main(String[]args)
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("enter the  number");
  int a= sc.nextInt();
  
  if(a>=0)
    {
     System.out.println("the given number is positive");
    }
    else
     {
       System.out.println("The given number is negative");
     }
}
