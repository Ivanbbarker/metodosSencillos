public class AppConcatenar {
    public static void main(String[] args) {

        String[] palabra = new String[] { "primeraPalabra", "segundaPalabra", "terceraPalabra" };
        concatenarCadena(palabra);
    }

    public static void concatenarCadena(String[] palabra) {
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i]);
        }
    }
}
