package ua.skillsup;

class DayResolver {

    private static StringBuilder resultDay = new StringBuilder();
    private static DayType resultType;

    static String checkDayOfWeek(String dayOfWeek){

        resultType = null;

        searchDay(dayOfWeek);

        return ((resultType != null) ? resultType.name() : "This isn't a day of the week.") ;

    }

    private static void searchDay(String searchDay){

        for (DayWeek dayWeek: DayWeek.values()) {
            if (dayWeek.name().equalsIgnoreCase(searchDay)){
                resultType = dayWeek.getDayType();
                return;
            }
        }

    }

    static String checkTypeOfDay(String typeOfDay) {

        resultDay.setLength(0);
        resultType = null;

        searchType(typeOfDay);

        if (resultType == null) {
            return "This type is not defined.";
        }

        return findDay();
    }

    private static void  searchType(String typeOfDay){
        for (DayType dayType: DayType.values()) {
            if (dayType.name().equalsIgnoreCase(typeOfDay) ){
                resultType = dayType;
                return ;
            }
        }

    }

    private static String findDay(){
        for (DayWeek dayWeek: DayWeek.values()) {
            if (resultType.equals(dayWeek.getDayType())){
                resultDay.append(dayWeek.toString());
                resultDay.append(", ");
            }
        }
        return resultDay.toString();
    }

}
