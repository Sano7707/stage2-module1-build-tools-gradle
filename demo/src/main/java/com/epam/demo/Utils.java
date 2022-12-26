package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String s:args) {
            if(Integer.parseInt(s) < 0)
                return false;
        }
        return true;
    }
}