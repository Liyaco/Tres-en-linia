import jdk.jshell.spi.ExecutionControl;
import java.util.Scanner;

public class TUI {
    //atributs aqui

    public static void mostrarMenu(Scanner sc) {
        int menuv = 4;
        boolean sortir = false;
        while (sortir == false) {
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
            menuv = sc.nextInt();
        }
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