public class Macchina {

    private String nome;
    private int cilindrata;
    private String targa;
    private double prezzo;
    private String colore;
    private int numeroMarce;

    private boolean motoreAcceso=false;
    private int marcia=0;

    public Macchina(String nome, int cilindrata, String targa, double prezzo, String colore, int numeroMarce) {
        this.nome = nome;
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.prezzo = prezzo;
        this.colore = colore;
        this.numeroMarce = numeroMarce;
    }

    //getter e setter
    public boolean isMotoreAcceso() {
        return motoreAcceso;
    }

    public void setMotoreAcceso(boolean motoreAcceso) {
        this.motoreAcceso = motoreAcceso;
    }

    public int getMarcia() {
        return marcia;
    }

    public void setMarcia(int marcia) {
        this.marcia = marcia;
    }

    public String getNome() {
        return nome;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public double getValore() {
        return prezzo;
    }

    public String getColore() {
        return colore;
    }

    public int getNumeroMarce() {
        return numeroMarce;
    }

    /** METODI*/

    /**Accendi Motore*/
    public void accendiMotore(){
      setMotoreAcceso(true);
    }

    /**Spegni  Motore*/
    public void spegniMotore(){
       setMotoreAcceso(false);
        setMarcia(0);
    }

    /**Cambia la Marcia*/
    public void cambioMarcia(int numeroMarcia){
        if(numeroMarcia<0 || numeroMarcia>getNumeroMarce()){
            System.out.println("Inserisca una marcia che sia tra folle '0' e "+ getNumeroMarce());
        }
        else{
            setMarcia(numeroMarcia);
        }
    }

    /**Diminuisce la Marcia*/
    public void scalaMarcia(){
        if(getMarcia()==0 ){
            System.out.println("le marce non possono andare in negativo, il minimo è il folle cioe 0");
        }
        else{
      setMarcia(getMarcia()-1);
        }
    }


    /**Aumenta la Marcia*/
    public void aumentaMarcia(){
        if(getMarcia()>=getNumeroMarce() ){
            System.out.println("le marce non possono andare più in alto della marcia massima,cioe : "+getNumeroMarce());
        }
        else{
            setMarcia(getMarcia()+1);
        }
    }

    /**Stampa le informazioni della macchina*/

    public String stampaInformazioni(){
       return             getNome()+" \n" +
                           "La cilindrata e' = " + getCilindrata()+"\n"+
                            "La targa  e' = " + getTarga()+"\n"+
                            "Il colore  e'= "+getColore()+"\n"+
                             "Il prezzo e' "+ getValore() +" $\n";

    }
}
