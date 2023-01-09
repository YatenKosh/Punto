package Matrix;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Person person = new Person("меня", 6, 6, 1987);
        Person Alina = new Person("Алины", 30, 7, 1991);
        Person Ella = new Person("Ella", 4, 12, 1992);
        Person Tora = new Person("Торы", 17, 9, 1992);
        Person Nasty = new Person("Насти", 17, 3, 2000);
        Person Nata = new Person("Натaша", 3, 8, 1999);
        Person Nastya = new Person("Насти", 11, 6, 1995);
        Person Lina = new Person("Лены", 20, 9, 2001);
        Person Vika = new Person("Вики", 5, 10, 1995);
        Person Samira = new Person("Самиры", 11, 1, 2008);

//        equalLove(Samira, person);
//        System.out.println("Задача пары: " + twain.taskPair(person, Ella));
//        System.out.println("Характер пары: " + twain.characterPair(person, Alina));
//        System.out.println("\nВведите ваше имя:");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = reader.readLine();
//        System.out.println("Введите день вашего рождения");
//        int day = Integer.parseInt(reader.readLine());
//        System.out.println("Введите месяц вашего рождения");
//        int month = Integer.parseInt(reader.readLine());
//        System.out.println("Введите год вашего рождения");
//        int year = Integer.parseInt(reader.readLine());
//        Person person1 = new Person(name, day, month, year);
        System.out.println(person);
    }
}