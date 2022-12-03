package day05patika;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        //Dizideki Elemanların Max ve Min Değerlerini Bulan Program
        // Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
        int arr[] = {15,12,788,1,-1,-778,2,0};
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int num=scan.nextInt();
        //arr(arr);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int w:arr) {
            max=Math.max(max,w);
            min=Math.min(min,w);
        }
        int max1=Integer.MAX_VALUE;
        int min1=Integer.MIN_VALUE;
        for (int a:arr) {
            if (num<a){
                max1=Math.min(max1,a);
            }
            if (num>a){
                min1=Math.max(min1,a);
            }
        }
        System.out.println("girilen sayidan sonra en buyuk sayi: "+max1);
        System.out.println("girilen sayidan sonra en kucuk sayi: "+min1);




    }
    public static void arr(int[] a){
        System.out.println(Arrays.stream(a).max());
        System.out.println(Arrays.stream(a).min());
    }
}
