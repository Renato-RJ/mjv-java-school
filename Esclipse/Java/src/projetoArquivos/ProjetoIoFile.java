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
