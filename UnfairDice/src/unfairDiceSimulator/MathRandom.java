package dataTypes;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args){

		int[] results = new int[6];
		//same as 
		//int[] results = {0,0,0,0,0,0};
		
		int totalRolls=10000;
		
		for (int index = 0; index < totalRolls; index++){
			int roll = rollUnfairDie("even");
			System.out.println("Roll # "+ (index + 1) + " Die is " +roll);
			results[roll-1]++;
		}

		for (int i=0; i<6;i++)
		{
			System.out.println( (i+1) + " was rolled " +  results[i] + " times. The percentage is " + (int)((double) results[i]/totalRolls * 100) + "%.") ;
		}
	}

	public static int rollFairDie(){
		//	Random gen = new Random();
		//	return gen.nextInt(6)+1;
		double rand = Math.random(); //random double (0.1)
		int roll = (int) (6*rand); // [0.5] (this is what above code does)
		return roll+1;//0 becomes 1 and 5 becomes 6
	}

	public static int rollUnfairDie(String Bias){
		//returns numbers 1-6, but with uneven distribution

		//favor evens
		int[] favorEven;
		favorEven = new int[9];
		favorEven[0] = 1;
		favorEven[1] = 2;
		favorEven[2] = 2;
		favorEven[3] = 3;
		favorEven[4] = 4;
		favorEven[5] = 4;
		favorEven[6] = 5;
		favorEven[7] = 6;
		favorEven[8] = 6;

		//favor odds
		int[] favorOdd;
		favorOdd = new int[9];
		favorOdd[0] = 1;
		favorOdd[1] = 1;
		favorOdd[2] = 2;
		favorOdd[3] = 3;
		favorOdd[4] = 3;
		favorOdd[5] = 4;
		favorOdd[6] = 5;
		favorOdd[7] = 5;
		favorOdd[8] = 6;

		if (Bias == "null"){
			return rollFairDie();
		}

		if (Bias == "even"){
			Random gen = new Random();
			int favorEvenRoll = gen.nextInt(9);
			return favorEven[favorEvenRoll];
		}

		if (Bias == "odd"){
			Random gen = new Random();
			int favorOddRoll = gen.nextInt(9);
			return favorOdd[favorOddRoll];
		}

		return -1;
	}
}
