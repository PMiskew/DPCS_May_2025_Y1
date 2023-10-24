import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		save(new File("t3.txt"),"B");
		
	}
	
	public static void save(File file, String textToSave) throws IOException  {
		
		PrintWriter pw = new PrintWriter(new FileWriter(file));
		
		pw.println(textToSave);//this is what writes to the file
		pw.close();
	}
	
	

}
