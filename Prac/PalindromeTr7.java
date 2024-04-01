
public class PalindromeTr7
{
  public static void main(String x[])
  {
    int a,b=2;
    for(int i=1;i<=4;i++)
    {
      a=b;
      b++;
      for(int j=1;j<=7;j++)
      {
         if(j<=3+i && j>=5-i)
         {
            if(j<=4)
            { a--;
              System.out.print(" "+a);
            }   
            else
            {
              a++;
              System.out.print(" "+a);
            }     
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