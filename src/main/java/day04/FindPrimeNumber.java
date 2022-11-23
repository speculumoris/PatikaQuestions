package day04;

import java.util.Scanner;

public class FindPrimeNumber {
    //Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
    public static void main(String[] args) {
        int choice=0;
        do {
            Scanner scan =new Scanner(System.in);
            System.out.println("please enter a number: ");
           int sayi= scan.nextInt();
            primeNumber(sayi);
            System.out.println("do you want to exit \n" +
                    "to exit press 1 ");
            choice= scan.nextInt();
        }while (choice!=1);

    }

    private static boolean primeNumber(int a) {

     return true;
    }

}
