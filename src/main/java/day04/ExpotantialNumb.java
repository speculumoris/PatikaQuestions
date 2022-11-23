package day04;

import java.util.Scanner;

public class ExpotantialNumb {
    public static void main(String[] args) {
        int choice ;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Taban Sayı : ");
            int base = scanner.nextInt();
            System.out.print("Üs Sayı : ");
            int exponent = scanner.nextInt();
            System.out.println("Sonuç : " + pow1(base, exponent));
            System.out.println("Devam Etmek İster Misiniz ? (1- Evet / 2- Hayır)");
            choice = scanner.nextInt();
        }while(choice == 1);
    }

    private static int pow1(int base, int expo) {
        int result =1;
        for (int i = 0; i < expo; i++) {
            result*=base;

        }
        return result;
    }
}
