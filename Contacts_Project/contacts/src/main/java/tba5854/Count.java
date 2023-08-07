package tba5854;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
    int count() throws FileNotFoundException
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
}
}
