import java.util.Random;
public class RandomFile {
    public static void main(String[] args)
    {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber=random.nextInt();
        System.out.println("number is"+ myRandomNumber);

        myRandomNumber=random.nextInt(1000);
        System.out.println("number is"+ myRandomNumber);

        myRandomNumber=random.nextInt(1000)+1;
        System.out.println("number is"+ myRandomNumber);



    }
}
