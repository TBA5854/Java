import java.util.Scanner;

public class Assignment_day_3_q_6 {
    boolean prime(int num)
    {
        boolean is_it_a_prime=true;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                is_it_a_prime=false;
                break;
            }
        }
        return is_it_a_prime;
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your starting number : ");
        int range_start=obj.nextInt();
        System.out.println("Enter your ending number : ");
        int range_end=obj.nextInt();
        Assignment_day_3_q_6 test = new Assignment_day_3_q_6();
        boolean found=false;
        for (int i = range_start; i <=range_end; i++) {
            if(test.prime(i))
            {
                System.out.println("1st prime is : "+i);
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("No prime numbers in the given range");
        }
        obj.close();
    }
}
