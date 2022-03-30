import java.util.Scanner;

public class Proj4_1_Arrays {
    public static  void main(String[] args)
    {
        Scanner Keyboard= new Scanner(System.in);
        int[] values  = new int[5];

        for(int i=0;i<values.length;i++)
        {
            System.out.println("Enter an integer");
            values[i]=Keyboard.nextInt();
        }
        for(int i=0;i<values.length;i++)
        {
            System.out.println("result is" +(values[i]*2));
        }
    }
}
