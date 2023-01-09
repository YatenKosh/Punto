package javaSET.TestReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {


    public static final class MyClass {
        private int a;
        private int b;
        public int c;
        int d;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }

        public int getD() {
            return d;
        }

        public void setD(int d) {
            this.d = d;
        }

        public MyClass(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public MyClass() {
        }
    }


    public static void main(String[] args) {

        MyClass myClass = null;
        try {
            Class<?> clazz = Class.forName(MyClass.class.getName());
            myClass = (MyClass) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(myClass);//output created object reflection.MyClass@60e53b93


        MyClass test = new MyClass();
        final Class<?> c = test.getClass();
        final Class<?> b = MyClass.class;


        System.out.println("modifications: ");
        int mods = c.getModifiers();
        int mod = b.getModifiers();
        if (Modifier.isPrivate(mods & mod))
            System.out.println(" private ");
        if (Modifier.isStatic(mods))
            System.out.println(" static ");
        if (Modifier.isAbstract(mods))
            System.out.println(" abstract ");
        if (Modifier.isFinal(mods))
            System.out.println(" final ");

        System.out.println("public fields: ");
        Field[] fields = c.getFields();
        for (Field field : fields) {
            Class<?> ftype = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tTape: " + ftype.getName());

        }
        System.out.println("Al files:");
        fields = c.getDeclaredFields();
        for (Field f : fields) {
            Class<?> ftype = f.getType();
            System.out.println("\tName: " + f.getName());
            System.out.println("\tTape: " + ftype.getName());
        }
    }
}

