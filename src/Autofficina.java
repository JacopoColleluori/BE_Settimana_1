import java.util.Locale;
import java.util.Scanner;

public class Autofficina {
                                                           /**METODI */
    /** Info della macchina più costosa*/
     static void infoMacchinaPiuCostosa(Macchina[]macchine){
         Macchina autoCostosa=null;
         double valore=0;
    for (Macchina auto :macchine){
     if (auto.getValore()>valore){
      valore=auto.getValore();
      autoCostosa=auto;
     }
    }
         System.out.println("\n"+ autoCostosa.stampaInformazioni());
    }

    /**Macchina per targa */
    static void infoMacchina(Macchina[]macchine,String targa){
        int control=0;
        for (Macchina auto :macchine){
            if (auto.getTarga().equals(targa)){
                System.out.println("La macchina con targa "+ targa+ " e':\n"+ auto.stampaInformazioni());
                control++;
            }
        }
        if(control==0){
            System.out.println("Non c'e' nessuna macchina della targa richiesta (" + targa + ")\n");
        }
    }

    /** Macchina per colore*/
    static void infoMacchinaColore(Macchina[]macchine,String colore){
       int control=0;
        for (Macchina auto :macchine){
            if (auto.getColore().equals(colore)){
                System.out.println("La/Le auto per colore richiesto "+colore+" e'/sono : \n "+ auto.stampaInformazioni());
                control++;
            }
        }
        if (control==0){
            System.out.println("Non c'e' nessuna macchina del colore richiesto (" + colore + ")\n");
        }
    }

                                                       /** MAIN */

    public static void main(String[] args) {
        //creo l'array di macchine
    Macchina[] auto= new Macchina[5];

    //riempio le macchine

    Macchina auto1=new Macchina("fiat 500",200,"allelujja45",6580.85,"rosso",5);
    Macchina auto2=new Macchina("BMW Classe truthSeeker",3000,"JCTruthSeeker",999999999,"nero",20);
    Macchina auto3=new Macchina("alfa romeo Giulia",400,"alfaugiuliaa60",10000,"verde",6);
    Macchina auto4=new Macchina("fiat punto",1000,"scamFiat",6580,"grigia",5);
    Macchina auto5=new Macchina("Hyunday ix-50",300,"comoda23",20000,"bianca",6);

    //assegno all'array di machcine le macchine

    auto[0]=auto1;
    auto[1]=auto2;
    auto[2]=auto3;
    auto[3]=auto4;
    auto[4]=auto5;


    auto1.cambioMarcia(3);
    auto1.cambioMarcia(3);
    //macchina piu' costosa
    infoMacchinaPiuCostosa(auto);


    //inserisco un criterio di ricerca per targhe e colore e lo utilizzo con i metodi prestabiliti

    Scanner scan = new Scanner(System.in);

    //immissione targa e chiamata metodo
        System.out.println("Immetta una targa di ricerca: \n ");
       String targa=scan.next();
       infoMacchina(auto,targa);


        //immissione colore e chiamata metodo
        System.out.println("Immetta un colore di ricerca: \n ");
        String colore=scan.next();
        infoMacchinaColore(auto,colore);
    }
}
