package day03Patika;

import java.util.Scanner;

public class PerfectNumber {
    //Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
    // değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
    //
    //Mükemmel Sayı Nedir ?
    //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
    // kendisine eşit olan sayıya mükemmel sayı denir.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please neter a number");
        int sayi= scan.nextInt();
        int a=0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                a+=i;
            }
        }
        if (a==sayi){
            System.out.println("your number is perfect number");
        }else System.out.println("your number is not perfect number");
    }
}
