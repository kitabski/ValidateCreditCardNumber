package com.kit;

public class Validate {

    public static boolean validate(String n) {
        int sum = 0;
        if (n.length() % 2 == 0) {
            for (int i = 0; i < n.length(); i++) {
                int y = Character.getNumericValue(n.charAt(i));
                if (i % 2 == 0){
                    y = Character.getNumericValue(n.charAt(i)) * 2;
                    if (y>9)
                        y-=9;
                }
                sum+=y;
            }
        } else {
            for (int i = 0; i < n.length(); i++) {
               int y = Character.getNumericValue(n.charAt(i));

                if (i % 2 == 1){
                    y = Character.getNumericValue(n.charAt(i)) * 2;
                    if (y>9)
                        y-=9;
                }
                sum+=y;
            }
        }
        return sum % 10 == 0;
    }
}
