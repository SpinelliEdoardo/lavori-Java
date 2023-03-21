public class Officina {
    public static void main(String[] args) {

        // Creazione di alcuni veicoli
        Automobile auto = new Automobile("FIAT", "Panda", 5, 50, false);
        Moto moto = new Moto("Honda", "CBR600", 2, 25, true);
        Bicicletta bici = new Bicicletta("Bianchi", "Corsa", 2, true);

        // Creazione dell'oggetto Officina
        Officina officina = new Officina();

        // Riparazione di alcuni veicoli
        double prezzoAuto = officina.ripara(auto);
        double prezzoMoto = officina.ripara(moto);
        double prezzoBici = officina.ripara(bici);

        // Stampa dei prezzi degli interventi
        System.out.println("Prezzo riparazione auto: " + prezzoAuto);
        System.out.println("Prezzo riparazione moto: " + prezzoMoto);
        System.out.println("Prezzo riparazione bicicletta: " + prezzoBici);
    }
}
