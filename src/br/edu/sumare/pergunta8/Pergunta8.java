package br.edu.sumare.pergunta8;

import java.util.Random;

public class Pergunta8 {

    private final int sorteado;
    private static int contador;

    public Pergunta8() {
        Random t1 = new Random();
        this.sorteado = t1.nextInt(99) + 1;
        
    }

    public void Executa() {
        //System.out.printf(String.valueOf(this.sorteado));
        String info;
        java.util.Scanner scanner = new java.util.Scanner(System.in);        
        boolean flag = false;
        while (!flag) {
            System.out.println("Digite um numero inteiro: ");

            if (scanner.hasNextLine()) {
                info = scanner.nextLine();                
                flag = this.Compara(info);

            }
        }

    }

    private boolean Compara(String num) {
        contador++;
        int convert = 0;
        boolean ret = false;
        convert = this.isNumero(num) ? Integer.parseInt(num) : 0;

        if (convert > this.sorteado) {
            System.out.println("O numero é maior:");
        } else if (convert < this.sorteado) {
            System.out.println("O numero é menor:");
        } else {
            System.out.println("Parabens, você acertou em "+ String.valueOf(contador) + " vez(es)!");
            ret = true;
        }
        return ret;

    }

    private boolean isNumero(String numero) {
        boolean ret = true;
        int convert = 0;
        try {
            convert = Integer.parseInt(numero);
        } catch (NumberFormatException ne) {
            ret = false;
        }
        return ret;

    }
    
    public static void main(String[] args) {
        Pergunta8 pergunta = new Pergunta8();
        pergunta.Executa();
    }

}
