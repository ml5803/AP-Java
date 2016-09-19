/**
 * 
 */
package introProj;

/**
 * @author Student 7
 *
 */
public class OOPExample {

	public static void main(String[] args){
		Student jillian = new Senior("Jillian","programmer");
		Student jordan = new Junior("Jordan","Software Engineering");
		Student jason = new Student("Jason");
		
		jillian.talk();
		jordan.talk();
		jason.talk();	
	}
}