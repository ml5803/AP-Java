import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr2D= new String[10][8];
	
		//print each row
		for(int i = 0; i<arr2D.length; i++){
			for (int j = 0; j<arr2D[i].length; j++){
				System.out.print(arr2D[i][j]);
			}
			System.out.println("\n" + " ");
		}
	}

}
