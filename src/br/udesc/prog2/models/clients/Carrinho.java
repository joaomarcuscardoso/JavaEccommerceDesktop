/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.clients;

import br.udesc.prog2.models.Conta;
import br.udesc.prog2.models.clients.Pagamento;
import br.udesc.prog2.models.products.Produto;
import br.udesc.prog2.models.clients.Transportadora;
import java.util.ArrayList;
import java.util.Collections;

public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Pagamento pagamento;
    private Transportadora transportadora;
    private Conta cliente;

    public Carrinho(Pagamento pagamento, Transportadora transportadora, Conta cliente) {
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
