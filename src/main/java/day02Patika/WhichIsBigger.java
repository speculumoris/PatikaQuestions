package day02Patika;

import java.util.Scanner;

public class WhichIsBigger {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first number");
        a = scan.nextInt();
        System.out.println("please enter second number");
        b = scan.nextInt();
        System.out.println("please enter third number");
        c = scan.nextInt();

        if (a > b && a > c){
            if (b>c){
                System.out.println("a > b > c");
            }else System.out.println("a > c > b");
        }else if (b > a && b > c){
            if (a>c){
                System.out.println("b > a > c");
            }else System.out.println("b > c > a");
        }else if (c > b && a < c){
            if (b>a){
                System.out.println("c > b > a");
            }else System.out.println("c > a > b");
        }

    }
}
