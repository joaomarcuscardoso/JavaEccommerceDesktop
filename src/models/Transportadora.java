/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author rfcjo
 */
class Transportadora {
    private ETransportador transporte;
    private String tempoParaEntrega;
    private double preco;
    private informacaoAdicionais infosEndereco;

    public Transportadora(ETransportador transporte, String tempoParaEntrega, informacaoAdicionais infosEndereco) {
        this.transporte = transporte;
        this.tempoParaEntrega = tempoParaEntrega;
        this.infosEndereco = infosEndereco;
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

    public informacaoAdicionais getInfosEndereco() {
        return infosEndereco;
    }
    
    
    
    
    
}
