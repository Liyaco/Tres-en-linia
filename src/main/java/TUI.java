// Importacio de paquets //
import jdk.jshell.spi.ExecutionControl;
import java.util.Scanner;

// La clase TUI //
public class TUI {
    Scanner sc = new Scanner(System.in);

    // El metode mostrarMenu es l'encarregat de mostrar el menu del joc //
    public int mostrarMenu() {
            int menuv = 4;
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
            return menuv;
    }

    // El metode mostrarTaulell es l'encarregat de mostrar el taulell de joc //
    public static void mostrarTaulell(){
        System.out.println("Mondongo");
    }

    // El metode recollirJugada es l'encarregat de recullir les jugades //
    public int recollirJugada() {
        System.out.print("Cord:");
        return sc.nextShort();
    }

    // El metode fiDePartida es l'encarregat de acabar la partida quan es guanya //
    public static void fiDePartida(){
        System.out.println("1-Volver a jugar \n 2-Sortir");
    }

    public void configuracio() {
        System.out.println("|1.X en raya \n" +
                "|2.Sotir al menú");
        int confmenu = sc.nextInt();
        switch (confmenu){
            case 1:
                System.out.println("seleccióna un numero");
                break;
            case 2:
                System.out.println("Sortint...");
                break;
        }
}
}