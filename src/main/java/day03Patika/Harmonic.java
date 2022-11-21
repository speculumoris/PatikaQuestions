package day03Patika;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        int number;
        double total=0;


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number:");
        number = scan.nextInt();

        for (double i = 1; i <= number; i++) {

            total += 1 / i;
        }
        System.out.println(total);
    }

}
