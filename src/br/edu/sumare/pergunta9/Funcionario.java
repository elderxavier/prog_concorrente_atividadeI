package br.edu.sumare.pergunta9;

public class Funcionario extends Pessoa {

    private int registro;

    public Funcionario(String nome, int cpf, int registro) {
        super(nome, cpf);
        this.registro = registro;
    }

}
