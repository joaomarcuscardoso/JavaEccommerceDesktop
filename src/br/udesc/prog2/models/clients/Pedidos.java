package br.udesc.prog2.models.clients;

import br.udesc.prog2.models.products.Produto;
import br.udesc.prog2.models.products.EStatus;
import br.udesc.prog2.models.workers.Funcionario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import br.udesc.prog2.models.Conta;
import java.util.Set;

public class Pedidos {
    private String complemento;
    private String cep;
    private Integer numero; 
    private String rua;
    private String estatus;
    private int quantidade;
    private int id; 
    private int id_product;
    private Double preco;
    private String nomeProduto;
    private int id_user;
    

    public Pedidos(Integer id_product,
            String complemento,
            String cep, 
            Integer numero, 
            String rua, 
            String estatus,
            Integer quantidade, 
            double preco,
            String nomeProduto,
            Integer id_user
    ) {
        
        this.id_product = id_product;
        this.id_user = id_user;
        this.complemento = complemento;
        this.cep = cep;
        this.numero = numero;
        this.rua = rua;
        if (EStatus.validar(estatus) == true) {
        
            this.estatus = estatus;
        }
        this.quantidade = quantidade;
        this.preco = preco;
        this.nomeProduto = nomeProduto;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
    

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    
    
    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    


    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        if (EStatus.validar(estatus) == true) {
        
            this.estatus = estatus;
        }
    }
    
    
    
    
    
//      public Pedidos(Conta conta, ArrayList<Produto> produtos, EStatus status, Funcionario responsavel) {
//        this.conta = conta;
//        this.produtos = produtos;
//        this.status = status;
//        this.responsavel.add(responsavel);
//       
//    }
//    
//    public void ordenarProdutosPorNome() {
//        Collections.sort(produtos, new Comparator<Produto>() {
//           @Override
//           public int compare(Produto p1, Produto p2) {
//               return p1.getNome().compareTo(p2.getNome());
//            } 
//        });
//    }
//    
//    public void addProdutos(Produto p) {
//        produtos.add(p);
//    }
//    
//    public boolean setTermino(Date data) {
//        long dataFormatada = data.getTime();
//        Date dataAgora = new Date();
//        long dataMili = dataAgora.getTime();
//        
//        if(dataFormatada <= dataMili) {
//            // Data deve estar formada do jeito certo.
//            this.termino = data;
//            return true;
//        } else {
//            return false;
//        }
//    }
//    
//    public Date getTermino() {
//        return this.termino;
//    }
//    
//    public Conta getConta() {
//        return this.conta;
//    }
//    
//    public ArrayList<Produto> getProdutos() {
//       return this.produtos;
//    }
//    
//    public EStatus getStatus() {
//        return this.status;
//    }
//    
//    public Set<Funcionario> getResponsavel() {
//         return this.responsavel;
//    }
//    
//    public String toString() {
//        
//        return "O pedidos foi realizado pelo conta: "+conta.getNome()+
//                " e o status é "+status+
//                ", os produtos selecionado são: \n"+produtos.toString()+
//                "\n Ass por "+responsavel.toString()+
//                "\n Finalizado "+termino;
//    }

    @Override
    public String toString() {
        return "Pedidos{" + "complemento=" + complemento + ", cep=" + cep + ", numero=" + numero + ", rua=" + rua + ", estatus=" + estatus + ", quantidade=" + quantidade + ", id=" + id + ", id_product=" + id_product + ", preco=" + preco + ", nomeProduto=" + nomeProduto + '}';
    }


    
    
   
    
}
