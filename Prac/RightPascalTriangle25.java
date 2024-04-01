public class RightPascalTriangle25
{
  public static void main(String x[])
  {
    int flag=1;
    for(int i=1;i<=7;i++)
    {
      flag=1;
      for(int j=1;j<=7;j++)
      {
        if(j<=i && i<=4 && j%2==1 && i%2==1)
        {
          System.out.print(" *");
        }  
        else if(j<=i && i<=4 && j%2==0 && i%2==0)
        {
          System.out.print(" *");
        } 
        else if(j<=8-i && i>4 && j%2==1 && i%2==1)
        {
          System.out.print(" *");
        }  
        else if(j<=8-i && i>4 && j%2==0 && i%2==0)
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