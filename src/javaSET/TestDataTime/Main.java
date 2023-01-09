package javaSET.TestDataTime;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bDay = LocalDate.of(1992, 06, 06);
        LocalDate Day = LocalDate.of(2022, 06, 06);
        int years = Period.between(bDay, today).getYears();
        System.out.println(years);
        System.out.println(LocalDate.of(1990, 06, 06).getDayOfWeek());
        double v = .06;
        if (Day.equals(today)) System.out.println("baday");
        else System.out.println("not today");
    }
}
