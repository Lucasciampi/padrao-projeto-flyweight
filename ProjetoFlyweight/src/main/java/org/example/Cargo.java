package org.example;

public class Cargo {

    private String nome;
    private String departamento;

    public Cargo(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

}
