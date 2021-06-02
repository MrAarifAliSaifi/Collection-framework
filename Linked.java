package com.company;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
//        System.out.println("Is this program is working!!");this line is only for checking the program
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(2);
        l.add(4);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(-6);
        for (int i = 0; i < l.size(); i++)//traversing the elements using the for loop
        {
            System.out.println(l.get(i));
        }
        for(int elements:l)
        {
            System.out.println(elements);//accesing the elements using the for each loop
        }
        l.remove(5);//here removing the elements from the list
        System.out.println(l);

    }
}
