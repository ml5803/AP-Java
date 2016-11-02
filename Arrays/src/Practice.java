import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pic= new String[10][12];

		//print each row
		for(int row = 1; row<pic.length; row++){
			for (int col = 0; col<pic[row].length; col++){
				pic[row][col] = "           ";
			}
		}
		
		for(int row = 7; row<pic.length; row++){
			for (int col = 0; col<pic[row].length; col++){
				pic[row][col] = "MMM";
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
			pic[pic.length-1][col]= "_";
		}
		
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
}
