package sort;

public class MainBattle {
	
	public static void main(String[] args){
		Pokemon raticate = new Pokemon("Raticate", 26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		
		raticate.iChooseYou();
		raticate.iChooseYou();
		
		System.out.println("Raticate is preparing to use Super Fang!");
		
		raticate.attack(bulbasaur, new Attack(){
			public void attack(Pokemon target){
				System.out.println("Super fang was used!");
				int newHP = target.getHP()/2;
				
			}
			
		});

	}
	
}
