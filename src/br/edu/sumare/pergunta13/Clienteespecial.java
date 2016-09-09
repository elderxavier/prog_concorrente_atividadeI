
package br.edu.sumare.pergunta13;


public class Clienteespecial extends Contacorrente{
    
    @Override
    public void sacar(double saque){
        setSaldo(getSaldo() - saque - (saque * 0.01)) ;
    }
    
    public static void main(String[] args) {
        Clienteespecial conta = new Clienteespecial();
        conta.depositar(100.00);
        conta.sacar(10.00);
        System.out.println("Saldo: " + String.valueOf(conta.getSaldo()));
    }
    
}
