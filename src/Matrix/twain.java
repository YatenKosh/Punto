package Matrix;

import static Matrix.Person.*;

public class twain {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    //задача пары
    public static int taskPair(Person person1, Person person) {
        int sum = person.day() + person1.day();
        return calc(sum);
    }
    //характер пары
    public static int characterPair(Person person1, Person person) {
        int sum = person.month() + person1.month();
        return calc(sum);
    }

    static String a(Person person, Person person1) {
        if (person.e() == person1.sum4())
            return "То что у " + person.name() + " в сердце, у " + person1.name() + " в характере, вы хорошо подходите";
        return "...у " + person.name() + " в сердце " + person.e() + ", а у " + person1.name() + " в характере нет - не хорошо";
    }

    static String b(Person person, Person person1) {
        if (person1.e() == person.sum4())
            return "Но! то, что у " + person1.name() + " в сердце (" + person1.e() + "), у " + person.name() + " в характере," +
                    " а это значит, что вы хорошо подходите";
        return "...у " + person1.name() + " в сердце " + person1.e() + ". А еще:";
    }

    static String c(Person person, Person person1) {
        if (person.sum3() == person1.sum3() & person.n() == person1.n())
            return "Вот так совпадение (по карме прошлой жизни идеально подходите)";
        return "..и по карме прошлой жизни, вы не совпадаете, но ты не огорчайся";
    }

    static String d(Person person, Person person1) {
        if (person.n() == person1.n() & person.q() == person1.q() & person.e() == person1.e())
            return "Это ваша судьба: все идеально совпало по трем пунктам";
        else return "Не плохо, если у вас хотя бы одно совпадение " + "⮵ ⮭ ⤣";
    }

    public static void equalLove(Person person, Person person1) {
        System.out.println("Сравниваю " + person.name() + " и " + person1.name() + " :");
        System.out.println(a(person, person1));
        System.out.println(ANSI_GREEN + b(person, person1) + ANSI_RESET);
        System.out.println(c(person, person1));
        System.out.println(ANSI_RED + d(person, person1) + ANSI_RESET);
    }
}