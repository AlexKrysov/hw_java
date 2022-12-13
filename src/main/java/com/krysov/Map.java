package com.krysov;

import java.util.HashMap;

public class Map {
    public static HashMap<String, Integer> hashMap = new HashMap<>();
    public static void addMap() {
        hashMap.put("Я там еще не доел",5);
        hashMap.put("хотя можно мезим",2);
        hashMap.put("Поехали в бургегр кинг",3);

    }
    public static void findMap() {
        if (hashMap.containsValue(5)) {
            System.out.println(hashMap.get("Я там еще не доел") + " капель корвалола пожалуйста");
        }
        else {
            System.out.println("эта строчка все равно не нужна=( ");
        }
    }
    public static void removeMap(){
        hashMap.remove("Я там еще не доел");
        hashMap.remove("хотя можно мезим");
        System.out.println(hashMap.toString());
        int i = 1;
        while (i <= 5)
        {
            System.out.println("считаем капли " + i);
            i++;
        }
    }
}
