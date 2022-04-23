package com.mjv.agualuz;

public class SistemaNotificacao {
	public static void main (String[] args) {
		LerTxt info = new LerTxt();
		String lido = info.dadoLido();
				
		String cpf = lido.substring(0, 11);
		String rg = lido.substring(12, 21);
		String nome = lido.substring(21, 51);
		String tel = lido.substring(51, 62);
		String logradouro = lido.substring(62, 81);
		String num = lido.substring(81, 87);
		String complemento = lido.substring(87, 97);
		String bairro = lido.substring(97, 112);
		String cidade = lido.substring(112, 142);
		String uf = lido.substring(142, 144);
		String cep = lido.substring(144, 152);
		String pais = lido.substring(152, 154);
		String protocolo = lido.substring(154, 164);
		String data = lido.substring(164, 172);
		String hora = lido.substring(172, 176);
		String tipoServico = lido.substring(176, 177);
		String valor = lido.substring(177, 185);
		String tipoNotificacao = lido.substring(185, 186);
		
		StringBuilder mensagem = new StringBuilder();
		
		mensagem.append("Senhor (a) " + nome + " cpf de número " + cpf + ", Informamos que conforme contrato com protocolo de "
				+ "número " + protocolo + " está \n agendado para a data\\hora " + data + " " + hora + "h, instalação do serviço de " 
				+ tipoServico + " com taxa de valor " + valor + " em sua residência localizada no \n endereço abaixo:\n\n"
						+ "	Logradouro: " + logradouro + ", " + num + "\n"
						+ "	Complemento: " + complemento + "\n"
						+ "	Bairro: " + bairro + "\n"
						+ "	Cidade: "+ cidade + "/ " + uf + "\n"
						+ "	CEP: "+ cep);
		
		System.out.println(mensagem);/*
		System.out.println(cpf);
		System.out.println(rg);
		System.out.println(nome);
		System.out.println(tel);
		System.out.println(logradouro);
		System.out.println(num);
		System.out.println(complemento);
		System.out.println(bairro);
		System.out.println(cidade);
		System.out.println(uf);
		System.out.println(cep);
		System.out.println(pais);
		System.out.println(protocolo);
		System.out.println(data);
		System.out.println(hora);
		System.out.println(tipoServico);
		System.out.println(valor);
		System.out.println(tipoNotificacao);
		*/
	}
}
