package day03Patika;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("pleasse enter a number :");
        int a= scan.nextInt();
        System.out.println("please enter a number which is expotantial");
        int b= scan.nextInt();
        int total=1;
        for (int i = 1; i <=b ; i++) {
            total*=a;
        }
        System.out.println(total);

    }
}
