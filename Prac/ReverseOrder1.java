import java.util.*;
public class ReverseOrder1
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    String str;
    System.out.println("Enter the String :");
    str=sc.nextLine();
    char ch[]=str.toCharArray();
    System.out.println("Display the String ");
    for(int i=0;i<ch.length;i++)
    {
      System.out.print(""+ch[i]);
    }
    int start,end=ch.length-1;
    System.out.println("");

    for(int i=ch.length-1;i>=0;i--)
    {
      //System.out.print(""+ch[i]);
      if(ch[i]==32 || i==0)
      {
         if(i==0)
         {
           start=i;
         }
         else
         {
           start=i+1;
         }
         while(start<=end)
         {
           System.out.print(""+ch[start]);
           start++;
         }
         System.out.print(" ");
         end=i-1;
      }
    }
  }
}