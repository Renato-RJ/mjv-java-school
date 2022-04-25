package com.mjv.agualuzatracao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class GerarCadastro {
	public static void main(String[] args) {
		Cadastro cliente = new Cadastro();
		Scanner leituraTeclado = new Scanner(System.in);
		
		System.out.println("CPF do titular:");
		cliente.setCpf(leituraTeclado.nextLine());
		System.out.println("RG do titular da instalação:");
		cliente.setRg(leituraTeclado.nextLine());
		System.out.println("Nome completo do titular da instalação:");
		cliente.setNome(leituraTeclado.nextLine());
		System.out.println("Informe um telefone para contato: ");
		cliente.setTel(leituraTeclado.nextLine());
		System.out.println("Logradouro:");
		cliente.setLogradouro(leituraTeclado.nextLine());
		System.out.println("Informe o número da residência: ");
		cliente.setNumEnd(Integer.parseInt(leituraTeclado.nextLine()));
		System.out.println("Complemento:");
		cliente.setComplemento(leituraTeclado.nextLine());
		System.out.println("Bairro:");
		cliente.setBairro(leituraTeclado.nextLine());
		System.out.println("Cidade:");
		cliente.setCidade(leituraTeclado.nextLine());
		System.out.println("SILGA UF:");
		cliente.setUf(leituraTeclado.nextLine());
		System.out.println("CEP:");
		cliente.setCep(leituraTeclado.nextLine());
		System.out.println("País:");
		cliente.setPais(Paises.valueOf(leituraTeclado.nextLine()));
		System.out.println("Protocolo: ");
		cliente.setProtocolo(Integer.parseInt(leituraTeclado.nextLine()));
		System.out.println("Informe a data desejada para instalação: \n(dd)\n(MM)\n(aaaa)");
		String dia = leituraTeclado.nextLine();
		String mes = leituraTeclado.nextLine();
		String ano = leituraTeclado.nextLine();
		cliente.setData(LocalDate.parse(ano+"-"+mes+"-"+dia));
		System.out.println("Informe a hora desejada para instalação: \n(HH)\n(MM)");				//CORRIGIR HORA
		String hora = leituraTeclado.nextLine();
		String minuto = leituraTeclado.nextLine();
		cliente.setHora(LocalTime.parse(hora+":"+minuto));
		System.out.println("Tipo de serviço (AGUA ou LUZ):");
		cliente.setTipoServico(TipoServico.valueOf(leituraTeclado.nextLine()));
		if (cliente.getTipoServico().toString() == "Água")
    		cliente.setValor(127.33);
    	else
    		cliente.setValor(132.15);
		System.out.println("Tipo de notificação (SMS ou WHATS):");
		cliente.setTipoNotificacao(TipoNotificacao.valueOf(leituraTeclado.nextLine()));
				
		
		FormatarTxt foramtarDado = new FormatarTxt();
		String dadoFormatado = foramtarDado.FormatarTxt(cliente);
		FormatarCsv foramtarDadoCsv = new FormatarCsv();
		String dadoFormatadoCsv = foramtarDadoCsv.FormatarCsv(cliente);
		
		GravarInformacaoTxtCsv gravarDoc = new GravarInformacaoTxtCsv();
		gravarDoc.gravarDisco(dadoFormatado, dadoFormatadoCsv);
		
		}

}
