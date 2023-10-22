package Ej2;

public class Jugador {
    private enum Posiciones{ARQUERO, DEFENSOR, MEDIOCAMPISTA, DELANTERO};
    private Posiciones Pos1;
    private Posiciones Pos2;

    public Jugador(String pos1, String pos2){
        for(Posiciones p : Posiciones.values()){
            if(p.name().equals(pos1)){
                this.Pos1 = p;
            }
            if(p.name().equals(pos2)){
                this.Pos2 = p;
            }
        }
    }
    public void setPos1(String pos1){
        for(Posiciones p : Posiciones.values()){
            if(p.name().equals(pos1)){
                this.Pos1 = p;
            }
        }
    }
    public void setPos2(String pos2){
        for(Posiciones p : Posiciones.values()){
            if(p.name().equals(pos2)){
                this.Pos2 = p;
            }
        }
    }
    public String getPos1(){
        return Pos1.name();
    }
    public String getPos2(){
        return Pos2.name();
    }
}
