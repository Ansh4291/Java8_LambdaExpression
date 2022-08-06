package com.Practice_Problm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8_Ex {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Lavi ");
        names1.add("Deepesh ");
        names1.add("Lucky ");
        names1.add("Santosh ");
        names1.add("Anshul ");

        Java8_Ex obj = new Java8_Ex();
        System.out.println("Sort using Java 8 syntax: ");

        obj.sortUsingJava8(names1);
        System.out.println(names1);
    }
    //sort using java 8
    private void sortUsingJava8(List<String> names1) {
        Collections.sort(names1, (s1, s2) -> s1.compareTo(s2));
    }
}
