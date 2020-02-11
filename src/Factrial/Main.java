package Factrial;

import java.security.Security;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    try {
        int i, fact = 1;

        Scanner num = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = num.nextInt();

        if (number == 0) {
            fact = 1;
            System.out.println("Factorial of " + number + " is: " + fact);
        } else {
            for (i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + number + " is: " + fact);
        }
    }catch(Exception z)
        {
            System.out.println("ups, something went wrong");
        }

    }
}