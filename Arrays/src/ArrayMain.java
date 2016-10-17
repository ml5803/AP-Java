public class ArrayMain {

	public static void main(String[] args) {
		//This is how you time how quickly a computer processes information;
		long startTime = System.currentTimeMillis();

		ArrayTests.printStringArray(ArrayTests.cardGen());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed time in " + (endTime-startTime) + " milliseconds");
	}
	
	private static void passByValueDemonstration(){
		String[] someStrings = new String[100];
		populateArray(someStrings);
		
		//In this method, we pass the ELEMENT
		//(a variable) not the array so no change will be made
		// to escape -> use / 
		System.out.println("Before \"changeString\"" + someStrings[99]);
		changeString(someStrings[99]);
		System.out.println("After " + someStrings[99]);
		
		System.out.println("Before \"changeArray\"" + someStrings[99]);
		changeArray(someStrings);
		System.out.println("After " + someStrings[99]);
		
		System.out.println("Before \"changeArrayElements\" " + someStrings[99]);
		changeArrayElements(someStrings,99);
		System.out.println(someStrings[99]);
		
	}

	private static void changeArrayElements(String[] someStrings, int i){
		someStrings[i]="new item" + (i+1);
	}
	
	private static void changeArray(String[] someStrings){
		someStrings= new String[100];
		for (int i=0;i<someStrings.length;i++){
			someStrings[i]= "new item " + (i+1);
		}
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