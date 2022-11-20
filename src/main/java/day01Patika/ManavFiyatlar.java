package day01Patika;

import java.util.Scanner;

public class ManavFiyatlar {
    /*
    Manav Kasa Programı
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana
    yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("kac kilo armut aldiniz: ");
        double armut= scan.nextDouble();
        armut*=2.14;

        System.out.print("kac kilo Elma aldiniz: ");
        double elma= scan.nextDouble();
        elma*=3.67;

        System.out.print("kac kilo domates aldiniz: ");
        double domates= scan.nextDouble();
        domates*=1.11;

        System.out.print("kac kilo Muz aldiniz: ");
        double muz= scan.nextDouble();
        muz*=0.95;

        System.out.print("kac kilo Patlıcan aldiniz: ");
        double patlican= scan.nextDouble();
        patlican*=5.00;

        System.out.println("Toplam tutar: "+(armut+elma+domates+muz+patlican));


    }
}
