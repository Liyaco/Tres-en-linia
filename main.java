import java.util.Locale;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        menu_seleccion(sc);
    }

    private static void menu_seleccion(Scanner sc) {
        int menuv = 4;
        boolean sortir = false;
        while(sortir == false) {
            System.out.println("-------------------" +
                                "\n1-Nova partida    |" +
                                "\n-------------------\n" +
                                "2-Carregar partida|\n" +
                                "-------------------\n" +
                                "3-Configuració    |\n" +

                                "-------------------\n" +
                                "4-Sortir          |\n" +
                                "-------------------");
            System.out.print("Selecciona l'opció que vols: ");menuv = sc.nextInt();
            switch (menuv){
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

    private static void novapartida() {
        System.out.println("Nova_partida");
    }
}
