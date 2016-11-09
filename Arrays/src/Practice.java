import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

		boolean [][] mines = new boolean[6][6];
		createMines(mines,10);
		String[][] field = new String[mines.length][mines[0].length];

		matchValues(field, mines);
		//printPic(field);
		makeMap(7,7);
		makeMap3(3,3);
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		// TODO Auto-generated method stub
		for (int row = 0; row < field.length; row++){
			for (int col = 0; col <field[0].length; col++){
				if(mines[row][col]){
					field[row][col]="X";
				}else{
					field[row][col] = countAdjacent(mines, row, col);
				}
			}
		}
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		// r and c represents coordinates of elements we are providing a string for
		int count = 0;
		//		//loop through row above to row below
		//			for (int row = r-1; row <= r+1; row++){
		//			//loop through col left to col right
		//			for (int col = c-1 ; col <c+1; col++){
		//				//exclude this element when counting
		//				if(row!=r && col != c){
		//					if (row >=0 && row < mines.length && col >= 0 && col < mines[row].length){
		//						
		//					}
		//				}
		//			}
		//			
		//			//this method only checks elements in the [][] so it is not necessary to verify they are valid
		//		}

		//		for (int row = 0; row < mines.length; row++){
		//			//check taxi cab distance
		//			for (int col = 0; col < mines[row].length; col++){
		//				if (Math.abs(row-r)+Math.abs(col-c)==1 && mines[row][col]){
		//					//check if true
		//					count++;
		//				}
		//			}
		//		}

		//above
		count+= validAndTrue(mines,r-1,c);
		//below
		count+= validAndTrue(mines,r+1,c);
		//right
		count+= validAndTrue(mines,r,c+1);
		//left
		count+= validAndTrue(mines,r,c-1);
		return count +"";
	}

	private static int validAndTrue(boolean[][] mines, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=0 && i < mines.length && j>=0 && j < mines[0].length && mines[i][j]){
			return 1;
		}else{
			return 0;
		}
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		// TODO Auto-generated method stub
		while(numberOfMines>0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			if (!mines[row][col]){
				mines[row][col] = true;
				numberOfMines --;
			}
		}
	}

	public static void prettyPicture(){
		// TODO Auto-generated method stub
		String[][] pic= new String[10][12];

		//print each row
		for(int row = 1; row<pic.length; row++){
			for (int col = 0; col<pic[row].length; col++){
				pic[row][col] = "      ";
			}
		}

		for(int row = 7; row<pic.length; row++){
			for (int col = 0; col<pic[row].length; col++){
				pic[row][col] = "MMMMMMM";
			}
		}

		//birds
		int count = pickRandom(5,0);
		for(int i = 0; i< count; i++){
			pic[pickRandom(pic.length-3,0)][pickRandom(pic[0].length-5,3)] = "<-(o v o)->";
		}

		//top row is "_"
		for (int col = 0; col < pic[0].length;col++){
			pic[0][col]="_";
			pic[pic.length-1][col]= "_________";

			for(int row = 0;row<pic.length;row++){
				pic[row][0]="|";
				pic[row][pic[0].length-1]="|";
			}

			pic[1][2] = "O";
			pic[0][2] = "|";
			pic[2][2] = "|";
			pic[1][1] = "-";
			pic[1][3] = "-";
			pic[0][1] = "\\";
			pic[2][3] = "\\";
			pic[0][3] = "/";
			pic[2][1] = "/";
			printPic(pic);	
		}
	}

	public static int pickRandom(int upper, int lower){
		return (int)(Math.random()*upper) + lower;
	}


	public static void printPic(String[][] arr){
		for(int i = 0; i<arr.length; i++){
			for (int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void makeMap(int length, int width){
		String[][] map = new String[length][width];
		
		
		for(int i = 0; i<map.length; i++){
			if (i==0){
				for (int j = 0; j<map[0].length; j++){
					System.out.print(" __");
				}
				System.out.println();
			}
			System.out.print("|");
			for (int j = 0; j<map[0].length; j++){
				System.out.print("__|");
			}
			System.out.println();
			//hi
		}
	}
	
	public static void makeMap3(int length, int width){
		int mapLength = length *3;
		int mapWidth = width *3;
		String[][] map = new String[mapLength][mapWidth];
		
		for (int row = 0; row< map[0].length; row++){
			if (row == 0){
				for(int j = 0; j <map.length; j++){
					System.out.print(" __");
				}
				System.out.println();
			}
			for (int col = 0; col <= map.length; col++){
				if (col % 3 == 0){
					System.out.print("|");
				}else if ((row+1)%3 == 0 && row!=0){
					System.out.print("____");
				}else{
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
	}
	
}
