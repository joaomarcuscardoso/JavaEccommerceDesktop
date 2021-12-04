/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author rfcjo
 */
public abstract class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String sobrenome;
    protected String email;
    protected String telefone;

    public Pessoa(String nome, String sobrenome, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }


    public String getSobrenome() {
        return sobrenome;
    }


    public String getEmail() {
        return email;
    }


    public String getTelefone() {
        return telefone;
    }
    

    public abstract void setTelefone(String telefone);
    
    @Override
    public int compareTo(Pessoa p) {
        if(!p.getEmail().equals(email)) {
            // Pode criar Cliente
            return 1;
        } else {
            // Não pode criar Cliente
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", telefone=" + telefone + '}';
    }
    
}
