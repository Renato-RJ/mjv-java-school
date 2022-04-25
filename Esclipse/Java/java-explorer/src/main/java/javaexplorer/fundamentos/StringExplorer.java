package javaexplorer.fundamentos;

public class StringExplorer {
	public static void main(String[] args) {
		StringExplorer.explorandoMetodoSplit();
	}
	//O split separa as palavras de uma string
	static void explorandoMetodoSplit() {
		String nomeCompleto = "Renato da Silva Santos Gonçalves";
		String [] palavras = nomeCompleto.split(" ");
		//PErcorrendo o array em java:
		for  (String palavra : palavras) {
			System.out.println(palavra);
			
		}
		//Pegando ultimo nome da string e invertendo posição(estilo padrão internacional)
		String lastName = palavras[palavras.length-1];
		String firstName = palavras[0];
		System.out.println(lastName.concat(", ").concat(firstName));
	}
}
