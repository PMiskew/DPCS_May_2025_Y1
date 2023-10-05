
public class $PM_Runner {

	public static void main(String[] args) {
	
		
		
		//************************Test findMiddle**********************
		
		int[] nums1 = {-1,-2,-3};
		int[] nums2 = {};
		int[] nums3 = {99,21,-9,6};
		
		
		int result1 = $PM.findMax(nums1);  //expect 3
		int result2 = $PM.findMax(nums2);  //expect 0
		int result3 = $PM.findMax(nums3);  //99
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		//With your first assignment I will be checking test cases
		//Testing is a very important aspect of computer science. 
		
	
		//************************Test findMiddle**********************
		/*
		System.out.println("Test findMiddle");
		
		String findMiddle_T1 = $PM.findMiddle("Paul");
		System.out.println(findMiddle_T1);
		
		String findMiddle_T2 = $PM.findMiddle("Malcolm");
		System.out.println(findMiddle_T2);
		
		String findMiddle_T3 = $PM.findMiddle("");
		System.out.println(findMiddle_T3);
		
		//*/
		//************************Test pullN**********************
		
		/*
	
		System.out.println("TEST pullN");
		
		String pull_T1 = $PM.pullN("Paul", 2);
		System.out.println(pull_T1);  //expect "PA"
		
		String pull_T2 = $PM.pullN("Paul", 6);
		System.out.println(pull_T2); //expect "Paul"
		
		String pull_T3 = $PM.pullN("Paul", 0);
		System.out.println(pull_T3); //expect ""
		
		String pull_T4 = $PM.pullN("", 0);
		System.out.println(pull_T4); //expect ""
		
		String pull_T5 = $PM.pullN("", 3);
		System.out.println(pull_T5); //expect ""
		
		//*/
		
		
	}

}
