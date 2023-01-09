package javaOOP2.MyShapes;

import java.util.Comparator;

public class shapeColorComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Circle circle1 = (Circle) o1;
        Circle circle2 = (Circle) o2;
        return Integer.compare(circle2.shapeColor.length(), circle1.shapeColor.length());
    }

}
