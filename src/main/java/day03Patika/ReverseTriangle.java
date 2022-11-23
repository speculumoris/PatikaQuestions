package day03Patika;

import java.util.Scanner;

public class ReverseTriangle {
    //Java ile basamak sayısının kullanıcıdan alınan
    // ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int sayi= scan.nextInt();
        for (int i = sayi; i >0 ; i--) {
            for (int j = sayi-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
