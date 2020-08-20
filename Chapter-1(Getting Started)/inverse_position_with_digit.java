import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int count = 0;
     int temp=n;
     int inv =0;
     int a;
      while(temp>0)
      {
          temp=temp/10;
          count++;
      }
      for(int i=1;i<=count;i++)
      {
          a=n%10;
          n=n/10;
          inv = inv+i*(int)Math.pow(10,a-1);
      }
      System.out.println(inv);
    }
}