public class Persona {

    // Attributi ma solo dichiarati = caratteristiche della classe
    String nome;
    String cognome;
    int eta;
    String coloPreferito;

// CREAZIONE DEL COSTRUTTORE E USO DEL THIS.

    Persona(String nome, String cognome, int eta, String coloPreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.coloPreferito = coloPreferito;
    }

    /* Creazione del metodo toString: possiamo scriverlo noi o crearlo in automatico dal menu generate:
       se lo scrivessimo noi a video potremmo avere una stampa corretta o almeno quello che vorremmo
       vedere, in automatico vedremo sempre tutto ma verrebbe a video nel sistema creato di default
     */

   // METODO GENERATO IN AUTOMATICO: lo lascio commentato perché se no creerebbe un errore
    /* @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", coloPreferito='" + coloPreferito + '\'' +
                '}';
    }*/

    // METODO CREATO DA NOI
    public String toString() {
        String stringa = this.nome +"\n"+ this.cognome +"\n"+ this.eta+"\n"+ this.coloPreferito;
        return stringa;
    }
}
