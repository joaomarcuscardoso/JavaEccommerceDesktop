/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views.products;

import br.udesc.prog2.controllers.contas.LoginController;
import br.udesc.prog2.controllers.contas.RegistrarController;
import br.udesc.prog2.controllers.products.CompraController;
import br.udesc.prog2.controllers.products.CriarProdutoController;
import br.udesc.prog2.controllers.products.ListarProdutosController;
import br.udesc.prog2.controllers.products.pedidos.ControladorListarPedidos;
import br.udesc.prog2.controllers.products.pedidos.EditarPedidosController;
import br.udesc.prog2.dao.Conta.ContaDAO;
import br.udesc.prog2.dao.Produto.PedidosDAO;
import br.udesc.prog2.views.accounts.LoginView;
import br.udesc.prog2.views.accounts.RegistrarView;
import br.udesc.prog2.views.products.CriarProdutoView;
import br.udesc.prog2.views.products.EditarPedidosView;
import br.udesc.prog2.dao.Produto.ProdutoDAO;
import br.udesc.prog2.main.App;
import br.udesc.prog2.models.clients.Pedidos;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
import br.udesc.prog2.models.products.Produto;
import br.udesc.prog2.models.products.pedidos.table.PedidoTableModel;
import br.udesc.prog2.models.products.table.ProdutoTableModel;
import br.udesc.prog2.utils.PegarTodosProdutoParaTableModels;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author rfcjo
 */
public class PedidosView extends javax.swing.JFrame {
    private ArrayList<Produto> listaProdutos;
    private DefaultTableModel model;
    private static String salvaBusca;
    
    /**
     * Creates new form HomeView
     */
    public PedidosView() {
        initComponents();
    }
    
    public void mostrarTela(){
        setVisible(true);
        
    }

    
    public void setTableModel(TableModel tableModel){
        tbPedidosView.setModel(tableModel);
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        buscaContainer = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        btnCompraPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPedidosView = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnProdutos = new javax.swing.JMenu();
        btnMontarPc = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnLogin = new javax.swing.JMenuItem();
        btnRegistrar = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(650, 559));

