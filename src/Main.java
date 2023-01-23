public class Main {
    public static void main(String[] args) {
        System.out.println("Metodo toString");
        System.out.println();

        /*---METODO TOTOSTRING---*/

        Persona persona = new Persona("Emanuele", "Belfiori", 42, "Viola" );

        /*
        Se facessimo una stampa di questo tipo, ci immagineremo di trovare i dati a video contenuti
        nell'oggetto quindi la persona nei dettagli che noi abbiamo fornito, ma invece a video apparirà:
        Persona@6d03e736 questa è la collocazione a livello di memoria, come fosse l'indirizzo in cui è
        salvato il nostro oggetto.
        Se andassimo ad aggiungere il metodo toDtring che tutti gli oggetti ereditano di default, non
        cambierebbe nulla ancora.
        Per far sì che a video passino i dati corretti che noi vorremmo effettivamente vedere: occorre
        andare nella classe desiderata in questo caso Persona e creare il metodo toString che passi i
        dati in modo corretto.
         */
       //  System.out.println(persona);

        // Modo corretto
        System.out.println(persona.toString()); /* potrei anche togliere il toString e darebbe lo stesso
                                                   risultato ma lo lascio per vedere la differenza dalla
                                                   stampa sopra commentata */

    }
}