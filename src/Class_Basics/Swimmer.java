package Class_Basics;

import java.util.ArrayList;

public class Swimmer {

	
	private String name;
	private String event;
	private int age;
	private static String club = "UCC";
	private ArrayList<Double> times = new ArrayList<Double>();
	
	public Swimmer(String name, String event, int age) {
		
		this.name = name;
		this.event = event;
		this.age = age;
		
	}
	
	public Swimmer(String n, String e, int a, double[] t) {
		
		name = n;
		event = e;
		age = a;
		
		for (int i = 0; i < t.length; i = i + 1) {
			times.add(t[i]);
		}
		
	}
	
	//get methods
	public String getName() { return name; }
	public String getEvent() { return event; }
	public static String getClub() { return club;}
	public int getAge() { return age; }
	
	
	//set methods: The question didn't state any error checking for values
	//therefore for the purpose of the test none are needed.  However, I have 
	//included some below. Good to understand that setMethods are excellent for 
	//reducing code, speeding up debugging and securing your design by collecting 
	//code in one area.  
	
	public void setName(String n) { name = n; }
	public void setEvent(String e) { event = e; }
	public static void setClub(String c) { club = c; } //this sets all objects club
	public void setAge(int a) { 
		//The question could be something that states a restriction around age. 
		//Here our design would stipulate that Swimmers must be greater than 9
		if (a < 9) {
			age = a;
		}
		else { 
			age = -1; //set age to -1 as an error flag for us. 
		}
	}
	
	//*******OTHER METHODS*************//
	
	public double findAverage() {
		
		double sum = 0; 
		
		for (int i = 0; i < times.size(); i = i + 1) {
			sum = sum + times.get(i);
			
		}
		
		return sum/times.size();
		
		
	}
	
	/*
	 */
	public double findModAverage() {
		
		double sum = findAverage()*times.size();
		
		//If you don't have this you will get an error. 
		if (times.size() == 0) {
			return 0; 
		}
		
		double max = times.get(0);
		double min = times.get(0);
		
		for (int i = 0; i < times.size(); i = i + 1) {
			
			max = Math.max(max, times.get(i));
			min = Math.min(min, times.get(i));
		}
		
		return (sum - max - min)/(times.size() - 2);
		
	}
	
	public void addTime(double time) { times.add(time); }
	
	/*
	 * I have purposely made the parameter name the same as the field
	 * You should be able to explain why this is required in this case. 
	 */
	public void addTime(double[] times) {
		
		for (int i = 0; i < times.length; i = i + 1) {
			this.times.add(times[i]);
			
		}
	}
	

	public static Swimmer findFaster(Swimmer s1, Swimmer s2) {
		

		double s1Min = s1.times.get(0);
		double s2Min = s2.times.get(0);
		
		//You need two loops or some logic to avoid index out of bounds
		//in the case the length of the times for s1 and s2 don't match 
		for (int i = 0; i < s1.times.size(); i = i + 1) {
		
			s1Min = Math.min(s1Min,s1.times.get(i));
			
		}
		
		for (int i = 0; i < s2.times.size(); i = i + 1) {
			
			s2Min = Math.min(s2Min,s1.times.get(i));
			
		}
		
		if (s1Min < s2Min) {
			return s1;  //we are returning a reference to the object not a copy
		}
		return s2;
		
	}
	
	public String printSwimmer() {
		
		String text = "";
		
		for (int i = 0; i < times.size(); i = i + 1) {
			int value = (int)(Math.round(times.get(i)));
			text = text + value +", ";
		}
		
		text = text.substring(0, text.length() - 2); //removes last comma
		
		return text;
		
	}
	
	
	public Swimmer olderSwimmer(Swimmer other) {
		
		if (this.age > other.age) {
			return this;
		}
		return other;
		
	}
	
	/* 
	 * I am really checking here if you understand what it means to return 
	 * a refernce of an object verses a new instance. 
	 * Also, notice I did not use the constructor that takes the times.  This
	 * is because the times are stored as an ArrayList and the constructor takes
	 * an array. 
	 * Finally, notice that I can directly access all fields since I am located in 
	 * class.  
	 */
	public Swimmer copySwimmer() {
		
		Swimmer newSwimmer = new Swimmer(this.name,this.event,this.age);
		
		for (int i = 0; i < this.times.size(); i = i + 1) {
			newSwimmer.times.add(this.times.get(i));
		}
		
		return newSwimmer;
	}
	
	//added this to check averages to proof my code
	public void printTimes() {
		System.out.println(times);
		
	}
	
	public static void main(String[] args) {
		
		
		//This first part sets up the objects so we can code #2
		//create swimmer 1
		
		Swimmer s1 = new Swimmer("swimmer 1","Free",10);
		Swimmer s2 = new Swimmer("swimmer 2","Free",10);
		Swimmer s3 = new Swimmer("swimmer 3","Free",10);
		
		//
		for (int i = 0; i < 10; i = i + 1) {
			double v1 = Math.random()*3 + 20;
			s1.addTime(v1);
			double v2 = Math.random()*3 + 20;
			s2.addTime(v2);
			double v3 = Math.random()*3 + 20;
			s3.addTime(v3);
		}
		Swimmer[] swimmers = {s1,s2,s3};
		//This is a solution to number 2
		
		double fastestAverage = s1.findAverage();
		int index = 0;
		
		//THis is inefficient but fine.  Can you see why? 
		for (int i = 0; i < swimmers.length; i = i + 1) {
			if (swimmers[i].findAverage() < fastestAverage) {
				fastestAverage = swimmers[i].findAverage(); 
				index = i;
			}
		}

		for (int i = 0; i < swimmers.length; i = i + 1) {
			swimmers[i].printTimes();
			System.out.println(swimmers[i].findAverage());
		}
		
		System.out.println(index);
		
		
				
	}
	
	
}
