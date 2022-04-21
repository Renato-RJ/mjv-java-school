package com.mjv.openbanking;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeradorArquivo {
	public void escreverDisco (String ConteudoGerado, Movimentacao movimentacao){
		String dataOperacao = movimentacao.getDataMovimentacao().toString();
		
		try {
			File diretorio = new File("c:\\estudos\\banco_central\\movimentacoes\\");
			if (! diretorio.exists())
				diretorio.mkdirs();
			Path enderecoDiretorio = Paths.get(diretorio.getAbsolutePath() +"\\"+ dataOperacao + ".txt");
			Files.write(enderecoDiretorio, ConteudoGerado.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}	
}
