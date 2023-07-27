import java.util.Scanner;

public class Assignment_day_3_q_5{
    public static void main(String[] args) {
        int sum=0;
        int usr;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("Enter your number : ");
            usr=obj.nextInt();
            sum+=usr;
        } while (usr>=0);
    System.out.println("::"+(sum-usr));
    obj.close();
    }
}