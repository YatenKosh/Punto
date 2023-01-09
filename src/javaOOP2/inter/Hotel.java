package javaOOP2.inter;

public class Hotel {
    private static int count = 0;
    private final HotelRoom[] rooms;

    public Hotel(HotelRoom[] rooms) {
        this.rooms = rooms;
    }

    public void settleTeam(Team team) {
        for (int i = 0; i < team.getSportsmen().length; i += 3) {
            rooms[count].setPlace1(team.getSportsmen()[i]);
            if (i + 1 < team.getSportsmen().length)
                rooms[count].setPlace2(team.getSportsmen()[i + 1]);
            if (i + 2 < team.getSportsmen().length)
                rooms[count].setPlace3(team.getSportsmen()[i + 2]);
            count++;
        }
    }
}