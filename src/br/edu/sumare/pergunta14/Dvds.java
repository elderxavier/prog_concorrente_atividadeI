package br.edu.sumare.pergunta14;

public class Dvds extends Midia{
    private String duracao;
    
    public Dvds(String nome, String preco, String duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }
    
    @Override
    public String toString(){        
        return "Nome: "+ this.getNome() + ", Preco: "+ this.getPreco() + ", Autor: "+ this.getDuracao();
    } 
    
    public String getDuracao() {
        return duracao;
    }
}
