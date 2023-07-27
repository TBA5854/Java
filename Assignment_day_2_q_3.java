public class Assignment_day_2_q_3 {
    public static void main(String[] args) {
        int a=10;
        int b=50;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a-b);
        a=100;
        b=120;
        int c=29;
        System.out.println(a&b|a - c);
        System.out.println(a-c|b);
        System.out.println(b&c^a);
        System.out.println(c^b-b);
    }
}