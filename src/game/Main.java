package game;

import java.util.Locale;
import java.util.Scanner;
import game.Joc;
import game.TUI;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int menuv = 4;
        boolean sortir = false;

        Joc joc = new Joc();
        TUI tui = new TUI();

        while (sortir == false){

            TUI.mostrarMenu(sc);

            menuv = sc.nextInt();

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

    private static void configuracio() {
        System.out.println("Configuració");
    }

    private static void carregarPartida() {
        System.out.println("Carregar partida");
    }

    private static void novaPartida(Joc joc) {
        joc.novaPartida();
    }
}
