public class RectangleDemo {
    public static void main(String[] args ){
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(5,10);

        System.out.println(Rectangle.getNumRectangles());

        Rectangle r3;
        System.out.println("After r3 declared "+
                Rectangle.getNumRectangles());
    }
}
