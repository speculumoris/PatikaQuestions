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
            primeNumber(sayi,2);
            System.out.println("do you want to exit \n" +
                    "to exit press 1 ");
            choice= scan.nextInt();
        }while (choice!=1);

    }

    private static boolean primeNumber(int a,int b) {
        if (a==b){
            System.out.println(a+ " sayisi asaldir");
            return true;
        } else if (a%b==0) {
            System.out.println(a+" sayisi asal degildir");
            return false;
        }
        return primeNumber(a,b+1);
    }

}
