package caveExplorer;

import java.util.Scanner;

public class CaveRoom {
	public static CaveRoom caves[][];
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;

	public CaveRoom(String description) {
		// TODO Auto-generated constructor stub
	}

	private void enter() {
		// TODO Auto-generated method stub
		//sets up cave when it gets enter
		
	}
	public static void main(String[] args){
		caves = new CaveRoom[5][5];
		
		for(int row = 0; row<caves.length;row++){
			for(int col = 0; col < caves[row].length; col++){
				caves[row][col]=new CaveRoom("This cave has coordinates" + row + "," + col);
			}
		}
		
		currentRoom = caves[0][1];
		currentRoom.enter();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}