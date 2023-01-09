package javaOOP2.inter;

public class ChessPlayer implements Sportsman {
    String name;
    private final String sport = "шахматист";

    public ChessPlayer(String name) {
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