package day03Patika;

import java.util.Scanner;

public class HackerRankQ01 {
    //input
    // 2
    //0 2 10
    //5 3 5
    //output
    //2 6 14 30 62 126 254 510 1022 2046
    //8 14 26 50 98
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int n= scan.nextInt();

        int count = a;
        for(int j = 0; j <n; j++){
            count += (int)(Math.pow(2,j) * b);
            System.out.print(count + " ");
        }
        System.out.println();
    }
}
