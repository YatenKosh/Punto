package javaOOP2.TestNested1;

import java.util.Arrays;

public class MyPhone {

    private boolean detectOfPower = false;
    private final PowerOnButton obj = new PowerOnButton();

    public PowerOnButton getObj() {
        return obj;
    }

    public boolean isDetectOfPower() {
        return detectOfPower;
    }

    public MyPhone() {
    }

    public static class MyPhoneBook {
        MyPhoneBook.PhoneNumber[] phoneNumbers = new PhoneNumber[5];
        private int count = 0;

        static class PhoneNumber {
            String name, phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public String getPhone() {
                return phone;
            }

            @Override
            public String toString() {
                return "PhoneNumber\nName: " + name + ", phone: " + phone;
            }
        }

        public void addPhoneNumber(String name, String phone) {
            phoneNumbers[count++] = new PhoneNumber(name, phone);
        }

        public void printPhoneBook() {
            for (PhoneNumber pN : phoneNumbers)
                if (pN != null) System.out.println(pN);
        }

        public void sortByName() {
            Arrays.sort(phoneNumbers, new SortByNameComparator());
        }

        public void sortByPhoneNumber() {
            Arrays.sort(phoneNumbers, new SortByLastNumberComparator());
        }

        public PhoneNumber[] getPhoneNumbers() {
            return phoneNumbers;
        }
    }

    private MyPhoneBook phoneNumbers;

    public MyPhoneBook getPhoneNumbers() {
        return phoneNumbers;
    }

    public void switchOn() {
        if (detectOfPower) {
            System.out.println("Загружаются записи телефоной книги... ");
            phoneNumbers = new MyPhoneBook();
            System.out.println("ok!");
        } else System.out.println("телефон не включен");

    }

    public String call(int a) {
        return "Звоним... " + phoneNumbers.getPhoneNumbers()[a];
    }

    public static class Camera {
        public String photo() {
            return "Делаем фото";
        }

        public String video() {
            return "Записываем видео";
        }
    }

    public static class Bluetooth {

        public String on() {
            return "Включаем блютуз";
        }

        public String off() {
            return "Выключаем блютуз";
        }
    }

    public static class MemoryCard {
        int files;
        String text;
        String video;
        String photo;
        int mp3;
        double applications;
    }

    static class SimCard {
        String contact;
        String operator;
    }

    public class PowerOnButton {
        public void PowerOn() {
            System.out.println("Включаем телефон");
            detectOfPower = true;
        }

        public void PowerOff() {
            System.out.println("Выключен телефон");
            detectOfPower = false;
        }
    }
}