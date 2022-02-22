/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views.products;

import br.udesc.prog2.controllers.contas.RegistrarController;
import br.udesc.prog2.controllers.products.ListarProdutosController;
import br.udesc.prog2.controllers.products.pedidos.ControladorListarPedidos;
import br.udesc.prog2.dao.Conta.ContaDAO;
import br.udesc.prog2.dao.Produto.PedidosDAO;
import br.udesc.prog2.dao.Produto.ProdutoDAO;
import br.udesc.prog2.models.products.Produto;
import br.udesc.prog2.exceptions.ExceptionDadosIncompletos;
import br.udesc.prog2.models.clients.Pedidos;
import br.udesc.prog2.models.products.EStatus;
import br.udesc.prog2.models.products.pedidos.table.PedidoTableModel;
import br.udesc.prog2.models.products.table.ProdutoTableModel;
import br.udesc.prog2.utils.CategoriaOpcao;
import static br.udesc.prog2.utils.CategoriaOpcao.categoriasOpcao;
import br.udesc.prog2.utils.ComboItem;
import br.udesc.prog2.utils.Instance;
import br.udesc.prog2.utils.PegarTodosProdutoParaTableModels;
import br.udesc.prog2.views.accounts.RegistrarView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class CompraView extends javax.swing.JFrame {
    
    public CompraView() {
        initComponents();
        popularCategoriaComboBox();
        //ProdutoDAO produtoDAO = new ProdutoDAO();
        
        //ArrayList<Produto> listaProdutos = popularComboBoxProdutos(produtoDAO.getProdutos());
        
        if(comboCategoria.getSelectedItem() != null) {
        
            comboCategoria.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    comboProduto.removeAllItems();
                    InputPreco.setText("");
                    ProdutoDAO produtoDAO = new ProdutoDAO();

                    ArrayList<Produto>  produtosPorCategoria = produtoDAO.selecionarProdutoPorCategoria(comboCategoria.getSelectedItem().toString());
                    
                    selecionouCategoria(produtosPorCategoria);
                    popularComboBoxProdutos(produtosPorCategoria);
                }

            });
            
        }
        
    }
    
    
    public void mostrarTela(){
        btnProduto.setEnabled(new Instance().getInstanceVerifyAdmin().isAdmin);
        System.out.println("btnProduto.setEnabled(new Instance().getInstanceVerifyAdmin().isAdmin) " + new Instance().getInstanceVerifyAdmin().isAdmin);
        setVisible(true);
        
    }
    
    public void selecionouCategoria(ArrayList<Produto> produtosPorCategoria) {
        if(produtosPorCategoria != null) {
            comboProduto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    popularInputsSelecionado(produtosPorCategoria);

                }
            });
        }
    }
    
    public void popularCategoriaComboBox() {
        CategoriaOpcao categoriaClass = new CategoriaOpcao();
        comboCategoria.addItem(new ComboItem(0, ""));

        String[] categoriasOPS = categoriaClass.getCategoriaOpcao();
        for(int i=0;i < categoriasOPS.length;i++) {
            comboCategoria.addItem(new ComboItem(i, categoriasOPS[i]));
        }
    }
    
    public void popularInputsSelecionado(ArrayList<Produto> produtos) {
        Object item = comboProduto.getSelectedItem();
        
        if(((ComboItem)item) != null) {
        
            int id = ((ComboItem)item).getKey();

             for(Produto p : produtos) {
                 if(id == p.getId()) {
                    comboCategoria.setSelectedItem(p.getCategoria());
                    InputPreco.setText( String.valueOf(p.getPreco()));

                 }
             }
        
        }
    }
    
    public ArrayList<Produto> popularComboBoxProdutos(ArrayList<Produto> listaProdutos) {

        for(Produto p : listaProdutos) {
            comboProduto.addItem(new ComboItem(p.getId(), p.toString()));
        }
        
        return listaProdutos;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnComprarProduto = new javax.swing.JButton();
        comboProduto = new javax.swing.JComboBox();
        labelCategoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputCep = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelCategoria1 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        labelQuantidade = new javax.swing.JLabel();
        inputQuantidade = new javax.swing.JSpinner();
        labelPreco = new javax.swing.JLabel();
        InputPreco = new javax.swing.JTextField();
        labelRS = new javax.swing.JLabel();
        inputRua = new javax.swing.JTextField();
        labelNome1 = new javax.swing.JLabel();
        labelNome2 = new javax.swing.JLabel();
        labelNome3 = new javax.swing.JLabel();
        inputComplemento = new javax.swing.JTextField();
        inputNumero = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnProdutos = new javax.swing.JMenu();
        btnMontarPc = new javax.swing.JRadioButtonMenuItem();
        btnProduto = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(590, 590));
        setResizable(false);

        btnComprarProduto.setBackground(new java.awt.Color(191, 75, 75));
        btnComprarProduto.setText("Comprar Produto");
        btnComprarProduto.setBorderPainted(false);
        btnComprarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarProdutoActionPerformed(evt);
            }
        });

        comboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutoActionPerformed(evt);
            }
        });

        labelCategoria.setText("Produto");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("Comprar Produto");

        inputCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepActionPerformed(evt);
            }
        });

        labelNome.setText("CEP");

        labelCategoria1.setText("Categoria");

        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        labelQuantidade.setText("Quantidade");

        inputQuantidade.setPreferredSize(new java.awt.Dimension(70, 26));

        labelPreco.setText("Preço:");

        InputPreco.setEditable(false);
        InputPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPrecoActionPerformed(evt);
            }
        });

        labelRS.setText("R$");

        inputRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRuaActionPerformed(evt);
            }
        });

        labelNome1.setText("Rua");

        labelNome2.setText("Número");

        labelNome3.setText("Complemento");

        inputComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputComplementoActionPerformed(evt);
            }
        });

        inputNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumeroActionPerformed(evt);
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

        btnProduto.setSelected(true);
        btnProduto.setText("Produtos");
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });
        btnProdutos.add(btnProduto);

        jMenuBar1.add(btnProdutos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCep, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputRua, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelQuantidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelCategoria1)
                        .addComponent(labelCategoria)
                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelPreco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelRS, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(InputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnComprarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 71, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelNome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidade)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(InputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRS))
                .addGap(18, 18, 18)
                .addComponent(btnComprarProduto)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarProdutoActionPerformed
        try {
            if(
                !InputPreco.getText().equals("") 
                && !comboProduto.getSelectedItem().toString().equals("") 
                && !comboCategoria.getSelectedItem().toString().equals("") 
                && !inputComplemento.getText().equals("") 
                && !inputCep.getText().equals("") 
                && inputQuantidade.getValue() != null 
                && !inputNumero.equals("")
                && !inputRua.getText().equals("")) 
            {
                ProdutoDAO produtoDAO = new ProdutoDAO();
                Object selected = this.comboProduto.getSelectedItem();
                int id = ((ComboItem)selected).getKey();

                if(inputNumero.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
                    
                    int quantidadeProdutoSql = produtoDAO.verificarQuantidadeProduto(id);
                    
                    if(Integer.parseInt(inputQuantidade.getValue().toString()) <= quantidadeProdutoSql) {
                        int quantidadeFormatada = Integer.parseInt(inputQuantidade.getValue().toString());
                        boolean vendido = produtoDAO.venderProduto(
                                id, 
                                quantidadeFormatada,
                                quantidadeProdutoSql
                        );
                        if(vendido == true) {
                            
                            PedidosDAO pedidosDAO = new PedidosDAO();
                            String estatus = String.valueOf(EStatus.em_andamento);
                            String nomeProduto = produtoDAO.getNomeById(id);
                            ContaDAO contaDAO = new ContaDAO();
                            
                            Pedidos pedido = new Pedidos(id, 
                                    inputComplemento.getText(), 
                                    inputCep.getText(), 
                                    Integer.valueOf(inputNumero.getText()), 
                                    inputRua.getText(),
                                    estatus, 
                                    quantidadeFormatada, 
                                    Double.parseDouble(InputPreco.getText()),
                                    nomeProduto,
                                    contaDAO.isLogado()
                            );
                            
                            if(pedidosDAO.inserir(pedido) == true) {
                                JOptionPane.showMessageDialog(this, "Pedido inserido com sucesso!");

                                new ControladorListarPedidos(new  PedidosView(), new PedidoTableModel(pedidosDAO.getPedidos(contaDAO.isLogado())));
                                
                                this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(this, "Algo deu errado, verifique os campos!");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Quantidade invalida!");
                    }
                 
                } else {
                        JOptionPane.showMessageDialog(this, "Caracteres invalido no campo número!");

                }

                //this.dispose();
            } else {
                throw new ExceptionDadosIncompletos(this, "Preencha todos os dados por favor!");
            }
        } catch(ExceptionDadosIncompletos ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnComprarProdutoActionPerformed

    private void comboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProdutoActionPerformed

    private void inputCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCepActionPerformed

    private void InputPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPrecoActionPerformed

    private void inputRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRuaActionPerformed

    private void inputComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputComplementoActionPerformed

    private void inputNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumeroActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void btnMontarPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontarPcActionPerformed
        // TODO add your handling code here:
        PedidosDAO pedidosDAO = new PedidosDAO();
        ContaDAO contaDAO = new ContaDAO();
        new ControladorListarPedidos(new  PedidosView(), new PedidoTableModel(pedidosDAO.getPedidos(contaDAO.isLogado())));
    }//GEN-LAST:event_btnMontarPcActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        // TODO add your handling code here:
        new ListarProdutosController(new ProdutoView(), new ProdutoTableModel(new PegarTodosProdutoParaTableModels().listarProdutos()));
        this.dispose();
    }//GEN-LAST:event_btnProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputPreco;
    private javax.swing.JButton btnComprarProduto;
    private javax.swing.JRadioButtonMenuItem btnMontarPc;
    private javax.swing.JRadioButtonMenuItem btnProduto;
    private javax.swing.JMenu btnProdutos;
    private javax.swing.JComboBox<Object> comboCategoria;
    private javax.swing.JComboBox comboProduto;
    private javax.swing.JTextField inputCep;
    private javax.swing.JTextField inputComplemento;
    private javax.swing.JTextField inputNumero;
    private javax.swing.JSpinner inputQuantidade;
    private javax.swing.JTextField inputRua;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCategoria1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome1;
    private javax.swing.JLabel labelNome2;
    private javax.swing.JLabel labelNome3;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelRS;
    // End of variables declaration//GEN-END:variables
}
