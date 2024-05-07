// Creacio del package game per a poder utilitzar els metodes fora de la clase //
package game;

// La clase Joc //
public class Joc{
    private short torn;
    public short getTorn() {
        return torn;
    }

    // El metode novaPartida es l'encarregat de crear una nova partida //
    public static void novaPartida() {
    }

    // El metode jugar es l'encarregat de fer correr el joc //
    public static void jugar() {

    }

    // El metode jugadaGuanyadora es l'encarregat de trobar la jugada guanyadora //
    public static void jugadaGuanyadora() {
        throw new UnsupportedOperationException("Not Soported");
    }
}
