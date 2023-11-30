import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Tools7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);

		list.add(3);
		
		writeToFile("DataFile.txt",list);

	}
	
	public static File writeToFile(String fName, ArrayList<Integer> list) {
		
		try {
			
		
			//
			//  Reference Type = new Object Type
			// GENERAL --> SPECIFIC 
			File f = new File(fName);
			
			PrintWriter pw = new PrintWriter(f);
			
			for (int i = 0; i < list.size(); i = i + 1) {
				int c = list.get(i);
				pw.println(c);
			}
			
			//pw.close();
			
			return f;
			
		} catch (Exception e) {
			
			return null;
		}
	}
	public static ArrayList<Integer> readFileToList(String fName) {
		
		return null;
	}

}
