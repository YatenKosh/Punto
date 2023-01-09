package javaSET;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {

    public static <Socet> void main(String[] args) throws IOException {
        ServerSocket listen = new ServerSocket(8800);
        System.out.println("server start...");
        try {
            System.out.println("wait to conection...");
            Socet socet = (Socet) listen.accept();
            System.out.println("clien conected");
        //  socet.getOutputStream().write("hello".getBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
