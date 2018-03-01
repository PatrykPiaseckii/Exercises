
import java.util.Scanner;


public class Quiz {
public static void main(String [] args){


//Generate two random single digit integers

int number1 = (int)(Math.random()* 1000);
int number2 = (int)(Math.random()* 1000);

// If number1 bigger then number 2 swap numbers

if (number1 < number2){
    
    int temp = number1;
    number1 = number2;
    number2 = temp;
    
}

System.out.println("What is " + number1 + " - " + number2 + " ? ");
Scanner input = new Scanner(System.in);
int answer = input.nextInt();

if (number1 - number2 == answer)
    System.out.println("You are correct answer!");
 else {
    System.out.println("Your answer is wrong!");
    System.out.println(number1 + " - " + number2 +  " should be " + (number1 - number2));
}          
}
}
