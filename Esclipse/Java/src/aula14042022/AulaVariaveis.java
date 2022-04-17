package aula14042022;

public class AulaVariaveis {
	public static void main(String[] args) {
		//Em java existe 8 tipos primitivos de dados, s�o eles: byte, suporta de -128 � 127, 
		//short, suporta de -32.768 � 32.767, int, de -2.147.483.648 � 2.147.483.647, 
		//long, de -9.223.372.036.854.775.808 � 9.223.372.036.854.775.807 
		//float, double, boolean e char, que suporta um �nico caracter, 
		//esses tipos n�o s�o objetos e s�o considerados
		//valores brutos.
		//NO dia a dia os tipos usados normalmente s�o: int, long, double, boolean.
		//Para se declara uma vari�vel em JAVA, se declara o tipo primeiramente, 
		//depois o nome da vari�vel e se desejar, se inicia a var�vel com algum valor.
		
		//Formas incorretas de declarar uma vari�vel:
		
		int numero&um = 1;	//Os �nicos caracteres especiais permitidos s�o o _ e $;
		int 1numero = 1;	//� permitido usar numerais em declara��o de vari�vel, por�m o nome da mesma n�o pode se iniciar cum um digito num�rico;
		int num um = 1;		//N�o � permitido espa�o em branco no nome da vari�vel;
		int long = 1;		//N�o se pode usar palavras reservadas da linguagem como nome de vari�vel, long � uma delas.
		
		
		//Formas corretas de declarar uma vari�vel, nos exxemplos abaixo, foram feitas as ddevidas corre��es nos exemplos incorretos.
		
		int numero_um = 1;
		int numero1 = 1;
		int numeroUm = 1;
		int longo = 1;
		
		//VARI�VEL x CONSTANTE?
		//Uma vari�vel � declarada conforme descrito acima, porem, se, se deseja que o valor dessa vari�vel n�o seja alterado de forma alguma,
		//acrescenta a palavra 'final' na  frente do tipo do vari�vel e o nome da vari�vel � escrito todo em mai�sculo por connvers�o.
	}

}
