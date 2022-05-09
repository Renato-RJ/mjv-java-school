package com.mjv.agualuzatracao.app;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import com.mjv.agualuzatracao.enuns.Paises;
import com.mjv.agualuzatracao.enuns.TipoNotificacao;
import com.mjv.agualuzatracao.enuns.TipoServico;
import com.mjv.agualuzatracao.model.Cliente;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Endereco;
import com.mjv.agualuzatracao.service.GravarInformacaoTxtCsv;
import com.mjv.agualuzatracao.util.FormatarCsv;
import com.mjv.agualuzatracao.util.FormatarTxt;

public class Sistema {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		Contrato contrato = new Contrato();
		contrato.setCliente(cliente);
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
		endereco.setLogradouro(leituraTeclado.nextLine());
		System.out.println("Informe o número da residência: ");
		endereco.setNumEndereco(leituraTeclado.nextLine());
		System.out.println("Complemento:");
		endereco.setComplemento(leituraTeclado.nextLine());
		System.out.println("Bairro:");
		endereco.setBairro(leituraTeclado.nextLine());
		System.out.println("Cidade:");
		endereco.setCidade(leituraTeclado.nextLine());
		System.out.println("SILGA UF:");
		endereco.setUf(leituraTeclado.nextLine());
		System.out.println("CEP:");
		endereco.setCep(leituraTeclado.nextLine());
		System.out.println("País:");
		endereco.setPais(Paises.valueOf(leituraTeclado.nextLine()));
		System.out.println("Protocolo: ");
		contrato.setProtocolo(leituraTeclado.nextLine());
		System.out.println("Informe a data desejada para instalação: \n(dd)\n(MM)\n(aaaa)");
		String dia = leituraTeclado.nextLine();
		String mes = leituraTeclado.nextLine();
		String ano = leituraTeclado.nextLine();
		contrato.setData(LocalDate.parse(ano+"-"+mes+"-"+dia));
		System.out.println("Informe a hora desejada para instalação: \n(HH)\n(MM)");				//CORRIGIR HORA
		String hora = leituraTeclado.nextLine();
		String minuto = leituraTeclado.nextLine();
		contrato.setHora(LocalTime.parse(hora+":"+minuto));
		System.out.println("Tipo de serviço (AGUA ou LUZ):");
		contrato.setTipoServico(TipoServico.valueOf(leituraTeclado.nextLine()));
		if (contrato.getTipoServico().toString() == "Água")
			contrato.setValor(127.33);
    	else
    		contrato.setValor(132.15);
		System.out.println("Tipo de notificação (SMS ou WHATS):");
		contrato.setTipoNotificacao(TipoNotificacao.valueOf(leituraTeclado.nextLine()));
				
//		System.out.println(contrato.getCliente().getNome());
//		System.out.println(contrato.getCliente().getEndereco().getLogradouro());
//		System.out.println(contrato.getData());
		FormatarTxt foramtarDado = new FormatarTxt();
		String dadoFormatado = foramtarDado.FormatarTxt(contrato);
		FormatarCsv foramtarDadoCsv = new FormatarCsv();
		String dadoFormatadoCsv = foramtarDadoCsv.FormatarCsv(contrato);
		
		GravarInformacaoTxtCsv gravarDoc = new GravarInformacaoTxtCsv();
		gravarDoc.gravarDisco(dadoFormatado, dadoFormatadoCsv);
		
		}

}
