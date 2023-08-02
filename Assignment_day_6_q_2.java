import java.util.Scanner;

public class Assignment_day_6_q_2 {
    static int factorial(int num)
    {
        if (num!=1)
        {
            num*=factorial(num-1);
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter number to apply factorial : ");
        int usr=obj.nextInt();
        obj.close();
        System.out.println("Factorial is "+factorial(usr));
    }
}
