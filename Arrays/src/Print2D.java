public class Print2D {

	private static boolean [][] grid;
	
	public static void main(String[] args){
		grid = new boolean[5][5];
		print2DArr(grid);
		buttonClick(3,3);
		print2DArr(grid);
		buttonClick(3,3);
		print2DArr(grid);
	}

	public static void buttonClick(int r, int c) {
		boolean win = true;
		if (r>0 && r< grid.length){// not on rubric
			switchRow(grid[r],c);
		}
		switchColumn(grid,r, c);//one point
		//check if any lights are on
		A:for(int i = 0; i< grid.length; i++){
			for(int j = 0; j<grid[i].length; j++){
				//1 of 2 points
				if(grid[i][j]){//1 of 2 points
					win = false;
					break A;
				}
			}
		}
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if(r>=0 && r<grid.length && c>=0 && c<grid[r].length){
			grid[r][c]=!grid[r][c];
		}
	}
	public static void switchRow(boolean[] row, int x){
//		for(int i = -1; i<2; i++){
//			if(x+i >=0 && x+ i<row.length){
//				row[x+i]=!row[x+i];
//			}
//		}
		
		if (x>=0 && x< row.length){
			for(int i = -1; i<2; i++){
				if(x+i >=0 && x+ i<row.length){
					row[x+i]=!row[x+i];
				}
			}
		}
	}
	
	public static void switchColumn(boolean[][] grid, int r, int c){
		switchIfValid(grid,r-1,c);
		switchIfValid(grid,r+1,c);
	}

	public static void print2DArr(boolean[][] arr){
		for(int row =0; row<arr.length; row++){
			for(int col = 0; col<arr[row].length;col++){
				if(arr[row][col]){
					System.out.print(" O ");
				}else{
					System.out.print(" X ");
				}
			}
			System.out.print("\n");
			System.out.println("- - - - - - - -");
		}
	}
}
