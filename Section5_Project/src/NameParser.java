import java.util.Scanner;

public class NameParser {
    public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);

        String fullName;
        String firstName;
        String lastName;

        System.out.println("Enter Full name");
        fullName=keyboard.nextLine();

        int indexOfSpace= fullName.indexOf(" ");

        firstName=fullName.substring(0,indexOfSpace);
        lastName=fullName.substring(indexOfSpace+1);

        System.out.println(firstName);
        System.out.println(lastName);

    }
}
