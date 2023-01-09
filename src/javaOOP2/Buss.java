package javaOOP2;

public class Buss {
    private int seats = 15;
    private boolean driver;

    public boolean getDriver() {
        return driver;
    }

   public void setDriverTrue() {
        this.driver = true;
    }

    public void setDriverFalse() {
        this.driver = false;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getSeats() {
        return seats;
    }

    public int setSeats() {
        return seats = 5;
    }
}