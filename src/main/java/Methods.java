public class Methods {
    static String text;
    static String reverseText;

    public static void checkText(String text) {

        if (text.matches(".*")) {
            System.out.println("Długość wpisanego tekstu wynosi:");
            System.out.println(text.length());
        }
        if (text.equals(reverseText = new StringBuilder(text).reverse().toString())) {
            System.out.println("Wpisany tekst jest palindromem");

        } else {
            System.out.println("Wpisany tekst  nie jest palindromem");
        }

    }
}