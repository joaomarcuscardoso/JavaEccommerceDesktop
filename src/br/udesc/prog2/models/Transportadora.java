/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models;

/**
 *
 * @author rfcjo
 */
class Transportadora {
    private ETransportador transporte;
    private String tempoParaEntrega;
    private double preco;
    private Cliente cliente;
    
    public Transportadora(ETransportador transporte, String tempoParaEntrega, Cliente cliente) {
        this.transporte = transporte;
        this.tempoParaEntrega = tempoParaEntrega;
        this.cliente = cliente;
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

    public Cliente getInfosEndereco() {
        return cliente;
    }
    
    
    
    
    
}
