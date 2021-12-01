/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author rfcjo
 */
class Pagamento {
    private String nomePagamento;
    private int numeroCartao;
    private String cvv;
    private Date dataDeValidade;
    private String nomeCartao;
    private int digito;

    public Pagamento(String nomePagamento, int numeroCartao, String cvv, Date dataDeValidade, String nomeCartao, int digito) {
        this.nomePagamento = nomePagamento;
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
        this.dataDeValidade = dataDeValidade;
        this.nomeCartao = nomeCartao;
        this.digito = digito;
    }

    public String getNomePagamento() {
        return nomePagamento;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public int getDigito() {
        return digito;
    }
    
    
    
    
}
