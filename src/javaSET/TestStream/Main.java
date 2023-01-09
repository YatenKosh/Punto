package javaSET.TestStream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(1, x -> x + 10).limit(10).map(x -> x / 2).toList();
        List<String> string = new LinkedList<>();
        string.add("hello");
        string.add("i");
        string.add("love");
        string.add("you");
        string.add("tell");
        string.add("me");
        string.add("what");
        string.add("is");
        string.add("your");
        string.add("name");
        string.add("?");
        string = string.stream().filter(x -> x.charAt(0) == 'y').toList();
        System.out.println(list + "\n" + string);
        List<Person> people = new LinkedList<>();
        people.add(new Person("Wex", 12, true));
        people.add(new Person("Eric", 21, true));
        people.add(new Person("Ric", 72, true));
        people.add(new Person("Tanya", 17, false));
        people = people.stream().filter(x -> x.getAge() > 18 && x.getAge() < 60 && x.isItsMan()).toList();
        System.out.println(people);
    }
}