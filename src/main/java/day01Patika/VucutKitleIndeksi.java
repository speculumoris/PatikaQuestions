package day01Patika;

import java.util.Scanner;

public class VucutKitleIndeksi {
    /*
    Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
    Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen boyunuzu metre cinsinden giriniz: ");
        double boy= scan.nextDouble();

        System.out.println("Lutfen kilonuzu giriniz: ");
        double kilo= scan.nextDouble();

        double kitleIndexi=kilo/(boy*boy);

        System.out.println("kitleIndexi: "+kitleIndexi);
    }


}
