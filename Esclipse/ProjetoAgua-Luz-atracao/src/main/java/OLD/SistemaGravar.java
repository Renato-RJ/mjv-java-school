package OLD;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import com.mjv.agualuzatracao.enuns.Paises;
import com.mjv.agualuzatracao.enuns.TipoNotificacao;
import com.mjv.agualuzatracao.enuns.TipoServico;
import com.mjv.agualuzatracao.service.GravarInformacaoTxtCsv;

public class SistemaGravar {
	public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        
        String nome, cpf,rg,logradouro,complemento,bairro,cidade,uf,cep,pais1,tel,numEnd, protocolo;
        int ano=0001,mes=01,dia=01,horaVar=00,minuto=00;
        TipoServico tipoServico;
        double valor;
        TipoNotificacao tipoNotificacao;
        Paises pais;
        StringBuilder dadoTxt = new StringBuilder();
        StringBuilder dadoCsv = new StringBuilder();
        
        
        System.out.println("CPF do titular:");
        	cpf = String.format("%011d", Long.valueOf(leituraTeclado.nextLine().replaceAll("\\D","")));
        	dadoTxt.append(cpf);
        	dadoCsv.append(cpf + ";");
        System.out.println("RG do titular da instala��o:");
        	rg = String.format("%010d", Long.valueOf(leituraTeclado.nextLine().replaceAll("\\D","")));
        	dadoTxt.append(rg);
        	dadoCsv.append(rg + ";");
        System.out.println("Nome completo do titular da instala��o:");
        	String nomeTemp = leituraTeclado.nextLine().toUpperCase();
        	if (nomeTemp.length() >=30){
        		nome = nomeTemp.substring(0, 30);
        		}
        	else {
        		nome = nomeTemp.format("%-30s", nomeTemp);
				}
        	dadoTxt.append(nome);
        	dadoCsv.append(nome + ";");
        System.out.println("Informe um telefone para contato: ");
        	tel = String.format("%011d", Long.valueOf(leituraTeclado.nextLine().replaceAll("\\D","")));
        	dadoTxt.append(tel.toString().replaceAll("\\D",""));
        	dadoCsv.append(tel.toString().replaceAll("\\D","") + ";");
        System.out.println("Logradouro:");
        	String logradouroTemp = leituraTeclado.nextLine().toUpperCase();
        	if (logradouroTemp.length() >=20){
        		logradouro = logradouroTemp.substring(0, 20);
        		}
        	else {
        		logradouro = logradouroTemp.format("%-20s", logradouroTemp);
				}
        	dadoTxt.append(logradouro);
        	dadoCsv.append(logradouro + ";");
        System.out.println("Informe o n�mero da resid�ncia: ");
        	numEnd = String.format("%06d", Long.valueOf(leituraTeclado.nextLine().replaceAll("\\D","")));
        	dadoTxt.append(numEnd);
        	dadoCsv.append(numEnd + ";");
        System.out.println("Complemento:");
        	String complementoTemp = leituraTeclado.nextLine().toUpperCase();
        	if (complementoTemp.length() >=10){
        		complemento = complementoTemp.substring(0, 10);
        		}
        	else {
        		complemento = complementoTemp.format("%-30s", complementoTemp);
				}
        	dadoTxt.append(complemento);
        	dadoCsv.append(complemento + ";");
        System.out.println("Bairro:");
        	String bairroTemp = leituraTeclado.nextLine().toUpperCase();
        	if (bairroTemp.length() >=15){
        		bairro = bairroTemp.substring(0, 15);
        		}
        	else {
        		bairro = bairroTemp.format("%-30s", bairroTemp);
				}
        	dadoTxt.append(bairro);
        	dadoCsv.append(bairro + ";");
        System.out.println("Cidade:");
        	String cidadeTemp = leituraTeclado.nextLine().toUpperCase();
        	if (cidadeTemp.length() >=30){
        		cidade = cidadeTemp.substring(0, 30);
        		}
        	else {
        		cidade = cidadeTemp.format("%-30s", cidadeTemp);
				}
        	dadoTxt.append(cidade);
        	dadoCsv.append(cidade + ";");
        System.out.println("SILGA UF:");
        	uf = leituraTeclado.nextLine().toUpperCase().substring(0, 2);
        	dadoTxt.append(uf);
        	dadoCsv.append(uf + ";");
        System.out.println("CEP:");
        	cep = String.format("%08d", Long.valueOf(leituraTeclado.nextLine().replaceAll("\\D","")));
        	dadoTxt.append(cep.replaceAll("\\D",""));
        	dadoCsv.append(cep.replaceAll("\\D","") + ";");
        System.out.println("Pa�s:");
        	pais1 = leituraTeclado.nextLine().toUpperCase();//CORRIGIR VARI�VEL E ENTRADA ENUM!!!
        	dadoTxt.append(pais1);
        	dadoCsv.append(pais1 + ";");
        System.out.println("Protocolo: ");
        	protocolo = String.format("%010d", Long.valueOf(leituraTeclado.nextLine().replaceAll("\\D","")));
        	dadoTxt.append(protocolo);
        	dadoCsv.append(protocolo + ";");
        System.out.println("Informe a data desejada para instala��o: \n(dd\nMM\naaaa)");
        	dia = Integer.parseInt(leituraTeclado.nextLine());
        	mes = Integer.parseInt(leituraTeclado.nextLine());
        	ano = Integer.parseInt(leituraTeclado.nextLine());
        	LocalDate data = LocalDate.of(ano,mes,dia);
        	dadoTxt.append(data.toString().replace("-",""));
        	dadoCsv.append(data.toString().replace("-","") + ";");
        System.out.println("Informe a hora desejada para instala��o: \n(HH\nMM)");
        	horaVar = Integer.parseInt(leituraTeclado.nextLine());
        	minuto = Integer.parseInt(leituraTeclado.nextLine());
        	LocalTime hora = LocalTime.of(horaVar, minuto);
        	dadoTxt.append(hora.toString().replace(":",""));
        	dadoCsv.append(hora.toString().replace(":","") + ";");
        System.out.println("Tipo de servi�o (�gua ou Luz):");				//CORRIGIR VARI�VEL E ENTRADA ENUM!!!
        	String tipoServico1  = leituraTeclado.nextLine().toUpperCase();
        	dadoTxt.append(tipoServico1.substring(0, 1));
        	dadoCsv.append(tipoServico1.substring(0, 1) + ";");
        	if (tipoServico1 == "A")
        		valor = 127.33;
        	else
        		valor = 132.15;
        	dadoTxt.append(valor);
        	dadoCsv.append(valor + ";");
        System.out.println("Tipo de notifica��o (SMS ou WHATS):");
        	String tipoNotificacao1 = leituraTeclado.nextLine().toUpperCase();		//CORRIGIR VARI�VEL E ENTRADA ENUM!!!
        	dadoTxt.append(tipoNotificacao1.substring(0, 1));
        	dadoCsv.append(tipoNotificacao1.substring(0, 1) + ";");
        
        GravarInformacaoTxtCsv gravador = new GravarInformacaoTxtCsv();
        gravador.gravarDisco(dadoTxt.toString(),dadoCsv.toString());          
    }
}
