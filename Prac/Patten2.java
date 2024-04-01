
public class Patten2
{
  public static void main(String x[])
  {
    int a=0,flag=1;
    for(int i=1;i<=4;i++)
    {
      a++;
      for(int j=1;j<=7;j++)
      {
         if(j>=5-i && j<=3+i && flag==1)
         {
            System.out.print(" "+a);
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