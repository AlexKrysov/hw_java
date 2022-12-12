package com.krysov;

import java.util.HashSet;

public class Set {
    public static String present1 = "гастрит";
    public static String present2 = "побои от сотрудников KFC";
    public static String present3 = "поездка в больницу";
    public static String present4 = "скажите что я молодец";
    public static HashSet<String> hashSet = new HashSet<>();

    public static void addSet() {
        hashSet.add(present1);
        hashSet.add(present2);
        hashSet.add(present3);
        hashSet.add(present4);
        int x = 5;
        do {
            System.out.print("до поездки в больницу осталось " + x);
            x--;
            System.out.print("\n");
        } while (x >= 0);

    }

    public static void findSet() {
        for (String a: hashSet) {
            if (a.contains(present1)) {
                System.out.println(present1 + " найден!");
            } else if (a.contains(present2)) {
                System.out.println(present2 + " найдены!");
            }
        }
    }
    public static void removeSet() {
        hashSet.remove(present1);
        hashSet.remove(present2);
        hashSet.remove(present3);
        System.out.println("Пожалуйста!" + hashSet);
    }
}