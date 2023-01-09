package punto;

import static punto.method.toTranslit;

public class Main {
    public static void main(String[] args) {
        // Не верная раскладка, с кирилицы на украинский
        String text = " nfv [kjgfrsd p zrbvb nb rhfq ,jhjyti yf gfkmwz[ ecs[ rjytxyjcntq yt gththf[edfnb) ";

        System.out.println(toTranslit(text));
    }
}
