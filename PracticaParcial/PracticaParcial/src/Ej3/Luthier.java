package Ej3;

public class Luthier {

    public void afinar(InstrumentoMusical instrumento){
        if(instrumento.getTipo().equals("VIENTO"))
            System.out.println("Afinando instrumento en SI");
        else if(instrumento.getTipo().equals("CUERDA"))
            System.out.println("Afinando instrumento en DO");
        else if(instrumento.getTipo().equals("PERCUSION"))
            System.out.println("Afinando instrumento en RE");
        else
            System.out.println("No se puede afinar el instrumento");
    }
}
