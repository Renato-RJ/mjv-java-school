package javaexplorer.fundamentos;

public class ClassesWrappersExplorer {
	public static void main(String[] args) {
		converterStringEmNumeros();
	}
	static void converterStringEmNumeros() {
		//Converter String em Integer:
		Integer numero = Integer.valueOf("123");
		
		//Convertendo uma String em Double
		Double numeroDuplo = Double.valueOf("123.45");
		
		System.out.println(numeroDuplo);
	}
}
