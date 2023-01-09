package javaSET.DemoSocet;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        Student st = new Student("Lol", "kek", 8);
        try (Socket socket = new Socket("localhost", 8899)) {
            System.out.println("Соединение успешно");
            ObjectOutputStream os = new ObjectOutputStream
                    (socket.getOutputStream());
            os.writeObject(st);
            os.flush();
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}