package com.softserve.itacademy;

public class Util {
    public static String[] getFields(String string) {
        String[] fields = string.split("(: )|(, )");
        return new String[] {
                fields[1],
                fields[3],
                fields[5]
        };
    }
}
