package game;

import jdk.jshell.spi.ExecutionControl;
import java.util.Scanner;

public class TUI {
    private Scanner sc;

    public static void mostrarMenu(Scanner sc) {
            System.out.println("-------------------" +
                    "\n1-Nova partida    |" +
                    "\n-------------------\n" +
                    "2-Carregar partida|\n" +
                    "-------------------\n" +
                    "3-Configuració    |\n" +

                    "-------------------\n" +
                    "4-Sortir          |\n" +
                    "-------------------");
            System.out.print("Selecciona l'opció que vols: ");

    }

    public static void mostrarTaulell() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }

    public static void recollirJugada() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
    public static void diDePartida() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}