package br.edu.sumare.pergunta10;
import java.util.ArrayList;
import java.util.List;

public class Pergunta10 {

    

    public void Executa() {
        List<Integer> minhalista = new ArrayList();
        
        String info;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean flag = false;
        int parse = 1;
        while (!flag) {
            System.out.println("Digite um numero inteiro: ");
            if (scanner.hasNextLine()) {
                info = scanner.nextLine();                
                parse = isNumero(info) ? Integer.parseInt(info): 1;
                minhalista.add(parse);
                flag  = parse == 0 ? true: false;
            }            
        }
        int cont = 1;
        for(int item : minhalista ){
            if(cont < minhalista.size()){
                System.out.println("O quadrado de: "+ String.valueOf(item) + " é : "+ String.valueOf(item * item) );
            }
            cont++;
        }

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
        Pergunta10 pergunta = new Pergunta10();
        pergunta.Executa();
    }

}
