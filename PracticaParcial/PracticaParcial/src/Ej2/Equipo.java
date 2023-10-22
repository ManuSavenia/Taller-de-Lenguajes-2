package Ej2;

public class Equipo {
    private int CantJugadores;
    private Jugador[] Jugadores;

    private int CantActuales;
    private int Arqueros;
    private int Defensores;
    private int Mediocampistas;
    private int Delanteros;

    public Equipo(int cantJugadores){
        if(cantJugadores>=5) {
            this.CantJugadores = cantJugadores;
            this.Jugadores = new Jugador[cantJugadores];
            this.CantActuales = 0;
            this.Arqueros = 0;
            this.Defensores = 0;
            this.Mediocampistas = 0;
            this.Delanteros = 0;
        }else {
            System.out.println("La cantidad de jugadores debe ser mayor o igual a 5");
        }
    }

    public void setJugadores(Jugador jugador) {
        int i=this.CantActuales;
            if(jugador.getPos1().equals("ARQUERO") && this.Arqueros<1){
                this.Arqueros++;
                this.Jugadores[i] = jugador;
                this.CantActuales++;
            } else if (jugador.getPos1().equals("DEFENSOR") && this.Defensores<2) {
                this.Defensores++;
                this.Jugadores[i] = jugador;
                this.CantActuales++;
            } else if (jugador.getPos1().equals("MEDIOCAMPISTA") && this.Mediocampistas<1) {
                this.Mediocampistas++;
                this.Jugadores[i] = jugador;
                this.CantActuales++;
            } else if (jugador.getPos1().equals("DELANTERO") && this.Delanteros<1) {
                this.Delanteros++;
                this.Jugadores[i] = jugador;
                this.CantActuales++;
            } else if (jugador.getPos2().equals("ARQUERO") && this.Arqueros<1) {
                this.Arqueros++;
                this.Jugadores[i] = jugador;
                this.CantActuales++;
            } else if (jugador.getPos2().equals("DEFENSOR") && this.Defensores<2) {
                this.Defensores++;
                this.Jugadores[i] = jugador;
                this.CantActuales++;
            } else if (jugador.getPos2().equals("MEDIOCAMPISTA") && this.Mediocampistas<1) {
                this.Mediocampistas++;
                this.Jugadores[i] = jugador;
                this.CantActuales++;
            } else if (jugador.getPos2().equals("DELANTERO") && this.Delanteros<1) {
                this.Delanteros++;
                this.Jugadores[i] = jugador;
                this.CantActuales++;
            } else {
                System.out.println("No se pudo agregar el jugador");
            }
        }

    public int getArqueros() {
        return Arqueros;
    }
    public int getDefensores() {
        return Defensores;
    }
    public int getMediocampistas() {
        return Mediocampistas;
    }
    public int getDelanteros() {
        return Delanteros;
    }
    public int getCantJugadores() {
        return CantJugadores;
    }
    public int getCantActuales() {
        return CantActuales;
    }
}

