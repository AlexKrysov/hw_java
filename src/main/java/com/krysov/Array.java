package com.krysov;

public class Array {

    public static String[] kfc = {"10 ножек","крылья", "байтсы", "колу", "стрипсы"};

    public static void giveMeFood() {
        for(int i = 0; i < kfc.length;i++ )
        {
            if (kfc[i].equals("10 ножек"))
            {
                System.out.println("дайте мне " + kfc[i]);
            } else if (kfc[i].equals("стрипсы")) {
                System.out.println("дайте мне " + kfc[i]);
            }
            else if (kfc[i].equals("колу")) {
                System.out.println("дайте мне еще " + kfc[i] +" 0.7");
            }
        }
    }
}
