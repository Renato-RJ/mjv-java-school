package aula14042022;

public class sabado {
	public static void main(String[] args) {
		String texto1 = "pneumoultramicroscopicossilicovulcanoconiótico";
		String texto2 = texto1.replace("o", "e");
		System.out.println("Frase antes do método replace: " + texto1);
		System.out.println("");
		System.out.println("Frase após o método replace:   " + texto2);
	}

}
