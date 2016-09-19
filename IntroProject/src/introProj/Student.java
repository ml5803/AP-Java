/**
 * 
 */
package introProj;

/**
 * @author Student 7
 *
 */
//constructor creates students
public class Student {
	//initialize fields
	private String name;
	
	public Student(String name){
		this.name = name;
	}
	
	public void talk(){
		System.out.println("Hi, my name is " + name);
	}
}
