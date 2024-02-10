public class algo {
    public static int Longueur(String c) {
        return c.length();
    }

    public static boolean Comparer(String c1, String c2) {
        return c1.equals(c2);
    }

    public static String Concatener(String c1, String c2) {
        return c1.concat(c2);
    }

    public static String Extraire(String c1, int debut, int fin) {
        return c1.substring(debut, fin);
    }

}
