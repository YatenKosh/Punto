package javaOOP2;

public class Computer {


    public int frequencyCPU;
    private String manufacturer;
    public int serialNumber;
    private float price;
    public int quantityCPU;

    public Computer(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getprice() {
        return price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    @Override
    public String toString(){
        return "manufacturer: "+ manufacturer + "; price: " + price + "; serial number:  " + serialNumber + "; frequencyCPU: "+ frequencyCPU + "; quantityCPU: " + quantityCPU ;
    }
    public Computer () {}
}