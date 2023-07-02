public class AreaCinfunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		/*Final - significa que não pode ser alterada*/
		final double pi = 3.14159; 
		
		double area = pi * raio * raio;
		System.out.println("Print 1: "  + area);
		
	    area = pi * raio * raio * raio;
		System.out.println("Print 2: " + area);
	}

}