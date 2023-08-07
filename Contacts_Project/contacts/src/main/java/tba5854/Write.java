package tba5854;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Write {
    void Contacts_write() throws IOException
    {
        File f = new File("Contacts.csv");
        Count counter = new Count();
        FileWriter fw=new FileWriter(f);
        Scanner obj = new Scanner(System.in);
        System.out.print("How many number of contacts you wish to append ?\n>>");
        int range=obj.nextInt();
        for (int i = 1; i <= range; i++) {
            int contact_no=counter.count();
            System.out.print("Enter contact no "+i+" Name : ");
            String name=obj.nextLine();
            System.out.print("Enter contact no "+i+" Phone Number : ");
            int number=obj.nextInt();
            fw.write(contact_no+","+name+","+number+"\n");
            fw.flush();
            System.out.println("\nContact "+i+" written successfully\n");
        }
		fw.close();        
        obj.close();
    }
}
