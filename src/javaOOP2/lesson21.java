package javaOOP2;

public class lesson21 {
    public static void main(String[] args) {

        Computer basik = new Computer("Басик", 5, 4, 65, 70);
        String basikName = basik.getManufacturer();
        float basikPrice = basik.getprice();
        int basikFrequencyCPU = basik.frequencyCPU;
        int basikQuantityCPU = basik.quantityCPU;
        int basicSerialNumber = basik.getSerialNumber();

        System.out.println("Manufacturer: " + basikName);
        System.out.println("price: " + basikPrice);
        System.out.println("QuantityCPU: " + basikQuantityCPU);
        System.out.println("Serial Number: " + basicSerialNumber);
        System.out.println("frequencyCPU: " + basikFrequencyCPU);
        System.out.println(" ВОТ ТУТ");

        Computer[] array = {basik};
        for (Computer computer : array) {
            System.out.print(computer);
        }
        System.out.println("по сюда\n");

        Computer[] arr = new Computer[5];
        for (Computer computer : array) {
            System.out.println("Serial Number: " + computer.getSerialNumber() + "; FrequencyCPU:  " + computer.getFrequencyCPU() + "; QuantityCPU:  " + computer.getQuantityCPU() + "; Manufacturer: " + computer.getManufacturer());
        }
        System.out.println();

        Buss bus = new Buss ();
        int busSeats = bus.getSeats();
        boolean busDriver = bus.getDriver();
        bus.setDriverFalse();
        if(bus.getDriver()) {
            System.out.println(busSeats - 1);}
        else
        System.out.println("Buss Seats: " + busSeats);
        System.out.println();

        Dog dg = new Dog("Тузик", 5, 4);
        String dgName = dg.getName();
        int dgAge = dg.getAge();
        int dgWeight = dg.getWeight();
        System.out.println("Dog name: " + dgName + "\n" + "Dog age: " + dgAge + "Dog weight: " + dgWeight);
        System.out.println();

        Person male = new Person("Vasya", "pupkin",  "M", 12, 451512, 1981);
        String maleName = male.getFirstName();
        int maleAge = male.getAge();
        String maleGender = male.getGender();
        int maleYearOfBirth = male.getYearOfBirth();
        System.out.println("name: " + maleName + "\n" + "Age: " + maleAge + "\n" + "Gender: " + maleGender + "\n" + "Year of birth: " + maleYearOfBirth);

    }
}