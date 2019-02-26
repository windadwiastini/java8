
import com.mitrais.pbi2.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int selection;
        while (true) {
            System.out.println("\n");
            System.out.println("Hi, please kindly select one of the items below :");
            System.out.print(
                    "1. Functional Interfaces\n" +
                            "2. Lambda Expressions\n" +
                            "3. Stream and Method Reference\n" +
                            "4. DateTime API\n" +
                            "5. Exit");

            selection = safeIntegerInput("\nYour Selection : ");

            if (selection == 5) {
                break;
            }

            switch (selection) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    StreamMethodReference streamExample=new StreamMethodReference();
                    streamExample.startStream();
                    break;
                case 4:
                    System.out.println("-=>Date time without timezone");
                    LocalDriver LD = new LocalDriver();
                    LD.LocalDateTimeApi();
                    System.out.println("-=>Date time with timezone");
                    ZonedDriver ZD = new ZonedDriver();
                    ZD.ZonedTimeAndDate();
                    System.out.println("-=>Checking birthday period and duration against today");
                    PeriodandDurationDriver P = new PeriodandDurationDriver();
                    P.checkingDuration();
                    P.checkingPeriod();
                    System.out.println("-=>Temporal Adjuster Calculation");
                    TemporalAdjusterDriver T = new TemporalAdjusterDriver();
                    T.checkingAdjusters();
                    break;
            }
            scanner.nextLine();
            scanner.nextLine();
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