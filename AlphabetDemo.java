import java.util.Scanner;
public class AlphabetDemo
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
    else
     {
       System.out.println("no,the given number is not an alphabet");
     }
}
