package javaOOP2.TestEnum3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrainSchedule {

    private final List<Train> trains;

    public TrainSchedule(List<Train> trains) {
        this.trains = trains;
    }

    public void addTrain(){
        System.out.println("Введите номер поезда:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String stationDispatch = readFromConsole("Станция выезда");
        String stationArrival = readFromConsole("Станция прибытия");
        String timeDispatch = readFromConsole("Время выезда");
        String timeArrival = readFromConsole("Время прибытия");
        String days = readFromConsole("Дни через запятую");
//        User need to enter days of week with a comma
        String[] daysOfWeekInStrings = days.split(",");
        DayOfWeek[] daysOfWeek = new DayOfWeek[daysOfWeekInStrings.length];

        for (int i = 0; i < daysOfWeekInStrings.length; i++) {
            daysOfWeek[i] = DayOfWeek.valueOf(daysOfWeekInStrings[i].toUpperCase());
        }

        Train train = new Train(number, stationDispatch, stationArrival, timeDispatch, timeArrival, daysOfWeek);
        trains.add(train);
    }

    private String readFromConsole(String userMessage) {
        System.out.println(userMessage);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    static class Train {
        int number;
        String stationDispatch;
        String stationArrival;
        String timeDispatch;
        String timeArrival;
        DayOfWeek[] days;

        public Train(int number, String stationDispatch, String stationArrival, String timeDispatch, String timeArrival, DayOfWeek[] days) {
            this.number = number;
            this.stationDispatch = stationDispatch;
            this.stationArrival = stationArrival;
            this.timeDispatch = timeDispatch;
            this.timeArrival = timeArrival;
            this.days = days;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek[] getDays() {
            return days;
        }

        public void setDays(DayOfWeek[] days) {
            this.days = days;
        }

        @Override
        public String toString() {
            return "Train: \n" +
                    "number train: " + number +
                    ", stationDispatch: " + stationDispatch + '\'' +
                    ", stationArrival: " + stationArrival + '\'' +
                    ", timeDispatch: " + timeDispatch + '\'' +
                    ", timeArrival: " + timeArrival + '\'' +
                    ", days: " + Arrays.toString(days);
        }
    }
public void printTrains(){
        for (TrainSchedule.Train tra : trains)
            if (tra != null) System.out.println(tra);
    }
    public void searchTrain(){
        String stationDispatch;
        DayOfWeek lol;

    }
}

