package ua.skillsup;

public enum DayWeek {
    MONDAY(DayType.WORK),
    TUESDAY(DayType.WORK),
    WEDNESDAY(DayType.WORK),
    THURSDAY(DayType.WORK),
    FRIDAY(DayType.PART_TIME),
    SATURDAY(DayType.WEEKEND),
    SUNDAY(DayType.WEEKEND);

    private final DayType dayType;

    DayWeek(DayType dayType)
    {
        this.dayType = dayType;
    }
    public DayType getDayType() {
        return dayType;
    }

}
