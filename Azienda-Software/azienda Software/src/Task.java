import java.time.LocalDate;
import java.util.Date;

// Classe Task che rappresnsta un singolo task del progetto
public class Task {
    private String descrizione;
    private LocalDate scadenza;
    private Dipendente assegnato;
    private boolean completato;

    public Task(String descrizione, LocalDate scadenza){
        this.descrizione = descrizione;
        this.scadenza = scadenza;
        this.completato = false;
    }

    public String  getDescrizione(){
        return descrizione;
    }

    public LocalDate getDataScadenza(){
        return scadenza;
    }

    public Dipendente getAssegnato(){
        return assegnato;
    }

    public void setAssegnato(Dipendente assegnato){
        this.assegnato = assegnato;
    }

    public boolean isCompletato(boolean completato){
        return completato;
    }

    public void setCompletato(boolean completato){
        this.completato = completato;
    }
}
