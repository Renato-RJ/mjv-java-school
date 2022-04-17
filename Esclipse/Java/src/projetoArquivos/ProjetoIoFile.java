//A classe File do pacote IO tem como fun��o, gerar uma representa��o abstrata de nomes de caminho de arquivos e diret�rios. Ela � 
//necess�ria visto que os sistemas operacionais e/ou interfaces de usu�rio utilizam string como nome de caminhos de arquivo e 
//diret�rio, e com caracteres separadores espec�ficos de cada S.O.
//A classe tamb�m perrmite, atrav�s de seus m�todos, criar, renomear e excluir arquivos, criar novos diret�rios, listar  conte�dos
//de diret�rios, determinar atributos de arquivos entre outros.


package projetoArquivos;

import java.io.File;
import java.io.IOException;

public class ProjetoIoFile {
	
	public static void main(String[] args) {
		File caminhoDir = new File("C:\\Users\\Renato\\Desktop\\TesteMkdris\\Pasta1\\Pasta2\\Pasta3");
		File arquivo = new File(caminhoDir + "\\Teste.txt");
			
		boolean diretorio = caminhoDir.mkdirs();
		
		if (diretorio);	
			try {
				boolean criador = arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
	}
		 
		if (arquivo.exists());
			System.out.println("Nome do arquivo criado �: "+ arquivo.getName());				//Retorna String
			System.out.println("Caminho completo do arquivo: "+ arquivo.getAbsolutePath());		//Retorna String
			System.out.println("Arquivo � leg�vel: "+ arquivo.canRead());						// Retorno booleano
			System.out.println("Arquivo � grav�vel:  "+ arquivo.canWrite());					// Retorna Booleano
			System.out.println("Tamanho do arquivo em byte(s):  "+ arquivo.length());			//Retorna Long
	};
}
