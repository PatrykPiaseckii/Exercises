
public class Length {
public static void main(String [] args){
    
String message = "Damy rade nauczyc sie JavaScript";    
System.out.println("The length of " + message + " is " + message.length());
System.out.println("The first letter " + message + " is " + message.charAt(0));
System.out.println("The last letter " + message + " is " + message.charAt(31));

message += " nie poddawaj sie";

System.out.println("This text is: " + message);
}
}