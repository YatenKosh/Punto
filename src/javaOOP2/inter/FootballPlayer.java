package javaOOP2.inter;

public class FootballPlayer implements Sportsman {
    private final String name;
    private final String sport = "футболист";

    public FootballPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSport() {
        return this.sport;
    }

    @Override
    public String toString() {
        return "Я " + name + " играю в " + sport;
    }
   }
