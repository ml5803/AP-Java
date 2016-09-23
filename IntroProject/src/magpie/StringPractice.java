package magpie;


import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	static int lineCount;

	public static void main(String[] args) {
		createAScanner();
		lineCount=0;
		promptName();
		talkForever();
	}

	private static void promptName() {
		// TODO Auto-generated method stub
		print("Hello, "+user+ ". I am a board covered with semiconductors and other such electronic components.\n 101010110101? (What is your name?)");
		user = input.nextLine();
		print("Awesome. I will call you " + user + " until you terminate me.");
	}

	public static void talkForever(){
		while (1==1){
			promptInput();
		}
	}

	private static void promptInput(){
		print(user + ", try inputting a String!");
		String userInput = input.nextLine();
		print("You typed:" + userInput);
	}
	public static void createAScanner() {
		input = new Scanner(System.in);
	}

	public static void print(String s){
		// create a multi-line String
		String printString="";
		int cutoff=35;
		//check to see if there are words to add
		//In other words is the length of s > 0

		while(s.length()>0){
			String currentLine ="";
			String nextWord = "";
			//while currentLine and nextWord are less than the cutoff AND there are still words to add, do the following loop
			while(currentLine.length()+ nextWord.length() <=cutoff && s.length()>0){
				//add the next word to the line
				currentLine += nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				//get the following word
				int endOfWord = s.indexOf(" ");
				if (endOfWord == -1){
					endOfWord = s.length() -1;
				}
				//get the next word and space
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
		}

		System.out.println(printString);
	}

	public static void demonstrateStringMethods(){
		String text1 = new String ("Hello World");
		String text2 = "Hello ";
		String text3 = "World";

		if (text1.equals(text2+text3)){
			System.out.println("These strings are equal");
		}

		System.out.println(text1);
		System.out.println(text2+text3);

		String word1 = "Aardvark";
		String word2 = "Zyzzyva";

		if (word1.compareTo(word2) < 0){
			System.out.println("word1 is before word2");
		}
	}
}

