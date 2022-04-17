package projetoArquivos;

import java.io.File;
import java.io.IOException;

public class ProjetoArquivos {
	
	public static void main(String[] args) {
		File arquivo = new File("C:\\MJV\\mjv-java-school\\Esclipse\\Java\\src\\ArquivoNovo.txt");
		try {
			boolean criador = arquivo.createNewFile();
		} catch (IOException e) {
		e.printStackTrace();
	}
		 
		if (arquivo.exists());
			System.out.println("Nome do arquivo criado é '"+ arquivo.getName()+"', ele está localizado em:'"+ arquivo.getAbsolutePath()+
			"' e tem "+arquivo.length()+" byte(s) de tamanho.");			
	}
}
