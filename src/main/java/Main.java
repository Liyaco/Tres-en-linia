// Importacio de paquets //
import java.util.Locale;
import java.util.Scanner;

// La clase Main //
public class Main {
    public static void main(String[] args) {

        // Aqui esta el switch i els seus atributs per poder funcionar, tambe crida al metode mostrar menu //
        boolean sortir = false;
        Joc joc = new Joc();
        TUI tui = new TUI();

        while (sortir == false){

            int menuv = tui.mostrarMenu();


        switch (menuv) {
            case 1:
                joc.novaPartida();
                play_game(joc, tui);
                break;
            case 2:
                carregarPartida();
                break;
            case 3:
                tui.configuracio();
                break;
            case 4:
                sortir = true;
                break;
            default:
                throw new IllegalStateException("No si esperaba el valor:" + menuv);
        }
        }
    }

    private static void play_game(Joc joc, TUI tui){
        boolean coordscorrect;
        boolean guanyador = false;
        while (guanyador == false){
            do {
                coordscorrect = joc.jugar((short) tui.recollirJugada(), (short) tui.recollirJugada());
            }
            while (coordscorrect);
            joc.jugadaGuanyadora();
        }
    }

    // El metode carregarPartida es l'encarregat de carregar una partida ja existent //
    private static void carregarPartida() {
        System.out.println("Carregar partida");
    }
}
