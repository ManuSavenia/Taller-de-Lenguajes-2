package Ej1;
public class Planeta {
    private int CantLunas;
    private enum Tipo{ROCOSO,GASEOSO};
    private Tipo tipo;
    private Long diametro;
    private Long DistSol;

    public Planeta(){}

    public Planeta(int CantLunas, String tipo, Long diametro, Long DistSol) {
        this.CantLunas = CantLunas;
        if(tipo.equals("ROCOSO"))
            this.tipo = Tipo.ROCOSO;
        else
            this.tipo = Tipo.GASEOSO;
        this.diametro = diametro;
        this.DistSol = DistSol;
    }
    public void setCantLunas(int CantLunas) {
        this.CantLunas = CantLunas;
    }
    public void setTipo(String tipo) {
        if(tipo.equals("ROCOSO"))
            this.tipo = Tipo.ROCOSO;
        else
            this.tipo = Tipo.GASEOSO;
    }
    public void setDiametro(Long diametro) {
        this.diametro = diametro;
    }
    public void setDistSol(Long DistSol) {
        this.DistSol = DistSol;
    }
    public int getCantLunas() {
        return CantLunas;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public Long getDiametro() {
        return diametro;
    }
    public Long getDistSol() {
        return DistSol;
    }

}
