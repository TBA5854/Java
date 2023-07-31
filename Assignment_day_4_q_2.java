import java.util.Scanner;

public class Assignment_day_4_q_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your 1st string \n>>");
        String str1= new String(obj.nextLine());
        System.out.print("Enter your 2nd string \n>>");
        String str2= new String(obj.nextLine());
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        obj.close();
        for (char c : arr2) {
            for (char d : arr1) {
                if (d==c) {
                    d='';
                }
            }
        }
    }
}
