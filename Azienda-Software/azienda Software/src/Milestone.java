import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe Milestone rappresenta un obiettivo del progetto
public class Milestone {
    public boolean isCompletato;
    private String nome;

    private LocalDate scadenza;
    private List<Task> tasks;

    private boolean completato;

    public Milestone(String nome, LocalDate scadenza){
        this.nome = nome;
        this.scadenza = scadenza;
        this.tasks = new ArrayList<>();
        this.completato = false;
    }

    public String getNome(){
        return nome;
    }

    public LocalDate getDataScadenza(){
        return scadenza;
    }

    public List<Task> getTasks(){
        return tasks;
    }

    public void isCompletato(boolean completato){
        this.completato = completato;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void removeTask(Task task){
        tasks.remove(task);
    }
}
