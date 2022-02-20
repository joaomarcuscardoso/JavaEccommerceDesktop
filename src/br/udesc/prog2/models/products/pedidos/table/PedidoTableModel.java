package br.udesc.prog2.models.products.pedidos.table;

import br.udesc.prog2.models.clients.Pedidos;
import br.udesc.prog2.models.products.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rfcjo
 */
public class PedidoTableModel extends AbstractTableModel {
    private List<Pedidos> pedidos;
    private List<Produto> produtos;
    
    private final String[] dados = {"ID", "Nome", "Quantidade", "Preço", "Status"};
    private final int Col_Id = 0;
    private final int Col_Nome = 1;
    private final int Col_Quantidade = 2;
    private final int Col_Preco = 3;
    private final int Col_Status = 4;
    
    public PedidoTableModel(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
    
    @Override
    public int getRowCount() {
        return pedidos.size();
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
        Pedidos pedidos = this.pedidos.get(rowIndex);

        String valor = null;
        switch(columnIndex){
            case Col_Id:
                valor = String.valueOf(pedidos.getId());
                break;
            case Col_Nome:
                valor = pedidos.getNomeProduto();
                break;
            case Col_Status:
                valor = String.valueOf(pedidos.getEstatus());
                break;
            case Col_Quantidade:
                valor = String.valueOf( pedidos.getQuantidade());
                break;
            case Col_Preco:
                valor = String.valueOf( pedidos.getPreco());
                break;
        }
        return valor;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        
        if(columnIndex == Col_Id || columnIndex == Col_Nome || columnIndex == Col_Quantidade || columnIndex == Col_Preco || columnIndex == Col_Status)
            return false;
        return true;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos.clear();
        this.pedidos.addAll(pedidos);
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }
    

 
}
