package TestDispositivoElectronico;
import java.util.Scanner;
public class Licuadora extends DispositivoElectronico{
    private double vaso;
    private int velocidad;

    public Licuadora(double vaso){
        this.setnombre("Licuadora");
        this.setEnchufado(false);
        this.setPrendido("APAGADO");
        this.vaso = vaso;
        this.velocidad = 0;
    }
    public void setVaso(double vaso){
        this.vaso = vaso;
    }
    public double getVaso(){
        return this.vaso;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    public int getVelocidad(){
        return this.velocidad;
    }

    Scanner scanner = new Scanner(System.in);

    public Licuado licuar(String fruta1, String fruta2){
        if(this.estaPrendida()) {
            boolean azucar = false;
            String lecheoAgua = "";
            System.out.println("Quiere con azucar? (si/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equals("si")) {
                azucar = true;
            }
            System.out.println("Quiere con leche o agua? (leche/agua)");
            lecheoAgua = scanner.nextLine();
            if (lecheoAgua.equals("leche")) {
                lecheoAgua = "leche";
            } else if (lecheoAgua.equals("agua")) {
                lecheoAgua = "agua";
            }
            Licuado licuado = new Licuado(fruta1, fruta2, azucar, lecheoAgua);
            return licuado;
        }
        System.out.println("La licuadora esta apagada o desenchufada");
        Licuado licuado = null;
        return licuado;
    }
}
