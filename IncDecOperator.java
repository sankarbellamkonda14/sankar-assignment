Public class IncDecOperator
{
 Public static void main(String[]args)
  {
    int n=3;
    System.out.println("The preincremental value of n is = "+ (++n));
    System.out.println("After ++n value of n is = "+ n);  //n=4
    System.out.println("The postincremental value of n is = "+ (n++));
    System.out.println(" After n++ value of n is = "+ n); //n=5
    System.out.println("The predecremental value of n is = "+ (--n));
    System.out.println(" After --n value of n is = "+ n);  //n=4
    System.out.println("The post decremental value of n is = "+ (n--));
    System.out.println(" After n-- value of n is = "+ n); //n=3
  }
}