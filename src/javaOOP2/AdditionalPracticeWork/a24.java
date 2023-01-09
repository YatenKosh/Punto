package javaOOP2.AdditionalPracticeWork;

import java.util.Collection;
import java.util.Iterator;

public interface a24 {
    int size();
    boolean isEmpty();
    Iterator iterator();
    boolean add(Object e);
    boolean remove(Object o);
    boolean addAll(Collection c);
    boolean removeAll(Collection c);
    void clear();
}