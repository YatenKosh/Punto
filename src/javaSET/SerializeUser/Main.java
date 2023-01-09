package javaSET.SerializeUser;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("Van", "Gog", 17);
        RandomAccessFile raf = new RandomAccessFile("C:\\users.ser", "rw");
        raf.writeBytes(user.toString());
        byte[] arr = new byte[46];
        raf.seek(0);
        raf.read(arr);
        //что бы извлечь числовые данные превращаем масив чисел с помощью
        // разделителя токенайзера, и каждый символ с помощью чар извлекаем
        StringBuffer st = new StringBuffer();
        for (byte b : arr) {
            if (b != 0)
                st.append((char) b);
        }
        System.out.println(st);
        raf.close();
        System.out.println("\n" + user);
    }
}