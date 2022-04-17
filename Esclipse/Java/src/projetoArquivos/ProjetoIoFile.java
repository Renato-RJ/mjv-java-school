//A classe File do pacote IO tem como função, gerar uma representação abstrata de nomes de caminho de arquivos e diretórios. Ela é 
//necessária visto que os sistemas operacionais e/ou interfaces de usuário utilizam string como nome de caminhos de arquivo e 
//diretório, e com caracteres separadores específicos de cada S.O.
//A classe também perrmite, através de seus métodos, criar, renomear e excluir arquivos, criar novos diretórios, listar  conteúdos
//de diretórios, determinar atributos de arquivos entre outros.


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
			System.out.println("Nome do arquivo criado é: "+ arquivo.getName());				//Retorna String
			System.out.println("Caminho completo do arquivo: "+ arquivo.getAbsolutePath());		//Retorna String
			System.out.println("Arquivo é legível: "+ arquivo.canRead());						// Retorno booleano
			System.out.println("Arquivo é gravável:  "+ arquivo.canWrite());					// Retorna Booleano
			System.out.println("Tamanho do arquivo em byte(s):  "+ arquivo.length());			//Retorna Long
	};
}
