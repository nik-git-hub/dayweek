package ua.skillsup;

class DayResolver {

    private static StringBuilder result = new StringBuilder();

    static String checkDayOfWeek(String dayOfWeek){

        String day = dayOfWeek.trim();

        for (DayWeek dayWeek: DayWeek.values()) {
            if (dayWeek.toString().compareToIgnoreCase(day) == 0 ){
                for (DayType dayType: DayType.values()) {
                    if (dayWeek.getIdDayType() == dayType.getIdDayType()) {
                        return dayType.toString();
                    }
                }
            }
        }

        return "This isn't a day of the week.";
    }

    static String checkTypeOfDay(String typeOfDay) {

        String typeDay = typeOfDay.trim();
        result.setLength(0);

        for (DayType dayType: DayType.values()) {
            if (dayType.toString().compareToIgnoreCase(typeDay) == 0 ){
                for (DayWeek dayWeek: DayWeek.values()) {
                    if (dayType.getIdDayType() == dayWeek.getIdDayType()){
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