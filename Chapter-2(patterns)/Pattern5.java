// QUESTION
// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// SAME INPUT
// 5(Only odd no. input)

// SAMPLE OUTPUT
//         *
//     *   *   *
// *   *   *   *   *
//     *   *   *
//         *                


//////////////////////////////////////////////////////////////////////////////////////////
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
      int star=1;
         for(int i=1;i<=n;i++)
         {
             for(int a=1;a<=sp;a++)
             {
                 System.out.print("\t");
             }
             for(int b=1;b<=star;b++)
             {
                 System.out.print("*\t");
             }
           // System.out.println(sp+" "+star);
             System.out.println();
             if(i<=n/2)
             {
                 sp--;
                 star=star+2;
             }
             else
             {
                 sp++;
                 star=star-2;
             }
         }
        } 
    }
    

    // Code By Kshitiz Goel