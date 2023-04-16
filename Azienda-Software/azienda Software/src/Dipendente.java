public class Dipendente {
    private String nome;
    private boolean disponibile;

    public Dipendente(String nome){
        this.nome = nome;
        this.disponibile = true;
    }
    public String getNome(){
        return nome;
    }

    public boolean isDisponibile(){
        return disponibile;
    }

    public void setDisponibile(boolean disponibile){
        this.disponibile = disponibile;
    }
}
