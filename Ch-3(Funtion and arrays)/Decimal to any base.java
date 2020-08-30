// QUESTION
// 1. You are given a decimal number n.
// 2. You are given a base b.
// 3. You are required to convert the number n into its corresponding value in base b.

// SAMPLE INPUT 
// 57
// 2

// SAMPLE OUTPUT
// 111001

/////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int rem=0;
       int n1=n;
       while(n1>0){
           int a=(n1/b);
       rem = (rem*10)+(n1-(a*b));
       n1=n1/b;
       }
       int rev=0;
       int orig;
       orig = rem;
       while(orig>0){
           rev=rev*10+(orig%10);
           orig=orig/10;
       }
       return rev;
   }
}

// Code By Kshitiz Goel