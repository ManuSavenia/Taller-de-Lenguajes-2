package TestDispositivoElectronico;
public abstract class DispositivoElectronico {
    private enum Prendido {PRENDIDO, APAGADO};
    private  Prendido estado;
    private String nombre;
    private boolean enchufado;


    public void setPrendido(String prendido){
        if(this.enchufado && prendido.equals("prender")){
            this.estado = Prendido.PRENDIDO;
        }else{
            this.estado = Prendido.APAGADO;
        }
    }
    public Prendido getPrendido(){
        return this.estado;
    }
    public void setEnchufado(boolean enchufado){
        this.enchufado = enchufado;
    }
    public boolean getEnchufado(){
        return this.enchufado;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getnombre(){
        return this.nombre;
    }
    public boolean estaPrendida() {
        return this.enchufado && this.estado.equals(Prendido.PRENDIDO);
    }
}
