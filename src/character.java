
import java.util.Scanner;


public class character {
public static void main(String [] args){
    
Scanner input = new Scanner(System.in);
System.out.print("Enter a character: ");
String s = input.nextLine();
char ch = s.charAt(3); // Ktory znak w stringu ma wyświetlić

System.out.println("The character entered is " + ch);
}}