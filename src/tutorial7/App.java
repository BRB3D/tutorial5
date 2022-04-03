package tutorial7;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Create scanner objet
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

//        Output the prompt
        System.out.println("Enter a line of text: ");

//        Wait for the user to enter a line of text
        String line = input.nextLine();

//        Tell them what they entered.
        System.out.println("You entered: "  + line);

        //        Output the prompt
        System.out.println("Enter an integer: ");

//        Wait for the user to enter something
       int value = input2.nextInt();

//        Tell them what they entered.
        System.out.println("You entered: "  + value);
    }
}
