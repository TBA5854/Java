package tba5854;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Back back = new Back();
        Read read = new Read();
        Info info = new Info();
        End end = new End();
        Count count = new Count();
        Write write = new Write();
        Scanner obj = new Scanner(System.in);
        Export_VCF export=new Export_VCF();
        Delete del = new Delete();
	System.out.print("\n\tContacts\n\n");
	System.out.print("1.Read Contacts\n");
	System.out.print("2.Append Contacts\n");
	System.out.print("3.Count number of contacts saved\n");
	System.out.print("4.Export Contacts\n");
	System.out.print("5.Delete a contact\n");
	System.out.print("6.Reset/Create CSV\n");
	System.out.print("7.Go back to menu\n");
	System.out.print("8.Exit\n");
	System.out.print(">>");
	int ch=obj.nextInt();
	switch (ch)
	{
	case 1:
	System.out.print("\n\tRead Contacts\n\n");
read.read();
	System.out.print("\nOperation Comleted\n");
	back.back();
	start();
	break;
	case 2:
	System.out.print("\n\tAppend Contacts\n\n");
write.Contacts_write();
	System.out.print("\nOperation Comleted\n");
	back.back();
	start();
	break;
	case 3:
	System.out.print("\n\tCount Contacts\n\n");
    System.out.print("Number of contacts are :"+count.count());
	System.out.print("\n\nOperation Comleted\n");
	back.back();
	start();
	break;
	case 4:
	System.out.print("\n\tExport Contacts\n\n");
	export();
	System.out.print("\nOperation Comleted\n");
	back.back();
	start();
	break;
	case 5:
	System.out.print("\n\tDelete a Contact\n\n");
    del.delete();
	System.out.print("\nOperation Comleted\n");
	back.back();
	start();
	break;
	case 6:
	menu();
	break;
	case 7:
	System.out.print("\n\tReset CSV\n\n");
	reset();
	System.out.print("\nOperation Comleted\n");
	back.back();
	start();
	break;
	case 8:
	end.end();
	default:
	System.out.print("Invalid input , program is exiting !!!");
	System.exit(1);
	}
}
}

