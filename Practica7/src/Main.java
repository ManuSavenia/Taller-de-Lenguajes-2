import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
public class Main {
    public static void main(String[] args) {
        boolean menu = true;
        Scanner sc = new Scanner(System.in);
        String base_url = "jdbc:mariadb://localhost:3306/mundial_futbol_2022";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(base_url.toString(), "root", "01234567");
            if (conn != null) {
                System.out.println("Conectado a la base de datos");
                System.out.println("Bienvenido al sistema de gestion de la Copa Mundial de Futbol 2022");
                while (menu){
                    System.out.println("1. Ingresar un nuevo jugador");
                    System.out.println("2. Ingresar un nuevo pais");
                    System.out.println("3. Ingresar una nueva sede");
                    System.out.println("4. Salir");
                    int opcion = sc.nextInt();
                    switch (opcion){
                        case 1:
                            Jugador jugador = new Jugador(conn);
                            Statement st = conn.createStatement();
                            String query = "INSERT INTO futbolista (nombre, apellido, docIdentidad, telefono, email,idPais) VALUES('"+jugador.getNombre()+"','"+jugador.getApellido()+"','"+jugador.getDocId()+"','"+jugador.getTelefono()+"','"+jugador.getEmail()+"','"+jugador.getID_Pais()+"')";
                            st.executeUpdate(query);
                            st.close();
                            break;
                        case 2:
                            Pais pais = new Pais();
                            Statement st1 = conn.createStatement();
                            String query1 = "INSERT INTO pais (idpais, nombre, idioma) VALUES('"+pais.getID()+"','"+pais.getNombre()+"','"+pais.getIdioma()+"')";
                            st1.executeUpdate(query1);
                            st1.close();
                            break;
                        case 3:
                            Sede sede = new Sede(conn);
                            Statement st2 = conn.createStatement();
                            String query2 = "INSERT INTO sede (idsede, nombre, capacidad,idpais) VALUES('"+sede.getID()+"','"+sede.getNombre()+"','"+sede.getCapacidad()+"','"+sede.getID_Pais()+"')";
                            st2.executeUpdate(query2);
                            st2.close();
                            break;
                        case 4:
                            menu = false;
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                }
                conn.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}