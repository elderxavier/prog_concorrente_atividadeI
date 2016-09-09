
package br.edu.sumare.pergunta14;


public class Cds extends Midia{
    
    private String autor;
    

    public Cds(String nome, String preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }
    
    @Override
    public String toString(){        
        return "Nome: "+ this.getNome() + ", Preco: "+ this.getPreco() + ", Autor: "+ this.getAutor();
    }   
    

    public String getAutor() {
        return autor;
    }   
    
}
