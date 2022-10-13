import java.util.*;

public class BookingSystem {

    public static Dage addPeople2(Dage enDag) {
        String addPeople = "";
        double timeForBooking = 0;

        Scanner in = new Scanner(System.in);
        enDag = new Dage();

        //String ind

        /*
        enDag.setBookningSpotss("Klaus", 0);
        enDag.setBookningSpotss("Lerry", 1);
        enDag.setBookningSpotss("Tommy", 2);
        enDag.setBookningSpotss("Ronaldos Søn", 4);
        enDag.setBookningSpotss("Lolo", 6);
        enDag.setBookningSpotss("Karl Ulrik", 12);

         */


        System.out.print(MenuPopUp.ANSI_BLUE);
        System.out.println(enDag);
        System.out.print(MenuPopUp.ANSI_RESET);

        System.out.print(MenuPopUp.ANSI_YELLOW);
        System.out.println("Den samlede mængde økonomi for dagen er:" +
                " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
        System.out.print(MenuPopUp.ANSI_RESET);
        while (true) {

            System.out.print(MenuPopUp.ANSI_PURPLE);
            System.out.println("Vil du stoppe med at tilføje personer kan du skrive 'quit '");
            System.out.println("\n" + "Hvis ikke så tryk på en knap for at fortsætte");
            System.out.print(MenuPopUp.ANSI_RESET);

            String terminateProgram = "";
            terminateProgram = in.nextLine();
            if (terminateProgram.equalsIgnoreCase("quit"))
                break;
            else {

                System.out.println("Indsat navnet på personen du vil book eller ersat");
                addPeople = in.nextLine();
                System.out.println("Indtast den tid du vil give ");
                timeForBooking = in.nextDouble();
                if (timeForBooking == 10)
                    timeForBooking = 0;
                if (timeForBooking == 10.30)
                    timeForBooking = 1;
                if (timeForBooking == 11)
                    timeForBooking = 2;
                if (timeForBooking == 11.30)
                    timeForBooking = 3;
                if (timeForBooking == 12)
                    timeForBooking = 4;
                if (timeForBooking == 12.30)
                    timeForBooking = 5;
                if (timeForBooking == 13)
                    timeForBooking = 6;
                if (timeForBooking == 13.30)
                    timeForBooking = 7;
                if (timeForBooking == 14)
                    timeForBooking = 8;
                if (timeForBooking == 14.30)
                    timeForBooking = 9;
                if (timeForBooking == 15)
                    timeForBooking = 10;
                if (timeForBooking == 15.30)
                    timeForBooking = 11;
                if (timeForBooking == 16)
                    timeForBooking = 12;
                if (timeForBooking == 16.30)
                    timeForBooking = 13;
                if (timeForBooking == 17)
                    timeForBooking = 14;
                if (timeForBooking == 17.30)
                    timeForBooking = 15;


                enDag.setBookningSpotss(addPeople, (int) timeForBooking);
            }

            System.out.println("Den nye opdaterende liste!!");
            System.out.print(MenuPopUp.ANSI_BLUE);
            System.out.println(enDag);
            System.out.print(MenuPopUp.ANSI_RESET);

            System.out.print(MenuPopUp.ANSI_YELLOW);
            System.out.println("Den samlede mængde økonomi for dagen er:" +
                    " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
            System.out.print(MenuPopUp.ANSI_RESET);
            terminateProgram = in.nextLine();

        }
        System.out.println(enDag);
        return enDag;
    }

    public static void addPeople() {
        String addPeople = "";
        double timeForBooking = 0;

        Scanner in = new Scanner(System.in);
        Dage enDag = new Dage();

        enDag.setBookningSpotss("Klaus", 0);
        enDag.setBookningSpotss("Lerry", 1);
        enDag.setBookningSpotss("Tommy", 2);
        enDag.setBookningSpotss("Ronaldos Søn", 4);
        enDag.setBookningSpotss("Lolo", 6);
        enDag.setBookningSpotss("Karl Ulrik", 12);

        System.out.print(MenuPopUp.ANSI_BLUE);
        System.out.println(enDag);
        System.out.print(MenuPopUp.ANSI_RESET);

        System.out.print(MenuPopUp.ANSI_YELLOW);
        System.out.println("Den samlede mængde økonomi for dagen er:" +
                " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
        System.out.print(MenuPopUp.ANSI_RESET);
        while (true) {

            System.out.print(MenuPopUp.ANSI_PURPLE);
            System.out.println("Vil du stoppe med at tilføje personer kan du skrive 'quit '");
            System.out.println("\n" + "Hvis ikke så tryk på en knap for at fortsætte");
            System.out.print(MenuPopUp.ANSI_RESET);

            String terminateProgram = "";
            terminateProgram = in.nextLine();
            if (terminateProgram.equalsIgnoreCase("quit"))
                break;
            else {

                System.out.println("Indsat navnet på personen du vil book eller ersat");
                addPeople = in.nextLine();
                System.out.println("Indtast den tid du vil give ");
                timeForBooking = in.nextDouble();
                if (timeForBooking == 10)
                    timeForBooking = 0;
                if (timeForBooking == 10.30)
                    timeForBooking = 1;
                if (timeForBooking == 11)
                    timeForBooking = 2;
                if (timeForBooking == 11.30)
                    timeForBooking = 3;
                if (timeForBooking == 12)
                    timeForBooking = 4;
                if (timeForBooking == 12.30)
                    timeForBooking = 5;
                if (timeForBooking == 13)
                    timeForBooking = 6;
                if (timeForBooking == 13.30)
                    timeForBooking = 7;
                if (timeForBooking == 14)
                    timeForBooking = 8;
                if (timeForBooking == 14.30)
                    timeForBooking = 9;
                if (timeForBooking == 15)
                    timeForBooking = 10;
                if (timeForBooking == 15.30)
                    timeForBooking = 11;
                if (timeForBooking == 16)
                    timeForBooking = 12;
                if (timeForBooking == 16.30)
                    timeForBooking = 13;
                if (timeForBooking == 17)
                    timeForBooking = 14;
                if (timeForBooking == 17.30)
                    timeForBooking = 15;


                enDag.setBookningSpotss(addPeople, (int) timeForBooking);
            }

            System.out.println("Den nye opdaterende liste!!");
            System.out.print(MenuPopUp.ANSI_BLUE);
            System.out.println(enDag);
            System.out.print(MenuPopUp.ANSI_RESET);

            System.out.print(MenuPopUp.ANSI_YELLOW);
            System.out.println("Den samlede mængde økonomi for dagen er:" +
                    " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
            System.out.print(MenuPopUp.ANSI_RESET);
            terminateProgram = in.nextLine();
        }
    }

    public static void cancelAppointments() {

        String removePeople = "";
        double timeForBooking = 0;


        Scanner in = new Scanner(System.in);
        Dage enDag = new Dage();

        enDag.setBookningSpotss("Klaus", 0);
        enDag.setBookningSpotss("Lerry", 1);
        enDag.setBookningSpotss("Tommy", 2);
        enDag.setBookningSpotss("Ronaldos Søn", 4);
        enDag.setBookningSpotss("Lolo", 6);
        enDag.setBookningSpotss("Klaus", 7);

        enDag.setBookningSpotss("Karl Ulrik", 12);

        System.out.println(enDag);

        System.out.print(MenuPopUp.ANSI_YELLOW);
        System.out.println("Den samlede mængde økonomi for dagen er:" +
                " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
        System.out.print(MenuPopUp.ANSI_RESET);
        while (true) {

            System.out.println("Vil du stoppe med at Slette personer kan du skrive 'quit '");
            System.out.println("Hvis to personer med samme navne eksisterer kan du skrive 'more' ");
            System.out.println("\n" + "Hvis ikke så tryk på en knap for at fortsætte");

            String optionChooser = "";
            optionChooser = in.nextLine();
            if (optionChooser.equalsIgnoreCase("quit")) {
                break;
            } else if (optionChooser.equalsIgnoreCase("more")) {
                System.out.println("Indsat navnet på personen du vil slette");
                removePeople = in.nextLine();
                System.out.println("Indtast den specifikke tid du vil slette fra vedkommende");
                timeForBooking = in.nextDouble();
                if (timeForBooking == 10)
                    timeForBooking = 0;
                if (timeForBooking == 10.30)
                    timeForBooking = 1;
                if (timeForBooking == 11)
                    timeForBooking = 2;
                if (timeForBooking == 11.30)
                    timeForBooking = 3;
                if (timeForBooking == 12)
                    timeForBooking = 4;
                if (timeForBooking == 12.30)
                    timeForBooking = 5;
                if (timeForBooking == 13)
                    timeForBooking = 6;
                if (timeForBooking == 13.30)
                    timeForBooking = 7;
                if (timeForBooking == 14)
                    timeForBooking = 8;
                if (timeForBooking == 14.30)
                    timeForBooking = 9;
                if (timeForBooking == 15)
                    timeForBooking = 10;
                if (timeForBooking == 15.30)
                    timeForBooking = 11;
                if (timeForBooking == 16)
                    timeForBooking = 12;
                if (timeForBooking == 16.30)
                    timeForBooking = 13;
                if (timeForBooking == 17)
                    timeForBooking = 14;
                if (timeForBooking == 17.30)
                    timeForBooking = 15;


                enDag.setBookningSpotss(removePeople, (int) timeForBooking);
                enDag.setBookningSpotss("Person has been removed", (int) timeForBooking);
                enDag.economyDisplayer = enDag.economyDisplayer - 150;
                if (enDag.economyDisplayer <= 0) {
                    enDag.economyDisplayer = 0;
                }

                System.out.println("Den nye opdaterende liste!!");
                System.out.println(enDag);

                System.out.print(MenuPopUp.ANSI_YELLOW);
                System.out.println("Den samlede mængde økonomi for dagen er:" +
                        " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
                System.out.print(MenuPopUp.ANSI_RESET);
                break;

            } else {

                System.out.println("Indsat navnet på personen du vil Slette");

                removePeople = in.nextLine();

                for (int i = 0; i < enDag.timer.size(); i++) {
                    if (enDag.bookningSpots.get(i).equals(removePeople)) {
                        enDag.bookningSpots.set(i, "Person has been unbooked");
                        enDag.economyDisplayer = enDag.economyDisplayer - 150;
                        if (enDag.economyDisplayer <= 0) {
                            enDag.economyDisplayer = 0;
                        }
                    }
                }
                System.out.println("Den nye opdaterende liste!!");
                System.out.println(enDag);

                System.out.print(MenuPopUp.ANSI_YELLOW);
                System.out.println("Den samlede mængde økonomi for dagen er:" +
                        " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
                System.out.print(MenuPopUp.ANSI_RESET);

            }
        }
    }

    public static void main(String[] args) {
        String removePeople = "";
        double timeForBooking = 0;

        Scanner in = new Scanner(System.in);
        Dage enDag = new Dage();

/*
        enDag.setBookningSpotss("Klaus", 0);
        enDag.setBookningSpotss("Lerry", 1);
        enDag.setBookningSpotss("Tommy", 2);
        enDag.setBookningSpotss("Ronaldos Søn", 4);
        enDag.setBookningSpotss("Lolo", 6);
        enDag.setBookningSpotss("Karl Ulrik", 12);



 */


        System.out.print(MenuPopUp.ANSI_BLUE);
        System.out.println(enDag);
        System.out.print(MenuPopUp.ANSI_RESET);

        System.out.print(MenuPopUp.ANSI_YELLOW);
        System.out.println("Den samlede mængde økonomi for dagen er:" +
                " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
        System.out.print(MenuPopUp.ANSI_RESET);
        while (true) {

            System.out.println("Vil du stoppe med at Slette personer kan du skrive 'quit '");
            System.out.println("Hvis to personer med samme navne eksisterer kan du skrive 'more' ");
            System.out.println("\n" + "Hvis ikke så tryk på en knap for at fortsætte");

            String optionChooser = "";
            optionChooser = in.nextLine();
            if (optionChooser.equalsIgnoreCase("quit")) {
                break;
            } else if (optionChooser.equalsIgnoreCase("more")) {
                System.out.println("Indsat navnet på personen du vil slette");
                removePeople = in.nextLine();
                System.out.println("Indtast den specifikke tid du vil slette fra vedkommende");
                timeForBooking = in.nextDouble();

                if (timeForBooking == 10)
                    timeForBooking = 0;
                if (timeForBooking == 10.30)
                    timeForBooking = 1;
                if (timeForBooking == 11)
                    timeForBooking = 2;
                if (timeForBooking == 11.30)
                    timeForBooking = 3;
                if (timeForBooking == 12)
                    timeForBooking = 4;
                if (timeForBooking == 12.30)
                    timeForBooking = 5;
                if (timeForBooking == 13)
                    timeForBooking = 6;
                if (timeForBooking == 13.30)
                    timeForBooking = 7;
                if (timeForBooking == 14)
                    timeForBooking = 8;
                if (timeForBooking == 14.30)
                    timeForBooking = 9;
                if (timeForBooking == 15)
                    timeForBooking = 10;
                if (timeForBooking == 15.30)
                    timeForBooking = 11;
                if (timeForBooking == 16)
                    timeForBooking = 12;
                if (timeForBooking == 16.30)
                    timeForBooking = 13;
                if (timeForBooking == 17)
                    timeForBooking = 14;
                if (timeForBooking == 17.30)
                    timeForBooking = 15;


                enDag.setBookningSpotss(removePeople, (int) timeForBooking);
                enDag.setBookningSpotss("Person has been removed", (int) timeForBooking);
                enDag.economyDisplayer = enDag.economyDisplayer - 150;
                if (enDag.economyDisplayer <= 0) {
                    enDag.economyDisplayer = 0;
                }

                System.out.println("Den nye opdaterende liste!!");
                System.out.println(enDag);

                System.out.print(MenuPopUp.ANSI_YELLOW);
                System.out.println("Den samlede mængde økonomi for dagen er:" +
                        " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
                System.out.print(MenuPopUp.ANSI_RESET);
                break;

            } else {

                System.out.println("Indsat navnet på personen du vil Slette");

                removePeople = in.nextLine();

                for (int i = 0; i < enDag.timer.size(); i++) {
                    if (enDag.bookningSpots.get(i).equals(removePeople)) {
                        enDag.bookningSpots.set(i, "Person has been unbooked");
                        enDag.economyDisplayer = enDag.economyDisplayer - 150;
                        if (enDag.economyDisplayer <= 0) {
                            enDag.economyDisplayer = 0;
                        }
                    }
                }
                System.out.println("Den nye opdaterende liste!!");
                System.out.println(enDag);

                System.out.print(MenuPopUp.ANSI_YELLOW);
                System.out.println("Den samlede mængde økonomi for dagen er:" +
                        " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
                System.out.print(MenuPopUp.ANSI_RESET);


            }

        }
    }
    public static Dage removePeople(Dage endag){

        String removePeople = "";
        double timeForBooking = 0;

        Scanner in = new Scanner(System.in);
        Dage enDag = new Dage();

/*
        enDag.setBookningSpotss("Klaus", 0);
        enDag.setBookningSpotss("Lerry", 1);
        enDag.setBookningSpotss("Tommy", 2);
        enDag.setBookningSpotss("Ronaldos Søn", 4);
        enDag.setBookningSpotss("Lolo", 6);
        enDag.setBookningSpotss("Karl Ulrik", 12);



 */


        System.out.print(MenuPopUp.ANSI_BLUE);
        System.out.println(enDag);
        System.out.print(MenuPopUp.ANSI_RESET);

        System.out.print(MenuPopUp.ANSI_YELLOW);
        System.out.println("Den samlede mængde økonomi for dagen er:" +
                " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
        System.out.print(MenuPopUp.ANSI_RESET);
        while (true) {

            System.out.println("Vil du stoppe med at Slette personer kan du skrive 'quit '");
            System.out.println("Hvis to personer med samme navne eksisterer kan du skrive 'more' ");
            System.out.println("\n" + "Hvis ikke så tryk på en knap for at fortsætte");

            String optionChooser = "";
            optionChooser = in.nextLine();
            if (optionChooser.equalsIgnoreCase("quit")) {
                break;
            } else if (optionChooser.equalsIgnoreCase("more")) {
                System.out.println("Indsat navnet på personen du vil slette");
                removePeople = in.nextLine();
                System.out.println("Indtast den specifikke tid du vil slette fra vedkommende");
                timeForBooking = in.nextDouble();

                if (timeForBooking == 10)
                    timeForBooking = 0;
                if (timeForBooking == 10.30)
                    timeForBooking = 1;
                if (timeForBooking == 11)
                    timeForBooking = 2;
                if (timeForBooking == 11.30)
                    timeForBooking = 3;
                if (timeForBooking == 12)
                    timeForBooking = 4;
                if (timeForBooking == 12.30)
                    timeForBooking = 5;
                if (timeForBooking == 13)
                    timeForBooking = 6;
                if (timeForBooking == 13.30)
                    timeForBooking = 7;
                if (timeForBooking == 14)
                    timeForBooking = 8;
                if (timeForBooking == 14.30)
                    timeForBooking = 9;
                if (timeForBooking == 15)
                    timeForBooking = 10;
                if (timeForBooking == 15.30)
                    timeForBooking = 11;
                if (timeForBooking == 16)
                    timeForBooking = 12;
                if (timeForBooking == 16.30)
                    timeForBooking = 13;
                if (timeForBooking == 17)
                    timeForBooking = 14;
                if (timeForBooking == 17.30)
                    timeForBooking = 15;


                enDag.setBookningSpotss(removePeople, (int) timeForBooking);
                enDag.setBookningSpotss("Person has been removed", (int) timeForBooking);
                enDag.economyDisplayer = enDag.economyDisplayer - 150;
                if (enDag.economyDisplayer <= 0) {
                    enDag.economyDisplayer = 0;
                }

                System.out.println("Den nye opdaterende liste!!");
                System.out.println(enDag);

                System.out.print(MenuPopUp.ANSI_YELLOW);
                System.out.println("Den samlede mængde økonomi for dagen er:" +
                        " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
                System.out.print(MenuPopUp.ANSI_RESET);
                break;

            } else {

                System.out.println("Indsat navnet på personen du vil Slette");

                removePeople = in.nextLine();

                for (int i = 0; i < enDag.timer.size(); i++) {
                    if (enDag.bookningSpots.get(i).equals(removePeople)) {
                        enDag.bookningSpots.set(i, "Person has been unbooked");
                        enDag.economyDisplayer = enDag.economyDisplayer - 150;
                        if (enDag.economyDisplayer <= 0) {
                            enDag.economyDisplayer = 0;
                        }
                    }
                }
                System.out.println("Den nye opdaterende liste!!");
                System.out.println(enDag);

                System.out.print(MenuPopUp.ANSI_YELLOW);
                System.out.println("Den samlede mængde økonomi for dagen er:" +
                        " " + MenuPopUp.RED_UNDERLINED + enDag.getEconomyDisplayer() + " Kroner" + MenuPopUp.ANSI_RESET);
                System.out.print(MenuPopUp.ANSI_RESET);


            }

        }


        return endag;
    }

}
