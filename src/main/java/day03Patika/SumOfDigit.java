package day03Patika;

import java.util.Scanner;

public class SumOfDigit {
    //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
    //
    //Örnek : 1643 = 1 + 6 + 4 + 3 = 14
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pleasse enter a number :");
        int a= scan.nextInt();
        int sum=0;
        while (true){
            System.out.print(a%10+"+");
            sum+=a%10;
            a/=10;
            if (a==0){
                break;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
