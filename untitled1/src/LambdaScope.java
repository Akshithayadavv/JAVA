public class LambdaScope extends SuperScope {
    private String member="GRANDPA";

    interface Family{
        String who(String member);
    }
    public void testMember(String member){
        System.out.println("Local member: "+ member);
        System.out.println("Family member: "+ this.member);
        System.out.println("Family member: "+ super.member);

        Family familyLambda=(familymember)->{
            System.out.println("Local lambda member: "+ familymember);
            System.out.println("Local lambda  member: "+ member);
            System.out.println("Local lambda this.member: "+ this.member);
            System.out.println("Local lambda super.member: "+ super.member);
            return familymember;
        };
        familyLambda.who(member);
    }
    public static void main(String[] args){
        new LambdaScope().testMember("SON");
    }
}
