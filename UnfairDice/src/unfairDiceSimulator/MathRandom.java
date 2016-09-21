package unfairDiceSimulator;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		//		for(int index = 0; index < 10; index++){
		//			System.out.println("Roll #"+(index+1)+
		//					" Die is "+rollFairDie());
		//		}

		for(int i = 0; i < 10; i++){
			System.out.println(rollUnfairDie("odd"));
		}
	}

	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6)+1;
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
			int favorEvenRoll = gen.nextInt(9)+1;
			return favorEven[favorEvenRoll];
		}

		if (Bias == "odd"){
			Random gen = new Random();
			int favorOddRoll = gen.nextInt(9)+1;
			return favorOdd[favorOddRoll];
		}

		return -1;
	}

}