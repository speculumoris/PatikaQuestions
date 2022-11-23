package day03Patika;

import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {
        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
        Scanner scan=new Scanner(System.in);
        System.out.println("girmek istediginiz sayi miktarini giriniz");
        int sayi= scan.nextInt();
        int sayi1= 0;
        int i =0;
        int max=0;
        int min=0;
        while (i<sayi){
            System.out.println("sayiyi giriniz");

            sayi1= scan.nextInt();
            max=Math.max(max,sayi1);
            if (min==0){
                min=sayi1;
            }else {
                min=Math.min(min,sayi1);
            };

            i++;
        }
        System.out.println("max deger: "+max);
        System.out.println("min deger: "+min);

    }
}
