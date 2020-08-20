import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        for(int i =0 ; i <n ; i++)
        {
            System.out.println(i);
        } 
        System.out.println(name);
    }
    }