public class MethodDemo {

    public static void main(String[] args)
    {
        printHello();
        printNumber();
        int result=giveMe();
        System.out.println(result);

        result=addThese(3,5);
        System.out.println(result);
    }
    public static void printHello()
    {
        System.out.println("Hello there!");
    }
    public static void printNumber()
    {
        System.out.println("5");
    }
    public static int giveMe()
    {
        return 10;
    }
    public static int addThese(int a,int b)
    {
        int result=a+b;
        return result;
    }

}
