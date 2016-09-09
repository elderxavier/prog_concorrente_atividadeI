
package br.edu.sumare.pergunta11;


public class Pergunta11 {
    
    public void Executa(){
    int[] dias = new int[31];
        String info;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean flag = false;
        int parse = 1;
        int diamais = 0;
        int aux = 0;
        
        for(int i = 0; i < dias.length; i++){
            System.out.println("Infor a quntidade vendida no dia "  +String.valueOf(i+1));
            if (scanner.hasNextLine()) {
                info = scanner.nextLine();                
                parse = isNumero(info) ? Integer.parseInt(info): 0;                
                aux = parse;
                if( parse > aux){
                    aux = parse;
                    diamais = i +1;
                }
                dias[i] = parse;                
            }            
        
        }
        System.out.println("Maior quntidade vendida no dia "  +String.valueOf(diamais));
        
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
        Pergunta11 pergunta = new Pergunta11();
        pergunta.Executa();
    }
    
}
