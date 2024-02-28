package Class_Basics;

public class B extends C {

	public void w() {
		System.out.println("BW");
	}
	
	public void callW() {
		w();
	}
	
	public void callWAgain() {
		super.w();
	}
}
