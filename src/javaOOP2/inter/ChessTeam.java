package javaOOP2.inter;

public class ChessTeam implements Team {
    private final ChessPlayer[] team;

    public ChessTeam(ChessPlayer[]team){this.team=team;}

    @Override
    public Sportsman[] getSportsmen() {
        return team;
    }
}