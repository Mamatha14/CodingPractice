package com.practice;

import java.util.*;

public class LambdaExercise {

    public static void main(String [] args){

        List<Person> personList = Arrays.asList(
                new Person("Mamatha", "Eswaraiah", 35),
                new Person("Sarmista", "Barik", 34),
                new Person("Darwin", "Charles", 55),
                new Person("Siddharth", "Singh", 30)
        );

        //Sort list by lastName

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });


        //Create a method that prints all elements in the list
        printAllElements(personList);

        System.out.println("Using Lambda");
        PersonInterface personAll = () -> {
            for (Person p: personList) {
                System.out.println(p.toString());
            }
        };

        personAll.get();

        //Create a method that pritns all people that have last name beginning with C
        printLastName(personList);

        System.out.println("Using Lambda");
        PersonInterface personLastName = () -> {
            for (Person p: personList) {
                if(p.getLastName().startsWith("C")) {
                    System.out.println(p.getLastName());
                }
            }
        };
        personLastName.get();

    }

    private static void printLastName(List<Person> personList) {
        System.out.println("*******************************************************************");
        System.out.println("Print Last name:");
        System.out.println("*******************************************************************");
        for(Person p: personList){
            if(p.getLastName().startsWith("C")) {
                System.out.println(p.getLastName());
            }
        }
    }

    private static void printAllElements(List<Person> personList) {
        System.out.println("*******************************************************************");
        System.out.println("Print all Elements:");
        System.out.println("*******************************************************************");
        for(Person p: personList){
            System.out.println(p);
        }

    }
}