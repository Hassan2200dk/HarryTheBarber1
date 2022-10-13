import java.util.*;

public class Calender extends MenuPopUp {
    public static void main(String[] args) {
        System.out.print(ANSI_CYAN);
        System.out.println("hej");
        System.out.println(ANSI_RESET);
        Scanner in = new Scanner(System.in);
        System.out.println("Se dine kalender ");
        int year = 2022;
        int day = 6;
        String month = "";
        for (int k = 10; k <= 10; k++) {
            int numOfDays = 0;
            switch (k) {
                case 1:
                    month = "January ";
                    numOfDays = 31;
                    break;
                case 2:
                    month = "February ";
                    numOfDays = 28;
                    break;
                case 3:
                    month = "March ";
                    numOfDays = 31;
                    break;
                case 4:
                    month = "April ";
                    numOfDays = 30;
                    break;
                case 5:
                    month = "May ";
                    numOfDays = 31;
                    break;
                case 6:
                    month = "June ";
                    numOfDays = 30;
                    break;
                case 7:
                    month = "July ";
                    numOfDays = 31;
                    break;
                case 8:
                    month = "August ";
                    numOfDays = 31;
                    break;
                case 9:
                    month = "September ";
                    numOfDays = 30;
                    break;
                case 10:
                    month = "October ";
                    numOfDays = 31;
                    break;
                case 11:
                    month = "November ";
                    numOfDays = 30;
                    break;
                case 12:
                    month = "December ";
                    numOfDays = 31;
                    break;
            }
            System.out.println(month + year);

            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            for (int i = 1; i <= day; i++)
                System.out.print("      ");
            for (int j = 1; j <= numOfDays; j++) {
                if (day % 7 == 0 && day != 0)
                    System.out.println();
                System.out.printf("%3d   ", j);
                day += 1;
            }
            System.out.println("\n" + "Press a certain number to view a date");
            int chooseNumber;
            chooseNumber = in.nextInt();
            if (chooseNumber == 1) {
                System.out.println("Den samlede omsætninger denne dag var 24000");
                ArrayList<String> bookningSpots = new ArrayList<>(16);
                String addPeople = "";
                double timeForBooking = 0.0;
                ArrayList<Double> timer = new ArrayList<Double>(Arrays.asList(10.0, 10.30, 11.0, 11.30, 12.0, 12.30, 13.0,
                        13.30, 14.0, 14.30, 15.0, 15.30, 16.0
                        , 16.30, 17.0, 17.30));
                bookningSpots.add("Henry");
                bookningSpots.add("Klaus");
                bookningSpots.add("lerry");
                bookningSpots.add("Tommy");
                bookningSpots.add("Ronaldos Søn");
                bookningSpots.add("Slot available");
                bookningSpots.add("Johnny");
                bookningSpots.add("lolo");
                bookningSpots.add("Slot available");
                bookningSpots.add("Slot available");
                bookningSpots.add("Slot available");
                bookningSpots.add("Slot available");
                bookningSpots.add("Slot available");
                bookningSpots.add("Slot available");
                bookningSpots.add("Slot available");
                bookningSpots.add("Slot available");
                bookningSpots.add("Karl ulrik");
                bookningSpots.add("Slot available");


                for (int i = 0; i < timer.size(); i++) {
                    if (bookningSpots.get(i).equals("Slot available"))
                        System.out.println("Ingen blev klippet i følgende tidsrum " + timer.get(i) + "0");
                    else
                        System.out.println(bookningSpots.get(i) + " havde tid " + timer.get(i) + "0");
                }

            }
            if (chooseNumber == 2) {
                Dage dage2 = new Dage();
                dage2.setBookningSpotss("Yasin", 1);
                dage2.setBookningSpotss("Yasine", 3);
                dage2.setBookningSpotss("Schucayb", 5);
                dage2.setBookningSpotss("Ahmad", 8);
                System.out.println(dage2);
            }

            if (chooseNumber == 6) {

                Dage dage2 = new Dage();
                dage2.setBookningSpotss("Yasin", 1);
                dage2.setBookningSpotss("Yasine", 3);
                dage2.setBookningSpotss("Schucayb", 5);
                dage2.setBookningSpotss("Ahmad", 8);


                    System.out.println(dage2.toString());


            }
        }
    }
}

