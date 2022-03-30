import java.util.Locale;

public class StringMethod2 {
    public static void main(String [] args)
    {
        String name="John Baugh";

        String upper=name.toUpperCase();
        String lower=name.toLowerCase();

        int indexOfB= name.indexOf("B");

        String lastName=name.substring(5);

        System.out.println("Upper is" + upper);
        System.out.println("Lower is" + lower);
        System.out.println("B is at index is" + indexOfB);
        System.out.println("Lastname is" + lastName);

    }
}
