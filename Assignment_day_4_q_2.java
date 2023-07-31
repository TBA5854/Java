import java.util.Scanner;
public class Assignment_day_4_q_2 {
	int letter_checker(char letter , char array[])
	{
		int sum=0;
		for (char i: array)
		{
			if (i==letter)
			{
				sum+=1;
			}
		}
		return sum;
	}
public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 1st word : ");
		String str1 = obj.nextLine();
		System.out.println("Enter 2nd word : ");
		String str2 = obj.nextLine();
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		Main test = new Main();
		boolean anagram=true;
		for (char i : arr1)
		{
			if (test.letter_checker(i,arr1)!=test.letter_checker(i,arr2))
			{
				anagram=false;
				break;
			}
		}
			if (anagram)
			{
				System.out.println(str1+" and "+str2+" are anagrams");
			}
			else
			{
				System.out.println(str1+" and "+str2+" are not anagrams");
			}
		obj.close();
}
}