import java.util.Scanner;
public class Assignment_day_3_q_3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int num1 = obj.nextInt();
		System.out.print("Enter 2nd number : ");
		int num2 = obj.nextInt();
		int p=0,q=0,r=0;
		if(num1>num2)
		{
			p=num1;
			q=num2;
		}
		else
		{
			q=num1;
			p=num2;
		}
		r=q;
		while(r!=0)
		{
			q=r;
			r=p%q;
			p=q;
		}
		System.out.println("GCD is : "+q+" and LCM is : "+num1*num2/q);
		obj.close();
	}
}