import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n-2;i++)
        {
                    int c=a+b;
         System.out.println(c);
         a=b;
         b=c;
        }
    }
    }