import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args)
{
    ArrayList<Integer> myAl= new ArrayList<>();
    myAl.add(22);
    myAl.add(23);

    for(int i=0;i<myAl.size();i++)
        System.out.println(myAl.get(i));

    String value="450";
    int num=Integer.parseInt(value);
    num+=10;

    System.out.println(num);
}
}






