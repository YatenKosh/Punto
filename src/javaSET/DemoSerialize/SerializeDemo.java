package javaSET.DemoSerialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        Employee emp = new Employee("Van", "USA", 15, 85);
        // сериализация в файл
        FileOutputStream fos = new FileOutputStream("C:\\emp.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos)) {
            try {
                objectOutputStream.writeObject(emp);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                objectOutputStream.close();
            }
        }
        System.out.println("Before Serialize: " + "\n" + emp);

    }
}
