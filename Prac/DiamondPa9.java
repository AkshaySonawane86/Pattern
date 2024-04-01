public class DiamondPa9
{
  public static void main(String x[])
  {
    int flag;
    for(int i=1;i<=7;i++)
    {
      flag=1;
      for(int j=1;j<=7;j++)
      {
        if(i<=4)
        {
          if(j>=5-i && j<=3+i &&flag==1)
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
        else if(i>4)
        {
          if(j>=i-3 && j<=11-i && flag==1)
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
      }
      System.out.println();
    }
  }
}