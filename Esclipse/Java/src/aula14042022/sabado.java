package aula14042022;

public class sabado {
	public static void main(String[] args) {
		String texto1 = "pneumoultramicroscopicossilicovulcanoconi�tico";
		String texto2 = texto1.replace("o", "e");
		System.out.println("Frase antes do m�todo replace: " + texto1);
		System.out.println("");
		System.out.println("Frase ap�s o m�todo replace:   " + texto2);
	}

}
