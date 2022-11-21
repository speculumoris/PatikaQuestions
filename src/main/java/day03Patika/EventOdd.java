package day03Patika;

import java.util.Scanner;

public class EventOdd {
    public static void main(String[] args) {
        /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

    Ödev
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        Scanner scan = new Scanner(System.in);

        int a = 0;
        int sum = 0;
/*
        do {
            System.out.println("please enter a number");
            a = scan.nextInt();
            if (a < 0) {
                break;
            }
            if (a % 2 == 1) {
                sum += a;
            }
        } while (true);
        System.out.println(sum);

 */

        do {
            System.out.println("please enter a number");
            a = scan.nextInt();
            if (a%2!=0) {
                break;
            }
            if (a%2==0&&a%4==0) {
                sum += a;
            }
        } while (true);
        System.out.println("sum of odd and dividing 4 number :"+sum);



    }
}
