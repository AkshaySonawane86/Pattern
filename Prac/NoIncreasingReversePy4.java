
public class NoIncreasingReversePy4
{
  public static void main(String x[])
  {
    int a;
    for(int i=1;i<=4;i++)
    {
      a=1;
      for(int j=1;j<=4;j++)
      {
         if(j<=5-i)
         {
            System.out.print(" "+a++);
         }
      }
      System.out.println(); 
    }
  }
}