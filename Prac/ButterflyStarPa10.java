public class ButterflyStarPa10
{
  public static void main(String x[])
  {
    for(int i=1;i<=7;i++)
    {
      for(int j=1;j<=7;j++)
      {
        if(i<=4)
        {
          if((j<=i || j>=8-i) && j%2==1 && i%2==1)
          {
              System.out.print(" *");
          }
          else if((j<=i || j>=8-i) && j%2==0 && i%2==0)
          {
              System.out.print(" *");
          }
          else
          {
              System.out.print("  ");
          }
        }
        else
        {
          if((j<=8-i || j>=i) && j%2==1 && i%2==1)
          {
              System.out.print(" *");
          }
          else if((j<=8-i || j>=i) && j%2==0 && i%2==0)
          {
              System.out.print(" *");
          }
          else
          {
              System.out.print("  ");
          }
        }
      }
      System.out.println();
    }
  }
}