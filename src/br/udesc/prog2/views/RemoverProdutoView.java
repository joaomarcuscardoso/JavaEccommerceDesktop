/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views;

import br.udesc.prog2.dao.ProdutoDAO;
import br.udesc.prog2.models.Produto;
import br.udesc.prog2.utils.ComboItem;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class RemoverProdutoView extends javax.swing.JFrame {
    /**
     * Creates new form RegistrarView
     */
    public RemoverProdutoView() {
        initComponents();
        popularComboBox();
    }
    
    
    public void popularComboBox() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ArrayList<Produto> produtos = produtoDAO.getProdutos();

        for(Produto p : produtos) {
            comboRm.addItem(new ComboItem(p.getId(), p.toString()));
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSendDelProduto = new javax.swing.JButton();
        comboRm = new javax.swing.JComboBox();
        labelCategoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenuProduto = new javax.swing.JMenu();
        btnMenuMontarPc = new javax.swing.JMenu();
        btnContainerConta = new javax.swing.JMenu();
        btnMenuLogin = new javax.swing.JMenuItem();
        btnMenuRegistrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSendDelProduto.setBackground(new java.awt.Color(191, 75, 75));
        btnSendDelProduto.setText("Deletar Produto");
        btnSendDelProduto.setBorderPainted(false);
        btnSendDelProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendDelProdutoActionPerformed(evt);
            }
        });

        comboRm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRmActionPerformed(evt);
            }
        });

        labelCategoria.setText("Produto");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("Deletar Produto");

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setAlignmentY(0.5F);

        btnMenuProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuProduto.setText("Produtos");
        btnMenuProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuProdutoMouseClicked(evt);
            }
        });
        btnMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProdutoActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnMenuProduto);

        btnMenuMontarPc.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuMontarPc.setText("Montar Pc");
        jMenuBar1.add(btnMenuMontarPc);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(178, 190, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(216, 216, 216))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboRm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSendDelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCategoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(labelCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboRm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnSendDelProduto)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuLoginActionPerformed

    }//GEN-LAST:event_btnMenuLoginActionPerformed

    private void btnMenuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuRegistrarActionPerformed

    private void btnMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProdutoActionPerformed

    }//GEN-LAST:event_btnMenuProdutoActionPerformed

    private void btnMenuProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuProdutoMouseClicked


    }//GEN-LAST:event_btnMenuProdutoMouseClicked

    private void btnSendDelProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendDelProdutoActionPerformed
        //int resposta = JOptionPane.showConfirmDialog(this, );
        String[] options = {"sim", "não"};
        int resposta = JOptionPane.showOptionDialog(this, "Você tem certeza que quer deletar esse produto", "Remover Produto", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
        
        if(resposta == 0) {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            Object selected = this.comboRm.getSelectedItem();
            int id = ((ComboItem)selected).getKey();
            produtoDAO.deletarProdutoPorId(id);
           
           JOptionPane.showMessageDialog(this, "Produto excluido com sucesso!");
           
            new HomeView().setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_btnSendDelProdutoActionPerformed

    private void comboRmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRmActionPerformed

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
            java.util.logging.Logger.getLogger(RemoverProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnContainerConta;
    private javax.swing.JMenuItem btnMenuLogin;
    private javax.swing.JMenu btnMenuMontarPc;
    private javax.swing.JMenu btnMenuProduto;
    private javax.swing.JMenuItem btnMenuRegistrar;
    private javax.swing.JButton btnSendDelProduto;
    private javax.swing.JComboBox comboRm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelCategoria;
    // End of variables declaration//GEN-END:variables
}
