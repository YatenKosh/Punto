package javaOOP2.TestNested1;
import java.util.Comparator;

public class SortByLastNumberComparator implements Comparator<MyPhone.MyPhoneBook.PhoneNumber> {

     public int compare(MyPhone.MyPhoneBook.PhoneNumber o1, MyPhone.MyPhoneBook.PhoneNumber o2) {
         return Character.compare(o1.getPhone().charAt(o1.getPhone().length() - 1), o2.getPhone().charAt(o2.getPhone().length() - 1));
     }
}