package chatBot;

import java.util.Scanner;

public class MichaelMain {

	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school;

	public static void main(String[] args) {
		createTopics();
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
		inLoop=true;
		while (inLoop){
			print("Greetings, " + user + ". How are you?");
			response = getInput();
			if (findKeyword(response, "good", 0)){
				print("I'm so happy you are good.");
			}else if(response.indexOf("school") >= 0){
				inLoop = false;//exit this loop
				school.talk();
			}else{
				print("I'm sorry. I don't understand you.");
			}
		}
	}

	public static boolean findKeyword(String searchString, String key, int startIndex) {
		// TODO Auto-generated method stub
		//delete white space
		String phrase = searchString.trim();
		//set to lowercase
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		//find postion of key
		int psn = phrase.indexOf(key);
		//while looking for the word until you find the right context
		while (psn >= 0){
			String before = " ";
			String after = " ";
			// if the phrase does not end with this word
			if (psn + key.length() < phrase.length()){
				after = phrase.substring((psn + key.length()) , (psn+key.length()+1)).toLowerCase();
			}
			
			if (psn > 0){
				before = phrase.substring(psn-1,psn).toLowerCase();
			}
			
			if (before.compareTo("a") < 0 && after.compareTo("a") < 0 ){
				return true;
			}
			// in case the keyword was not found yet, check the rest of the string.
			
			psn = phrase.indexOf(key,psn+1);
		}
		return false;
	}

	private static void promptInput(){
		print(user + ", try inputting a String!");
		String userInput = input.nextLine();
		print("You typed:" + userInput);
	}

	public static void createTopics() {
		input = new Scanner(System.in);
		school = new School();
	}

	public static String getInput(){
		return input.nextLine();
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

