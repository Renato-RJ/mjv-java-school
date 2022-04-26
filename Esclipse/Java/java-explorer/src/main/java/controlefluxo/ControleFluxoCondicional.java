package controlefluxo;

public class ControleFluxoCondicional {
	public static void main(String[] args) {
		ControleFluxoCondicional.caixaEletronicoCondSimples();
		ControleFluxoCondicional.notaMediaCondComposta(4);
	}
	static void caixaEletronicoCondSimples(){
		 double saldo = 25.0;
	       double valorSolicitado = 17.0;

	       if(valorSolicitado < saldo)
	        saldo = saldo - valorSolicitado;

	        System.out.println(saldo);

	}
	static void notaMediaCondComposta(double nota) {
		if(nota >= 7)
			System.out.println("Aprovado");

		else
			System.out.println("Reprovado");
	}
}
