/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.dao.Produto;

import br.udesc.prog2.dao.ConexaoDB;
import br.udesc.prog2.dao.Conta.ContaDAO;
import br.udesc.prog2.models.clients.Pedidos;
import br.udesc.prog2.models.products.EStatus;
import br.udesc.prog2.models.products.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author joaomarcus
 */
public class PedidosDAO {
    public void criarTabela() {
        Connection conexao = ConexaoDB.getConnection();
        String tabela = "CREATE TABLE IF NOT EXISTS pedidos (id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT," +
                            "  id_product INTEGER(10)," +
                            "  id_user INTEGER(10)," +
                            "  complemento VARCHAR(60)," +
                            "  nome_produto VARCHAR(60)," +
                            "  cep VARCHAR(200)," +
                            "  numero VARCHAR(200)," +
                            "  rua VARCHAR(200),"+
                            "  estatus VARCHAR(200)," +
                            "  quantidade_vendida INTEGER(10),"+
                            "  preco DOUBLE)";
        try {
            Statement stmt = conexao.createStatement();
            stmt.execute(tabela);
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    

    public ArrayList<Pedidos> getPedidosByName(String nomeSearch, int id_user) {
        ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
        
        criarTabela();
        Connection conexao = ConexaoDB.getConnection();
        ContaDAO contaDAO = new ContaDAO();
        String sql;
        
        if(contaDAO.isADmin() == false) {
            sql = "SELECT * FROM pedidos WHERE nome_produto LIKE ? and id_user = ?";
        } else {
            sql = "SELECT * FROM pedidos WHERE nome_produto LIKE ?";
        }
            
        
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1,"%" + nomeSearch + "%"); 
            if(contaDAO.isADmin() == false) {
                pstmt.setInt(2, id_user);
            }
            
            ResultSet resultado = pstmt.executeQuery();

            while(resultado.next()) {
                int id = resultado.getInt("id");
                int id_produto = resultado.getInt("id_product");
                String complemento = resultado.getString("complemento");
                String nome = resultado.getString("nome_produto");
                String cep = resultado.getString("cep");
                String rua = resultado.getString("rua");
                int numero = resultado.getInt("numero");
                String estatus = resultado.getString("estatus");
                int quantidade_vendida = resultado.getInt("quantidade_vendida");
                double preco = resultado.getDouble("preco");

                Pedidos p = new Pedidos(id_produto, complemento, cep, numero, rua, estatus, quantidade_vendida, preco, nome, id_user);
                p.setId(id);
                pedidos.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

        ConexaoDB.desconectarDB();
        return pedidos;      
    }
    
    public ArrayList<Pedidos> getPedidos(int id_user) {
        ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();

        criarTabela();
        Connection conexao = ConexaoDB.getConnection();
        ContaDAO contaDAO = new ContaDAO();
        String sql;
        
        if(contaDAO.isADmin() == true) {
            sql = "SELECT * FROM pedidos";
        } else {
            
            sql = "SELECT * FROM pedidos WHERE id_user = ?";
        }
        
        PreparedStatement pstmt;
        try {
            pstmt = conexao.prepareStatement(sql);
            if(contaDAO.isADmin() == false) {
                pstmt.setInt(1, id_user);
            }
             ResultSet resultado = pstmt.executeQuery();
            
            while(resultado.next()) {
                
                int id = resultado.getInt("id");
                int id_product = resultado.getInt("id_product");
                String nomeProduto = resultado.getString("nome_produto");
                String complemento = resultado.getString("complemento");
                String cep = resultado.getString("cep");
                String rua = resultado.getString("rua");
                String estatus = resultado.getString("estatus");
                int numero = resultado.getInt("numero");
                double preco = resultado.getDouble("preco");
                int quantidadeVendida = resultado.getInt("quantidade_vendida");
                
                Pedidos p = new Pedidos(id_product, complemento, cep, numero, rua, estatus, quantidadeVendida, preco, nomeProduto, id_user);
                p.setId(id);
                pedidos.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        
        ConexaoDB.desconectarDB();
        return pedidos;

    }
    
    public boolean inserir(Pedidos pedido) {
        criarTabela();
        Connection conexao = ConexaoDB.getConnection();

        String sql = "INSERT INTO pedidos (id_product, complemento, cep, numero, rua, estatus, quantidade_vendida, preco, nome_produto, id_user) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt;
        try {
            pstmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, pedido.getId_product());
            pstmt.setString(2, pedido.getComplemento());
            pstmt.setString(3, pedido.getCep());
            pstmt.setInt(4, pedido.getNumero());
            pstmt.setString(5, pedido.getRua());
            pstmt.setString(6, String.valueOf(pedido.getEstatus()));
            pstmt.setInt(7, pedido.getQuantidade());
            pstmt.setDouble(8, pedido.getPreco());
            pstmt.setString(9, pedido.getNomeProduto());
            pstmt.setInt(10, pedido.getId_user());
            pstmt.execute();

            System.out.println("Pedido gravado com sucesso!");

            final ResultSet resultado = pstmt.getGeneratedKeys();
            if (resultado.next()) {
                int id_pedido = resultado.getInt(1);
                pedido.setId(id_pedido);
            }
            ConexaoDB.desconectarDB();
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ConexaoDB.desconectarDB();
            return false;
        }
    }
    
    
    public boolean deletarPedidosPorId(int id) {
        criarTabela();
        Connection conexao = ConexaoDB.getConnection();
        String sql = "DELETE FROM pedidos WHERE id = ? ";
        PreparedStatement pstmt;
        try {
            pstmt = conexao.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.execute();
            System.out.println("Pedido apagada com sucesso!");
            return true;
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }

        ConexaoDB.desconectarDB();
        return false;  
    }
    
    public boolean editarPedidos(int id, String estatus) {
               criarTabela();
        Connection conexao = ConexaoDB.getConnection();
        String sql = "UPDATE pedidos SET "
                + " estatus = ?"
                + " WHERE id = ? and id_user = ?";
        PreparedStatement pstmt;

        try {
            pstmt = conexao.prepareStatement(sql);

            pstmt.setString(1, estatus);
            pstmt.setInt(2, id);
            pstmt.execute();

            System.out.println("Pedidos atualizado com sucesso!");
            
            ConexaoDB.desconectarDB(); 
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            ConexaoDB.desconectarDB();
            return false;
        } 
    }
}
