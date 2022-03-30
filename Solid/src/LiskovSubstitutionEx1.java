public class LiskovSubstitutionEx1 {
    static void testdrive(Vehicle vehicle)
    {
        vehicle.start();
        vehicle.stop();
    }
    public static void main(String args[])
    {
        testdrive(new Vehicle());
        testdrive(new Bike());
        testdrive(new Car());
    }
}
