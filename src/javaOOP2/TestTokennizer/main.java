package javaOOP2.TestTokennizer;

import java.util.StringTokenizer;

public class main {
    public main() {
        String myStr = "This is String, split by StringTokenizer. Created by Student: Yaten";
        StringTokenizer tokenizer = new StringTokenizer(myStr, " "); // разделитель по пробелу
        StringTokenizer tokenizer1 = new StringTokenizer(myStr, "."); // разделитель по точке
        StringTokenizer tokenizer2 = new StringTokenizer(myStr, ","); // разделитель по запятой
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
