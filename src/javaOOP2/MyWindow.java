package javaOOP2;

public class MyWindow {
    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
/* public MyWindow() {
        width = 10;
        height = 15;
        numberOfGlass = 5;
        color = "Желтый";
        isOpen = true;
    }*/

    public void printFields() {
        System.out.println("высота " + width + "; ширина " + height + "; число окон " + numberOfGlass + "; цвет " + color + "; открыто " + isOpen);
    }

    public static void main(String[] args) {
        MyWindow list = new MyWindow(1, 2, 3, "Brown", true);
        list.printFields();

        System.out.println("вывод с помощью масива");
        MyWindow[] array = {list};
        for (int i = 0; i < array.length; i++) {
            System.out.println("ширина: " + array[i].getWidth() + "; высота:  " + array[i].getHeight() + "; количество окон:  " + array[i].getNumberOfGlass() + "; открыто: " + array[i].isOpen());
        }
        System.out.println("");
    }
}
