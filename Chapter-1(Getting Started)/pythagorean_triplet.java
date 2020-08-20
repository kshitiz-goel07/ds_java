// QUESTION

// 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise

// SAMPLE INPUT
// 5 3 4

// SAMPLE OUTPUT
// true


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
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int x,y,z,sum;
    
    x=a*a;
    y=b*b;
    z=c*c;
    sum=y+z;
    if(x==sum)
    {
        System.out.println("true");
    }
    else
    {
        System.out.println("false");
    }
    }
    }