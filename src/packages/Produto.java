package packages;

import java.text.DecimalFormat;

public class Produto {
    private String nome;
    private String descricao;
    private String categoria;
    private String recomendacao;
    private int quantidade;
    private double preco;
    
    
       public Produto(String nome, String descricao, String categoria, int quantidade, double preco) {
          this.nome = nome;
          this.descricao = descricao;
          this.categoria = categoria;
          this.quantidade = quantidade;
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
       
       public int getQuantidade() {
           return this.quantidade;
       }
       
       public double getPreco() {
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
       
       public String toString() {
           DecimalFormat df = new DecimalFormat("#.00");
           return "Produto: "+nome+"\n descrição: "+descricao+"\n categoria: "+categoria+"\n quantidade: "+quantidade+"\n Preço: R$"+df.format(preco)+"\n";
       }
       
    
}
