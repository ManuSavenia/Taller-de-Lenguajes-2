import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
public class Sede {

    private int ID;
    private String nombre;
    private int capacidad;
    private int ID_Pais;
    Scanner sc = new Scanner(System.in);
    public Sede(Connection conn) {
        System.out.println("Ingrese el nombre de la sede a almacenar: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese la capacidad de la sede a almacenar: ");
        this.capacidad = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el ID de la sede a almacenar: ");
        this.ID = Integer.parseInt(sc.nextLine());
        System.out.println("Listado de paises a elegir para la sede: ");

        try {
            Statement sent = conn.createStatement();
            ResultSet resul = sent.executeQuery("SELECT * FROM pais");
            while (resul.next()){
                System.out.println("ID = "+resul.getString("idpais")+", Nombre = "+resul.getString("nombre"));
            }
            String eleccion = sc.nextLine();
            this.ID_Pais = Integer.parseInt(eleccion);
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
    //setters y getters
    public String getNombre() {
        return nombre;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public int getID_Pais() {
        return ID_Pais;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void setID_Pais(int ID_Pais) {
        this.ID_Pais = ID_Pais;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

}
