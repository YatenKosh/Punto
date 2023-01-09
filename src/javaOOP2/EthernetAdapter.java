package javaOOP2;

import java.util.Objects;

public class EthernetAdapter extends Monitor{

    int speed;
    String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY, int speed, String mac) {
        super(manufacturer, price, serialNumber, resolutionX, resolutionY);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return getSpeed() == that.getSpeed() && getMac().equals(that.getMac());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed(), getMac());
    }

    @Override
    public String toString() {
        return "EthernetAdapter{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                ", speed=" + speed +
                ", mac='" + mac + '\'' +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }
}
