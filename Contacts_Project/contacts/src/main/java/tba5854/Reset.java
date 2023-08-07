package tba5854;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reset {
    void delete () throws IOException{
    File f = new File ("Contacts.csv");
	if (!f.exists()) {
		System.out.println("NO FILE FOUND , TRY CREATING");
		return;
	}
    f.delete();
    f.createNewFile();
    FileWriter fw = new FileWriter(f);
    fw.write("SNO,NAME,PHONE_NUMBER\n");
    fw.close();
    }
}
