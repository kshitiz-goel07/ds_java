// QUESTION
// 1. You are given a number n.
// 2. You are given a digit d.
// 3. You are required to calculate the frequency of digit d in number n.

// SAMPLE INPUT 
// 994543234
// 4

// SAMPLE OUTPUT
// 3

/////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count=0;
        int n1=n;
        int a;
        while(n1>0)
        {
        a=n1%10;
        if(a==d)
        {
            count++;
        }
        n1=n1/10;
        }
        return count;
    }
}

// Code By Kshitiz Goel