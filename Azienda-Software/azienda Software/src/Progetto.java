import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Classe Progretto che rappresenta un progetto in sviluppo del softaware
public class Progetto {
    private String nome;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private List<Milestone> milestones;
    private boolean completato
            ;

    public Progetto(String nome, LocalDate dataInizio) {
        this.nome = nome;
        this.dataInizio = dataInizio;
        this.milestones = new ArrayList<>();
        this.completato = false;
    }

    public String getNome(){
        return nome;
    }

    public LocalDate getDataInizio(){
        return dataInizio;
    }

    public LocalDate getDataFine(){
        return dataFine;
    }

    public List<Milestone> getMilestones(){
        return milestones;
    }

    public boolean isCompletato(){
        return completato;
    }

    public void setCompletato(boolean completato){
        this.completato = completato;
    }

    public void addMilestone(Milestone milestone){
        milestones.add(milestone);
    }

    public void removeMilestone(Milestone milestone){
        milestones.remove(milestone);
    }
    public void calcolaPercentualeAvanzamento(){
         int milestoneCompletate = 0;
         int milestoneTotali = milestones.size();
         int taskCompletati = 0;
         int taskTotali = 0;

         for(Milestone milestone: milestones){
             if (!milestone.isCompletato) {
                 continue;
             }
             milestoneCompletate++;
         }

        Milestone milestone = null;

        for(Task task: milestone.getTasks()){
             taskTotali++;
         }
    }

    private Object milestoneCompletate;
    private double milestoneTotali;

    double percentualeMilestone = (double) milestoneCompletate / milestoneTotali * 100;
    private Object taskCompletati;
    private double taskTotali;

    double percentualeTask = (double)  taskCompletati / taskTotali * 100;



}
