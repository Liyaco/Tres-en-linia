import java.io.IOException;

// La clase Main //
public class Main {
    public static void main(String[] args) throws IOException {

        // Aqui esta el switch i els seus atributs per poder funcionar, tambe crida al metode mostrar menu //
        boolean sortir = false;
        Joc joc = new Joc();
        TUI tui = new TUI();

        while (!sortir){

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
                throw new IllegalStateException(STR."No si esperaba el valor:\{menuv}");
        }
        }
    }
    // play game es usa per a poder trucar desde el main els diferents metodes de Joc i TUI
    private static void play_game(Joc joc, TUI tui){
        boolean coordscorrect;
        boolean guanyador;
        while (true){
            do {
                TUI.mostrarTaulell(joc);
                coordscorrect = joc.jugar((short) tui.recollirJugada(), (short) tui.recollirJugada());
            }
            while (coordscorrect);
            guanyador = joc.jugadaGuanyadora();
            if (joc.getTorn() > 9) {
                TUI.fiDePartida(joc, true);
                break;
            }
            else if (guanyador){
                TUI.fiDePartida(joc, false);
                break;
            }
        }
    }

    // El metode carregarPartida es l'encarregat de carregar una partida ja existent //
    private static void carregarPartida() {
        System.out.println("Carregar partida");
    }
}
