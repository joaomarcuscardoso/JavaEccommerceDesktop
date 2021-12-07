/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.Produto;
import java.util.ArrayList;

/**
 *
 * @author rfcjo
 */
public class ProdutoDAO {
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    
    public void setProdutos() {
        produtos.add(new Produto("Memoria Ram", "Memoria ram boa", "Memoria", 10, 500, 12));
        produtos.add(new Produto("Ryzen 7 3700x", "Processador high End", "Processador", 50, 2300, 52));
        produtos.add(new Produto("Coller Xio", "Coller", "Coller", 20, 500, 20));
    }
    
    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }
    
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
}
