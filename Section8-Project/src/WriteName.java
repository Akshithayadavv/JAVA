import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class WriteName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Luke");
        names.add("Mayor");
        names.add("Kyle");
        names.add("Kendal");

        try {
            PrintWriter pw = new PrintWriter("names.txt");

            for(String name:names){
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Cant write to file");
        }
    }
}
