package javaOOP2.inter;

public class HotelRoom {
    private final int roomNumber;
    private Sportsman place1;
    private Sportsman place2;
    private Sportsman place3;
    private Sportsman place4;

    public int getRoomNumber() {
        return roomNumber;
    }

    public HotelRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Sportsman getPlace1() {
        return this.place1;
    }

    public void setPlace1(Sportsman place1) {
        this.place1 = place1;
    }

    public Sportsman getPlace2() {
        return this.place2;
    }

    public void setPlace2(Sportsman place2) {
        this.place2 = place2;
    }

    public Sportsman getPlace3() {
        return this.place3;
    }

    public void setPlace3(Sportsman place3) {
        this.place3 = place3;
    }

    public Sportsman getPlace4() {
        return this.place4;
    }

    public void setPlace4(Sportsman place4) {
        this.place4 = place4;
    }
}
