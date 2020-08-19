// QUESTION

// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.

//   SAMPLE INPUT   
// 562984
// 2

//   SAMPLE OUTPUT
// 845629

///////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc=new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     int n1=n;
     int n2=n;
     int count=0;
     int a;
     int rotate=n;
     while(n2>0)
     {
         n2=n2/10;
         count++;
     }
     if(k>=0)
     {
         for(int i=0;i<k;i++)
      {
        a=rotate%10;
        rotate=rotate/10;
        rotate = a*(int)Math.pow(10,count-1)+rotate;
      }
      System.out.println(rotate);
     }
     else
     {
       for(int i=k;i<0;i++)
       {
           int b;
           a=rotate/(int)Math.pow(10,count-1);
           b=rotate-(a*(int)Math.pow(10,count-1));
           rotate=b*10+a;
       }
             System.out.println(rotate);
     }
      
    }
}