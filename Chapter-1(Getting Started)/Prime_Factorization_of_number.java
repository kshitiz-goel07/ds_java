// QUESTION

// 1. You are required to display the prime factorization of a number.
// 2. Take as input a number n.
// 3. Print all its prime factors from smallest to largest.

// SAMPLE INPUT
// 1440

// SAMPLE OUTPUT
// 2 2 2 2 2 3 3 5


///////////////////////////////////////////////////////////////////////////////////////////
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
        
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                while(n%i==0)
                {
                    System.out.println(i);
                    n=n/i;
                }
            }
        }
    }
    }