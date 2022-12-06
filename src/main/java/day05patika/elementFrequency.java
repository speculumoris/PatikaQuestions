package day05patika;

import java.util.Arrays;

public class elementFrequency {
    public static void main(String[] args) {
        //Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
        //Tekrar Sayıları
        //10 sayısı 3 kere tekrar edildi.
        //20 sayısı 4 kere tekrar edildi.
        //5 sayısı 1 kere tekrar edildi.
        int arr[]= {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);
        int count=0;
        int b=0;
        int z=0;
       /* for (int i = 0; i <arr.length ; i++) {
            count=0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>0){
                System.out.println(count+" "+arr[i]);

            }
        }*/
        for (int w : arr) {
            count=0;
            for (int j = 0; j <arr.length ; j++) {
                if (w==arr[j]){
                    count++;
                }
            }


        }
        for (int s : arr) {
            if ( z != (b)) {
                z = b;
                System.out.println(z + " "+ count);
            }
            if (b != s) {
                count = 0;
                b = s;
                count++;
            } else {
                count++;
            }
        }


















        /*
        for (int s : arr) {

            if (b!=s) {
                count = 0;
                b = s;
                count++;
            } else {
                count++;

            } if (count >= 0  ) {
                System.out.println(s+" sayisi "+count+" kadar tekrar etti ");
            }


        }



         */
    }
}
