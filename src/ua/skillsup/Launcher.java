package ua.skillsup;

public class Launcher {

    public static void main(String... args) {

        processDay("MONDAY");
        processDay("FRIDAY");
        processDay("  friDAY ");
        processDay("FRADAY");
        processDay(" SunDaY ");
        processDay("SUNDAA");

        processType("woRk");
        processType("PART_TIME");
        processType("  WeekEnd ");
        processType("WEEKEEND");

    }

    private static void processDay(String message){
        String msg = message.trim();
        print(msg, DayResolver.checkDayOfWeek(msg));
    }

    private static void processType(String message){
        String msg = message.trim();
        print(msg, DayResolver.checkTypeOfDay(msg));
    }

    private static void print(String msg, String value){
        System.out.printf("\n%-9s - %s", msg, value);
    }


}
