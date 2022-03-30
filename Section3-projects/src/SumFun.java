import java.util.Scanner;
public class SumFun {
    public static void main(String [] args)
    {
        Scanner Keyboard= new Scanner(System.in) ;
        int sum=0;
        int input;

        System.out.println("Enter non neagtive integer");
        System.out.println("Negative to exit");
        input=Keyboard.nextInt();

        while(input>=0){
            sum+=input;
            System.out.println("Enter non neagtive integer");
            System.out.println("Negative to exit");
            input=Keyboard.nextInt();

        }
        System.out.println("Sum is " + sum);
    }
}
