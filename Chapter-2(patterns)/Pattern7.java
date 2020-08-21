// QUESTION
// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// SAME INPUT
// 5

// SAMPLE OUTPUT
//*	
// 	*	
// 		*	
// 			*	
// 				*

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
      int sp=0;
      for(int i=1;i<=n;i++)
      {
          for(int a=1;a<=sp;a++)
          {
              System.out.print("\t");
          }
          System.out.print("*\t");
          sp++;
          System.out.println();
      }
        } 
    }
    

    // Code By Kshitiz Goel