package com.company;
import java.util.HashMap;
public class Map{
    //In java map is a interface which is going to implemeted by the Hasmap Class
    public static void main(String[] args) {
        HashMap hm=new HashMap();//creating the HashMap
        hm.put(12,"Aarif");//adding the value to the HashMap
        hm.put(13,"Khalid");
        hm.put(14,"Sajar");
        hm.put(15,"Sajar");
        System.out.println(hm);
        System.out.println(hm.get(12));
    }
}
