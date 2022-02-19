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
    private Conta conta;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private String componente;
    private EStatus status;
    private Set<Funcionario> responsavel = new HashSet<>();
    private Date termino;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");
    
    
    public Pedidos(Conta conta, ArrayList<Produto> produtos, EStatus status, Funcionario responsavel) {
        this.conta = conta;
        this.produtos = produtos;
        this.status = status;
        this.responsavel.add(responsavel);
       
    }
    
    public void ordenarProdutosPorNome() {
        Collections.sort(produtos, new Comparator<Produto>() {
           @Override
           public int compare(Produto p1, Produto p2) {
               return p1.getNome().compareTo(p2.getNome());
            } 
        });
    }
    
    public void addProdutos(Produto p) {
        produtos.add(p);
    }
    
    public boolean setTermino(Date data) {
        long dataFormatada = data.getTime();
        Date dataAgora = new Date();
        long dataMili = dataAgora.getTime();
        
        if(dataFormatada <= dataMili) {
            // Data deve estar formada do jeito certo.
            this.termino = data;
            return true;
        } else {
            return false;
        }
    }
    
    public Date getTermino() {
        return this.termino;
    }
    
    public Conta getConta() {
        return this.conta;
    }
    
    public ArrayList<Produto> getProdutos() {
       return this.produtos;
    }
    
    public EStatus getStatus() {
        return this.status;
    }
    
    public Set<Funcionario> getResponsavel() {
         return this.responsavel;
    }
    
    public String toString() {
        
        return "O pedidos foi realizado pelo conta: "+conta.getNome()+
                " e o status é "+status+
                ", os produtos selecionado são: \n"+produtos.toString()+
                "\n Ass por "+responsavel.toString()+
                "\n Finalizado "+termino;
    }
    
    
    
   
    
}
