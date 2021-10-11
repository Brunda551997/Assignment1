public class Fibb{
  public static void main(String args[]){
int a=1;
int b=1;
int n=60;
while(a<=n){
  System.out.print(a+",");
  int nextterm=a+b;
  a=b;
  b=nextterm;
}
}
}
