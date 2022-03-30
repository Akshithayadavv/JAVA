import java.util.ArrayList;
import java.util.Scanner;

public class Proj1_SumOfElements {
 public static void main(String[] args)
 {ArrayList<Integer> someList =new ArrayList<>();
      someList.add(10);
      someList.add(20);
      someList.add(30);
      someList.add(40);

      int sum=sumOfElements(someList);
      System.out.println(sum);
 }
 public static int sumOfElements(ArrayList<Integer> list)
 {
     int sum=0;
     for(int i=0;i<list.size();i++){
         sum+=list.get(i);
     }
      return sum;
 }
}
