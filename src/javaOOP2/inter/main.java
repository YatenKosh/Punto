package javaOOP2.inter;

public class main {

    public static void main(String[] args) {
        ChessPlayer ch1 = new ChessPlayer("Дон");
        ChessPlayer ch2 = new ChessPlayer("Бутон");
        FootballPlayer fo1 = new FootballPlayer("Fee");
        FootballPlayer fo2 = new FootballPlayer("Faa");
        FootballPlayer fo3 = new FootballPlayer("Foo");
        ChessPlayer ch3 = new ChessPlayer("Biba");
        ChessPlayer ch4 = new ChessPlayer("Boba");

        FootballTeam team = new FootballTeam(new FootballPlayer[]{fo1, fo2, fo3});
        ChessTeam team1 = new ChessTeam(new ChessPlayer[]{ch1, ch2});
        ChessTeam team2 = new ChessTeam(new ChessPlayer[]{ch3, ch4});

        HotelRoom[] rooms = new HotelRoom[200];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new HotelRoom(i + 1);
        }
        Hotel hot = new Hotel(rooms);
        hot.settleTeam(team);
        hot.settleTeam(team1);
        hot.settleTeam(team2);

        for (int i = 0; i < 10; i++) {
            System.out.println(rooms[i].getRoomNumber());
            if (rooms[i].getPlace1() != null) System.out.println(rooms[i].getPlace1().getName());
            if (rooms[i].getPlace2() != null) System.out.println(rooms[i].getPlace2().getName());
            if (rooms[i].getPlace3() != null) System.out.println(rooms[i].getPlace3().getName());
            if (rooms[i].getPlace4() != null) System.out.println(rooms[i].getPlace4().getName());
        }




    }
}
