/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.models.workers;

import br.udesc.prog2.models.workers.Funcionario;
import java.util.Comparator;


public class FuncionarioComparatorPrivilegio implements Comparator<Funcionario> {

    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return f2.getPrivilegio() - f1.getPrivilegio();
    }
    
}
