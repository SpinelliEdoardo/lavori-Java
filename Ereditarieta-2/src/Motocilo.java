public class Motocilo extends Veicolo{
    private int cilindrata;

    public Motocilo(String targa, String marca, String modello, boolean guasto, int cilindrata) {
        super(targa, marca, modello, guasto);
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
}