        buscaContainer.setBackground(new java.awt.Color(204, 204, 204));
        buscaContainer.setMaximumSize(new java.awt.Dimension(500, 500));
        buscaContainer.setMinimumSize(null);
        buscaContainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaContainerActionPerformed(evt);
            }
        });

        btnPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisa.setForeground(new java.awt.Color(204, 204, 204));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/udesc/prog2/assets/images/magnifying-glass.png"))); // NOI18N
        btnPesquisa.setMaximumSize(new java.awt.Dimension(500, 500));
        btnPesquisa.setMinimumSize(null);
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnCompraPedido.setBackground(new java.awt.Color(191, 75, 75));
        btnCompraPedido.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCompraPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnCompraPedido.setText("Comprar Pedido");
        btnCompraPedido.setBorderPainted(false);
        btnCompraPedido.setMaximumSize(new java.awt.Dimension(500, 500));
        btnCompraPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraPedidoActionPerformed(evt);
            }
        });

        jScrollPane1.setMaximumSize(new java.awt.Dimension(500, 500));
        jScrollPane1.setMinimumSize(null);

        tbPedidosView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "Quantidade", "Preço", "Status", "Excluir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPedidosView.setMaximumSize(new java.awt.Dimension(500, 500));
        jScrollPane1.setViewportView(tbPedidosView);

        btnExcluir.setBackground(new java.awt.Color(191, 75, 75));
        btnExcluir.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Remover Pedido");
        btnExcluir.setBorderPainted(false);
        btnExcluir.setMaximumSize(new java.awt.Dimension(500, 500));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar1.setBackground(new java.awt.Color(191, 75, 75));
        btnEditar1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEditar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar1.setText("Editar Pedido");
        btnEditar1.setBorderPainted(false);
        btnEditar1.setMaximumSize(new java.awt.Dimension(500, 500));
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setAlignmentY(0.5F);

        btnProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutos.setText("Produtos");
        btnProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdutosMouseClicked(evt);
            }
        });
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnMontarPc.setSelected(true);
        btnMontarPc.setText("Pedidos");
        btnMontarPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontarPcActionPerformed(evt);
            }
        });
        btnProdutos.add(btnMontarPc);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Produtos");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        btnProdutos.add(jRadioButtonMenuItem1);

        jMenuBar1.add(btnProdutos);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Conta");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jMenu4.add(btnLogin);

        btnRegistrar.setText("Registrar-se");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jMenu4.add(btnRegistrar);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCompraPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCompraPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCompraPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraPedidoActionPerformed
        new CompraController(new CompraView());
        this.dispose();
    }//GEN-LAST:event_btnCompraPedidoActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new LoginController(new LoginView());
        this.dispose();

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        new RegistrarController(new RegistrarView());
        this.dispose();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    public String getIdLinhaSelecionada(){
        if(tbPedidosView.getSelectedRow() == -1){
            System.out.println("Nenhuma Linha selecionada");
            return null;
        }
        
        return tbPedidosView.getModel().getValueAt(tbPedidosView.getSelectedRow(), 0).toString();
    }
    

    
    public void btnProdutosDelete(java.awt.event.ActionListener acao) {
        btnExcluir.addActionListener(acao);
    }
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
//        System.out.println("entrou");
//        new EditarPedidosView().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        PedidosDAO pedidosDAO = new PedidosDAO();
        String buscaNome = buscaContainer.getText();
        ContaDAO contaDAO = new ContaDAO();
        
        ArrayList<Pedidos> pedidos = pedidosDAO.getPedidosByName(buscaNome, contaDAO.isLogado());

        ControladorListarPedidos controlador = new ControladorListarPedidos(new PedidosView(), new PedidoTableModel(pedidos));
        controlador.exibir();
        this.dispose();

    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void buscaContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaContainerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaContainerActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        new EditarPedidosController(new EditarPedidosView());
        this.dispose();

    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnMontarPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontarPcActionPerformed
        // TODO add your handling code here:
        PedidosDAO pedidosDAO = new PedidosDAO();
        ContaDAO contaDAO = new ContaDAO();
        new ControladorListarPedidos(new  PedidosView(), new PedidoTableModel(pedidosDAO.getPedidos(contaDAO.isLogado())));
        this.dispose();
    }//GEN-LAST:event_btnMontarPcActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
        new ListarProdutosController(new ProdutoView(), new ProdutoTableModel(new PegarTodosProdutoParaTableModels().listarProdutos()));
        this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void btnProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProdutosMouseClicked

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        ProdutoDAO produtoDAO = new ProdutoDAO();

        new ListarProdutosController(new ProdutoView(), new ProdutoTableModel(new PegarTodosProdutoParaTableModels().listarProdutos()));
        this.dispose();

    }//GEN-LAST:event_btnProdutosActionPerformed

    public void exibirMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    

    
    public void addEventAlterTable(TableModelListener l){
        tbPedidosView.getModel().addTableModelListener(l);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //tablePrincipal.add(new Object[]{)
        //tablePrincipal.add(new Object[]{)
        //tablePrincipal.add(new Object[]{)
        //tablePrincipal.add(new Object[]{)
        //tablePrincipal.add(new Object[]{)
        //tablePrincipal.add(new Object[]{)
        //tablePrincipal.add(new Object[]{)
        //tablePrincipal.add(new Object[]{)
               
        
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosView().setVisible(true);
            }
        });

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompraPedido;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JMenuItem btnLogin;
    private javax.swing.JRadioButtonMenuItem btnMontarPc;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JMenu btnProdutos;
    private javax.swing.JMenuItem btnRegistrar;
    private javax.swing.JTextField buscaContainer;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPedidosView;
    // End of variables declaration//GEN-END:variables

}
