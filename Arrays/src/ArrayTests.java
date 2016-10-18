
public class ArrayTests {

	public static int[] populateArray50(){
		int[] arr = new int[50];
		for(int i = 0; i<arr.length; i++){
			arr[i] = i+1;
		}
		return arr;
	}
	
	public static int[] populateArrayRandom(int length, int randomNum){
		int[] arr = new int[length];
		for(int i = 0; i<arr.length; i++){
			arr[i] = (int) (Math.random() * (double)randomNum);
		}
		return arr;
	}
		
	public static String[] cardGen(){
		String[] cards = new String[52];
		String[] suits = {" of Diamonds", " of Clubs ", " of Hearts ", " of Spades"};
		String[] numbers = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		int i = 0;
		int sCount = 0;
		while (i<cards.length){
			if(i<13){
				sCount=0;
			}
			if (i>=13 && i<26){
				sCount=1;
			}
			if (i>=26 && i<39){
				sCount=2;
			}
			if (i>=39){
				sCount=3;
			}
			for (int n = 0; n < numbers.length; n++){
				cards[i] = numbers[n] + suits[sCount];
				i++;
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

