// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GeneraRandom generaRandom = new GeneraRandom();
        int a;
        for (int i = 1; i <= 100; i++) {
            a = generaRandom.obtenerRandom();
            System.out.println(a);
        }
    }
}