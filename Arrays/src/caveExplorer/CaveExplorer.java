package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	
	public static CaveRoom caves[][];
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;
	
	public static void main(String[] args){
		in = new Scanner(System.in);
		caves = new CaveRoom[5][5];
		for(int r=0; r<caves.length;r++){
			for(int c=0;c<caves[r].length;c++){
				caves[r][c] = new CaveRoom("This cave has coords ("+r+","+c+")!");
			}
		}
		
		caves[0][2]= new EventRoom("This is the room where the guy with a tail met you.");
		new GameStartEvent();
		currentRoom = caves[0][1];
		currentRoom.enter();
		caves[0][1].setConnection(CaveRoom.EAST,caves[0][2],new Door());
		caves[0][2].setConnection(CaveRoom.SOUTH,caves[1][2],new Door());
		caves[1][2].setConnection(CaveRoom.SOUTH,caves[2][2],new Door());
		
		startExploring();
	}

	public static void startExploring() {
		while(true){
			//System.out.println(inventory.getDescription());
			System.out.println(currentRoom.getDescription());
			System.out.println("Angry Mushrooms incoming.");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
		
	}

	public static void print(String str){
		System.out.println(str);
	}
}