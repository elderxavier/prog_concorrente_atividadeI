
package br.edu.sumare.pergunta13;


public class Contacorrente {
    private static double saldo;

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double aSaldo) {
        saldo = aSaldo;
    }
    public void depositar(double deposito){
        setSaldo(getSaldo() + deposito);
    }
    
    public void sacar(double saque){
        setSaldo(getSaldo() - saque - (saque * 0.05)) ;
    }
    
    public static void main(String[] args) {
        Contacorrente conta = new Contacorrente();
        conta.depositar(100.00);
        conta.sacar(10.00);
        System.out.println("Saldo: " + String.valueOf(conta.getSaldo()));
    }
    
}
