public class Practice_day_3_q_1 {
	public static void main(String[] args) {
		int a=0;
		if (a==0)
		{
			a+=1;
			System.out.println("if block activated (from if) !");
		}
		if (a==0)
		{
			a+=1;
			System.out.println("if block activated (from if else) !");
		}
		else
		{
			a+=1;
			System.out.println("else block activated (from if else) !");
		}
		if (a==0)
		{
			a+=1;
			System.out.println("if block activated (from if else) !");
		}
		else if (a==2)
		{
			a+=1;
			System.out.println("else if block activated (from else if else) !");
		}
		while (a==3)
		{ a+=1;
		System.out.println("While block activated");
		}
		do
		{
			a+=1;
			System.out.println("Do while block activated");
		}while (a!=a);
		for(a=a;a<=5;a++)
		{
			System.out.println("For block activated");
		}
		switch(a)
		{
			case 1:
			System.out.println("Switch block , case 1 activated");
			break;
			case 2:
			System.out.println("Switch block , case 2 activated");
			break;
			case 3:
			System.out.println("Switch block , case 3 activated");
			break;
			case 4:
			System.out.println("Switch block , case 4 activated");
			break;
			case 5:
			System.out.println("Switch block , case 5 activated");
			break;
			case 6:
			System.out.println("Switch block , case 6 activated");
			break;
			case 7:
			System.out.println("Switch block , case 7 activated");
			break;
		}
	}
}