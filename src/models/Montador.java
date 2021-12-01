package models;

import java.util.Date;
import java.util.Set;

public class Montador extends Cargo {
    private String trabalhoAtual;
    private Date prazo;
    private boolean feito;
    private int qtdTrabalhoPorMes;
    
    public Montador(String nomeDoCargo, Set<Setor> setor) {
        super(nomeDoCargo, setor);
    }
    
    public Montador(String nomeDoCargo, Set<Setor> setor, String trabalhoAtual, Date prazo, boolean feito) {
        super(nomeDoCargo, setor);
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
