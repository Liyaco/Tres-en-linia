// Creacio del package game per a poder utilitzar els metodes fora de la clase //
package game;

// La clase Joc //
public class Joc{
    private short torn;
    public short getTorn() {return torn;}

    // Creacio de un array, sera el taulell //
    private char[][] taulell;
    public char[][] getTaulell() {return taulell;}

    // El metode novaPartida es l'encarregat de crear una nova partida //
    public void novaPartida() {
        this.taulell = new char[3][3];
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3;j++) {
                this.taulell[i][j] = '#';
            }
        }
    }

    // El metode jugar es l'encarregat de fer correr el joc //
    public static void jugar() {

    }

    // El metode jugadaGuanyadora es l'encarregat de trobar la jugada guanyadora //
    public static void jugadaGuanyadora() {
        throw new UnsupportedOperationException("Not Soported");
        //boolean iguals = false;

        //int contador = 0;

        //for(int j = 0; j < 3; j++) {
        //iguals = true;

        //for (int i = 1; i < 3; i++) {
        //char anterior = taulell[i - 1][j];
        //char actual = taulell[i][j];

        //if (anterior != actual) {
        //iguals = false;
        //contador++;
        //break;
        //}
        //}
        //}

        //boolean iguals = false;

        //int contador = 0;

        //for(int j = 0; j < 3; j++) {
        //iguals = true;

        //for (int i = 1; i < 3; i++) {
        //char anterior = taulell[i][j - 1];
        //char actual = taulell[i][j];

        //if (anterior != actual) {
        //iguals = false;
        //contador++;
        //break;
        //}
        //}
        //}

        //boolean iguals = false;

        //int contador = 0;

        //for(int j = 0; j < 3; j++) {
        //iguals = true;

        //for (int i = 1; i < 3; i++) {
        //char anterior = taulell[i + 1][j + 1];
        //char actual = taulell[i][j];

        //if (anterior != actual) {
        //iguals = false;
        //contador++;
        //break;
        //}
        //}
        //}

        //boolean iguals = false;

        //int contador = 0;

        //for(int j = 0; j < 3; j++) {
        //iguals = true;

        //for (int i = 1; i < 3; i++) {
        //char anterior = taulell[i - 1][j - 1];
        //char actual = taulell[3][j];

        //if (anterior != actual) {
        //iguals = false;
        //contador++;
        //break;
        //}
        //}
        //}

        //if (iguals == true)
            //TUI.fiDePartida();

        //else
            //Joc.jugar();
    }
}
