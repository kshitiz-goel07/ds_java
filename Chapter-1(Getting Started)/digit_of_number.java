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
       int a=0;
       int c=0;
       while(n>0)
       {
          a=n%10;
          n=n/10;
          c=a+c*10;
       }
       while(c>0)
       {
           int x=c%10;
           System.out.println(x);
                        c=c/10;
       }
    }
    }