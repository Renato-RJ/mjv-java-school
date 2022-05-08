package com.mjv.agualuz.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LerTxt{
	public String dadoLido () {
		String dadosPessoais = "";
			
		Path local = Paths.get("C:\\estudo\\mjv-java-school\\agua-luz-output\\agua-luz-contratos.txt");
			
		try {
			String linhaTxt = Files.readString(local);
			dadosPessoais = linhaTxt;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	return dadosPessoais;
		
	}
}