// QUESTION
// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// SAME INPUT
// 5

// SAMPLE OUTPUT
//                 *
//             *   *                
//         *   *   *
//     *   *   *   *
// *   *   *   *   *


//////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,a,b;
        int sp=n-1;
        int val=1;
        for(i=1;i<=n;i++)
        {
            // System.out.println(sp+" "+val);
            for(a=1;a<=sp;a++)
            {
                System.out.print("\t");
            }
            for(b=1;b<=val;b++)
            {
                 System.out.print("*\t");
            }
            sp--;
            val++;
            System.out.println();
        }
        } 
    }
    

    // Code By Kshitiz Goel