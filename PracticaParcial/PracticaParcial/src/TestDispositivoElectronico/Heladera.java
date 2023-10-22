package TestDispositivoElectronico;

public class Heladera extends DispositivoElectronico{
    private String[] contenido;
    private int cant;

    private static Heladera heladera;

    private Heladera(){
        this.setnombre("Heladera");
        this.setEnchufado(true);
        this.setPrendido("PRENDIDO");
        this.contenido = new String[20];
        this.cant = 0;
    }

    public Heladera getHeladera(){
        if(heladera == null){
            heladera = new Heladera();
        }
        return heladera;
    }

    public void setContenido(String contenido){
        if (this.cant < 20){
            this.contenido[this.cant] = contenido;
            this.cant++;
            System.out.println("Se agrego "+contenido+" a la heladera");
        }else {
            System.out.println("La heladera esta llena");
        }
    }
    public String[] getContenido(){
        return this.contenido;
    }
    public int getCant(){
        return this.cant;
    }
    public String getContenido(int i){
        return this.contenido[i];
    }
    public void SePudrio(){
        if (!getEnchufado() || !estaPrendida()){
            System.out.println("La heladera esta apagada o desenchufada y se pudrio todo");
            }
        }

    }

