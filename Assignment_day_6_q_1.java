import java.util.Scanner;

public class Assignment_day_6_q_1 {
    static double area_of_circle(int radius){
        return radius*radius*3.14;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int usr=obj.nextInt();
        obj.close();
        System.out.println("Area is "+area_of_circle(usr)); 
    }
    
}