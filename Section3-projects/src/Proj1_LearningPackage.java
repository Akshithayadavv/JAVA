import java.util.Scanner;

public class Proj1_LearningPackage {
    public static void main(String[] args)
    {
        Scanner Keyboard =new Scanner(System.in);
        int packageNumber;
        int howManyCourses;
        int baseCost;
        int costPerCourse;
        int numIncluded;
        int totalCost;

        System.out.println("Which of packages do want 1,2,3");
        packageNumber=Keyboard.nextInt();

        System.out.println("How many courses did you enroll in this month");
        howManyCourses=Keyboard.nextInt();

        if(packageNumber==1)
        {
            baseCost=10;
            costPerCourse=6;
            numIncluded=2;

        }
        else if(packageNumber==2)
        {baseCost=12;
            costPerCourse=4;
            numIncluded=4;

        }
        else
        {
            baseCost=15;
            costPerCourse=3;
            numIncluded=6;

        }
        if(howManyCourses>numIncluded)
            totalCost=baseCost+(howManyCourses-numIncluded)*costPerCourse;
        else
            totalCost=baseCost;
        System.out.println(totalCost);
    }
}
