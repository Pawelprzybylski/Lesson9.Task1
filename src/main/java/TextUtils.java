public class TextUtils {

    public static void checkText(String text) {
        if (!text.isEmpty()) {
            if (isPalindrome(text)) {
                System.out.println("Wpisany tekst jest palindromem");
            } else {
                System.out.println("Wpisany tekst  nie jest palindromem");
            }
            System.out.println("Długość wpisanego tekstu wynosi:" + text.length());
        }
        throw new IllegalArgumentException("Nie można sprawdzić pustego napisu");
    }

    private static boolean isPalindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }

}


