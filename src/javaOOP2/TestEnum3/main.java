package javaOOP2.TestEnum3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        TrainSchedule schedule = new TrainSchedule(new ArrayList<>());
        schedule.addTrain();
        schedule.printTrains();

    }
}