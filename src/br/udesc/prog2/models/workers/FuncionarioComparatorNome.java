package br.udesc.prog2.models.workers;

import br.udesc.prog2.models.workers.Funcionario;
import java.util.Comparator;

public class FuncionarioComparatorNome implements Comparator<Funcionario> {

    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return f1.getNome().compareTo(f2.getNome());
        
    }
}
