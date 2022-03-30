public class TargetTyping {
    //i ->i*i;

    public interface Email{
        String constructEmail(String name);
    }
    Email email= (String name) -> name+ "@maddhusudan.com";

    public String getEmail(String name, Email email){
        return  null;
    }
    public static void main(String[] args){
        new  TargetTyping().getEmail("mkonda",(String name)-> name +"@maddhusudan.com");
    }
}
