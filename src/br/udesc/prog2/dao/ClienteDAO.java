/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.prog2.dao;

import br.udesc.prog2.models.workers.Cliente;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author rfcjo
 */
public class ClienteDAO {
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public void setClientes() {
        clientes.add(new Cliente("João", "Marcus", "joao@gmail.com", "123"));
        clientes.add(new Cliente("José", "Antonio", "jose@gmail.com", "345"));
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public Optional<Cliente> getClienteByNome(String nome) {
        return  clientes.stream().filter(c-> c.getNome().equals(nome)).findFirst();
    }
}
