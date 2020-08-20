// QUESTION
// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// SAME INPUT
// 15

// SAMPLE OUTPUT
//    *	*	*	*	*	*	*	*	*	*	*	*	*	*	*	
//	    *	*	*	*	*	*	*	*	*	*	*	*	*	*	
//		    *	*	*	*	*	*	*	*	*	*	*	*	*	
//			    *	*	*	*	*	*	*	*	*	*	*	*	
//				    *	*	*	*	*	*	*	*	*	*	*	
//					    *	*	*	*	*	*	*	*	*	*	
//						    *	*	*	*	*	*	*	*	*	
//							    *	*	*	*	*	*	*	*	
//								    *	*	*	*	*	*	*	
//									    *	*	*	*	*	*	
//										    *	*	*	*	*	
//											    *	*	*	*	
//												    *	*	*	
//													    *	*	
//														    *	


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
        int sp=0;
        int star=n;
        for(i=1;i<=n;i++)
        {
            
             for(b=1;b<=sp;b++)
            {
                 System.out.print("\t");
            }
            for(a=1;a<=star;a++)
            {
                System.out.print("*\t");
            }
           
            sp++;
            star--;
            System.out.println();
        }
        } 
    }
    

    // Code By Kshitiz Goel