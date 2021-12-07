package br.udesc.prog2.models;

import java.text.DecimalFormat;

public class Produto {
    private String nome;
    private String descricao;
    private String categoria;
    private String recomendacao;
    private int quantidade;
    private int quantidadeIdeal;
    private double preco;
    
    
       public Produto(String nome, String descricao, String categoria, int quantidade, double preco, int quantidadeIdeal) {
          this.nome = nome;
          this.descricao = descricao;
          this.categoria = categoria;
          this.quantidade = quantidade;
          this.quantidadeIdeal = quantidadeIdeal;
          this.preco = preco;
       }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
       
       public String getNome() {
           return this.nome;
       }
       
       public String getDescricao() {
           return this.nome;
       }
       
       public String getCategoria() {
           return this.categoria;
       }
       
       public Integer getQuantidade() {
           return this.quantidade;
       }
       
       public Integer getQuantidadeIdeal() {
           return this.quantidadeIdeal;
       }
       
       public int removeQuantidade() {
           this.quantidade -= 1;
           return this.quantidade;
       }
       
       public Double getPreco() {
           return this.preco;
       }
       
       public boolean setRecomendacao(String recomendacao) {
            if(!recomendacao.isEmpty()) {
             this.recomendacao = recomendacao;
                return true;   
            } else  {
                return false;
  
            }  
       }
       
       
       public String getRecomendacao() {
           return this.recomendacao;
       }

    @Override
    public String toString() {
        return "\nProduto{" + "\n nome=" + nome + "\n descricao=" + descricao + "\n categoria=" + categoria + "\n recomendacao=" + recomendacao + "\n quantidade=" + quantidade + "\n quantidadeIdeal=" + quantidadeIdeal + "\n preco=" + preco +"\n"+ '}';
    }
       
       
       
  
       
    
}
