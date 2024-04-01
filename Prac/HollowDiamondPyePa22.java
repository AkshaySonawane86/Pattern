public class HollowDiamondPyePa22
{
  public static void main(String x[])
  {
    int flag=1;
    for(int i=1;i<=7;i++)
    {
      flag=1;
      for(int j=1;j<=9;j++)
      {
        if((j==5-i || j==3+i) && i<=4)
        {
            System.out.print(" *");
        }
        else if((j==i-3 || j==11-i) && i>4)
        {
            System.out.print(" *");
        }
        else
         {
            System.out.print("  ");
         }    
      }
      System.out.println();
    }
  }
}