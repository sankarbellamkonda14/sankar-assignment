public class CompoundOperator
 {
  public static void main(String[]args)
  {
   int x=6;
   x+=10;
   System.out.println(" The value of x+=x "+ x);  // x = 6 + 10 = 16
   x-=8;
   System.out.println(" The value of x-=x "+ x);  // x = 16 - 8 = 8
   x*=6;
   System.out.println( " The value of x*=x "+ x);  // x = 8 * 6 = 48
   x/=4;
   System.out.println(" The value of x/=x "+ x); // x = 48 / 4 = 12
   x%=5;
   System.out.println(" The value of x%=x "+ x);  // x = 12 % 5 = 2
  }
}