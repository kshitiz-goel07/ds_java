// QUESTION
// 1. You are given a number n.
// 2. You've to create a pattern as shown in output format.

// SAMPLE INPUT
// 5

// SAMPLE OUTPUT
// 0	
// 1	1	
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377

///////////////////////////////////////////////////////////////////////////////////////////
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
       int b=1;
       int c=a+b;
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(a+"\t");
               a=b;
               b=c;
               c=a+b;
           }
           System.out.println();
       }
    }
    }