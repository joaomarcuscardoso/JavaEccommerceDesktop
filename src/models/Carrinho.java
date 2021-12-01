/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author rfcjo
 */
public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Pagamento pagamento;
    private Transportadora transportadora;
    
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
