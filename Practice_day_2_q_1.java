import java.util.Scanner;
public class Practice_day_2_q_1 {
	void another_prgm(int a , int b)
	{
		System.out.println("Operations output :");
		System.out.println(a+b);
System.out.println(a*b);

System.out.println(a/b);

System.out.println(a%b);

System.out.println(a<<1); 
System.out.println(b>>1);

System.out.println((a<b) & (b>a));

System.out.println((a==b) | (a>b)); 
System.out.println(a!=b);
	}
	
		public static void main(String[] args) {

int a=3,b=2;

System.out.println(a+b);
System.out.println(a*b);

System.out.println(a/b);

System.out.println(a%b);

System.out.println(a<<1); 
System.out.println(b>>1);

System.out.println((a<b) & (b>a));

System.out.println((a==b) | (a>b)); 
System.out.println(a!=b);
Scanner obj= new Scanner(System.in);
System.out.print("Enter 2 numbers:\n");
Practice_day_2_q_1 test = new Practice_day_2_q_1();
test.another_prgm(obj.nextInt(),obj.nextInt());
obj.close();	}
}