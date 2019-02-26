
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int selection;
        while (true) {
            System.out.println("Hi, please kindly select one of the items below :");
            System.out.print(
                    "1. Functional Interfaces\n" +
                            "2. Lambda Expressions\n" +
                            "3. Stream\n" +
                            "4. Method Reference\n" +
                            "5. DateTime API\n" +
                            "6. Exit");

            selection = safeIntegerInput("Your Selection : ");

            if (selection == 6) {
                break;
            }

            switch (selection) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }

    private static int safeIntegerInput(String message){
        boolean isValid=true;
        int userInput=0;
        do{
            /*Loop if there was an exception*/
            try{
                isValid=true;
                System.out.print(message);
                userInput=scanner.nextInt();
            }catch (InputMismatchException e){
                /*Print exception message and program is still running*/
                scanner.nextLine();
                isValid=false;
                e.printStackTrace();
            }
        }while(!isValid);
        return userInput;
    }
}
