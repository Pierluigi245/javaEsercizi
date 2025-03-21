public class Main {
    public static String verificaStringhe(String prima, String seconda) {
        StringBuilder messaggio = new StringBuilder();

        // Usa equals() invece di compareTo()
        boolean sonoUguali = prima.equals(seconda);

        // Costruzione del messaggio con append condizionale
        messaggio.append("Le due stringhe sono ");
        messaggio.append(sonoUguali ? "uguali" : "differenti");

        return messaggio.toString();
    }

    public static void main(String[] args) {
        // Esempi di test
        String stringa1 = "test";
        String stringa2 = "test";
        String stringa3 = "prova";

        System.out.println(verificaStringhe(stringa1, stringa2)); // Output: Le due stringhe sono uguali
        System.out.println(verificaStringhe(stringa1, stringa3)); // Output: Le due stringhe sono differenti
    }
}