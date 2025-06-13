import java.util.Scanner;
public class DigitDemo
{
 public static void main(String[]args)
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("enter the  number");
  int a= sc.nextInt();
  
  if(a>=0 && a<=9)
    {
     System.out.println("the given number is a digit");
    }
    else
     {
       System.out.println("The given number is not a digit");
     }
}
