/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.products.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rfcjo
 */
public class ProdutoDAO {
    
    private static void criarTabela() {
        Connection conexao = ConexaoDB.getConnection();
        System.out.println(conexao);
        String tabela = "CREATE TABLE IF NOT EXISTS produtos (id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT," +
                            "  nome VARCHAR(60)," +
                            "  descricao VARCHAR(60)," +
                            "  categoria VARCHAR(200)," +
                            "  recomendacao VARCHAR(200)," +
                            "  quantidade INTEGER(11)," +
                            "  quantidade_ideal INTEGER(11)," +
                            "  preco DOUBLE)";
        try {
            Statement stmt = conexao.createStatement();
            stmt.execute(tabela);
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public ProdutoDAO() {
    }

    
    public boolean setProduto(Produto produto) {
        criarTabela();
        Connection conexao = ConexaoDB.getConnection();
        System.out.println("entrou");
        String sql = "INSERT INTO produtos (nome, descricao, categoria, quantidade, preco, quantidade_ideal, recomendacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt;
        try {
            pstmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, produto.getNome());
            pstmt.setString(2, produto.getDescricao());
            pstmt.setString(3, produto.getCategoria());
            pstmt.setInt(4, produto.getQuantidade());
            pstmt.setDouble(5, produto.getPreco());
            pstmt.setInt(6, produto.getQuantidadeIdeal());
            pstmt.setString(7, produto.getRecomendacao());


            pstmt.execute();

            System.out.println("Produto gravado com sucesso!");

            final ResultSet resultado = pstmt.getGeneratedKeys();
            if (resultado.next()) {
                int id = resultado.getInt(1);
                produto.setId(id);
            }
            ConexaoDB.desconectarDB();
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ConexaoDB.desconectarDB();
            return false;
        }
        
//        produtos.add(new Produto("Memoria Ram", "Memoria ram boa", "Memoria", 10, 500, 12));
//        produtos.add(new Produto("Ryzen 7 3700x", "Processador high End", "Processador", 50, 2300, 52));
//        produtos.add(new Produto("Coller Xio", "Coller", "Coller", 20, 500, 20));
    }
    
    public ArrayList<Produto> getProdutos() {
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        criarTabela();
        Connection conexao = ConexaoDB.getConnection();
        String sql = "SELECT * FROM produtos";
        try {
            Statement stat = conexao.createStatement();
            
            ResultSet resultado = stat.executeQuery(sql);
            
            while(resultado.next()) {
                
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String descricao = resultado.getString("descricao");
                String categoria = resultado.getString("categoria");
                int quantidade = resultado.getInt("quantidade");
                double preco = resultado.getDouble("preco");
                int quantidadeIdeal = resultado.getInt("quantidade_ideal");
                
                Produto p = new Produto(nome, descricao, categoria, quantidade, preco, quantidadeIdeal);
                p.setRecomendacao(resultado.getString("recomendacao"));
                p.setId(id);
                produtos.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        
        ConexaoDB.desconectarDB();
        return produtos;

    }

    
    public void deletarProdutoPorId(int id) {
        criarTabela();
        Connection conexao = ConexaoDB.getConnection();
        String sql = "DELETE FROM produtos WHERE id = ?";
        PreparedStatement pstmt;
        try {
            pstmt = conexao.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.execute();
            System.out.println("Produto apagada com sucesso!");

        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        ConexaoDB.desconectarDB();
    }
    
    public boolean editarProduto(
        int id, 
        String nome, 
        String descricao,
        String categoria, 
        int quantidade, 
        double preco,
        int quantidade_ideal, 
        String recomendacao
    ) 
    {
        criarTabela();
        Connection conexao = ConexaoDB.getConnection();
        String sql = "UPDATE produtos SET "
                + "nome = ?,"
                + " descricao = ?,"
                + " categoria = ?,"
                + " quantidade = ?,"
                + " quantidade_ideal = ?,"
                + " preco = ?, "
                + " recomendacao = ?"
                + " WHERE id = ?";
        PreparedStatement pstmt;

        try {
            pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, nome);
            pstmt.setString(2, descricao);
            pstmt.setString(3, categoria);
            pstmt.setInt(4, quantidade);
            pstmt.setInt(5, quantidade_ideal);
            pstmt.setDouble(6, preco);
            pstmt.setString(7, recomendacao);
            pstmt.setInt(8, id);
            pstmt.execute();

            System.out.println("Producto atualizado com sucesso!");
            
            ConexaoDB.desconectarDB(); 
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ConexaoDB.desconectarDB();
            return false;
        } 
    }
    
}
