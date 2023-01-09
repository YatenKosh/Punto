package javaSET.DemoSerialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) throws IOException {
        Employee employee;
        FileInputStream fis = new FileInputStream("C:\\emp.ser");
        try (ObjectInputStream oin = new ObjectInputStream(fis)) {
            employee = (Employee) oin.readObject();
            System.out.println("First name: " + employee.getName());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Number: " + employee.getNumber());
            System.out.println("SNN: " + employee.getSSN());

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}