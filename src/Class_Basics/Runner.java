package Class_Basics;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		a.w();  //AW
		a.callW(); //AW
		a.callWAgain(); //CW
		
		//GOOD: 
		B ba = new A();
		
		
		C a2 = new A();
		((A)(a2)).aMethod();
		
		
		
		
	}

}
