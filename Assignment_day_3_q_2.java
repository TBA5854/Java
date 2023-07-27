import java.util.Scanner;

public class Assignment_day_3_q_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    
        System.out.print("Are you a Male or Female ? (M/F)\n>>");
        char gender = obj.nextLine().charAt(0);
        System.out.print("Enter your age \n>>");
        int age=obj.nextInt();
        if (gender=='M') {
            if (age>62) {
                System.out.println("You are retired");
            } else {
                System.out.println("You aren't retired");
            }
        } else {
            if (age>60) {
                System.out.println("You are retired");
            } else {
                System.out.println("You aren't retired");
            }
        }
        obj.close();    
}
}