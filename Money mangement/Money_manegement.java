import java.util.Scanner;
public class Main 
{
    public static void main(String args[]) 
    {
      
      int x=5000;
      System.out.println(x);
      double a=0.55;
      a=a*x;
      double b=0.1;
      b=b*x;
      double c=0.1;
      c=c*x;
      double d=0.1;
      d=d*x;
      double e=0.1;
      e=e*x;
      double f=0.05;
      f=f*x;
      System.out.println("NEC: "+(int)a);
      System.out.println("FFA: "+(int)b);
      System.out.println("EDU: "+(int)c);
      System.out.println("LTSS: "+(int)d);
      System.out.println("PLAY: "+(int)e);
      System.out.println("GIVE: "+(int)f);
    }
}
