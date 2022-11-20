package day02Patika;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2;

        Scanner tara = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = tara.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = tara.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        int select = tara.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma " + (n1 * n2));
                break;
            case 4:
                if(n2 != 0)
                    System.out.println("Bölme: " + (n1/n2));
                else System.out.println("Bir sayı sıfıra bölünemez.");
                break;
            default:

        }
    }
}
