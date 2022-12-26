package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String s:args) {
            if(s == null)
                return false;
            else if(s.equals("null")){
                return false;
            }
            else if(s.contains(".")){
               if(Double.parseDouble(s) <= 0)){
                    return false;
                }
            }
            else if(s.equals("") || s.equals(" "))
                return false;

            else if(Integer.parseInt(s) <= 0)
                return false;
        }
        return true;
    }
}