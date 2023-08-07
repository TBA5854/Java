package tba5854;

import java.util.Scanner;

public class Back {
    
void back()
{
	Scanner obj = new Scanner(System.in);
	System.out.print("\nType \"back\" to go previous page\n>>");
	String st=obj.nextLine();
	String b="back";
	if (st.equals(b))
	{
		System.out.print("\n");
	}
	else
	{
		System.out.print("Invalid input , program is exiting !!!");
		System.exit(1);
	}
	obj.close();
}
}
