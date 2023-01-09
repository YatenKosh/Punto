package javaOOP2.inter;

public interface Championship {
    String playOffGames(String team1, String team2);
    String winner();
    String[] getListOfPlayer(String team);
    String getNameOfCoach();
    String getTeamLocation();
}
