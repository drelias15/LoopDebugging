import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


            String userInput;

            while (!(userInput = keyboard.nextLine()).isEmpty()) {
                System.out.println(userInput);
            }
    }
}