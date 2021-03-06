package com.mjv.agualuz.app;

import java.time.LocalDate;

import com.mjv.agualuz.service.GravarMsgPronta;
import com.mjv.agualuz.service.LerTxt;
import com.mjv.agualuz.util.padronizadorInformacao;

public class SistemaNotificacao {
	public static void main (String[] args) {
		LerTxt info = new LerTxt();
		String lido = info.dadoLido(),servico;
		padronizadorInformacao padrao = new padronizadorInformacao();
				
		String cpf = padrao.formatarCpf(lido.substring(0, 11));
		String rg = lido.substring(12, 21);
		String nome = lido.substring(21, 51);
		String tel = lido.substring(51, 62);
		String logradouro = lido.substring(62, 82);
		String num = lido.substring(82, 88);
		String complemento = lido.substring(88, 98);
		String bairro = lido.substring(98, 113);
		String cidade = lido.substring(113, 143);
		String uf = lido.substring(143, 145);
		String cep = lido.substring(145, 153);
		String pais = lido.substring(153, 155);
		String protocolo = lido.substring(155, 165);
		String data = padrao.formatarData(lido.substring(165, 173));
		String hora = lido.substring(173, 177);
		String tipoServico = lido.substring(177, 178);
		if (tipoServico.toString().equals("A")) {
			servico = "Água";
		}
		else {
			servico = "Luz";
		}
		String valor = lido.substring(178, 183);
		String tipoNotificacao = lido.substring(183, 184);
		
		StringBuilder mensagem = new StringBuilder();
		
		mensagem.append("Senhor (a) " + nome + " cpf de número " + cpf + ", Informamos que conforme contrato com "
				+ "protocolo de número " + protocolo + " está \n agendado para a data\\hora " + data + " " 
				+ hora.substring(0, 2)+":"+hora.substring(2, 4) +"h, instalaçãoo do serviço de " + servico + " com taxa de valor " + valor + " em "
						+ "sua residência localizada no \n endereço abaixo:\n\n"
				
						+ "	Logradouro: " + logradouro + ", " + num + "\n"
						+ "	Complemento: " + complemento + "\n"
						+ "	Bairro: " + bairro + "\n"
						+ "	Cidade: "+ cidade + "/ " + uf + "\n"
						+ "	CEP: "+ cep);
		
		
		
		
		GravarMsgPronta gravarMsg = new GravarMsgPronta();
		gravarMsg.gravarDisco(mensagem.toString(), protocolo);
		
		
		System.out.println(mensagem);		
	}
}
