// QUESTION
// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// SAMPLE INPUT
// 5

// SAMPLE OUTPUT
//      *
//  *       *
//*             *
//  *       *
//      *


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
        int sp=n/2;
        int inner_sp=1;
        for(int i=1;i<=n;i++)
        {
           if(i==1 || i==n)
           {
               for(int a=1;a<=sp;a++)
            {
                System.out.print("\t");
            }
               System.out.print("*\t");
               sp--;
           }
           else{
               if(i<=n/2)
               {
            for(int a=1;a<=sp;a++)
            {
                System.out.print("\t");
            }
               System.out.print("*\t");
            for(int a=1;a<=inner_sp;a++)
            {
                System.out.print("\t");
            }
               System.out.print("*\t");
               sp--; 
               inner_sp=inner_sp+2;
               }
               else {
                   for(int a=1;a<=sp;a++)
            {
                System.out.print("\t");
            }
                   System.out.print("*\t");
                   for(int a=1;a<=inner_sp;a++)
            {
                System.out.print("\t");
            }
                   System.out.print("*\t");
                   sp++;
                   inner_sp=inner_sp-2;
               }
           }
           System.out.println();
        }
    }
    }