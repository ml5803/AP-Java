package caveExplorer;

public class CaveExplorer {
	// "final" never changes
	// constants are public and ALL-CAPS
	// example Math.PI;
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	private String description;
	private String directions;
	private String contents;
	private String defaultContent;
	private CaveRoom[] borderingRooms;
	private Door[] doors;
} 
