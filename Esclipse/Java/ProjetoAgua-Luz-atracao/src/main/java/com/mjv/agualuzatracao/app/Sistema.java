package com.mjv.agualuzatracao.app;

import java.time.LocalDate;
import java.time.LocalTime;

import com.mjv.agualuzatracao.enums.Paises;
import com.mjv.agualuzatracao.enums.Servico;
import com.mjv.agualuzatracao.enums.TipoNotificacao;
import com.mjv.agualuzatracao.enums.TipoServico;
import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Endereco;
import com.mjv.agualuzatracao.util.FormatadorUtil;
import com.mjv.agualuzatracao.util.GeradorConteudo;

public class Sistema {
    public static void main(String[] args) {

        Cadastro cliente = new Cadastro();
        Contrato contrato = new Contrato();
        Endereco endereco = new Endereco();
        cliente.setEndereco(endereco);
        cliente.setContrato(contrato);
        
        //cliente.setContrato();
        
   

        cliente.setCpf("007.324.223-21");
        cliente.setRg("33765-5");
        cliente.setNome("Raimundo Nonato Loureiro Castelo Branco");
        cliente.setNumTel("(11)99768-1515");


        endereco.setLogradouro("Rua Sebastião Firmino");
        endereco.setNumero("123");
        endereco.setComplemento("AP 210 BL CENTAURO");
        endereco.setBairro("São Sebastião");
        endereco.setCidade("São Raimundo Nonato");
        endereco.setEstado("Sp");
        endereco.setCep("07.210.715");
        endereco.setPais(Paises.BRASIL);
        
        contrato.setNumeroProtocolo(1984365l);
        contrato.setData(LocalDate.of(2022, 05, 07));
        contrato.setHora(LocalTime.of(15, 21));
        contrato.setTipoServico(TipoServico.AGUA);
        contrato.setServico(Servico.AGUA);
//        notificacao.setValor(127.35);
        contrato.setTipoNotificacao(TipoNotificacao.SMS);
        
        FormatadorUtil ftxt = new FormatadorUtil();
        System.out.println(ftxt.padronizarTamanho(cliente.getNome(), 30));
        
//        GeradorConteudo gc = new GeradorConteudo();
//        gc.gerarDados(cliente);
    }
    
}