
public class Logico {

	public static void main(String[] args) {
		
		/* E: 				&&
		 * OU:				||
		 * OU Exclusivo: 	^
		 * Não: 			!
		 * */
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(a ^ b);
		System.out.println(!b);

	}

}