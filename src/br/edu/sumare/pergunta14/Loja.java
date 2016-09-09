
package br.edu.sumare.pergunta14;


public class Loja {
    public static void main(String[] args) {
        Object[] obj = new Object[5];
        Dvds dvd = new Dvds("Matrix", "R$ 35,00", " 120 min");
        obj[0]=dvd;
        dvd = new Dvds("Matrix II", "R$ 50,00", " 120 min");
        obj[1]=dvd;
        dvd = new Dvds("Matrix III", "R$ 55,00", " 120 min");
        obj[2]=dvd;
        
        Cds cd = new Cds("Cazuza", "25", "Cazuza");
        obj[3]= cd;
        
        cd = new Cds("Um abraçaço", "20", "Caetano Veloso");
        obj[4]= cd;
        
        for(Object o : obj){
            System.out.println( o.toString() );
        }       
        
    }
       
    
}
