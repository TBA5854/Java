/* 1. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their salary and year of service and print the net bonus amount.
2. Take values of length and breadth of a rectangle from user and check if it is square or not.
3. Take two int values from user and print greatest among them.
4. A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
5. Take input of age of 3 people by user and determine oldest and youngest among them.
6. Write a program to print absolute value of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/
import java.util.Scanner;
public class Extra_q_day_1 {
    void age()
    {
        Scanner obj = new Scanner(System.in);
		System.out.print("Enter your 1st member's age :\n>>");
		int a = obj.nextInt();
		System.out.print("Enter your 2nd member's age :\n>>");
		int b = obj.nextInt();
		System.out.print("Enter your 3rd member's age :\n>>");
		int c = obj.nextInt();
        if (a > b) {
            if (c > a) {
                System.out.println("person with age " + c + " is older");
			} else {
				System.out.println("person with age " + a + " is older");
			}
            if (c > b) {
				System.out.println("person with age " + b + " is younger");
			} else {
				System.out.println("person with age " + c + " is younger");
			}
		} else {
			if (c > b) {
				System.out.println("person with age " + c + " is older");
			} else {
				System.out.println("person with age " + b + " is older");
			}
            if (c > a) {
                System.out.println("person with age " + a + " is younger");
			} else {
				System.out.println("person with age " + c + " is younger");
            }
        }
		obj.close();
    }
    void absolute()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your number \n>>");
        int num=obj.nextInt();
        System.out.print("Absolute value is : ");
        if ( num < 0 ) 
        {
            System.out.println(num*-1);            
        }
        else
        {
            System.out.println(num);
        }
        obj.close();
    }
    void grade()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your mark\n>>");
        int num=obj.nextInt();
        System.out.print("Your grade is : ");
        if ( num < 25 ) 
        {
            System.out.println("F");
        }
        else if ( num < 45 ) 
        {
            System.out.println("E");
        }
        else if ( num < 50 ) 
        {
            System.out.println("D");
        }
        else if ( num < 60 ) 
        {
            System.out.println("C");
        }
        else if ( num < 80 ) 
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("A");
        }
        obj.close();
    }
    void bonus()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your Salary \n>>");
        int salary=obj.nextInt();
        System.out.print("How many years have you worked here ? \n>>");
        int year=obj.nextInt();
        if ( year > 5 ) 
        {
            System.out.println("Your Bonus is "+(float)salary/20);            
        }
        else
        {
            System.out.println("Workk HArd to earn bonus!!!");
        }
        obj.close();
    }
    void square()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter length \n>>");
        int length=obj.nextInt();
        System.out.print("Enter breadth\n>>");
        int breadth=obj.nextInt();
        if ( length==breadth ) 
        {
            System.out.println("Square");            
        }
        else
        {
            System.out.println("Rectangle");
        }
        obj.close();
    }
    void greatest_num()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your 1st number \n>>");
        int num_1=obj.nextInt();
        System.out.print("Enter your 2nd number \n>>");
        int num_2=obj.nextInt();
        if ( num_1 > num_2 ) 
        {
            System.out.println(num_1+" is bigger");            
        }
        else
        {
            System.out.println(num_2+" is bigger");
        }
        obj.close();
    }
    public static void main(String[] args) {
        Extra_q_day_1 test = new Extra_q_day_1();
        System.out.println("Choose your program");
        System.out.println("1.Bonus calculator");
        System.out.println("2.Is it a SQUARE !?");
        System.out.println("3.Find the greatest number");
        System.out.println("4.Grade System");
        System.out.println("5.Find Oldest and Youngest Among Us");
        System.out.println("6.Absolute value finder");
        System.out.print("Enter your choice :\n>>");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		switch (a)
		{
			case 1:
            test.bonus();
			break;
			case 2:
            test.square();
			break;
			case 3:
            test.greatest_num();
			break;
            case 4:
            test.grade();
			break;
			case 5:
            test.age();
			break;
			case 6:
            test.absolute();
			break;
            default:
            System.out.println("Invalid option");
		}
		obj.close();
    }
}
