// La clase Joc //
public class Joc {
    private short torn;

    //public short getTorn() { return torn; }

    public short getTorn() {
        return torn;
    }

    // Creacio de un array, sera el taulell //
    private char[][] taulell;

    public char[][] getTaulell() {
        return taulell;
    }

    // El metode novaPartida es l'encarregat de crear una nova partida: //
    // Comença per crear el taulell sobre el atribut taulell de la clase creant-ho. //
    public void novaPartida() {
        this.taulell = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.taulell[i][j] = '#';
            }
        }
        this.torn = 1;
    }

    // El metode jugar es l'encarregat de fer correr el joc //
    public boolean jugar(short cordx, short cordy) {
        // Al Main hi farem us d'un iterant per a capacitar el codi recollir unes altres coordenades on es pogui jugar
        if (this.taulell[cordx][cordy] == '#') {
            if (cordx < 3 && cordy < 3) {
                if (this.torn % 2 == 1) {
                    this.taulell[cordx][cordy] = 'o';
                } else {
                    this.taulell[cordx][cordy] = 'x';
                }
                this.torn++;
                return true;
            }
        }
        return false;
    }

    // El metode jugadaGuanyadora es l'encarregat de trobar la jugada guanyadora //
    public int jugadaGuanyadora() {
        int guanyador;
        char anterior;
        char actual;

        guanyador = 2;

        for (int j = 0; j < 3; j++) {
            for (int i = 1; i < 3; i++) {
                anterior = this.taulell[i - 1][j];
                actual = this.taulell[i][j];
                if (actual == '#' || anterior == '#') {
                    break;
                }
                else if (anterior == actual) {
                    guanyador = 1;
                }
                else {
                    break;
                }
            }
        }

        if (guanyador != 1) {

            for (int j = 1; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    anterior = this.taulell[i][j - 1];
                    actual = this.taulell[i][j];
                    if (actual == '#' || anterior == '#') {
                        break;
                    }
                    else if (anterior == actual) {
                        guanyador = 1;
                    }
                    else {
                        break;
                    }
                }
            }

            if (guanyador != 1) {

                for (int j = 2; j > 0; j--) {
                    for (int i = 2; i > 0; i--) {
                        anterior = this.taulell[i - 1][j - 1];
                        actual = this.taulell[i][j];
                        if (actual == '#' || anterior == '#') {
                            break;
                        }
                        else if (anterior == actual) {
                            guanyador = 1;
                        }
                        else {
                            break;
                        }
                    }
                }

                if (guanyador != 1) {

                    for (int j = 1; j < 3; j++) {
                        for (int i = 2; i > 0; i--) {
                            anterior = this.taulell[i][j - 1];
                            actual = this.taulell[i - 1][j];
                            if (actual == '#' || anterior == '#') {
                                break;
                            }
                            else if (anterior == actual) {
                                guanyador = 1;
                            }
                            else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return guanyador;
    }
}