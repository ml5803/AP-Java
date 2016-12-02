package sort;

public class Pokemon {
	private int level;
	private int  hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name, int level){
		this.name = name;
		this.level = level;
		this.hp = 100;
		this.poisoned = false;
	}
	
	public void iChooseYou(){
		System.out.print(this.name);
		System.out.print(this.name);
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setHP(int newHP){
		this.hp = newHP;
	}
	
	public void setPoisoned(boolean b){
		this.poisoned=b;
	}
	
	public void lapse(){
		if(this.poisoned){
			this.hp-=15;
		}
	}

	public void attack(Pokemon bulbasaur, Attack attack) {

	}

	public int getHP() {
		// TODO Auto-generated method stub
		return this.getHP();
	}
}
