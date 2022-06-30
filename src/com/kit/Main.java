package com.kit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String cardNumber = obj.nextLine();

        if (Validate.validate(cardNumber))
            System.out.println("Your card is valid");
        else
            System.out.println("Your card is invalid");

    }
}

