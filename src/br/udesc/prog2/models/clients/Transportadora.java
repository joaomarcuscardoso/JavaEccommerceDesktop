/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.clients;

import br.udesc.prog2.models.Conta;


class Transportadora {
    private ETransportador transporte;
    private String tempoParaEntrega;
    private double preco;
    private Conta conta;
    
    public Transportadora(ETransportador transporte, String tempoParaEntrega, Conta conta) {
        this.transporte = transporte;
        this.tempoParaEntrega = tempoParaEntrega;
        this.conta = conta;
    }
    
    
    private double calcularFrete(int distancia) {
        // KM * 0.15;
        this.preco = distancia * 0.15;
        return this.preco;
    }

    public ETransportador getTransporte() {
        return transporte;
    }

    public String getTempoParaEntrega() {
        return tempoParaEntrega;
    }

    public Conta getInfosEndereco() {
        return conta;
    }
    
    
    
    
    
}
