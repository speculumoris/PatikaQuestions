package day04patika;

import java.util.Scanner;

public class Pattern {
    /*
    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
     Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
     Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     N Sayısı : 16
    Çıktısı : 16 11 6 1 -4 1 6 11 16
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("please enter a number: ");
            int sayi = scan.nextInt();
            patternNums(sayi, sayi, 0);
            System.out.println();
            System.out.println("do you want to exit \n" +
                    "to exit press 1 ");
            choice = scan.nextInt();
        } while (choice != 1);


    }

    public static void patternNums(int a, int sayi, int k) {

        int temp = sayi;


        if (a > 0 && k == 0) {
            System.out.print(a + " ");
            a -= 5;
            patternNums(a, sayi, 0);
        } else if (a <= 0) {
            System.out.print(a + " ");
            a += 5;
            patternNums(a, sayi, 1);
        } else if (a > 0 && a <= temp && k == 1) {
            System.out.print(a + " ");
            a += 5;
            patternNums(a, sayi, 1);

        }
    }
}
