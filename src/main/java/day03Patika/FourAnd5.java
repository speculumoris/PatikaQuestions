package day03Patika;

import java.util.Scanner;

public class FourAnd5 {
    //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
    //
    //Ödev
    //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pleasse enter a number:");
        int a= scan.nextInt();
        for (int i = 1; i <=a ; i*=4) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i <=a ; i*=5) {
            System.out.print(i+" ");
        }
    }
}
