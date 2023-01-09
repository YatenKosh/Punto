package javaOOP2.TestNested1;

public class Main {
    public static void main(String[] args) {
        MyPhone.MyPhoneBook notebook = new MyPhone.MyPhoneBook();
        notebook.addPhoneNumber("Indragord", "+3267465681");
        notebook.addPhoneNumber("Sasha", "0501234564");
        notebook.addPhoneNumber("Annami", "+235672357");
        notebook.addPhoneNumber("Tims", "+4678344362");
        notebook.addPhoneNumber("Tod", "23581237235");
 //     notebook.sortByName();
        notebook.sortByPhoneNumber();
//      notebook.printPhoneBook();
        MyPhone note = new MyPhone();
        note.getObj().PowerOn();
        note.switchOn();
        if (note.isDetectOfPower()) {
            note.getPhoneNumbers().addPhoneNumber("Sofiya", "+34627212436");
            note.getPhoneNumbers().addPhoneNumber("Olga", "+32445782333");
            note.getPhoneNumbers().addPhoneNumber("Pet", "235623574355");
            note.getPhoneNumbers().addPhoneNumber("Stasivko", "+21354372748");
            note.getPhoneNumbers().addPhoneNumber("Sveta", "+2354613429");
            note.getPhoneNumbers().sortByPhoneNumber();
            note.getPhoneNumbers().sortByName();

            System.out.println(note.call(2));
            note.getPhoneNumbers().printPhoneBook();
        }
    }
}