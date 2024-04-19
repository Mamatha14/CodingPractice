package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExcerciseOptimised {

    public static void main(String [] args){

        List<Person> personList = Arrays.asList(
                new Person("Mamatha", "Eswaraiah", 35),
                new Person("Sarmista", "Barik", 34),
                new Person("Darwin", "Charles", 55),
                new Person("Siddharth", "Singh", 30)
        );

        //Sort list by lastName

        //2nd way to sort
//        Collections.sort(personList, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //3rd way to sort
        Collections.sort(personList, Comparator.comparing(Person::getFirstName));

        //Create a method that prints all elements in the list
        printByCondition(personList, p -> true);

        //Create a method that pritns all people that have last name beginning with C
        printByCondition(personList, (p) -> p.getLastName().startsWith("C"));

    }

    private static void printByCondition(List<Person> personList, Predicate<Person> condition) {
        System.out.println("*******************************************************************");
        System.out.println("Print Last name:");
        System.out.println("*******************************************************************");
        for(Person p: personList){
            if(condition.test(p)) {
                System.out.println(p.getLastName());
            }
        }
    }

//    private static void printAllElements(List<Person> personList) {
//        System.out.println("*******************************************************************");
//        System.out.println("Print all Elements:");
//        System.out.println("*******************************************************************");
//        for(Person p: personList){
//            System.out.println(p);
//        }
//
//    }
}
