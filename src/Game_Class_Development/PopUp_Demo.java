package Game_Class_Development;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PopUp_Demo {

	public static void main(String[] args) throws Exception {
		
		int result = JOptionPane.showConfirmDialog(null,"Do you like fish?");
		System.out.println(result);
		
		PrintWriter pw = new PrintWriter(new FileWriter(new File("town.txt")));
		
		pw.print("file");
		pw.close();
		
	}
}
