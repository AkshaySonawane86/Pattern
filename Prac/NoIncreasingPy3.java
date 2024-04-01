
public class NoIncreasingPy3
{
  public static void main(String x[])
  {
    int a;
    for(int i=1;i<=4;i++)
    {
      a=1;
      for(int j=1;j<=4;j++)
      {
         if(j<=i)
         {
            System.out.print(" "+a++);
            //a++;
         }
         
      }
      System.out.println(); 
    }
  }
}