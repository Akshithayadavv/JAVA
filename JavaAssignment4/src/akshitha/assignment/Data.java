package akshitha.assignment;

public class Data {
    int intMember; //not intialized
    char charMember; //not intialized

 void printMembers(){
    System.out.println("Integer Value is : "+ intMember + "Character value is:" + charMember);
 }
 void printLocalMembers(){
    int intLocalMember; //Not initialized
    char charLocalMember; //Not initialized

     //Local variables must be initialized before use, as they don't have default value
     // System.out.println("Local Integer Value : "+ intLocalMember + "Local Character Value : "+ charLocalMember);

 }
}
