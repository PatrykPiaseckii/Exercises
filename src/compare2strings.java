
import java.util.Scanner;


public class compare2strings {
public static void main(String [] args){
Scanner input = new Scanner(System.in);    

System.out.println("Enter two strings");
String string1 = input.nextLine();
String string2 = input.nextLine();

if (string1.equals(string2))
    System.out.println("string1 and string2 are the same object");
else
     System.out.println("string1 and string2 are different");
    

}
}
