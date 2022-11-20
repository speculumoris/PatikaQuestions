package day02Patika;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;

        System.out.println("Yıl giriniz : ");
        age = input.nextInt();

        if (age % 100 == 0) {
            if (age % 400 == 0) {
                System.out.println(age + " ARTIK YILDIR");
            } else {
                System.out.println(age + " artık yıl değildir.(400'ün katı olmadığı için)");
            }
        } else if (age % 4 == 0) {
            System.out.println(age + " ARTIK YILDIR");
        } else {
            System.out.println(age + " artık yıl değildir.");
        }

    }
}
