import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        int x = 15;
        int y = 10;
        int sum=x+y;
        // sum = x+y;
        System.out.println(sum);
        int prd = x*y;
        System.out.println("Product of "+x+" and "+y+" is "+prd);
        int v1=x/y;
        int v2=y/x;
        int v3=x%y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        // int v4=x*y/x+y;
        int v4 = (x*y)/(x+y);
                System.out.println(v4);
                System.out.println(Math.pow(2,3));
                int a = (int)Math.pow(2,3);
                System.out.println(a);

    }
    }