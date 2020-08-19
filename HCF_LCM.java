// QUESTION

// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
// 3. Take input "num1" and "num2" as the two numbers.
// 4. Print their GCD and LCM.

// SAMPLE INPUT
// 36
// 24
// SAMPLE OUTPUT
// 12 
// 72

//////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc= new Scanner(System.in);
        int a,b,t,lcm,hcf;
          int x = sc.nextInt();
          int y = sc.nextInt();
          a=x;
          b=y;
          while(b>0)
          {
              t=b;
              b=a%b;
              a=t;
          }
          hcf=a;
          lcm=(x*y)/a;
          System.out.println(hcf);
          System.out.println(lcm);
    }
    }