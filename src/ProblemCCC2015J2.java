import java.util.Scanner;

public class ProblemCCC2015J2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		String sh = input.replaceAll(":-\\)","");
		String ss = input.replaceAll(":-\\(","");
		int shl = sh.length();
		int ssl = ss.length();
		
		System.out.println(shl+" "+ssl);
		if (shl < ssl) {
			System.out.println("happy");
		}
		else if (shl > ssl) {
			System.out.println("sad");
		}
		else if (ssl == shl) {
			System.out.println("unsure");
		}
		else {
			System.out.println("none");
		}
	}
}
