import java.util.Arrays;
import java.util.Scanner;

public class SecretCode {

	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		//String sentence = s.nextLine();
		
		String sentence = "Another Sunrise Another New Beginning 1234 5678";
		String[] words = sentence.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		
		//encryption 1: Reverse String
		String temp1 = "";
		for (int i = words[0].length() - 1; i >= 0; i = i - 1) {
			temp1 = temp1 + words[0].charAt(i);
		}
		
		words[0] = temp1;
		System.out.println(words[0]);
		
		//Encryption 2: Character Shift
		
		String temp2 = "";
		int l2 = words[1].length();
		temp2 = temp2 + words[1].charAt(l2-1);
		
		for (int i = 1; i < words[1].length() - 1; i = i + 1) {
			char c = (char)((int)(words[1].charAt(i)) - 3);
			temp2 = temp2 + c;
		}
		temp2 = temp2 + words[1].charAt(0);
		words[1] = temp2;
		
		System.out.println(temp2);
		
		
		//Encryption 3: Stars and U
		int cf = (int)(words[2].charAt(0));
		int l3 = words[2].length();
		int cl = (int)(words[2].charAt(l3 - 1));
		String temp3 = "";
		
		//check if first letter is upper case
		if (cf >= 65 && cf <= 90) {
			temp3 = "U";
		}
		else {
			temp3 = "u";
		}
		
		for (int i = 1; i < l3 - 1; i = i + 1) {
			temp3 = temp3 + "*";
			
		}
		
		if (cl >= 65 && cl <= 90) {
			temp3 = temp3 + "U";
		}
		else {
			temp3 = temp3 + "u";
		}
		
		words[2] = temp3;
		System.out.println(temp3);
		
		
		//Encryption 4:
		
		int num = 0;
		int l4 = words[3].length();
		
		num = (int)(Math.random()*l4*300 + 151);
		String temp4 = "" + num;
		words[3] = temp4;
		System.out.println(temp4);
		
		//Encryption 5:
		
		String temp5 = "";
		int l5 = words[4].length();
		
		//Why do I need the "";
		temp5 = ""+ words[4].charAt(l5 - 2) + words[4].charAt(l5 - 1);
		
		for (int i = 0; i < l5 - 2; i = i + 1) {
			temp5 = temp5+words[4].charAt(i);
		}
		
		words[4] = temp5;
		System.out.println(temp5);
		
		//Encryption 6:
		int temp6 = Integer.parseInt(words[5]);
		temp6 = temp6 - 20000;
		temp6 = Math.abs(temp6);
		
		words[5] = "" + temp6;
		System.out.println(temp6);
		
		//Encryption 7:
		double temp7 = Integer.parseInt(words[6]);
		temp7 = Math.sqrt(temp7);
		temp7 = Math.round(temp7);
		
		words[6] = "" + (int)(temp7);
		System.out.println(temp7);
		
		System.out.println(Arrays.toString(words));
		
		
	}
}
