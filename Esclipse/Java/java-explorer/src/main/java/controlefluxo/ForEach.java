package controlefluxo;

public class ForEach {
	public static void main(String[] args) {
		int nums [] = {1,2,3,4,5,6,7};
		ForEach.controle(nums);
		
	}
	static void controle(int [] n) {
		
		//For each serve para percorrer objetos iteráveis através de seu indice do inicio ao final
		//sem interrupções.
		for(Integer num : n) {
			  System.out.println(num);
		}
	}
}

