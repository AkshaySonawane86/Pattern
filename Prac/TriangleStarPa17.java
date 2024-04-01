public class TriangleStarPa17
{
  public static void main(String x[])
  {
    int flag=1;
    for(int i=1;i<=5;i++)
    {
      flag=1;
      for(int j=1;j<=9;j++)
      {
        if(j>=6-i && j<=4+i && flag==1)
        {
           System.out.print(" *");
           flag=0;
        }
        else
        {
           System.out.print("  ");
           flag=1;
        } 
      }
      System.out.println();
    }
  }
}