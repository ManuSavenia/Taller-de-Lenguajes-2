import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import Ej1.DiccionarioDeSinonimos;
import Ej2.ParOrdenado;
import Ej4.HashSetCuentaAgregados;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiccionarioDeSinonimos diccionario = new DiccionarioDeSinonimos();
        //System.out.println("Ingrese una palabra para obtener sus sinonimos: ");
        //String palabra = sc.nextLine();
        //System.out.println(diccionario.obtenerSinonimos(palabra));
        System.out.println("Diccionario: ");
        diccionario.imprimirDiccionario();

        ParOrdenado<String, Long> par = new ParOrdenado<>("hola", 23L);
        System.out.println("("+par.getA()+","+par.getB()+")");

        HashSetCuentaAgregados<String> hashSet = new HashSetCuentaAgregados<>();
        hashSet.addAll(Arrays.asList("hola", "chau"));
        System.out.println("Cantidad de elementos agregados: " + hashSet.getCantidadAgregados());

    }
}