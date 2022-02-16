/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.products.table;

import br.udesc.prog2.dao.ProdutoDAO;
import br.udesc.prog2.models.products.Produto;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rfcjo
 */
public class ProdutoTableModel extends AbstractTableModel {
    private List<Produto> produtos;
    
    private final String[] dados = {"ID", "Nome", "Categoria", "Quantidade", "Preço"};
    private final int Col_Id = 0;
    private final int Col_Nome = 1;
    private final int Col_Categoria = 2;
    private final int Col_Quantidade = 3;
    private final int Col_Preco = 4;
    
    public ProdutoTableModel(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
        @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return dados.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return dados[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produtos = this.produtos.get(rowIndex);
        String valor = null;
        switch(columnIndex){
            case Col_Id:
                valor = String.valueOf(produtos.getId());
                break;
            case Col_Nome:
                valor = produtos.getNome();
                break;
            case Col_Categoria:
                valor = produtos.getCategoria();
                break;
            case Col_Quantidade:
                valor = String.valueOf( produtos.getQuantidade());
                break;
            case Col_Preco:
                valor = String.valueOf( produtos.getPreco());
                break;
        }
        return valor;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        
        if(columnIndex == Col_Id)
            return false;
        return true;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    	Produto produto = this.produtos.get(rowIndex);

        switch (columnIndex) {
            case Col_Id:
                produto.setId((Integer) aValue);
                break;
            case Col_Nome:
                produto.setNome((String) aValue);
                break;
            case Col_Categoria:
                produto.setCategoria((String) aValue);
                break;
            case Col_Quantidade:
                produto.setQuantidade(Integer.valueOf((String) aValue));
                break;
            case Col_Preco:
                produto.setPreco(Double.valueOf((String) aValue));
                break;
        }
        //este método é que notifica a tabela que houve alteração de dados
        fireTableDataChanged();
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos.clear();
        this.produtos.addAll(produtos);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
 
}
