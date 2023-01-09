package javaOOP2.inter;

public class  FootballTeam implements Team {
    private final FootballPlayer[] team;

    public FootballTeam(FootballPlayer[]team){this.team=team;}

    @Override
    public Sportsman[] getSportsmen() {
        return team;
    }
    }