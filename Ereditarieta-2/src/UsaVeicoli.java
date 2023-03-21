import java.util.ArrayList;
import java.util.List;

public class UsaVeicoli {
    public static void main(String[] args) {
        List<Veicolo> veicoli = new ArrayList<>();

        veicoli.add(new Vettura("AA111BB", "Fiat", "Panda", false, "utilitaria"));
        veicoli.add(new Vettura("CC222DD", "Ford", "Focus", true, "station wagon"));
        veicoli.add(new Vettura("EE333FF", "Jeep", "Cherokee", false, "SUV"));
        veicoli.add(new Motocilo("GG444HH", "Honda", "CBR", true, 125));
        veicoli.add(new Motocilo("II555JJ", "Yamaha", "MT-09", false, 850));

        System.out.println("Veicoli guasti:");
        for (Veicolo v : veicoli) {
            if (v.isGuasto()) {
                System.out.println(v.getTarga());
            }
        }
    }
}