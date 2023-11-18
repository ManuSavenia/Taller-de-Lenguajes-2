package Ej1;
import java.util.*;

public class DiccionarioDeSinonimos {
    private HashMap<String, LinkedList<String>> diccionario;
    public DiccionarioDeSinonimos() {
        LinkedList<String> palabras = new LinkedList<String>();
        palabras.add("sillon");
        palabras.add("casa");
        palabras.add("libro");
        palabras.add("computador");
        LinkedList<String> sinonimos1 = new LinkedList<String>();
        sinonimos1.add("asiento");
        sinonimos1.add("butaca");
        sinonimos1.add("silla");
        LinkedList<String> sinonimos2 = new LinkedList<String>();
        sinonimos2.add("edificacion");
        sinonimos2.add("inmueble");
        sinonimos2.add("hogar");
        sinonimos2.add("obra");
        LinkedList<String> sinonimos3 = new LinkedList<String>();
        sinonimos3.add("ejemplar");
        sinonimos3.add("manual");
        sinonimos3.add("texto");
        sinonimos3.add("obra");
        LinkedList<String> sinonimos4 = new LinkedList<String>();
        sinonimos4.add("equipo");
        sinonimos4.add("ordenador");
        sinonimos4.add("pc");
        this.diccionario = new HashMap<String,LinkedList<String>>();
        this.diccionario.put(palabras.get(0), sinonimos1);
        this.diccionario.put(palabras.get(1), sinonimos2);
        this.diccionario.put(palabras.get(2), sinonimos3);
        this.diccionario.put(palabras.get(3), sinonimos4);
    }
    public String obtenerSinonimos(String palabra) {
        return diccionario.get(palabra).toString();
    }
    public void imprimirDiccionario() {
        for (String palabra : diccionario.keySet()) {
            System.out.println(palabra + ": " + diccionario.get(palabra));
        }
    }
}
