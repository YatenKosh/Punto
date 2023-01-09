package javaSET.DemoSocet;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class MyServer {
    private List<Student> users =new LinkedList<>();
    public List<Student> userList(List<Student> list) {
        return  list.stream().toList();
    }
    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        try (ServerSocket listen = new ServerSocket(8899)) {
            Socket socket = listen.accept();
            System.out.println("Соединение сервера успешно");
            ObjectInputStream oi = new ObjectInputStream(socket.
                    getInputStream());
            Student student = (Student) oi.readObject();
            System.out.println(student);
            oi.close();
            socket.close();
        }
    }
}