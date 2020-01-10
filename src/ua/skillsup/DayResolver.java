package ua.skillsup;

class DayResolver {

    private static StringBuilder result = new StringBuilder();

    static String checkDayOfWeek(String dayOfWeek){

        for (DayWeek dayWeek: DayWeek.values()) {
            if (dayWeek.toString().compareToIgnoreCase(dayOfWeek) == 0 ){
                for (DayType dayType: DayType.values()) {
                    if (dayWeek.getDayType().toString().compareToIgnoreCase(dayType.toString()) == 0) {
                        return dayType.toString();
                    }
                }
            }
        }

        return "This isn't a day of the week.";
    }

    static String checkTypeOfDay(String typeOfDay) {

        result.setLength(0);

        for (DayType dayType: DayType.values()) {
            if (dayType.toString().compareToIgnoreCase(typeOfDay) == 0 ){
                for (DayWeek dayWeek: DayWeek.values()) {
                    if (dayType.toString().compareToIgnoreCase(dayWeek.getDayType().toString()) == 0){
                        result.append(dayWeek.toString());
                        result.append(", ");
                    }
                }
            }
        }

        if(result.length() == 0) {
            result.append("This type is not defined.");
        }

        return result.toString();

    }

}
