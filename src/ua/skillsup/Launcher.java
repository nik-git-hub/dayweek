package ua.skillsup;

public class Launcher {

    public static void main(String... args) {

        System.out.println("\nMONDAY" + "-" + DayResolver.checkDayOfWeek("MONDAY"));

        System.out.println("\nFRIDAY" + "-" + DayResolver.checkDayOfWeek("FRIDAY"));

        System.out.println("\nfriDAY " + "-" + DayResolver.checkDayOfWeek("  friDAY "));

        System.out.println("\nFRADAY" + "-" + DayResolver.checkDayOfWeek("FRADAY"));

        System.out.println("\nSunDaY " + "-" + DayResolver.checkDayOfWeek(" SunDaY "));

        System.out.println("\nSUNDAA" + "-" + DayResolver.checkDayOfWeek("SUNDAA"));

        System.out.println("\nwoRk" + "-"+ DayResolver.checkTypeOfDay("woRk"));

        System.out.println("\nPART_TIME" + "-"+ DayResolver.checkTypeOfDay("PART_TIME"));

        System.out.println("\nWeekEnd" + "-" + DayResolver.checkTypeOfDay("  WeekEnd "));

        System.out.println("\nWEEKEEND" + "-" + DayResolver.checkTypeOfDay("WEEKEEND"));

    }
}
