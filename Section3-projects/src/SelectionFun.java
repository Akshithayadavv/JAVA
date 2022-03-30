import java.util.Scanner;
public class SelectionFun {
    public static void main(String [] args)
    {
        int age;
        Scanner Keyboard= new Scanner(System.in);

        System.out.println("Welcome to Pub and Grillie");

        System.out.println("Please enter your age");
        age= Keyboard.nextInt();

        if(age>=21)
            System.out.println("Here, have a beer");

        if(age>=16)
        {
            System.out.println("Here have a coke!");
            System.out.println("Atleast you can drive!");
        }
        else
            System.out.println("Here have a coke!");
    }
}
