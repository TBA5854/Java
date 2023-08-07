package tba5854;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
void read()throws FileNotFoundException
{
	File f = new File ("Contacts.csv");
	if (!f.exists()) {
		System.out.println("NO FILE FOUND , TRY CREATING");
		return;
	}
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
}
