// Importacio de paquets //
import java.util.Locale;
import java.util.Scanner;

// La clase Main //
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        // Aqui esta el switch i els seus atributs per poder funcionar, tambe crida al metode mostrar menu //
        boolean sortir = false;

        Joc joc = new Joc();
        TUI tui = new TUI(sc);

        while (sortir == false){

            int menuv = TUI.mostrarMenu(sc);


        switch (menuv) {
            case 1:
                novaPartida(joc);
                break;
            case 2:
                carregarPartida();
                break;
            case 3:
                configuracio();
                break;
            case 4:
                sortir = true;
                break;
            }
        }
    }

    // El metode configuracio es l'encarregat de mostrar la configuracio i poder editarla //
    private static void configuracio() {
        int confmenu = 0;
        System.out.println("|1.X en raya" +
                           "|2.Sotir al menú");
        switch (confmenu){
            case 1:
                System.out.println("seleccióna un numero");
                break;
            case 2:
                System.out.println("Sortint...");
                break;
        }
        }

    // El metode carregarPartida es l'encarregat de carregar una partida ja existent //
    private static void carregarPartida() {
        System.out.println("Carregar partida");
    }

    // El metode novaPartida es l'encarregat de crear la partida //
    private static void novaPartida(Joc joc) {
        joc.novaPartida();
    }
}
