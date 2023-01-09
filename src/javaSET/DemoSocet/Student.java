package javaSET.DemoSocet;

import java.io.Serializable;

public class Student implements Serializable {
   private String name;
    private final String curse;
   private final int id;
    public Student(String name, String curse, int id) {
        this.name = name;
        this.curse = curse;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Student\n" + "name " + name +
          ", curse " + curse + ", id " + id + '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}