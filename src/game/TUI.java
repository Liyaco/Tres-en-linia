// Creacio del package game per a poder utilitzar els metodes fora de la clase //
package game;

// Importacio de paquets //
import jdk.jshell.spi.ExecutionControl;
import java.util.Scanner;

// La clase TUI //
public class TUI {
    private Scanner sc;

    // El metode mostrarMenu es l'encarregat de mostrar el menu del joc //
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

    // El metode mostrarTaulell es l'encarregat de mostrar el taulell de joc //
    public static void mostrarTaulell() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }

    // El metode recollirJugada es l'encarregat de recullir les jugades //
    public static void recollirJugada() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }

    // El metode fiDePartida es l'encarregat de acabar la partida quan es guanya //
    public static void fiDePartida() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}