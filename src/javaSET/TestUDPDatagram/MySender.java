package javaSET.TestUDPDatagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MySender {
    public static void main(String[] args) throws IOException {
        DatagramSocket serSock = new DatagramSocket(9999);
        byte[] resDate = new byte[1024];
        System.out.println("MySender accepted");
        while (true) {
            System.out.println("отправляем данные");
            DatagramPacket datagramPacket = new
                    DatagramPacket(resDate, resDate.length);
            serSock.receive(datagramPacket);
            String senti = new String(datagramPacket.getData());
            System.out.print("Resive: " + senti);

        }
    }
}
