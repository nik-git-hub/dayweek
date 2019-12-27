package ua.skillsup;

public enum DayWeek {
    MONDAY(1), TUESDAY(1), WEDNESDAY(1), THURSDAY(1),
    FRIDAY(3),
    SATURDAY(2), SUNDAY(2);

    private int idDayType;

    DayWeek(int idDayType) {
        this.idDayType = idDayType;
    }

    public int getIdDayType() {
        return idDayType;
    }

}
