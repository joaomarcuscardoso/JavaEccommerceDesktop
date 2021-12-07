package br.udesc.prog2.models;

import java.util.Date;
import java.util.Set;

public class Montador extends Cargo {
    private String trabalhoAtual;
    private Date prazo;
    private boolean feito;
    private int qtdTrabalhoPorMes;
    
    public Montador(int id, String nomeDoCargo, Setor setor) {
        super(id, nomeDoCargo, setor);
    }
    
    public Montador(int id, String nomeDoCargo, Setor setor, String trabalhoAtual, Date prazo, boolean feito) {
        super(id, nomeDoCargo, setor);
        this.trabalhoAtual = trabalhoAtual;
        this.prazo = prazo;
        this.feito = feito;
    }
    
    public String getTrabalhoAtual() {
     return this.trabalhoAtual;   
    }
    
    public Date getPrazo() {
        return this.prazo;
    }
    
    public boolean getFeito() {
        return this.feito;
    }
    
    public void addQtdTrabalhoPorMes() {
        this.qtdTrabalhoPorMes += 1;
    }
    
    public int getQtdTrabalhoPorMes() {
        return this.qtdTrabalhoPorMes;
    }
}
