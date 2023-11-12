public class CharlyGarcia {
    private static CharlyGarcia instance;
    private CharlyGarcia() {}

    public static CharlyGarcia getInstance() {
        if (instance == null) {
            instance = new CharlyGarcia();
        }
        return instance;
    }
}
