package day03Patika;

import java.util.Scanner;

public class Combination {
    //Ödev
    //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
    // kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    //
    //Java ile kombinasyon hesaplayan program yazınız.
    //
    //Kombinasyon formülü
    //C(n,r) = n! / (r! * (n-r)!)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pleasse enter a number of lenght of Group:");
        int a= scan.nextInt();
        System.out.println("please enter wanted sample size");
        int b= scan.nextInt();
        int sum=1;
        int sample=1;
       /* for (int i = a; i >0 ; i--) {
            if (i==1){
                System.out.print(i);
                sum*=i;
                break;
            }
            System.out.print(i+"*");
            sum*=i;

        }
        System.out.print("="+sum);

        */
        for (int i = a; i >0 ; i--) {
            sum*=i;
        }
        System.out.println("group faktoriel is "+sum);
        for (int i = b; i >0 ; i--) {
            sample*=i;
        }
        int subs=1;
        System.out.println("sample gruop faktoriel "+sample);
        for (int i = (a-b); i >0 ; i--) {
            subs*=i;
        }
        System.out.println("substraction of both number's faktoriel: "+subs);
        System.out.println("the combination is "+(sum/(sample*subs)));













    }
}
