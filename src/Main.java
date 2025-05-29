
import java.util.Currency;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Locale nigerianLocale = new Locale("en", "ng");

        Currency naira = Currency.getInstance("NGN");
        System.out.println(naira.getSymbol(nigerianLocale));
    }

    public void say_hello(String firstname, String lastname) {
        final String fullname = firstname + " " + lastname;
        System.out.printf("Your full name is %s", fullname);
    }
}