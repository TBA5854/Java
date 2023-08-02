import java.util.Scanner;

public class Assignment_day_q_3 {
    public static void main(String[] args) {
        System.out.println("Enter size of array :");
        Scanner obj=new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element "+i+":");
            arr[i]=obj.nextInt();
        }
        System.out.print("Largest is :");
        int larger=arr[0];
        for (int i : arr) {
            if (i>larger) {
                larger=i;
            }
        }
        System.out.println(larger);
        System.out.print("Smallest is :");
        int smaller=arr[0];
        for (int i : arr) {
            if (i<smaller) {
                smaller=i;
            }
        }
        System.out.println(smaller);
        obj.close();
    }
}
