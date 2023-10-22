package Ej3;

public abstract class InstrumentoMusical {
    private enum TipoInstrumento{VIENTO,CUERDA,PERCUSION};
    private TipoInstrumento tipo;
    public abstract void tocar();
    public String getTipo(){
        return tipo.name();
    }

}
