package br.edu.sumare.pergunta14;

public abstract class Midia {

    private String nome;
    private String preco;

    public Midia(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
        
    }    
    
    public String toString(){        
        return "Nome: "+ this.getNome() + ", Preco: "+ this.getPreco();
    }

    public String getNome() {
        return nome;
    }    

    public String getPreco() {
        return preco;
    }

    
    
    
}
