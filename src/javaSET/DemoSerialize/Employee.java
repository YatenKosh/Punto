package javaSET.DemoSerialize;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private final String address;
    private final transient int SSN;
    private final int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public int getSSN() {
        return SSN;
    }


    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }

    public Employee(String name, String address, int SSN, int number) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }
}