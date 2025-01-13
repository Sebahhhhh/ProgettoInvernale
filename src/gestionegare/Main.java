package gestionegare;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Sono solo Estetica della console
    private static void stampaLinea() {
        System.out.println("═══════════════════════════════════════════════════════════════════");
    }
    private static void stampaTitolo(String titolo) {
        stampaLinea();
        System.out.println("║ " + titolo);
        stampaLinea();
}
//

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arbitro
        Persona arbitro = new Persona("123456789", "Sebastiano", "Rocchi", "M", 2007, "Bergamo",
                17, "Celibe/Nubile", "Licenza Media", "Studente", 3, "AE", "BG");
           // AE significa Arbitro Effettivo
           // Anni di anzianità cioè gli anni da arbitro

        // Gare passate
        Storico storico = new Storico();
        Gara garaPassata = new Gara(
                "Allievi Regionali", "A", 1, "2024-01-05", "15:30",
                "Virtus Bergamo", "Atalanta U17", "Arbitro",
                "Campo Sportivo Comunale, Via dello Sport 1, Bergamo"
        );
        storico.aggiungi(garaPassata);


        // Array contenente le gare future (che vanno accettate)
        ArrayList<Gara> gareDisponibili = new ArrayList<>();

        gareDisponibili.add(new Gara(
                "Allievi Regionali", "C", 2, "2025-01-16", "10:00",
                "Ponte San Pietro", "Villa Valle", "Arbitro",
                "Stadio Matteo Legler, Via San Pietro 34, Ponte San Pietro"
        ));

        //  Ho cercato di rendere un minimo carina la visualizzazione
        while (true) {
            stampaTitolo("GESTIONE GARE ARBITRALI");
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║  1) Visualizza dati arbitro   ║");
            System.out.println("║  2) Visualizza gare disponib. ║");
            System.out.println("║  3) Accetta gara              ║");
            System.out.println("║  4) Visualizza storico        ║");
            System.out.println("║  5) Crea una gara             ║");
            System.out.println("║  0) Esci                      ║");
            System.out.println("╚═══════════════════════════════╝");
            System.out.print("\nInserisci la tua scelta: ");

            int scelta = Integer.parseInt(scanner.nextLine());

            switch (scelta) {
                case 1 -> {
                    stampaTitolo("DATI ARBITRO");
                    System.out.println(arbitro.toString());
                }

                case 2 -> {
                    stampaTitolo("GARE DISPONIBILI");
                    for (int i = 0; i < gareDisponibili.size(); i++) {
                        System.out.println("╔════════════════ GARA " + (i + 1) + " ════════════════╗");
                        System.out.println(gareDisponibili.get(i).toString());
                        System.out.println("╚══════════════════════════════════════╝\n");
                    }
                }

                case 3 -> {
                    stampaTitolo("ACCETTAZIONE GARA");
                    if (gareDisponibili.isEmpty()) {
                        System.out.println("Non ci sono gare disponibili al momento.");
                    } else {
                        System.out.println("Quale gara vuoi accettare? (1-" + gareDisponibili.size() + "):");
                        int i = Integer.parseInt(scanner.nextLine()) - 1;
                        // l'array lo ho fatto variare in base al numero di gare disponibili

                        if (i >= 0 && i < gareDisponibili.size()) {
                            System.out.println("\n╔════════════ RIEPILOGO GARA ════════════╗");
                            System.out.println(gareDisponibili.get(i).toString());
                            System.out.println("╚══════════════════════════════════════╝");
                            System.out.print("\nConfermi di accettare questa gara? (S/N): ");
                            if (scanner.nextLine().equalsIgnoreCase("S")) {
                                Gara garaAccettata = gareDisponibili.remove(i);
                                storico.aggiungi(garaAccettata);
                                System.out.println("\nGara accettata e aggiunta allo storico.");
                            } else {
                                System.out.println("\nGara non accettata.");
                            }
                        } else {
                            System.out.println("\nNumero gara non valido.");
                        }
                    }
                }

                case 4 -> {
                    stampaTitolo("STORICO GARE ACCETTATE");
                    ArrayList<Gara> gare = storico.getGare();
                    for (int i = 0; i < gare.size(); i++) {
                        System.out.println("╔════════════════ GARA " + (i + 1) + " ════════════════╗");
                        System.out.println(gare.get(i).toString());
                        System.out.println("╚══════════════════════════════════════╝\n");
                    }
                }

                case 5 -> {
                    stampaTitolo("CREA UNA NUOVA GARA");
                    System.out.print("Inserisci la categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Inserisci il girone: ");
                    String girone = scanner.nextLine();
                    System.out.print("Inserisci la giornata (numb.): ");
                    int giornata = Integer.parseInt(scanner.nextLine());
                    System.out.print("Inserisci la data (AAAA-MM-GG): ");
                    String data = scanner.nextLine();
                    System.out.print("Inserisci l'orario (HH:MM): ");
                    String ora = scanner.nextLine();
                    System.out.print("Inserisci la squadra di casa: ");
                    String casa = scanner.nextLine();
                    System.out.print("Inserisci la squadra ospite: ");
                    String ospite = scanner.nextLine();
                    System.out.print("Inserisci il ruolo (AE o OA): ");
                    String ruolo = scanner.nextLine();
                    System.out.print("Inserisci il campo: ");
                    String campo = scanner.nextLine();

                    Gara nuovaGara = new Gara(categoria, girone, giornata, data, ora, casa, ospite, ruolo, campo);
                    gareDisponibili.add(nuovaGara);
                    System.out.println("\nGara aggiunta con successo alla lista delle gare disponibili!");
                }


                case 0 -> {
                    stampaTitolo("Chiusura del programma");
                    // (anche se dovrebbe essere un sito e non un programma in realtà)
                    return;
                }

                default -> System.out.println("\n Scelta non valida. Riprova.");
            }

            System.out.println("Premi qualsiasi tasto per continuare...");
            System.out.println(" (non premere invio perchè tanto non funziona) ");
            // per qualche motivo Invio non funziona
            scanner.nextLine();
        }
    }
}