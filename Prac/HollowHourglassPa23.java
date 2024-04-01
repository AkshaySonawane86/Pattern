public class HollowHourglassPa23
{
  public static void main(String x[])
  {
    int flag=1;
    for(int i=1;i<=7;i++)
    {
      flag=1;
      for(int j=1;j<=7;j++)
      {
        if((j==i || j==8-i || i==1|| i==7) && flag==1)
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