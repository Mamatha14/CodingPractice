package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamsExcercise {

    public static void main(String [] args){

        List<Person> personList = Arrays.asList(
                new Person("Mamatha", "Eswaraiah", 35),
                new Person("Sarmista", "Barik", 34),
                new Person("Darwin", "Charles", 55),
                new Person("Siddharth", "Singh", 30)
        );

        personList.stream()
                .filter(p -> p.getAge()>30)
                .forEach(p -> System.out.println(p));

    }
}