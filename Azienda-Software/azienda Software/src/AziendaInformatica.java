import java.time.LocalDate;

public class AziendaInformatica {

    public static void main(String[] args) {

        // creazione dipendenti

        Dipendente dipendente1 = new Dipendente("mMario");
        Dipendente dipendente2 = new Dipendente("Luigi");
        Dipendente dipendente3 = new Dipendente("Edoardo");

        //Creazione di task

        Task task1 = new Task("Implementazione del modulo di login", LocalDate.of(2023, 5, 10));
        Task task2 = new Task("Implementazionne delle funzionalità di registrazione", LocalDate.of(2023, 5, 15));
        Task task3 = new Task("Test del modulo di login", LocalDate.of(2023, 5, 25));
        Task task4 = new Task("Test della funzionalità di registrazione", LocalDate.of(2023,5, 25));

        // Assegnazione di Task a dipendenti

        task1.setAssegnato(dipendente1);
        task2.setAssegnato(dipendente2);
        task3.setAssegnato(dipendente1);
        task4.setAssegnato(dipendente3);


        // Creazione di milestone

        Milestone milestone1 = new Milestone("Milestone 1", LocalDate.of(2023, 5, 31));
        Milestone milestone2 = new Milestone("Milestone2", LocalDate.of(2023, 5, 15));

        //aggiunta di Task alla Milestone

        milestone1.addTask(task1);
        milestone1.addTask(task2);
        milestone2.addTask(task3);
        milestone2.addTask(task4);

        //Creazione di progetto

        Progetto progetto1 = new Progetto("Progetto 1", LocalDate.of(2023, 5, 1));


        // Aggiunta di Milestone al progetto

        progetto1.addMilestone(milestone1);
        progetto1.addMilestone(milestone2);

        //Calcolo percentuale di avanzamento del progetto

        progetto1.calcolaPercentualeAvanzamento();

    }
}