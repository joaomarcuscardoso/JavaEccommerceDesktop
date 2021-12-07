/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views;

import br.udesc.prog2.dao.ProdutoDAO;
import br.udesc.prog2.models.Produto;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rfcjo
 */
public class ProdutosView extends JFrame {
    private JTable tbPrincipal;
    private Object[][] dados;
    
    public void adicionarLinhasInicias() {
        
        String[] colunas = {"Nome", "Categoria", "Quantidade", "Preço"};
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        ArrayList<Produto> produtos = produtoDAO.getProdutos();
        
        Object[][] dados = new  Object[produtos.size()][produtos.size()];
        
        for(int i =0; i< produtos.size();i++) {
            
            Object[] obj = {produtos.get(i).getNome(), produtos.get(i).getCategoria(), String.valueOf(produtos.get(i).getQuantidade()), String.valueOf(produtos.get(i).getPreco())};
            dados[i] = obj;
            
        } 
        
        tbPrincipal = new JTable(dados, colunas);
        
        tbPrincipal.setPreferredScrollableViewportSize(new Dimension(400, 400));
        tbPrincipal.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(tbPrincipal);
        add(scrollPane);
    }
 
}
