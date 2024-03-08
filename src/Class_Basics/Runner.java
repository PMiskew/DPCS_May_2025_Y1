package Class_Basics;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		a.w();  //AW
		a.callW(); //AW
		a.callWAgain(); //CW
		a.callBW();
		System.out.println("*******");
		//GOOD: 
		A ba = new A();
		ba.w();
		((A)ba).aonly();
		
		//GOOD:
		C a2 = new A();
		((A)(a2)).aMethod();
		
		
		
		
	}

}
