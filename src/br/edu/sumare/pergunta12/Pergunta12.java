package br.edu.sumare.pergunta12;

public class Pergunta12 {

    public void Executa() {
        int[] dias = new int[31];
        String info;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean flag = false;
        int parse = 1;
        int aux = 0;
        int aux2 = 0;
        

        System.out.println("Informe um número inteiro: ");

        if (scanner.hasNextLine()) {
            info = scanner.nextLine();
            parse = isNumero(info) ? Integer.parseInt(info) : 0;
        }
        int limit = parse < 10 ? (parse - 2): ( (parse / 3) -2);
        for(int i = 0; i <  limit; i++){
            aux = i * (i+1)* (i+2);
            if(aux == parse){
                flag = true;
                aux2 = i;
                break;
            }
        }
        if(flag){
            System.out.println("O numero " + String.valueOf(parse) + "é um triangular, pois ");
            System.out.println(String.valueOf( aux2 * (aux2 +1) * (aux2 +2) )+ " é igual "+ String.valueOf(parse) );
        }else{
            System.out.println("O numero " + String.valueOf(parse) + " não é um triangular");
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
        Pergunta12 pergunta = new Pergunta12();
        pergunta.Executa();
    }

}
