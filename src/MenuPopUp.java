public class MenuPopUp {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

     //background
    // Underline

    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN

    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE

    private static String menuHeader;  // "Menu";
    private static String leadText; // "Please choose";
    private static String[] menuItems;

    public MenuPopUp(String menuHeader, String leadText, String[] menuItems ){

        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;

    }
    public MenuPopUp(){

    }

    public static void printMenu(){

        System.out.println(ANSI_RED);
        menuHeader = "Harry's salon";
        System.out.println("         " +menuHeader + ":");

        String[]  menuItems = {"1. Pick 1 to book appointments" , "2. Pick 2 to delete appointments", "3. Pick 3 to view schedule for future bookings " +
                ", previous days or book vacation days"
                 , "4. Pick 4 to log out"};

        for(int i = 0; i<menuItems.length; i++){

            System.out.println(menuItems[i]);
        }
        leadText = "Please choose";
        System.out.println(leadText + ":");
        System.out.print(ANSI_RESET);

    }
}