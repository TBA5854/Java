import java.util.Scanner;
import java.io.*;
public class Contacts {


/*
void start()
{
	Scanner obj = new Scanner(f);
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
	int ch=onj.nextInt();
	switch (ch)
	{
	case 1:
	System.out.print("\n\tRead Contacts\n\n");
read_c();
	System.out.print("\nOperation Comleted\n");
	back();
	start();
	break;
	case 2:
	System.out.print("\n\tAppend Contacts\n\n");
writ_c();
	System.out.print("\nOperation Comleted\n");
	back();
	start();
	break;
	case 3:
	System.out.print("\n\tCount Contacts\n\n");
    System.out.print("Number of contacts are :%d\n",count());
	System.out.print("\nOperation Comleted\n");
	back();
	start();
	break;
	case 4:
	System.out.print("\n\tExport Contacts\n\n");
	export_vcf();
	System.out.print("\nOperation Comleted\n");
	back();
	start();
	break;
	case 5:
	System.out.print("\n\tDelete a Contact\n\n");
del();
	System.out.print("\nOperation Comleted\n");
	back();
	start();
	break;
	case 6:
	menu();
	break;
	case 7:
	System.out.print("\n\tReset CSV\n\n");
	reset();
	System.out.print("\nOperation Comleted\n");
	back();
	start();
	break;
	case 8:
	end();
	default:
	System.out.print("Invalid input , program is exiting !!!");
	exit(0);
	}
}*/
	public static void main(String[] args)throws IOException , FileNotFoundException {
		File f= new File("Contacts.csv");
		
		
		if(!f.exists())
		{
			f.createNewFile();
			FileWriter fw=new FileWriter(f);
			fw.write("SNO,NAME,PHONE NUMBER\n");
			fw.close();
		}
		
	}
}