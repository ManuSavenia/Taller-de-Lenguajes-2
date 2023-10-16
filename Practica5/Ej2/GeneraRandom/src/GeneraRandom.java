import java.util.Random;
public final class GeneraRandom {
    public static final int  MAXIMO_VALOR= 100;

    public int obtenerRandom() {
        Random random = new Random();
        while (true) {
            int numeroAleatorio = random.nextInt();
            if (numeroAleatorio < MAXIMO_VALOR && numeroAleatorio > 0) {
                return numeroAleatorio;
            }
        }
    }
}
