package Ej2;

public class TestEquipos {
    public static void main(String[] args){
        //create 2 teams
       Equipo equipo1 = new Equipo(5);
        Equipo equipo2 = new Equipo(5);
        //set the players for both teams
        equipo1.setJugadores(new Jugador("ARQUERO", "DEFENSOR"));
        equipo1.setJugadores(new Jugador("DEFENSOR", "MEDIOCAMPISTA"));
        equipo1.setJugadores(new Jugador("MEDIOCAMPISTA", "DELANTERO"));
        equipo1.setJugadores(new Jugador("DELANTERO", "DEFENSOR"));
        equipo1.setJugadores(new Jugador("DEFENSOR", "ARQUERO"));
        equipo2.setJugadores(new Jugador("ARQUERO", "DELANTERO"));
        equipo2.setJugadores(new Jugador("DEFENSOR", "MEDIOCAMPISTA"));
        equipo2.setJugadores(new Jugador("MEDIOCAMPISTA", "DELANTERO"));
        equipo2.setJugadores(new Jugador("DELANTERO", "DEFENSOR"));
        equipo2.setJugadores(new Jugador("DEFENSOR", "ARQUERO"));
        //print the number of goalkeepers for both teams
        System.out.println("Equipo 1: "+equipo1.getArqueros()+" arqueros");
        System.out.println("Equipo 2: "+equipo2.getArqueros()+" arqueros");
        //print the number of defenders for both teams
        System.out.println("Equipo 1: "+equipo1.getDefensores()+" defensores");
        System.out.println("Equipo 2: "+equipo2.getDefensores()+" defensores");
        //print the number of midfielders for both teams
        System.out.println("Equipo 1: "+equipo1.getMediocampistas()+" mediocampistas");
        System.out.println("Equipo 2: "+equipo2.getMediocampistas()+" mediocampistas");
        //print the number of forwards for both teams
        System.out.println("Equipo 1: "+equipo1.getDelanteros()+" delanteros");
        System.out.println("Equipo 2: "+equipo2.getDelanteros()+" delanteros");
        //print the actual number of players for both teams
        System.out.println("Equipo 1: "+equipo1.getCantActuales()+" jugadores");
        System.out.println("Equipo 2: "+equipo2.getCantActuales()+" jugadores");

    }
}
