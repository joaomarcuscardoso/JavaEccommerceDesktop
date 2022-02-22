/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao.Conta;

import br.udesc.prog2.dao.ConexaoDB;
import br.udesc.prog2.exceptions.ExceptionDadosIncompletos;
import br.udesc.prog2.exceptions.ExceptionUsuarioInvalido;
import br.udesc.prog2.models.Conta;
import br.udesc.prog2.models.products.Produto;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author rfcjo
 */
public class ContaDAO {

    
    private static void criarTabela() {
        Connection conexao = ConexaoDB.getConnection();
        String tabela = "CREATE TABLE IF NOT EXISTS contas (id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT," +
                            "  nome VARCHAR(60)," +
                            "  email VARCHAR(120)," +
                            "  senha VARCHAR(220)," +
                            "  sobrenome VARCHAR(120),"+
                            "  logado boolean not null default false,"+
                            "   admin boolean not null default false)";
        
        try {
            Statement stmt = conexao.createStatement();
            stmt.execute(tabela);
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    
    public boolean isADmin() {
        criarTabela();

        Connection conexao = ConexaoDB.getConnection();

        String sql = "SELECT * FROM contas WHERE id = ? and admin = ?";
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setBoolean(1, true);
            pstmt.setBoolean(2, true);
            
            ResultSet resultado = pstmt.executeQuery();
            if(resultado.next()) {
                return true;
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        ConexaoDB.desconectarDB();
        return false;
    }
    
    public int isLogado() {
        criarTabela();

        Connection conexao = ConexaoDB.getConnection();

        String sql = "SELECT * FROM contas WHERE logado = ?";
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setBoolean(1, true);
            
            ResultSet resultado = pstmt.executeQuery();
            while(resultado.next()) {
                int id = resultado.getInt("id");
                System.out.println("idUSer: "+id);
                return id;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Não entrou");

        ConexaoDB.desconectarDB();
        return 0;
    }
        
    public boolean criarConta(Conta conta) {
        criarTabela();
        
        Connection conexao = ConexaoDB.getConnection();
        String sql = "INSERT INTO contas (email, senha, nome, sobrenome) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt;
        try {
            pstmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, conta.getEmail());
            pstmt.setString(2, conta.getSenha());
            pstmt.setString(3, conta.getNome());
            pstmt.setString(4, conta.getSobrenome());


            pstmt.execute();

            System.out.println("Conta registrada com sucesso!");

            final ResultSet resultado = pstmt.getGeneratedKeys();
            if (resultado.next()) {
                int id = resultado.getInt("id");
                conta.setId(id);
                
            }
            ConexaoDB.desconectarDB();
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ConexaoDB.desconectarDB();
        }
        
        return true;
    }
    
    
    public String criptografarSenha(String senha) {
        byte[] padraoBytes = senha.getBytes();
        try {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(padraoBytes);
            byte messageDigest[] = algorithm.digest();

            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                    hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            }

            return hexString.toString();
                
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
    
    public boolean verificarEmailExiste(String email) {
        criarTabela();

        Connection conexao = ConexaoDB.getConnection();

        String sql = "SELECT * FROM contas WHERE email = ?";
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, email);
            
            ResultSet resultado = pstmt.executeQuery();
            if(resultado.next()) {

                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        ConexaoDB.desconectarDB();
        return false;
    }
    
    public Conta verificarLoginDaConta(String email, String senha) {
        criarTabela();

        Connection conexao = ConexaoDB.getConnection();
        String sql = "SELECT * FROM contas WHERE email = ? and senha = ?";

        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            
            ResultSet resultado = pstmt.executeQuery();
            if(resultado.next()) {

                int id = resultado.getInt("id");
                
                String nome = resultado.getString("nome");
                String sobrenome = resultado.getString("sobrenome");
                boolean admin = resultado.getBoolean("admin");
                
                Conta conta = new Conta(nome, sobrenome, email, senha);
                
                conta.setId(id);
                conta.setAdmin(admin);
                updateLogado(id);
                return conta;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        ConexaoDB.desconectarDB();
        return null;  
    }
    
    public void deslogar() {
        criarTabela();

        Connection conexao = ConexaoDB.getConnection();     
        
        String sql = "Update contas SET logado = ?";
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setBoolean(1, false);

            pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    
    public void updateLogado(int id) {
        criarTabela();

        Connection conexao = ConexaoDB.getConnection();     
        
        String sql = "Update contas SET logado = ? WHERE id = ?";
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setBoolean(1, true);
            pstmt.setInt(2, id);

            pstmt.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
