import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int menuv = 4;
        boolean sortir = false;

        TUI tui = new TUI();

        while (sortir == false){

            TUI.mostrarMenu(sc);

            menuv = sc.nextInt();

        switch (menuv) {
            case 1:
                novapartida();
                break;
            case 2:
                carregarpartida();
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

    private static void carregarpartida() {
        System.out.println("Carregar partida");
    }

    private static void novapartida() { //Joc joc = new Joc()
        // ;
        System.out.println("Nova_partida");
    }
}
