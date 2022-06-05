import java.time.Period;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any text");
        String text = in.nextLine();

        Methods.checkText(text);
    }
}


