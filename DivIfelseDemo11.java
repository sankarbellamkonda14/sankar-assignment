import java.util.Scanner;
public class DivIfelseDemo11
{
 public static void main(String[]args)
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("enter the  number");
  int a= sc.nextInt();
  
  if(a%11==0)
    {
     System.out.println("yes, it can be divided by 11");
    }
    else
     {
       System.out.println("no, it cant be divided by 11");
     }
}
