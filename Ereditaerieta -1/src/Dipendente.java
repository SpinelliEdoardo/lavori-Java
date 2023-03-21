public class Dipendente extends Persona {
    private String dataAssunzione;
    private double stipendio;

    public Dipendente(String nome, String cognome, String dataAssunzione, double stipendio) {
        super(nome, cognome);
        this.dataAssunzione = dataAssunzione;
        this.stipendio = stipendio;
    }

    public String getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(String dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public void visualizza() {
        super.visualizza();
        System.out.println("Data di assunzione: " + dataAssunzione + ", Stipendio: " + stipendio);
    }

    public boolean guadagnaPiuDi(Dipendente altroDipendente) {
        return this.stipendio > altroDipendente.getStipendio();
    }
}
