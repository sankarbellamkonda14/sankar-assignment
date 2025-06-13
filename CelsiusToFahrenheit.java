import java.util.Scanner
public class CelsiusToFahrenheit
{

 public static void main(String[]args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println(" Enter the Temparature in celsius");
  double celsius = sc.nextDouble();
  double fahrenheit = (celsius * 9 / 5) + 32;
  System.out.println("Temperature in Fahrenheit: " + fahrenheit);
  if (fahrenheit >= 90)
   {
     System.out.println("It's a hot day.");
   }
   else
   {
     System.out.println("It's a cold day.");
   }
 }
}
  
 