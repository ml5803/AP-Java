
public class ArrayTests {

	public static int[] populateArray50(){
		int[] arr = new int[50];
		for(int i = 0; i<arr.length; i++){
			arr[i] = i+1;
		}
		return arr;
	}
	
	public static int[] populateArrayRandom(){
		int[] arr = new int[50];
		for(int i: arr){
			i = (int)(Math.random()*123);
		}
		return arr;
	}
		
	public static String[] cardGen(){
		String[] cards = new String[52];
		String[] suits = {" of Diamonds", " of Clubs ", " of Hearts ", " of Spades"};
		String[] numbers = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		/*for(int s = 0; s<suits.length; s++){
			for (int n = 0; n < numbers.length; n++){
				cards[(s*n)] = numbers[n] + suits[s];
			}
		}*/
	    int sCount = 0;
		int nCount = 0;
		for (int c = 0; c<cards.length; c++){
			if(c<13){
				sCount=0;
			}
			
			if (c<26 && c>=12){
				sCount=1;
			}
			
			if (c<39 && c>=25){
				sCount=2;
			}
			
			for (int n = 0; n < numbers.length; n++){
				cards[c] = numbers[n] + suits[sCount];
			}
		}
		return cards;
	}
	
	public static void printIntArray(int[] intArr){
		for(int i = 0; i<intArr.length;i++){
			System.out.println("The index is " + i + " The value is " + intArr[i]);
		}
	}
	
	public static void printStringArray(String[] stringArr){
		for(int i = 0; i<stringArr.length;i++){
			System.out.println("The index is " + i + " The value is " + stringArr[i]);
		}
	}
}

