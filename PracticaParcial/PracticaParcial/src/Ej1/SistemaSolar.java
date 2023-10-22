package Ej1;

public class SistemaSolar {
    private Planeta[] planetas;
    private static SistemaSolar SistemaSolar;
    private SistemaSolar(){
        planetas = new Planeta[8];
        planetas[0] = new Planeta(0, "ROCOSO", 4879L, 57910000L);
        planetas[1] = new Planeta(0, "ROCOSO", 12104L, 108200000L);
        planetas[2] = new Planeta(0, "ROCOSO", 12756L, 149600000L);
        planetas[3] = new Planeta(0, "ROCOSO", 6792L, 227900000L);
        planetas[4] = new Planeta(0, "GASEOSO", 142984L, 778500000L);
        planetas[5] = new Planeta(0, "GASEOSO", 120536L, 1433000000L);
        planetas[6] = new Planeta(0, "GASEOSO", 51118L, 2877000000L);
        planetas[7] = new Planeta(0, "GASEOSO", 49528L, 4503000000L);
    }

    public SistemaSolar getSistemaSolar(){
        if (SistemaSolar == null)
            SistemaSolar = new SistemaSolar();
        return SistemaSolar;
    }
}
