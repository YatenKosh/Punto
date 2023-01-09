package javaOOP2;

public class Employee {
    private static int day;
    public String firstName, lastName, occupation;
    private static int hours;
    public static int count = 0;
    private int telephone;
    public static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, int telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        numberOfEmployees++;
        this.telephone = telephone;
    }

    public Employee(String firstName, int day, int hours) {
        this.firstName = firstName;
        this.hours = hours;
        this.day = day;
        numberOfEmployees++;
        count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public static void setDay(int day) {
        Employee.day = day;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static int getHours() {
        return hours * 15;
    }

    public static void setHours(int hours) {
        Employee.hours = hours;
    }

    public String calcSalary(String name, int day, int hours) {

        return "Зарплата работника " + name + " за " + day + " дней = " + (day * hours) * 15;
    }
}