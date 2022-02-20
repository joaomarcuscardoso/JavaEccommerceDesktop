/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.controllers.products.pedidos;

import br.udesc.prog2.dao.Conta.ContaDAO;
import br.udesc.prog2.dao.Produto.PedidosDAO;
import br.udesc.prog2.models.clients.Pedidos;
import br.udesc.prog2.models.products.pedidos.table.PedidoTableModel;
import br.udesc.prog2.models.products.table.ProdutoTableModel;
import br.udesc.prog2.views.products.PedidosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author joaomarcus
 */
public class ControladorListarPedidos {
    private PedidosView pedidosView;
    private PedidoTableModel pedidoTableModel;
    private PedidosDAO pedidosDAO = new PedidosDAO();
    
    public ControladorListarPedidos(PedidosView pedidosView, PedidoTableModel pedidoTableModel) {
        this.pedidosView = pedidosView;
        this.pedidoTableModel = pedidoTableModel;
        
        setTableModel();
        adicionarAcaoBotaoExcluir();
        adicionarEventos(); 
        
        exibir();
                                
    }
    
    private void setTableModel(){
        pedidosView.setTableModel(this.pedidoTableModel);
    }
    
    public void exibir(){
        pedidosView.mostrarTela();
    }
    
    public void atualizarDados(){
        pedidoTableModel.fireTableDataChanged();
        ContaDAO contaDAO = new ContaDAO();
        
        pedidoTableModel.setPedidos(pedidosDAO.getPedidos(contaDAO.isLogado()));
        System.out.print("Atualizando dados..");
    }
    
    public void adicionarAcaoBotaoExcluir(){
        pedidosView.btnProdutosDelete(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirProduto();
            }
        });
    }
    
    public void excluirProduto(){
        String idString = pedidosView.getIdLinhaSelecionada();
        
        if(idString != null) {
            
            int id = Integer.valueOf(idString);
            ContaDAO contaDAO = new ContaDAO();

            if(this.pedidosDAO.deletarPedidosPorId(id, contaDAO.isLogado())){
                pedidosView.exibirMensagem("pedido excluido com sucesso");
                atualizarDados();
            } else {
                pedidosView.exibirMensagem("Não foi possível excluir o pedido");
            }
            
        } else {
            pedidosView.exibirMensagem("Não foi possível excluir o pedido");
        }
    }
    
    public void adicionarEventos(){
        pedidosView.addEventAlterTable(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (TableModelEvent.UPDATE == e.getType()) {
                   int row = e.getFirstRow();
                   int column = e.getColumn();
                   if(row >=0 && column >=0){
                        ProdutoTableModel model = (ProdutoTableModel)e.getSource();
                        String id = (String) model.getValueAt(row, 0);
                        Pedidos pedidos = pedidoTableModel.getPedidos().get(row);
//                        pedidosDAO.editarPedidos(pedidos);
                        atualizarDados();
                   }
                 }
            }
        });
    }
}
