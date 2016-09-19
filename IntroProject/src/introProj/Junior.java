package introProj;

public class Junior extends Student{

	private String major;
	
	public Junior(String name, String major) {
		// TODO Auto-generated constructor stub
		super(name);
		this.major = major;
	}
	
	public void talk(){
		super.talk();
		System.out.println("I am from the major " + major);
	}
}
