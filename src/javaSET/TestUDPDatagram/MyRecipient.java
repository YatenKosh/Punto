package javaSET.TestUDPDatagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MyRecipient {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new
                InputStreamReader(System.in));
        DatagramSocket client = new DatagramSocket();
        InetAddress IPAdress = InetAddress.getByName("localhost");
        System.out.println("Введите сообщение серверу: ");
        String sensi = in.readLine();
        byte[] senGat = sensi.getBytes();
        System.out.println("MyRecipient accepted");
        DatagramPacket senPack = new DatagramPacket(senGat,
                senGat.length, IPAdress, 9999);
        client.send(senPack);
        System.out.println("успешно");
           client.close();
    }
}