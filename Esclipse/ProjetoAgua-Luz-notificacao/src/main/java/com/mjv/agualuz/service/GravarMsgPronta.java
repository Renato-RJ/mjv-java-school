package com.mjv.agualuz.service;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class GravarMsgPronta {
	public void gravarDisco (String msg, String protocolo){
			
			File diretorio = new File("C:\\estudo\\mjv-java-school\\agua-luz-output");
			boolean criaDiretorrio = diretorio.mkdirs();
			
			
			Path dirArquivoTxt = Paths.get(diretorio + "\\contrato-"+protocolo+".txt");
			try {
				Files.write(dirArquivoTxt, msg.getBytes(StandardCharsets.UTF_8));
			} catch (IOException e) {
				e.printStackTrace();
			}
	}	
}