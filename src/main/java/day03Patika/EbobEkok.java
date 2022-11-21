package day03Patika;

import java.util.ArrayList;
import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
     //Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen girmek istediginiz ilk sayiyi yaziniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen girmek istediginiz ikinci sayiyi yaziniz");
        int sayi2= scan.nextInt();

        ArrayList<Integer>sayiList=new ArrayList<>();
        int i=1;
        do {

            if (sayi1 % i == 0 && sayi2 % i == 0) {
                sayiList.add(i);
                System.out.println(sayiList);
                i++;
            }

        } while (i != sayi1 && i != sayi2);

        System.out.println(sayiList);
        int max=0;
        for (Integer w:sayiList) {
            max=Math.max(max,w);
        }
        System.out.println(max);

    }
}
