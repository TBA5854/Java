package tba5854;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Delete {
    void delete () throws FileNotFoundException{
        File f = new File ("Contacts.csv");
        File tmp = new File (".tmp.csv");
        FileWriter fw = new FileWriter(f);
        FileWriter tmpw = new FileWriter(tmp);
	if (!f.exists()) {
		System.out.println("NO FILE FOUND , TRY CREATING");
		return;
	}
    Scanner obj = new Scanner(System.in);
    Read rd = new Read();
    rd.read();
    System.out.print("\nEnter contact's sno number to delete");
    int no= obj.nextInt();
    Scanner fr = new Scanner(f);
    String test;
    while(fr.hasNextLine())
    {
        test=fr.nextLine();
        if (test.split(",")[0])==no {
            break
        }
    }
    }
}
//to complete