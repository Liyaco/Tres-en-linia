import java.util.Locale;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int menuv = 4 ;
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
                    System.out.println("Nova partida");
                    break;
                case 2:
                    System.out.println("Carregar partida");
                    break;
                case 3:
                    System.out.println("Configuració");
                    break;
                case 4:
                    sortir = true;
                    break;
            }
        }
    }
}
