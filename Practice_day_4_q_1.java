public class Practice_day_4_q_1 {
    public static void main(String[] args) {
        int arr[]={2,34,12,65,29,45};
        System.out.print("Largest is :");
        int larger=arr[0];
        for (int i : arr) {
            if (i>larger) {
                larger=i;
            }
        }
        System.out.println(larger);
    }
}
