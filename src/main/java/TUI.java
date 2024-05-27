import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// La clase TUI //
public class TUI {
    Scanner sc = new Scanner(System.in);

    // El metode mostrarMenu es l'encarregat de mostrar el menu del joc //
    public int mostrarMenu() {
            int menuv;
            System.out.println("""
                    -------------------
                    1-Nova partida    |
                    -------------------
                    2-Carregar partida|
                    -------------------
                    3-Configuració    |
                    -------------------
                    4-Sortir          |
                    -------------------""");
            System.out.print("Selecciona l'opció que vols: ");
            menuv = sc.nextInt();
            return menuv;
    }

    // El metode mostrarTaulell es l'encarregat de mostrar el taulell de joc //
    public static void mostrarTaulell(Joc joc){
        for (int i = 0; i < 3; i++){
            System.out.println(joc.getTaulell()[i]);
        }
    }

    // El metode recollirJugada es l'encarregat de recullir les jugades //
    public int recollirJugada() {
        System.out.print("Cord (puedes usar 1,2,3):");
        return (sc.nextShort() - 1 ) ;
    }

    // El metode fiDePartida es l'encarregat de acabar la partida quan es guanya //
    public static void fiDePartida(Joc joc, boolean empat){
        if (joc.getTorn()%2 == 1) {
            System.out.println("Has guanyat! jugador1");
        }
        else {
            System.out.println("Has guanyat! jugador2");
        }
    }

    public void configuracio() throws IOException {
        System.out.println("|1.X en raya \n" +
                "|2.Sotir al menú");
        int confmenu = sc.nextInt();
        switch (confmenu){
            case 1:
                File f = new File("./","config");
                FileWriter fw = new FileWriter(f);
                f.createNewFile();
                System.out.println("seleccióna un numero del 1 al 10");
                fw.write(sc.nextInt());
                break;
            case 2:
                System.out.println("Sortint...");
                break;
        }
}
}