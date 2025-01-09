package gestionegare;

public class Gara {
    private String categoria;
    private String girone;
    private int giornata;
    private String data;
    private String ora;
    private String casa;
    private String ospite;
    private String ruolo;
    private String campo;

    public Gara(String categoria, String girone, int giornata, String data, String ora,
                String casa, String ospite, String ruolo, String campo) {
        this.categoria = categoria;
        this.girone = girone;
        this.giornata = giornata;
        this.data = data;
        this.ora = ora;
        this.casa = casa;
        this.ospite = ospite;
        this.ruolo = ruolo;
        this.campo = campo;
    }


    // GET E SET
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGirone() {
        return girone;
    }

    public void setGirone(String girone) {
        this.girone = girone;
    }

    public int getGiornata() {
        return giornata;
    }

    public void setGiornata(int giornata) {
        this.giornata = giornata;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getOspite() {
        return ospite;
    }

    public void setOspite(String ospite) {
        this.ospite = ospite;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    // toString
    public String toString() {
        return "Categoria: " + categoria + "\n" +
                "Girone: " + girone + "\n" +
                "Giornata: " + giornata + "\n" +
                "Data: " + data + "\n" +
                "Ora di inizio: " + ora + "\n" +
                "Squadra casa: " + casa + "\n" +
                "Squadra ospite: " + ospite + "\n" +
                "Ruolo: " + ruolo + "\n" +
                "Campo: " + campo + "\n";
    }
}