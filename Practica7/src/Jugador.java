import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jugador {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private String docId;
    private String telefono;
    private String email;
    private int ID_Pais;
    public Jugador(Connection conn) {
        System.out.println("Ingrese el nombre del jugador a almacenar: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del jugador a almacenar: ");
        this.apellido = sc.nextLine();
        System.out.println("Ingrese el documento de identidad del jugador a almacenar: ");
        this.docId = sc.nextLine();
        System.out.println("Ingrese el telefono del jugador a almacenar: ");
        this.telefono = sc.nextLine();
        System.out.println("Ingrese el email del jugador a almacenar: ");
        this.email = sc.nextLine();
        System.out.println("Listado de paises a elegir para jugar: ");

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
    public String getApellido() {
        return apellido;
    }
    public String getDocId() {
        return docId;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }

    public int getID_Pais() {
        return ID_Pais;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDocId(String docId) {
        this.docId = docId;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setID_Pais(int ID_Pais) {
        this.ID_Pais = ID_Pais;
    }

}
