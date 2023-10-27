import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		save(new File("FILE3.txt"),"");
		
	}
	
	public static void save(File file, String textToSave) throws IOException  {
		
		PrintWriter pw = new PrintWriter(new FileWriter(file));
		
		//pw.println(textToSave);//this is what writes to the file
		//pw.close();
		
		pw.println("0 0 3 5");
		pw.println("2 3 8 6");
		pw.close();
	}
	
	

}
