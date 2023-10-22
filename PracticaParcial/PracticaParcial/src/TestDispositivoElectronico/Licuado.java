package TestDispositivoElectronico;

public final class Licuado {
    private String fruta1;
    private String fruta2;
    private boolean azucar;
    private enum LecheOAgua {LECHE, AGUA};
    private LecheOAgua lecheoAgua;

    public Licuado(String fruta1, String fruta2, boolean azucar, String LecheoAgua){
        this.fruta1 = fruta1;
        this.fruta2 = fruta2;
        this.azucar = azucar;
        if (LecheoAgua.equals("leche")){
            this.lecheoAgua = LecheOAgua.LECHE;
        } else if (LecheoAgua.equals("agua")) {
            this.lecheoAgua = LecheOAgua.AGUA;
        }
    }
    public void setFruta1(String fruta1){
        this.fruta1 = fruta1;
    }
    public String getFruta1(){
        return this.fruta1;
    }
    public void setFruta2(String fruta2){
        this.fruta2 = fruta2;
    }
    public String getFruta2(){
        return this.fruta2;
    }
    public void setAzucar(boolean azucar){
        this.azucar = azucar;
    }
    public boolean getAzucar(){
        return this.azucar;
    }
    public void setLecheoAgua(String LecheoAgua){
        if (LecheoAgua.equals("leche")){
            this.lecheoAgua = LecheOAgua.LECHE;
        } else if (LecheoAgua.equals("agua")) {
            this.lecheoAgua = LecheOAgua.AGUA;
        }
    }
    public String getLecheoAgua(){
        if (this.lecheoAgua == LecheOAgua.LECHE){
            return "leche";
        } else if (this.lecheoAgua == LecheOAgua.AGUA) {
            return "agua";
        }
        return "";
    }
    public String toString(){
        return "Fruta 1: "+this.fruta1+"\nFruta 2: "+this.fruta2+"\nAzucar: "+this.azucar+"\nLeche o Agua: "+this.lecheoAgua;
    }

}
