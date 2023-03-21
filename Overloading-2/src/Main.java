public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Mario", "Rossi");
        Studente studente = new Studente("Luigi", "Verdi", "12345");

        saluta(persona); // Saluta la persona
        saluta(studente); // Saluta lo studente
    }

    public static void saluta(Object oggetto) {
        if (oggetto instanceof Persona) {
            Persona persona = (Persona) oggetto;
            System.out.println("Ciao " + persona.getNome() + " " + persona.getCognome() + "!");
        } else if (oggetto instanceof Studente) {
            Studente studente = (Studente) oggetto;
            System.out.println("Ciao " + studente.getNome() + " " + studente.getCognome() + ", matricola " + studente.getMatricola() + "!");
        }
    }
}