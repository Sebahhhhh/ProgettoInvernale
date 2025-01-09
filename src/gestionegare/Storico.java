package gestionegare;
import java.util.ArrayList;

class Storico {
    private ArrayList<Gara> gare;

    // Arraylist
    public Storico() {
        this.gare = new ArrayList<>();
    }

    public void aggiungi(Gara gara) {
        gare.add(gara);
    }

    public ArrayList<Gara> getGare() {
        return gare;
    }

    // toString
    public String toString() {
        StringBuilder sb = new StringBuilder("Storico gare:\n");
        for (int i = 0; i < gare.size(); i++) {
            sb.append("Gara ").append(i + 1).append(":\n");
            sb.append(gare.get(i).toString());
            sb.append("-----------------\n");
        }
        return sb.toString();
    }
}
