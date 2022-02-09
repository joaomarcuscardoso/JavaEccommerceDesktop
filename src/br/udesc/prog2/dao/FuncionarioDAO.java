/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.positions.Cargo;
import br.udesc.prog2.models.workers.Funcionario;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author rfcjo
 */
public class FuncionarioDAO {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public void setFuncionariosMontador(Cargo cargoMon) {
        funcionarios.add(new Funcionario("Roberto", "Machado", "machado@gmail.com", "789", cargoMon, 0, 1));
        funcionarios.add(new Funcionario("Antonio", "Silveira", "silveirinha@gmail.com", "789", cargoMon, 0, 1));
    }
    
    public void setFuncionariosAdminstrador(Cargo cargoAdm) {
        funcionarios.add(new Funcionario("Carlos", "Silva", "silvao@gmail.com", "789", cargoAdm, 0, 2));
        funcionarios.add(new Funcionario("ADebora", "Souza", "souza@gmail.com", "789", cargoAdm, 0, 2));
    }
    
    
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public Optional<Funcionario> getFuncionariosByNome(String nome) {
        return  funcionarios.stream().filter(f-> f.getNome().equals(nome)).findFirst();
    }
    
}
