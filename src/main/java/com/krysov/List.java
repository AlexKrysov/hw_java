package com.krysov;

import java.util.ArrayList;

public class List {
    public static ArrayList<String> arrayList = new ArrayList<>();
    public static String potato1 = "Картошечка маленькая";
    public static String potato2 = "Картошечка средняя";
    public static String potato3 = "Картошечка большая";
    public static void addList(){
        arrayList.add(potato1);
        arrayList.add(potato2);
        arrayList.add(potato3);
        for (String a: arrayList) {
            System.out.println("и еще " + a);
        }
    }
    public static void findList() {
        for (String a: arrayList) {
            if (a.equals(potato1)){
                System.out.println("какая-то совсем маленькая " + potato1);
            }
            else if (a.equals(potato2)){
                System.out.println("тоже не достаточно большая " + potato2);
            }
            else if (a.equals(potato3)) {
                System.out.println("ну воооот, уже лучше " + potato3);
            }
        }
    }
    public static void removeList() {
        arrayList.remove(0);
        arrayList.remove(0);
        System.out.println("лучше таких три дайте " + arrayList);
    }
}
