public class ReverseNoTrianglePa18
{
  public static void main(String x[])
  {
    int flag=1,a,b=1;
    for(int i=1;i<=4;i++)
    {
      flag=1;
      a=b;
      b++;
      for(int j=1;j<=7;j++)
      {
        if(j>=i && j<=8-i && flag==1)
        {
           System.out.print(" "+a++);
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