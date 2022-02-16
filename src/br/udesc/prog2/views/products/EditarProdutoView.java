/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views.products;

import br.udesc.prog2.dao.ProdutoDAO;
import br.udesc.prog2.models.products.Produto;
import br.udesc.prog2.exceptions.ExceptionDadosIncompletos;
import static br.udesc.prog2.utils.CategoriaOpcao.categoriasOpcao;
import br.udesc.prog2.utils.ComboItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class EditarProdutoView extends javax.swing.JFrame {
    /**
     * Creates new form RegistrarView
     */
    public EditarProdutoView() {
        initComponents();
        popularCategoriaComboBox();
        ArrayList<Produto> produtos = popularComboBox();
        popularInputsSelecionado(produtos);
        
        comboEdit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                popularInputsSelecionado(produtos);
            }
        });
    }
    
    public void popularCategoriaComboBox() {
        for(int i=0;i < categoriasOpcao.length;i++) {
            inputCategoria.addItem(new ComboItem(i, categoriasOpcao[i]));
        }
    }
    
    public void popularInputsSelecionado(ArrayList<Produto> produtos) {
        Object item = comboEdit.getSelectedItem();
        int id = ((ComboItem)item).getKey();
        
         for(Produto p : produtos) {
             if(id == p.getId()) {
                inputCategoria.setSelectedItem(p.getCategoria());
                InputPreco.setText( String.valueOf(p.getPreco()));
                inputQuantidade.setValue(p.getQuantidade());
                inputQuantidadeIdeal.setValue(p.getQuantidadeIdeal());
                inputNome.setText(p.getNome());
                inputDescricao.setText(p.getDescricao());
                inputRecomendado.setText(p.getRecomendacao());
                 
             }
         }
        
        
    }
    
    public ArrayList<Produto> popularComboBox() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ArrayList<Produto> produtos = produtoDAO.getProdutos();

        for(Produto p : produtos) {
            comboEdit.addItem(new ComboItem(p.getId(), p.toString()));
        }
        
        return produtos;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSendDelProduto = new javax.swing.JButton();
        comboEdit = new javax.swing.JComboBox();
        labelCategoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescricao = new javax.swing.JTextArea();
        labelCategoria1 = new javax.swing.JLabel();
        inputCategoria = new javax.swing.JComboBox<>();
        labelRecomendado = new javax.swing.JLabel();
        inputRecomendado = new javax.swing.JTextField();
        labelQuantidade = new javax.swing.JLabel();
        inputQuantidade = new javax.swing.JSpinner();
        labelQuantidadeIdeal = new javax.swing.JLabel();
        inputQuantidadeIdeal = new javax.swing.JSpinner();
        labelPreco = new javax.swing.JLabel();
        InputPreco = new javax.swing.JTextField();
        labelRS = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenuProduto = new javax.swing.JMenu();
        btnMenuMontarPc = new javax.swing.JMenu();
        btnContainerConta = new javax.swing.JMenu();
        btnMenuLogin = new javax.swing.JMenuItem();
        btnMenuRegistrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSendDelProduto.setBackground(new java.awt.Color(191, 75, 75));
        btnSendDelProduto.setText("Editar Produto");
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

        labelCategoria.setText("Produto");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("Editar Produto");

        labelNome.setText("Nome");

        labelDescricao.setText("Descrição");

        inputDescricao.setColumns(20);
        inputDescricao.setRows(5);
        jScrollPane1.setViewportView(inputDescricao);

        labelCategoria1.setText("Categoria");

        labelRecomendado.setText("Recomendado");

        labelQuantidade.setText("Quantidade");

        inputQuantidade.setPreferredSize(new java.awt.Dimension(70, 26));

        labelQuantidadeIdeal.setText("Quantidade ideal");

        labelPreco.setText("Preço:");

        InputPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPrecoActionPerformed(evt);
            }
        });

        labelRS.setText("R$");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNome))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCategoria1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelRecomendado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRS, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InputPreco))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelQuantidadeIdeal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputQuantidadeIdeal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnSendDelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEdit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCategoria)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inputRecomendado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputCategoria, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(labelCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDescricao)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCategoria1)
                .addGap(3, 3, 3)
                .addComponent(inputCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRecomendado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputRecomendado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidade)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidadeIdeal)
                    .addComponent(inputQuantidadeIdeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(InputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRS))
                .addGap(18, 18, 18)
                .addComponent(btnSendDelProduto)
                .addContainerGap(39, Short.MAX_VALUE))
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
        try {
            if(!InputPreco.getText().equals("") 
                && !inputCategoria.getSelectedItem().toString().equals("") 
                && !inputDescricao.getText().equals("") 
                && !inputNome.getText().equals("") 
                && inputQuantidade.getValue() != null 
                && inputQuantidadeIdeal.getValue() != null 
                && !inputRecomendado.getText().equals("")) 
            {
                ProdutoDAO produtoDAO = new ProdutoDAO();
                Object selected = this.comboEdit.getSelectedItem();
                int id = ((ComboItem)selected).getKey();

                boolean editado = produtoDAO.editarProduto
                (
                        id,
                        inputNome.getText(), 
                        inputDescricao.getText(), 
                        inputCategoria.getSelectedItem().toString(), 
                        (Integer) inputQuantidade.getValue(), 
                        Double.parseDouble(InputPreco.getText()), 
                        (Integer) inputQuantidadeIdeal.getValue(),
                        inputRecomendado.getText()
                );

               if(editado == true) {

                   JOptionPane.showMessageDialog(this, "Produto editado com sucesso!");
               } else {
                   JOptionPane.showMessageDialog(this, "Ocorreu um error!");

               }

                new ProdutoView().setVisible(true);
                this.dispose();
            } else {
                throw new ExceptionDadosIncompletos(this, "Preencha todos os dados por favor!");
            }
        } catch(ExceptionDadosIncompletos ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSendDelProdutoActionPerformed

    private void comboEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEditActionPerformed

    private void InputPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputPreco;
    private javax.swing.JMenu btnContainerConta;
    private javax.swing.JMenuItem btnMenuLogin;
    private javax.swing.JMenu btnMenuMontarPc;
    private javax.swing.JMenu btnMenuProduto;
    private javax.swing.JMenuItem btnMenuRegistrar;
    private javax.swing.JButton btnSendDelProduto;
    private javax.swing.JComboBox comboEdit;
    private javax.swing.JComboBox<Object> inputCategoria;
    private javax.swing.JTextArea inputDescricao;
    private javax.swing.JTextField inputNome;
    private javax.swing.JSpinner inputQuantidade;
    private javax.swing.JSpinner inputQuantidadeIdeal;
    private javax.swing.JTextField inputRecomendado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCategoria1;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelQuantidadeIdeal;
    private javax.swing.JLabel labelRS;
    private javax.swing.JLabel labelRecomendado;
    // End of variables declaration//GEN-END:variables
}
