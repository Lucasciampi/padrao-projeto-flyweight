package org.example;

public class Funcionario {

    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String obterDadosFuncionario() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", cargo='" + cargo.getNome() + '\'' +
                ", departamento='" + cargo.getDepartamento() + '\'' +
                '}';
    }


}
