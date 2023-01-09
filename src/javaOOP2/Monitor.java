package javaOOP2;

import java.util.Objects;

public class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }
    @Override
    public int hashCode() {
        return Objects.hash(resolutionX, resolutionY);
    }
    public static void main(String[] args) {

        Monitor samsung = new Monitor("Samsung", 120, "AB1234567", 1280, 1024);
        System.out.println(samsung);
        Device lg = new Device("LG", 178, "AB1234567CD");
        Monitor kia = new Monitor("kia", 123, "cd76543234235", 1280, 720);
        System.out.println(lg);
        boolean isEquals = samsung.equals(lg);
        System.out.println(isEquals);
        System.out.println(lg.hashCode());
        System.out.println(samsung.hashCode());
    }
}
