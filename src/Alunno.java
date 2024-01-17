import java.io.Serial;
import java.io.Serializable;

public class Alunno implements Serializable {

    @Serial
    private static final long serialVersionUID = 3215449103735670227L;

    String cognome, nome;
    int annoNascita;

    public Alunno() {
        cognome = "";
        nome = "";
        annoNascita = 0;
    }

    public Alunno(String cognome, String nome, int annoNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.annoNascita = annoNascita;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    @Override
    public String toString() {
        return "Alunno{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", annoNascita=" + annoNascita +
                '}';
    }
}
