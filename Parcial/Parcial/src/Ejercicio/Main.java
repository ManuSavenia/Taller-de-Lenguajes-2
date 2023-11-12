package Ejercicio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Empieza el juego");
        jugar();
    }
    public static void jugar() {
        int eleccionJugador1 = (int) (Math.random() * 3);
        int eleccionJugador2 = (int) (Math.random() * 3);
        Jugador jugador1 = new Jugador(eleccionJugador1);
        Jugador jugador2 = new Jugador(eleccionJugador2);
        System.out.println("El jugador 1 a elegido " + jugador1.getGesto());
        System.out.println("El jugador 2 a elegido " + jugador2.getGesto());
        if (jugador1.getGesto().equals(jugador2.getGesto())) {
            System.out.println("Empate");
            return;
        }
        if (jugador1.getGesto().equals("PIEDRA")) {
            if (jugador2.getGesto().equals("PAPEL")) {
                System.out.println("Gana jugador 2");
                return;
            } else {
                System.out.println("Gana jugador 1");
                return;
            }
        }
        if (jugador1.getGesto().equals("PAPEL")) {
            if (jugador2.getGesto().equals("TIJERA")) {
                System.out.println("Gana jugador 2");
                return;
            } else {
                System.out.println("Gana jugador 1");
                return;
            }
        }
        if (jugador1.getGesto().equals("TIJERA")) {
            if (jugador2.getGesto().equals("PIEDRA")) {
                System.out.println("Gana jugador 2");
                return;
            } else {
                System.out.println("Gana jugador 1");
                return;
            }
        }
    }

}