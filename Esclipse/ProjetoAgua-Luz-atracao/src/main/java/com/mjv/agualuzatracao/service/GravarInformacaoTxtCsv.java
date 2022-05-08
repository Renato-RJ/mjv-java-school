package com.mjv.agualuzatracao.service;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class GravarInformacaoTxtCsv {
	public void gravarDisco (String dadoTxt, String dadoCsv){
			
			File diretorio = new File("C:\\estudo\\mjv-java-school\\agua-luz-output");
			boolean criaDiretorrio = diretorio.mkdirs();
			
			
			Path dirArquivoTxt = Paths.get(diretorio + "\\agua-luz-contratos.txt");
			Path dirArquivoCsv = Paths.get(diretorio + "\\agua-luz-contratos.csv");
			try {
				Files.write(dirArquivoTxt, dadoTxt.getBytes(StandardCharsets.UTF_8));
				Files.write(dirArquivoCsv, dadoCsv.getBytes(StandardCharsets.UTF_8));
			} catch (IOException e) {
				e.printStackTrace();
			}
	}	
}





