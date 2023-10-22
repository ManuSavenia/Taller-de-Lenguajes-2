package Ej3;

public class Orquesta {
    private int CantVientos;
    private int CantCuerdas;
    private int CantPercusiones;
    InstrumentoMusical[] Instrumentos;

    public Orquesta(){
        this.CantVientos = 3;
        this.CantCuerdas = 2;
        this.CantPercusiones = 2;
        Instrumentos = new InstrumentoMusical[7];
        for(int i=0; i<CantVientos; i++){
            Instrumentos[i] = new Viento();
        }
        for(int i=CantVientos; i<CantVientos+CantCuerdas; i++){
            Instrumentos[i] = new Cuerdas();
        }
        for(int i=CantVientos+CantCuerdas; i<CantVientos+CantCuerdas+CantPercusiones; i++){
            Instrumentos[i] = new Percusion();
        }
    }
}
