package javaOOP2.TestMyGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyNumGenerator {
    int numOfElm;
    int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }


    public List<Integer> generate() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            list.add((int) (Math.random() * maxNumb));
        }
        return list;
    }

    public Set<Integer> generateDistinct() {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < numOfElm; i++) {
            list.add((int) (Math.random() * maxNumb));
        }
        return list;
    }
}