package ua.skillsup;

public enum DayType {
    WORK(1), WEEKEND(2), PART_TIME(3);

    private final int idDayType;

    DayType(int idDayType) {
        this.idDayType = idDayType;
    }

    public int getIdDayType() {
        return idDayType;
    }

}
