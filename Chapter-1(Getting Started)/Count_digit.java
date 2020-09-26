import java.util.Scanner;
// Other imports go here
// Do not change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    }

//Code by Kshitiz Goel
