/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views.products;

import br.udesc.prog2.controllers.contas.LoginController;
import br.udesc.prog2.controllers.contas.RegistrarController;
import br.udesc.prog2.controllers.products.ListarProdutosController;
import br.udesc.prog2.controllers.products.pedidos.ControladorListarPedidos;
import br.udesc.prog2.dao.Conta.ContaDAO;
import br.udesc.prog2.dao.Produto.PedidosDAO;
import br.udesc.prog2.dao.Produto.ProdutoDAO;
import br.udesc.prog2.models.Conta;
import br.udesc.prog2.models.clients.Pedidos;
import br.udesc.prog2.models.products.EStatus;
import br.udesc.prog2.models.products.Produto;
import br.udesc.prog2.models.products.pedidos.table.PedidoTableModel;
import br.udesc.prog2.models.products.table.ProdutoTableModel;
import br.udesc.prog2.utils.ComboItem;
import br.udesc.prog2.utils.PegarTodosProdutoParaTableModels;
import br.udesc.prog2.views.accounts.LoginView;
import br.udesc.prog2.views.accounts.RegistrarView;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class EditarPedidosView extends javax.swing.JFrame {

    private int marcardor = 0;
    /**
     * Creates new form RegistrarView
     */
    public EditarPedidosView() {
        initComponents();
        popularComboBox();
    }
    
    public void mostrarTela(){
        setVisible(true);
        
    }
    
    
    public void popularComboBox() {
        PedidosDAO pedidosDAO = new PedidosDAO();
        ContaDAO contaDAO = new ContaDAO();

        
        ArrayList<Pedidos> pedidos = pedidosDAO.getPedidos(contaDAO.isLogado());

        for(Pedidos p : pedidos) {
            comboEdit.addItem(new ComboItem(p.getId(), p.toString()));
        }

        for(EStatus s : EStatus.values()) {
            
            comboEstatus.addItem(new ComboItem(marcardor, s.name()));
            marcardor++;
        }
        
        marcardor = 0;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSendDelProduto = new javax.swing.JButton();
        comboEdit = new javax.swing.JComboBox();
        labelCategoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelCategoria1 = new javax.swing.JLabel();
        comboEstatus = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnProdutos = new javax.swing.JMenu();
        btnMontarPc = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        btnContainerConta = new javax.swing.JMenu();
        btnMenuLogin = new javax.swing.JMenuItem();
        btnMenuRegistrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSendDelProduto.setBackground(new java.awt.Color(191, 75, 75));
        btnSendDelProduto.setText("Salvar");
        btnSendDelProduto.setBorderPainted(false);
        btnSendDelProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendDelProdutoActionPerformed(evt);
            }
        });

        comboEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEditActionPerformed(evt);
            }
        });

        labelCategoria.setText("Pedidos");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("Editar Pedidos");

        labelCategoria1.setText("Estatus");

        comboEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstatusActionPerformed(evt);
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

        btnContainerConta.setForeground(new java.awt.Color(255, 255, 255));
        btnContainerConta.setText("Conta");

        btnMenuLogin.setText("Login");
        btnMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuLoginActionPerformed(evt);
            }
        });
        btnContainerConta.add(btnMenuLogin);

        btnMenuRegistrar.setText("Registrar-se");
        btnMenuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuRegistrarActionPerformed(evt);
            }
        });
        btnContainerConta.add(btnMenuRegistrar);

        jMenuBar1.add(btnContainerConta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCategoria1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelCategoria))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEdit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSendDelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)))
                    .addComponent(comboEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(labelCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCategoria1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnSendDelProduto)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuLoginActionPerformed
        new LoginController(new LoginView());
        this.dispose();
    }//GEN-LAST:event_btnMenuLoginActionPerformed

    private void btnMenuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuRegistrarActionPerformed
        // TODO add your handling code here:
        new RegistrarController(new RegistrarView());
        this.dispose();                                   

    }//GEN-LAST:event_btnMenuRegistrarActionPerformed

    private void btnSendDelProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendDelProdutoActionPerformed
        //int resposta = JOptionPane.showConfirmDialog(this, );
        String[] options = {"sim", "não"};
        int resposta = JOptionPane.showOptionDialog(this, "Você tem certeza que quer editar esse produto", "Editar Pedido", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
        if(resposta == 0) {
            ContaDAO contaDAO = new ContaDAO();

               
            if(contaDAO.isADmin() == true) {
                
                PedidosDAO pedidosDAO = new PedidosDAO();
                Object selected = this.comboEdit.getSelectedItem();

                int id = ((ComboItem)selected).getKey();

                pedidosDAO.editarPedidos(id, comboEstatus.getSelectedItem().toString(), contaDAO.isLogado());

                JOptionPane.showMessageDialog(this, "Pedido editado com sucesso!");

                new ControladorListarPedidos(new  PedidosView(), new PedidoTableModel(pedidosDAO.getPedidos(contaDAO.isLogado())));
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(this, "Você não tem permissão para alterar essa pagina!");
            }
        } 
    }//GEN-LAST:event_btnSendDelProdutoActionPerformed

    private void comboEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEditActionPerformed

    private void comboEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstatusActionPerformed

    private void btnMontarPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontarPcActionPerformed
        // TODO add your handling code here:
        PedidosDAO pedidosDAO = new PedidosDAO();
        ContaDAO contaDAO = new ContaDAO();
        new ControladorListarPedidos(new  PedidosView(), new PedidoTableModel(pedidosDAO.getPedidos(contaDAO.isLogado())));
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
    }//GEN-LAST:event_btnProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPedidosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnContainerConta;
    private javax.swing.JMenuItem btnMenuLogin;
    private javax.swing.JMenuItem btnMenuRegistrar;
    private javax.swing.JRadioButtonMenuItem btnMontarPc;
    private javax.swing.JMenu btnProdutos;
    private javax.swing.JButton btnSendDelProduto;
    private javax.swing.JComboBox comboEdit;
    private javax.swing.JComboBox comboEstatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCategoria1;
    // End of variables declaration//GEN-END:variables
}
