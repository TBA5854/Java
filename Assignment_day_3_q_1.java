import java.util.Scanner;

public class Assignment_day_3_q_1{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your character \n>>");
        char character=obj.next().charAt(0);
        char vowels[]={'a','e','i','o','u','A','E','I','O','U'};
        boolean is_it_a_vowel=false;
        for (char i : vowels ) {
            if (character==i) {
                is_it_a_vowel=true;
                break;
            }
        }
        if (is_it_a_vowel) {
            System.out.println(character+" is a vowel");
        } else {
            System.out.println(character+" is a consonant");
        }
        obj.close();
    }
}