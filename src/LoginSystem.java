import java.util.Scanner;

public class LoginSystem extends MenuPopUp {
    private static  String username;
    private static String password;
    private static int failAttempts = 0;
    public static boolean codeVerifier = true;

    static Scanner in = new Scanner(System.in);

    public static void enterPassword(){

        while (codeVerifier) {
            System.out.print(ANSI_BLUE);
            System.out.println("Enter your username");
            username = in.nextLine();
            System.out.println("Enter your password");
            password = in.nextLine();
            System.out.print(ANSI_RESET);

            if (username.equalsIgnoreCase("Harry") && password.equals("hairyharry")) {
                System.out.print(ANSI_PURPLE);
                System.out.print("Succesfully Logged in!");
                System.out.println(ANSI_RESET);
                codeVerifier = false;
                printMenu();
                int pickChoice;
                int secondPick;
                int vacationPick;
                pickChoice = in.nextInt();
                if (pickChoice==3){
                    System.out.println("tryk 1 for at se fremtidige bookings eller tryk 2 for at se tidligere bookings" +
                            "" + " tryk 3 for at registrere feriedage");
                    secondPick = in.nextInt();

                    if ( secondPick ==1){
                        System.out.println("Se fremtidige status");
                        CalenderDisplayer.displayCalender();
                        CalenderDatabase.displayDatabase();
                    }
                     if (secondPick == 2){
                        CalenderDisplayer.displayCalender();

                        System.out.println("Vælg en dag du ville se status over");
                        TidligereDage.customerInfo();

                    }
                     if (secondPick==3){
                         CalenderDisplayer.displayCalender();
                         System.out.println();
                         System.out.println("Vælg en dag du holde fri");
                         vacationPick = in.nextInt();
                         System.out.println("Du har valgt og høre ferie den " + vacationPick + " Oktober");

                     }
                }
                if (pickChoice==1){

                    BookingSystem.addPeople();

                }
                if (pickChoice==2){
                    BookingSystem.cancelAppointments();

                }



            } else {
                System.out.println("Wrong username or password");
                failAttempts++;

            }
            if (failAttempts == 2) {
                System.out.println("You have tried to many times");
                codeVerifier = false;
            }

        }
    }

}