package day03Patika;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int sayi= scan.nextInt();
        int a=1;
        int b=1;
        int temp=0;
        for (int i = 0; i <sayi ; i++) {
            if (a==1&&b==1){
                System.out.print("0 ");
            }
            temp=a+b;
            System.out.print(a+" ");
            a=b;
            b=temp;
        }
    }
}
