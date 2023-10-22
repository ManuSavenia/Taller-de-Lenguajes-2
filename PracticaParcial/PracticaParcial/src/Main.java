// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        enum Estados {CONECTANDO, LEYENDO, LISTO, ERROR};
        int posicion = 2;
        for (Estados i : Estados.values()) {
            if(i.ordinal() == posicion-1){
                System.out.println("La constante en la posicion 2 es es: " + Estados.values()[i.ordinal()]);
            }
            System.out.println("i: " + i.name());
        }
       int name = Estados.LISTO.ordinal();
        System.out.println("ordinal = " + name);
       int j = Estados.LISTO.compareTo(Estados.CONECTANDO);
        System.out.println("j = " + j);
    }
}