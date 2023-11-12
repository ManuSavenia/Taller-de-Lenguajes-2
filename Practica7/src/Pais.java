import java.util.Scanner;
public class Pais {
    private String Idioma;
    private String Nombre;
    private int ID;

    Scanner sc = new Scanner(System.in);
    public Pais() {
        System.out.println("Ingrese el nombre del pais a almacenar: ");
        this.Nombre = sc.nextLine();
        System.out.println("Ingrese el idioma del pais a almacenar: ");
        this.Idioma = sc.nextLine();
        System.out.println("Ingrese el ID del pais a almacenar: ");
        this.ID = sc.nextInt();
    }
    //setters y getters
    public String getIdioma() {
        return Idioma;
    }
    public void setIdioma(String idioma) {
        Idioma = idioma;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

}
