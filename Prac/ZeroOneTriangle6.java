
public class ZeroOneTriangle6
{
  public static void main(String x[])
  {
    int a=1,b=0,flag=1;
    for(int i=1;i<=4;i++)
    {
      flag=1;
      for(int j=1;j<=4;j++)
      {
         if(j<=i)
         {
            if(i%2==1 && flag==1)
            {
              System.out.print(" "+a);
              flag=0;
            }
            else if(i%2==1 && flag==0)
            {
              System.out.print(" "+b);
              flag=1;
            }
            

            if(i%2==0 && flag==1)
            {
              System.out.print(" "+b);
              flag=0;
            }
            else if(i%2==0 && flag==0)
            {
              System.out.print(" "+a);
              flag=1;
            }           
         }
         
      }
      System.out.println(); 
    }
  }
}