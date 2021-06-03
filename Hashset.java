package com.company;
import java.util.Collections;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
//        System.out.println("is this code is working or not i am just checking the situation");]
        HashSet hs=new HashSet(100);//default capacity is 16 and the default load factoe is .75
        HashSet hs1=new HashSet();
        hs.add(12);
        hs.add("aarif");
        hs.add(12.4);
        hs.add(12.4);
        hs.add(46234674.474673);
        hs.add('a');
        hs.size();
        hs1.addAll(hs);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains(12));
        System.out.println(hs1);
        System.out.println(   hs.contains('A'));
        Collections.sort();//note that sorting is not allowed in the HashSet

    }


}
