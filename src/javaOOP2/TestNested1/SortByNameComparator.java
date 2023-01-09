package javaOOP2.TestNested1;
import java.util.Comparator;

public class SortByNameComparator implements Comparator<MyPhone.MyPhoneBook.PhoneNumber> {
    @Override
    public int compare(MyPhone.MyPhoneBook.PhoneNumber o1, MyPhone.MyPhoneBook.PhoneNumber o2) {
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
//        public int compare(Object phone1, Object phone2) {
//            return ((MyPhone.MyPhoneBook.PhoneNumber)phone1).name.compareTo(((MyPhone.MyPhoneBook.PhoneNumber)phone2).name);
//    }
}