package day03Patika;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        //please find all prime number between 1-100;
        int sayac=0;
        for (int i = 2; i <101 ; i++) {
            sayac=0;
            for (int j = 1; j <100; j++) {
                if (i%j==0){
                    sayac++;
                }
                if (sayac>2){
                    break;
                }
            }
           if (!(sayac>2)) {
                System.out.print(i+" ");
            }

        }
    }
}
