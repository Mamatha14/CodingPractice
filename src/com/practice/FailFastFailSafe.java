package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {

    public static void main(String[] args) {
        // write your code here

        //Using ArrayList causes ConcurrentModificationException at line no 27 thus causing fail-fast n stopping the operation
//        List<Integer> al = new ArrayList<>();

        //To avoid fail-fast using non-fail-fast iterators such CopyOnWriteArrayList and thereby executing the program without any issues.
        List<Integer> al = new CopyOnWriteArrayList<>();
        al.add(10);
        al.add(20);

        System.out.println(al);

        Iterator<Integer> iterator = al.iterator();

        while(iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
            if(!al.contains(30)) {
                al.add(30);
            }
        }

        System.out.println(al);

    }

}
