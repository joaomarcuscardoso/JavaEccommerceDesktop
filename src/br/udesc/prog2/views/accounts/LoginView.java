/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.views.accounts;

import br.udesc.prog2.controllers.contas.LoginController;
import br.udesc.prog2.controllers.contas.RegistrarController;
import br.udesc.prog2.controllers.products.CompraController;
import br.udesc.prog2.controllers.products.ListarProdutosController;
import br.udesc.prog2.controllers.products.pedidos.ControladorListarPedidos;
import br.udesc.prog2.dao.Conta.ContaDAO;
import br.udesc.prog2.dao.Produto.PedidosDAO;
import br.udesc.prog2.dao.Produto.ProdutoDAO;
import javax.swing.JOptionPane;
import br.udesc.prog2.models.Conta;
import br.udesc.prog2.exceptions.ExceptionDadosIncompletos;
import br.udesc.prog2.exceptions.ExceptionUsuarioInvalido;
import br.udesc.prog2.models.products.pedidos.table.PedidoTableModel;
import br.udesc.prog2.models.products.table.ProdutoTableModel;
import br.udesc.prog2.utils.Instance;
import br.udesc.prog2.utils.PegarTodosProdutoParaTableModels;
import br.udesc.prog2.utils.VerifyAdmin;
import br.udesc.prog2.views.products.CompraView;
import br.udesc.prog2.views.products.PedidosView;
import br.udesc.prog2.views.products.ProdutoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LoginView extends javax.swing.JFrame {

    
    public LoginView() {
        initComponents();
        ContaDAO contaDAO = new ContaDAO();
        
        contaDAO.deslogar();
    }
    
    public void mostrarTela(){
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        inputEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        inputSenha = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        btnLogin1 = new javax.swing.JMenuItem();
        btnRegistrar = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelEmail.setText("email");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Acessar sua Conta");

        labelSenha.setText("senha");

        btnLogin.setBackground(new java.awt.Color(191, 75, 75));
        btnLogin.setText("Entrar");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputEmail)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSenha)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(inputSenha))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelSenha)
                .addGap(2, 2, 2)
                .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setAlignmentY(0.5F);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("Conta");

        btnLogin1.setText("Login");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        jMenu4.add(btnLogin1);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    public JButton getBtnLogin() {
        return btnLogin;
    }
    
    public JLabel getEmail() {
        return labelEmail;
    }
    
    public JLabel getSenha() {
        return labelEmail;
    }
  
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
       
       try {
            if(!inputEmail.getText().equals("") && !inputSenha.getText().equals("")) {;
                try {
                    
                    ContaDAO contaDAO = new ContaDAO();
                    
                    String senhaCriptografada = contaDAO.criptografarSenha(inputSenha.getText());
                    System.out.println("senhaCripto: "+senhaCriptografada );
                    Conta conta = contaDAO.verificarLoginDaConta(inputEmail.getText(), senhaCriptografada);
                    if( conta != null) {
                        
                        JOptionPane.showMessageDialog(this, "Usuário logado com sucesso.");
                        
                        if(conta.isAdmin() == true ) {
                            ProdutoDAO produtoDAO = new ProdutoDAO();
                            
                            new Instance().getInstanceVerifyAdmin().isAdmin = conta.isAdmin();
                            
                            
                            new ListarProdutosController(new ProdutoView(), new ProdutoTableModel(new PegarTodosProdutoParaTableModels().listarProdutos()));
                            this.dispose();
                            
                        } else {
                            PedidosDAO pedidosDAO = new PedidosDAO();
                            
                            new ControladorListarPedidos(new  PedidosView(), new PedidoTableModel(pedidosDAO.getPedidos(contaDAO.isLogado())));
                            this.dispose();
                        }
                       
                    } else {
                        throw new ExceptionUsuarioInvalido(this, "E-mail ou senha invalidos");
                    } 
                } catch(ExceptionUsuarioInvalido error) {
                    error.printStackTrace();
                } 
            } else {
                throw new ExceptionDadosIncompletos(this, "Preencha todos os dados, por fazor!");
            }
        } catch(ExceptionDadosIncompletos e ) {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        new LoginController(new LoginView());
        this.dispose();

    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        new RegistrarController(new RegistrarView());
        this.dispose();

    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JMenuItem btnLogin1;
    private javax.swing.JMenuItem btnRegistrar;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelSenha;
    // End of variables declaration//GEN-END:variables

    public void btnLogin(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
