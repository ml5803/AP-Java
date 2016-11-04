package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayIntro {

	public static String[][] arr2D;
	public static String[][] pic; //starter code
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main(String[] args) {

		//rows, columns
		arr2D= new String[5][4];
		pic = new String[5][4];

		//in each row, go col by col
		for(int row= 0; row<arr2D.length;row++){
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col]= "(" + row +"," + col +")";
			}
		}
		//start positions
		i = 2;
		j = 3;
		in = new Scanner(System.in);
		printPic(pic);
		startExploring();
	}

	private static void startExploring() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("You are in room " + arr2D[i][j] );
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			while (!isValid(input)){
				System.out.println("Please enter w, a ,s or d");
				input = in.nextLine();
			}
			interpretInput(input);
		}
	}

	private static void interpretInput(String input) {
		// TODO Auto-generated method stub
		int iOrig = i;
		int jOrig = j;
		if (input.equals("w") && i > 0) i--;
		if (input.equals("a") && j > 0) j--;
		if (input.equals("s") && i+1 < arr2D.length) i++;
		if (input.equals("d") && j+1 < arr2D[0].length) j++;
		
		if (iOrig == i && jOrig==j){
			System.out.println("YOU. SHALL. NOT. PASS! I mean you are running into a wall.");
		}
	}

	private static boolean isValid(String input) {
		// TODO Auto-generated method stub
		String lc = input.toLowerCase();
		String[] keys = {"w","a","s","d"};
		for (String key: keys){
			if(key.equals(lc)) return true;
		}
		return false;
	}	
	
	public static void printPic(String[][] arr){
		for(int i = 0; i<arr.length; i++){
			for (int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
}
