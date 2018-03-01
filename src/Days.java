
import java.util.Scanner;


public class Days {
public static void main(String [] args){
Scanner input = new Scanner(System.in);   

System.out.println("Enter a day:"
        + "\n  1 - Monday "
        + "\n  2 - Tuesday "
        + "\n  3 - Wednesday "
        + "\n  4 - Thursday "
        + "\n  5 - Friday "
        + "\n  6 - Saturday "
        + "\n  7 - Sunday "
        + "\n <------------------>");

int day = input.nextInt();
    
switch (day) {
case 1:
case 2:
case 3:
case 4:
case 5: System.out.println("Weekday"); break;
case 6:
case 7: System.out.println("Weekend");
}  
   
}    
}
