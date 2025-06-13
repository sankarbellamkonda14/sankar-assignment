import java.util.Scanner;
public class AlphaDigChaDemo
{
 public static void main(String[]args)
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("enter the  character");
  char ch= sc.next().charAt(0);
  
   if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
    {
     System.out.println("yes, the given character is alphabet");
    }
    else if(ch>='0' && ch<='9')
    {
     System.out.println("the given character is a digit");
    }

    else
     {
       System.out.println("the given is special character");
     }
}
