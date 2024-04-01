import java.util.*;
public class Twowords4
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner(System.in);
    String str[]={"the","quick","brown","fox","quick"};
    //char s[]=str.toCharArray();
    System.out.print("Enter the 1st String ");
    String str1=sc.nextLine();
    char ch[]=str1.toCharArray();
    System.out.print("Enter the 2nd String ");
    String str2=sc.nextLine();
    char chh[]=str2.toCharArray();
    for(int i=0;i<str.length;i++)
    {
      System.out.print(""+str[i]);
      System.out.print(" ");
    }
    
    System.out.println();
    int count=0;
    for(int i=0;i<str.length;i++)
    {
      char ch2[]=str[i].toCharArray();
      if(ch[0]==ch2[0])
      {
        for(int j=i+1;j<str.length;j++)
        {
          if(ch[0]!=ch2[0])
          {
            count++;
            char ch3[]=str[j].toCharArray();
            if(chh[0]==ch3[0])
            {
              break;
            }
          }
           else
           {
              count=0;
              for(int j=i+1;j<str.length;j++)
              {
                 count++;
                 char ch3[]=str[j].toCharArray();
                 if(chh[0]==ch3[0])
                 {
                   break;
                 }
              }
            }
          }
        }
        break;
      }
      
    }
    System.out.println("Count == "+count);



   
  }
}