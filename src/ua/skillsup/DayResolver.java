package ua.skillsup;

class DayResolver {

    static String checkDayOfWeek(String dayOfWeek){

        DayType dayType = findType(dayOfWeek);

        return (dayType != null
                ? dayType.name()
                : "It isn't a day of the week.") ;

    }

    private static DayType findType(String searchDay){

        for (DayWeek dayWeek: DayWeek.values()) {
            if (dayWeek.name().equalsIgnoreCase(searchDay)){
                return dayWeek.getDayType();
            }
        }

        return null;
    }

    static String checkTypeOfDay(String typeOfDay) {

        DayType resultType = searchType(typeOfDay);

        return resultType != null
                ? findDay(resultType)
                : "This type is not defined.";

    }

    private static DayType searchType(String typeOfDay){
        for (DayType dayType: DayType.values()) {
            if (dayType.name().equalsIgnoreCase(typeOfDay) ){
                return dayType;
            }
        }
        return null;
    }

    private static String findDay(DayType dayType){
        StringBuilder resultDay = new StringBuilder();

        for (DayWeek dayWeek: DayWeek.values()) {
            if (dayType.equals(dayWeek.getDayType())){
                resultDay.append(dayWeek.toString());
                resultDay.append(", ");
            }
        }
        return resultDay.toString();
    }

}
