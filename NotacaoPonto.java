public class NotacaoPonto {
public static void main(String[] args) {
		
		String s = "Bom dia X!";
		s = s.toUpperCase();
		
		s = s.replace("Xg", "Senhora");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		//pode quebrar o código em multiplas linhas
		String y = "Bom dia X"
				.replace("X","Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//tipos primitivos não tem o operador "."
		
	}
}
