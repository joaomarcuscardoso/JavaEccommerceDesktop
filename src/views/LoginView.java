/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.ArrayList;
import models.Cliente;
import models.errors.ExceptionDadosIncompletos;
import models.errors.ExceptionUsuarioInvalido;

/**
 *
 * @author rfcjo
 */
public class LoginView extends javax.swing.JFrame {
    
    private ArrayList<Cliente> clientesCadastrados = new ArrayList<Cliente>();;

    
    public LoginView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inputEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        inputSenha = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnProdutos = new javax.swing.JMenu();
        btnMontarPc = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btnLogin1 = new javax.swing.JMenuItem();
        btnRegistrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
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
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputEmail)
                            .addComponent(inputSenha)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSenha)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setAlignmentY(0.5F);

        btnProdutos.setText("Produtos");
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
    
    
    public void addLista(ArrayList<Cliente> clientes) {
        clientesCadastrados = clientes;
    }
    
        
    
    public boolean verificarLogin(String email, String senha) {
        System.out.println("Chamou: "+clientesCadastrados.size());
         for(Cliente cliente : clientesCadastrados) {
             System.out.println(cliente.getEmail());
             System.out.println(cliente.getSenha());
             
            if(cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) 
                return true;
                break;
        }
         
        return false;       
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        try {
            
            if(!inputEmail.getText().equals("") && !inputSenha.getText().equals("")) {
                try {
                    
                    if(verificarLogin(inputEmail.getText(), inputSenha.getText()) == true) {
                        System.out.println("Entrou agora");
                    } else {
                        throw new ExceptionUsuarioInvalido("E-mail ou senha invalidos");
                    } 
                } catch(ExceptionUsuarioInvalido error) {
                    error.printStackTrace();
                } 
            } else {
                throw new ExceptionDadosIncompletos("Preencha todos os dados, por fazor!");
            }
        } catch(ExceptionDadosIncompletos e ) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnMontarPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMontarPcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMontarPcActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        new LoginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        new RegistrarView().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        // TODO add your handling code here:
        new HomeView().setVisible(true);
        this.dispose();
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
    private javax.swing.JMenu btnMontarPc;
    private javax.swing.JMenu btnProdutos;
    private javax.swing.JMenuItem btnRegistrar;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelSenha;
    // End of variables declaration//GEN-END:variables
}