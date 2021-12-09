/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views;

import br.udesc.prog2.dao.ProdutoDAO;
import br.udesc.prog2.main.App;
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
import br.udesc.prog2.models.Cliente;
import br.udesc.prog2.models.Produto;
import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author rfcjo
 */
public class HomeView extends javax.swing.JFrame {
    private ArrayList<Produto> listaProdutos;
    private DefaultTableModel model;
    
    /**
     * Creates new form HomeView
     */
    public HomeView() {
        initComponents();
        model = (DefaultTableModel) tbPrincipal.getModel();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        adicionarLinhasInicias(produtoDAO.getProdutos());
    }

    public void adicionarLinhasInicias(ArrayList<Produto> produtos) {
   
        for(int i =0; i< produtos.size();i++) {
            Object[] obj = {produtos.get(i).getNome(), produtos.get(i).getCategoria(), String.valueOf(produtos.get(i).getQuantidade()), String.valueOf(produtos.get(i).getPreco())};
            model.addRow(obj);
            
        }

        model.fireTableRowsUpdated(ERROR, ERROR);
        
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
        btnAddProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPrincipal = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnProdutos = new javax.swing.JMenu();
        btnMontarPc = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btnLogin = new javax.swing.JMenuItem();
        btnRegistrar = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 238, 238));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buscaContainer.setBackground(new java.awt.Color(204, 204, 204));
        buscaContainer.setMinimumSize(new java.awt.Dimension(15, 25));
        buscaContainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaContainerActionPerformed(evt);
            }
        });

        btnPesquisa.setBackground(new java.awt.Color(204, 204, 204));
        btnPesquisa.setForeground(new java.awt.Color(204, 204, 204));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/udesc/prog2/assets/images/magnifying-glass.png"))); // NOI18N
        btnPesquisa.setMaximumSize(new java.awt.Dimension(25, 25));
        btnPesquisa.setMinimumSize(new java.awt.Dimension(25, 25));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnAddProduto.setBackground(new java.awt.Color(191, 75, 75));
        btnAddProduto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAddProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduto.setText("Criar Produto");
        btnAddProduto.setBorderPainted(false);
        btnAddProduto.setMaximumSize(new java.awt.Dimension(120, 25));
        btnAddProduto.setMinimumSize(new java.awt.Dimension(120, 25));
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });

        tbPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Categoria", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPrincipal);

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setAlignmentY(0.5F);

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
        jMenuBar1.add(btnProdutos);

        btnMontarPc.setText("Montar Pc");
        btnMontarPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMontarPcActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnMontarPc);

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
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)
                        .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaContainerActionPerformed
        // TODO add your handling code here:
                System.out.println("Oi1");

    }//GEN-LAST:event_buscaContainerActionPerformed

    
    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
                System.out.println("Oi2");

    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        // TODO add your handling code here:
        new CriarProdutoView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddProdutoActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new LoginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnMontarPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontarPcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMontarPcActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        new RegistrarView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosMouseClicked
        // TODO add your handling code here:
        new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosMouseClicked

    public void mostrarTela() {
        setVisible(true);
    }
    
    public void addProdutoInLista(Produto prod) {
        System.out.println("Entrou addProdutoInsta: "+prod.toString());
        if(prod != null) 
        {
           Object[] obj = {prod.getNome(), prod.getCategoria(), String.valueOf(prod.getQuantidade()), String.valueOf(prod.getPreco())};
           model.addRow(obj);
        }
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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //tablePrincipal.add(new Object[]{)
               
        
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JMenuItem btnLogin;
    private javax.swing.JMenu btnMontarPc;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JMenu btnProdutos;
    private javax.swing.JMenuItem btnRegistrar;
    private javax.swing.JTextField buscaContainer;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPrincipal;
    // End of variables declaration//GEN-END:variables

}