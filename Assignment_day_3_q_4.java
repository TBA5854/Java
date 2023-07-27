import java.util.Random;
import java.util.Scanner;

public class Assignment_day_3_q_4 {
    public static void main(String[] args) {
        Random rand =new Random();
        Scanner obj = new Scanner(System.in);
        int rand_int=rand.nextInt(101);
        int usr =0;
        while (usr!=rand_int) {
            usr=obj.nextInt();
            if (usr>rand_int) {
                System.out.println("Too High");
            } else if(usr<rand_int) {
                System.out.println("Too Low");
            }
        }
        System.out.println("Correct");
        obj.close();
    }
}
