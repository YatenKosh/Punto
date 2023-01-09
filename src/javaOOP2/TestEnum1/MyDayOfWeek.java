package javaOOP2.TestEnum1;

public enum MyDayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    MyDayOfWeek() {
    }

    public MyDayOfWeek nextDay() {
        return switch (this) {
            case MONDAY -> TUESDAY;
            case TUESDAY -> WEDNESDAY;
            case WEDNESDAY -> THURSDAY;
            case THURSDAY -> FRIDAY;
            case FRIDAY -> SATURDAY;
            case SATURDAY -> SUNDAY;
            case SUNDAY -> MONDAY;
        };
    }
}