package aula14042022;

public class AulaVariaveis {
	public static void main(String[] args) {
		//Em java existe 8 tipos primitivos de dados, são eles: byte, suporta de -128 à 127, 
		//short, suporta de -32.768 à 32.767, int, de -2.147.483.648 à 2.147.483.647, 
		//long, de -9.223.372.036.854.775.808 à 9.223.372.036.854.775.807 
		//float, double, boolean e char, que suporta um único caracter, 
		//esses tipos não são objetos e são considerados
		//valores brutos.
		//NO dia a dia os tipos usados normalmente são: int, long, double, boolean.
		//Para se declara uma variável em JAVA, se declara o tipo primeiramente, 
		//depois o nome da variável e se desejar, se inicia a varável com algum valor.
		
		//Formas incorretas de declarar uma variável:
		
		int numero&um = 1;	//Os únicos caracteres especiais permitidos são o _ e $;
		int 1numero = 1;	//É permitido usar numerais em declaração de variável, porém o nome da mesma não pode se iniciar cum um digito numérico;
		int num um = 1;		//Não é permitido espaço em branco no nome da variável;
		int long = 1;		//Não se pode usar palavras reservadas da linguagem como nome de variável, long é uma delas.
		
		
		//Formas corretas de declarar uma variável, nos exxemplos abaixo, foram feitas as ddevidas correções nos exemplos incorretos.
		
		int numero_um = 1;
		int numero1 = 1;
		int numeroUm = 1;
		int longo = 1;
		
		//VARIÁVEL x CONSTANTE?
		//Uma variável é declarada conforme descrito acima, porem, se, se deseja que o valor dessa variável não seja alterado de forma alguma,
		//acrescenta a palavra 'final' na  frente do tipo do variável e o nome da variável é escrito todo em maiúsculo por connversão.
	}

}
