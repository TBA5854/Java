import java.util.Scanner;

public class Assignment_day_4_q_1 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter your string \n>>");
        String usr = obj.nextLine();
        System.out.print("Enter your character \n>>");
        char character = obj.nextLine().charAt(0);
        char arr[]=usr.toCharArray();
        int sum=0;
        for (char c : arr) {
            if (c==character) {
                sum+=1;
            }
        }
        System.out.println("The number of "+character+" in "+usr+" is "+sum);
        obj.close();
    }
}
