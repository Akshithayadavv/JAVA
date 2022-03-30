import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class FileInputFun {
    public static void main(String[] args){
        Scanner inFile;
        int sum=0;

        try{
            inFile=new Scanner(new File("src/input.txt"));
            int input;

            while (inFile.hasNext()){
                input=inFile.nextInt();
                System.out.println(input);
                sum+=input;
            }
            System.out.println(sum);
            inFile.close();

        }

        catch (FileNotFoundException ex){
            System.out.println("Can't find file");
            System.out.println(ex.getMessage());
        }

        catch (InputMismatchException ex){
            System.out.println("Error reading input");
        }
    }
}
