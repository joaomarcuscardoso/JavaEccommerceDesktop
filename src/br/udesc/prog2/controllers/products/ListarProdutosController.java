package br.udesc.prog2.controllers.products;


import br.udesc.prog2.dao.Produto.ProdutoDAO;
import br.udesc.prog2.models.products.Produto;
import br.udesc.prog2.models.products.table.ProdutoTableModel;
import br.udesc.prog2.views.products.ProdutoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaomarcus
 */
public class ListarProdutosController {
    private ProdutoView produtoView;
    private ProdutoTableModel produtoTableModel;
    private ProdutoDAO produtoDao = new ProdutoDAO();
    
    public ListarProdutosController(ProdutoView produtoView, ProdutoTableModel produtoTableModel) {
        this.produtoView = produtoView;
        this.produtoTableModel = produtoTableModel;
        
        setTableModel();
        adicionarAcaoBotaoExcluir();
        adicionarEventos(); 
        
        exibir();
                                
    }
    
    private void setTableModel(){
        produtoView.setTableModel(this.produtoTableModel);
    }
    
    public void exibir(){
        produtoView.mostrarTela();
    }
    
    public void atualizarDados(){
        produtoTableModel.fireTableDataChanged();
        produtoTableModel.setProdutos(produtoDao.getProdutos());
        System.out.print("Atualizando dados..");
    }
    
    public void adicionarAcaoBotaoExcluir(){
        produtoView.btnProdutosDelete(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirProduto();
            }
        });
    }
    
    public void excluirProduto(){
        String idString = produtoView.getIdLinhaSelecionada();
        
        if(idString != null) {
            
            int id = Integer.valueOf(idString);
            
            if(this.produtoDao.deletarProdutoPorId(id)){
                produtoView.exibirMensagem("Produto excluido com sucesso");
                atualizarDados();
            } else {
                produtoView.exibirMensagem("Não foi possível excluir o produto");
            }
            
        } else {
            produtoView.exibirMensagem("Não foi possível excluir o produto");
        }
    }
    
    public void adicionarEventos(){
        produtoView.addEventAlterTable(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (TableModelEvent.UPDATE == e.getType()) {
                   int row = e.getFirstRow();
                   int column = e.getColumn();
                   if(row >=0 && column >=0){
                        ProdutoTableModel model = (ProdutoTableModel)e.getSource();
                        String id = (String) model.getValueAt(row, 0);
                        Produto produtos = produtoTableModel.getProdutos().get(row);
                        System.out.println(produtos);
                        produtoDao.editarProduto(produtos);
                        atualizarDados();
                   }
                 }
            }
        });
    }
    
}
