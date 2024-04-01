public class MirrorImageTrianglePa19
{
  public static void main(String x[])
  {
    int flag=1,a,b=1,c=2;
    int z=0;
    for(int i=1;i<=7;i++)
    {
      flag=1;
      a=b;
      b++;
      if(i>4)
      {
        z=c;
        c--;
      }
      for(int j=1;j<=7;j++)
      {
        if(j>=i && j<=8-i && flag==1 && i<5)
        {
           System.out.print(" "+a++);
           flag=0;
        }
        else if(j>=8-i && j<=i && flag==1 && i>4)
        { 
           z++;
           System.out.print(" "+z);
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