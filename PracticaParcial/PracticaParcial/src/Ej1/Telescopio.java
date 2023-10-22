package Ej1;

public class Telescopio {
    public Long distancia(Planeta planeta){
        Long distancia = planeta.getDistSol();
        return  distancia;
    }
    public void tipo(Planeta planeta){
        System.out.println(planeta.getTipo());
    }


}
