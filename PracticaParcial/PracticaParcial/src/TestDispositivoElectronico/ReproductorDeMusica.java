package TestDispositivoElectronico;

public class ReproductorDeMusica extends DispositivoElectronico{
    private enum CD {CANCION1, CANCION2, CANCION3, CANCION4, CANCION5};
    private CD cancion;

    public ReproductorDeMusica(){
        this.setnombre("Reproductor de musica");
        this.setEnchufado(false);
        this.setPrendido("APAGADO");
    }

    public CD getCancion(){
        return this.cancion;
    }

    public void ReproducirCancion(String cancion){
        if(this.estaPrendida()) {
            for (CD i : CD.values()) {
                if (i.name().equals(cancion)) {
                    this.cancion = i;
                    System.out.println("Reproduciendo " + cancion);
                    return;
                }
            }
        }
    }
    public void ReproducirCD(){
        if(this.estaPrendida()) {
            for (CD i : CD.values()) {
                System.out.println("Reproduciendo " + i.name());
            }
        }
    }
}
