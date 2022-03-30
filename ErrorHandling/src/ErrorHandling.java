public class ErrorHandling {

    public static void exceptionHandling(String name,String phoneNumber,String bankNumber) throws FirstException,SecondException,ThirdException,NullPointerException
    {   if(name==null || phoneNumber==null || bankNumber==null)
            throw new NullPointerException();
        if(name.length()==0)
            throw new FirstException();
        if(phoneNumber.length()!=10)
            throw new SecondException();
        if(bankNumber.length()!=12)
            throw new ThirdException();

    }
    public static void main(String[] args) {
        try {
            exceptionHandling("", "1276761904809665826", "123456789109");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("In finally block!!");
        }
    }
}