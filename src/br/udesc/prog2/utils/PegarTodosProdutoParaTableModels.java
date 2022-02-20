/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.utils;

import br.udesc.prog2.dao.Produto.ProdutoDAO;
import br.udesc.prog2.models.products.Produto;
import java.util.ArrayList;

/**
 *
 * @author joaomarcus
 */
public class PegarTodosProdutoParaTableModels {
    
    public ArrayList<Produto> listarProdutos() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        return produtoDAO.getProdutos();
        
    }
}
