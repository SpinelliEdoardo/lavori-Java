import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("Mario", "Rossi", "01/01/2021", 1500);
        Dipendente dipendente2 = new Dipendente("Luigi", "Verdi", "01/01/2020", 2000);
        Dipendente dipendente3 = new Dipendente("Giuseppe", "Bianchi", "01/01/2019", 1800);

        // Creo un array di dipendenti e lo ordino per stipendio
        Dipendente[] dipendenti = { dipendente1, dipendente2, dipendente3 };
        Arrays.sort(dipendenti, Comparator.comparingDouble(Dipendente::getStipendio));

        // Visualizzo i dipendenti in ordine di stipendio
        for (Dipendente dipendente : dipendenti) {
            dipendente.visualizza();
        }
    }
}