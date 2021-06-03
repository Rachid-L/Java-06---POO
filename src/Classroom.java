/**
 * 
 */

/**
 * @author rachid
 *
 */
public class Classroom {

	/**
	 * 
	 */
	public Classroom() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Wilder loic = new Wilder("Loic", true);
		System.out.println(loic.whoAmI());
		
		Wilder rachon = new Wilder("Rachon", false);
		System.out.println(rachon.whoAmI());
	}

}
