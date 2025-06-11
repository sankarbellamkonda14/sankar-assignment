public class Addition
 {
    public int add(int a, int b) 
    {
        int x = a;
        int y = b;
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args)
    {
        Addition obj = new Addition();
        int result = obj.add(5, 10);
        System.out.println("Sum = " + result);
    }
}