/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rfcjo
 */
public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Pagamento pagamento;
    private Transportadora transportadora;
    private Cliente cliente;

    public Carrinho(Pagamento pagamento, Transportadora transportadora, Cliente cliente) {
        this.pagamento = pagamento;
        this.transportadora = transportadora;
        this.cliente = cliente;
    }
    
    
    
    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    public void removeQtdProduto(Produto produto) {
        Produto listProduto = produtos.get(produtos.indexOf(produto));
        int quantidade = listProduto.removeQuantidade();
        if(listProduto.getQuantidade() == quantidade) {
            produtos.remove(listProduto);
        }
    }
    
    
    public void setPagamento() {
        this.pagamento = pagamento;
    }
    
    public Pagamento getPagamento() {
        return this.pagamento;
    }
}
