/*1.Write a program to check whether a number is divisible by 7 or not.
2.Write a program to reverse a number. i/p=7865  o/p=5687
(Hint: any number % will return the last digit).
3.Write a program to check whether the last digit of a number (entered by user) is divisible by 3 or not.
4.Write a program to check whether a person is senior citizen or not.
5.Write a program to check a character is vowel or not.*/

import java.util.Scanner;
public class Extra_q_day_2 {
    void div_by_7()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your number \n>>");
        int num_1=obj.nextInt();
        if (num_1%7==0) {
            System.out.println("Divisible by 7 ");
        }
        else
        {
            System.out.println("Not divisible by 7");
        }
        obj.close();
    }
    void reverse()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your number \n>>");
        long num_1=obj.nextInt();
        System.out.print("Reversed number is :");
        while (num_1!=0) {
         System.out.print(num_1%10);
         num_1/=10;   
        }
        obj.close();
    }
    void last_no_div_by_3()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your number \n>>");
        int num_1=obj.nextInt();
        if ((num_1%10)%3==0) {
            System.out.println("Last number divisible by 3");
        }
        else
        {
            System.out.println("Last number not divisible by 3");
        }
        obj.close();
    }
    void senior_citizen()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your age \n>>");
        int num_1=obj.nextInt();
        if (num_1>=60) {
            System.out.println("You are a senior citizen");
        }
        else
        {
            System.out.println("You are not a senior citizen");
        }
        obj.close();
    }
    void vowel_checker()
    {
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
            System.out.println(character+" is not a vowel");
        }
        obj.close();
    }
    public static void main(String[] args) {
        Extra_q_day_2 test = new Extra_q_day_2();
        System.out.println("Choose your program");
        System.out.println("1.Is it divisible by 7 ?");
        System.out.println("2.Number Reverser");
        System.out.println("3.Is the last number divisible by 3 ?");
        System.out.println("4.Are you a senior citizen");
        System.out.println("5.Is it a vowel");
        System.out.print("Enter your choice :\n>>");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		switch (a)
		{
			case 1:
            test.div_by_7();
			break;
			case 2:
            test.reverse();
			break;
			case 3:
            test.last_no_div_by_3();
			break;
            case 4:
            test.senior_citizen();
			break;
			case 5:
            test.vowel_checker();
			break;
            default:
            System.out.println("Invalid option");
		}
		obj.close();
        
    }
}
