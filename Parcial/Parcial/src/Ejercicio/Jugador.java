package Ejercicio;

public class Jugador {
    private enum Gesto{PIEDRA,PAPEL,TIJERA};
    private Gesto gesto;

    public Jugador(){};

    public Jugador(int n){
        switch(n){
            case 0:
                gesto = Gesto.PIEDRA;
                break;
            case 1:
                gesto = Gesto.PAPEL;
                break;
            case 2:
                gesto = Gesto.TIJERA;
                break;
        }
    }
    public String getGesto(){
        return gesto.name();
    }

}
