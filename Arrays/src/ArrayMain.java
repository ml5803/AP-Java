public class ArrayMain {

	public static void main(String[] args) {
		//This is how you time how quickly a computer processes information;
		long startTime = System.currentTimeMillis();
		String[] someStrings = new String[100];
		populateArray(someStrings);
		
		changeString(someStrings[99]);
		
		printArray(someStrings);
		long endTime = System.currentTimeMillis();

		System.out.println("Completed time in " + (endTime-startTime) + " milliseconds");
	}

	private static void changeString(String s){
		s = "This string has been changed";
	}
	
	private static void printArray(String[] str) {
		for(String a: str){
			System.out.println(a);
		}
	}


	private static void populateArray(String[] str) {
		for (int index = 0; index < str.length; index++){
			str[index]="value" + (index+1);
		}
	}


	public static void arrayIntroMethod(){
		//construct 2 integer arrays
		//those two methods do the same thing
		//primitive type arrays fill with ZEROES: 0,0.0,false;
		int[] zeros1= {0,0,0};
		int[] zeros2 = new int[3];
		//example
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		// FIRST METHOD : FOR LOOP
		//	the index of the data is important to reference
		//	you need to customize how you iterate
		//		increase by 2, go backwards etc	
		for(int index = 0; index< booleans.length;index++){
			System.out.println(index+" )" + booleans[index]);
		}
		for(boolean b: booleans){
			System.out.println(""+b);
		}

		//these two constructors are different
		String[] strings1={"","",""};
		String[] strings2=new String[3];

		

		//SECOND METHOD : FOR EACH
		//always goes in order, does not keep track of index
		//easier to type
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}
}