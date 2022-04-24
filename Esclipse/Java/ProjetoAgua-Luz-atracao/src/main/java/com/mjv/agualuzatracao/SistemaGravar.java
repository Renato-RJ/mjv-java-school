package com.mjv.agualuzatracao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class SistemaGravar {
	public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);
        
        String nome, cpf,rg,logradouro,complemento,bairro,cidade,uf,cep, pais1;
        int ano=0001,mes=01,dia=01,horavar=00,minuto=00;
        Long tel, numEnd, protocolo;
        TipoServico tipoServico;
        double valor;
        TipoNotificacao tipoNotificacao;
        Paises pais;
        
        System.out.println("Nome completo do titular da instalação:");
        nome = leituraTeclado.nextLine().toUpperCase();
        System.out.println("CPF do titular:");
        cpf = leituraTeclado.nextLine().replaceAll("\\D","");
        System.out.println("RG do titular da instalação:");
        rg = leituraTeclado.nextLine().replaceAll("\\D","");
        System.out.println("Informe um telefone para contato: ");
        tel = Long.parseLong(leituraTeclado.nextLine());
        System.out.println("Logradouro:");
        logradouro = leituraTeclado.nextLine().toUpperCase();
        System.out.println("Informe o número da residência: ");
        numEnd = Long.parseLong(leituraTeclado.nextLine());
        System.out.println("Complemento:");
        complemento = leituraTeclado.nextLine().toUpperCase();
        System.out.println("Bairro:");
        bairro = leituraTeclado.nextLine().toUpperCase();
        System.out.println("Cidade:");
        cidade = leituraTeclado.nextLine().toUpperCase();
        System.out.println("UF:");
        uf = leituraTeclado.nextLine().toUpperCase();
        System.out.println("CEP:");
        cep = leituraTeclado.nextLine().toUpperCase();
        System.out.println("País:");
        pais1 = leituraTeclado.nextLine().toUpperCase();		//CORRIGIR VARIÁVEL E ENTRADA ENUM!!!
        System.out.println("Protocolo: ");
        protocolo = Long.parseLong(leituraTeclado.nextLine());
        System.out.println("Informe a data desejada para instalação: \n(dd\nMM\naaaa)");
        dia = Integer.parseInt(leituraTeclado.nextLine());
        mes = Integer.parseInt(leituraTeclado.nextLine());
        ano = Integer.parseInt(leituraTeclado.nextLine());
        LocalDate data = LocalDate.of(ano,mes,dia);
        System.out.println("Informe a hora desejada para instalação: \n(HH\nMM)");
        horavar = Integer.parseInt(leituraTeclado.nextLine());
        minuto = Integer.parseInt(leituraTeclado.nextLine());
        LocalTime hora = LocalTime.of(horavar, minuto);
        System.out.println("Tipo de serviço (Água ou Luz):");				//CORRIGIR VARIÁVEL E ENTRADA ENUM!!!
        String tipoServico1  = leituraTeclado.nextLine().toUpperCase();
        if (tipoServico1 == "A")
        	valor = 127.33;
        else
        	valor = 132.15;
        System.out.println("Tipo de notificação (SMS ou WHATS):");
        String tipoNotificacao1 = leituraTeclado.nextLine().toUpperCase();		//CORRIGIR VARIÁVEL E ENTRADA ENUM!!!
        
        
        
        
        
       
        System.out.println(data);
        System.out.println(cpf);
        System.out.println(rg);
        
        
       
    }

}
