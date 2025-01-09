package gestionegare;

// Variabili
public class Persona {
    private String matricola;
    private String nome;
    private String cognome;
    private String sesso;
    private int annoNascita;
    private String luogo;
    private int eta;
    private String stato;
    private String titolo;
    private String lavoro;
    private int anzianita;
    private String qualifica;
    private String sezione;


    public Persona(String matricola, String nome, String cognome, String sesso, int annoNascita,
                   String luogo, int eta, String stato, String titolo, String lavoro,
                   int anzianita, String qualifica, String sezione) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.annoNascita = annoNascita;
        this.luogo = luogo;
        this.eta = eta;
        this.stato = stato;
        this.titolo = titolo;
        this.lavoro = lavoro;
        this.anzianita = anzianita;
        this.qualifica = qualifica;
        this.sezione = sezione;
    }

    // GET E SET
    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getLavoro() {
        return lavoro;
    }

    public void setLavoro(String lavoro) {
        this.lavoro = lavoro;
    }

    public int getAnzianita() {
        return anzianita;
    }

    public void setAnzianita(int anzianita) {
        this.anzianita = anzianita;
    }

    public String getQualifica() {
        return qualifica;
    }

    public void setQualifica(String qualifica) {
        this.qualifica = qualifica;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }


    // toString
    public String toString() {
        return "Matricola: " + matricola + "\n" +
                "Nome: " + nome + "\n" +
                "Cognome: " + cognome + "\n" +
                "Sesso: " + sesso + "\n" +
                "Anno di nascita: " + annoNascita + "\n" +
                "Luogo di nascita: " + luogo + "\n" +
                "Età: " + eta + "\n" +
                "Stato civile: " + stato + "\n" +
                "Titolo di studio: " + titolo + "\n" +
                "Professione: " + lavoro + "\n" +
                "Anni di anzianità: " + anzianita + "\n" +
                "Qualifica: " + qualifica + "\n" +
                "Sezione: " + sezione + "\n";
    }
}
