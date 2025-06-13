import java.util.Scanner;

public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit");
        double fahrenheit = sc.nextDouble();
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.println("Temperature in Celsius: " + celsius);

        if (celsius >= 30)
        {
            System.out.println("It's a hot day.");
        }
        else 
        {
            System.out.println("It's a cold day.");
        }
    }
}
