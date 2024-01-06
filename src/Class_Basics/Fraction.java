package Class_Basics;

public class Fraction {

//************FIELDS************
	int num;
	int den;

	
//*************CONSTRUCTORS**********
	public Fraction() {
		
		num = 1;
		den = 1;
		
	}
	
	public Fraction(int n, int d) {
		
		num = n;
		
		if (d != 0) {
			den = d;
		}
		else {
			den = 1;
		}
		
	}
	
	
	public Fraction(Fraction f) {
		
		this.num = f.num;
		this.den = f.den;
		
	}
	
	
	
	
	
//******************METHODS****************
	
	public void reduce() {
		
		//Step 1: Find GCF of num and den
		
		int gcf = 1;
		int m = Math.min(num,den);
		
		for (int i = m; i > 1; i = i + 1) {
			
			if (num % i == 0 && den % i == 0) {
				num = num /i;
				den = den /i;
				return;
			}
		}
		//Step 2: divide both num and den by GCF
	}
	
	public Fraction findLarger(Fraction other) {
		
		if (this.num/(this.den*1.0) > 1.0*other.num/other.den ) {
			return this;
		}
		return other;
		
	}
	
	public Fraction copyLarger(Fraction other) {
		
		if (this.num/(this.den*1.0) > 1.0*other.num/other.den ) {
			Fraction temp = new Fraction(this.num,this.den);
			return temp;
		}
		Fraction temp = new Fraction(other.num,other.den);
		return temp;
		
	}
	
	public boolean equals(Fraction other) {
		
		if (this.num == other.num && this.den == other.den) {
			return true;
		}
		return false;
	}
}
