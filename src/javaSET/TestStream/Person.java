package javaSET.TestStream;

public class Person {
    private String name;
    private int age;
    private  boolean itsMan;

    public Person(String name, int age, boolean itsMan) {
        this.name = name;
        this.age = age;
        this.itsMan = itsMan;
    }

    @Override
    public String toString() {
        return "Person is \n" +
                "name '" + name + '\'' +
                ", age " + age +
                ", itsMan " + itsMan +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isItsMan() {
        return itsMan;
    }

    public void setItsMan(boolean itsMan) {
        this.itsMan = itsMan;
    }


}
