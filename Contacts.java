import java.util.Scanner;
import java.io.*;
public class Main {
	void end()
{
		System.out.print("\t\tThanks for Trying this program \n\n\t\t  A Program by TBA5854\n");
		System.exit(0);
}
void info()
{
	System.out.print("1.This is a Contacts program\n");
	System.out.print("2.This program can store , count , read contacts in csv file and them export all as vcf\n");
	System.out.print("3.Only enter option number\n");
	System.out.print("4.Never enter a alphabet unless asked to do so\n");
	System.out.print("5.Never type space in names\n");
	System.out.print("6.For 1st time use , create CSV before\n doing anything ");
	System.out.print("7.If Contacts become corrupted , try resetting csv");
}
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
void read()throws FileNotFoundException
{
	File f = new File ("Contacts.csv");
	Scanner obj = new Scanner(f);
	while (obj.hasNext())
	{
		for(String word:obj.nextLine().split(" "))
		{
			System.out.println(word);
		}
	}
	obj.close();
}
int count()throws FileNotFoundException
{
	File f = new File ("Contacts.csv");
	Scanner obj = new Scanner(f);
	int count=0;
	while (obj.hasNext())
	{
		obj.nextLine();
		count++;
	}
	obj.close();
	return count-1;
}/*
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