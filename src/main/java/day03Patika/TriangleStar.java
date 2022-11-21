package day03Patika;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number:");
        int num= scan.nextInt();

        for (int i = 1; i <=num ; i++) {
            for (int j = num-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = num-1 ; i >0 ; i--) {
            for (int j = num-i; j >0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
