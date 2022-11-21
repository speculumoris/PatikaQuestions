package day03Patika;

import java.util.Scanner;

public class ThreeFour {
    public static void main(String[] args) {
        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int a=scan.nextInt();
        for (int i = 1; i <=a ; i++) {
           if(i%3==0&&i%4==0){
               System.out.print(i+" ");
           }
        }
    }
}
