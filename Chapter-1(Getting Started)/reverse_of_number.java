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
     int a;
     while(n>0)
     {
         a=n%10;
         n=n/10;
         System.out.println(a);
     }
    }
    }