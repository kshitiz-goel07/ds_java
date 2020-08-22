// QUESTION
// 1. You are given a number n.
// 2. You've to create a pattern as shown in output format.

// SAMPLE INPUT
// 5

// SAMPLE OUTPUT
// 1	
// 2	3	
// 4	5	6	
// 7	8	9	10	
// 11	12	13	14	15


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
       int count=1;
       for(int i=1;i<=n;i++)
       {
           for(int a=1;a<=i;a++)
           {
               System.out.print(count+"\t");
               count++;
           }
           System.out.println();
       }
    }
    }