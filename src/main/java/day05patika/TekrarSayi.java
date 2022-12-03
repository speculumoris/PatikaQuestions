package day05patika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekrarSayi {
    public static void main(String[] args) {
        //Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazınız
        // GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.
        int arr[]={1,2,2,2,2,3,4,4,4,5,6,6,7,7,7,8,8,8,9,9,10,10,12,12,12,12};
        int count=0;
        int kb[]=new int[arr.length];
        int idx=0;

        String a="";
        int b= 0;
        int w= 0;
        for (int x:arr) {
            if (x%2==0){
                kb[idx]+=x;
                idx++;
            }

        }
        System.out.println(Arrays.toString(kb));
        String arr1[]=a.split(" ");
        Arrays.sort(arr1);


        for (int s : kb) {
            if (count >= 2 && w!=(b) ) {
                 w=b;
                System.out.print(w+" ");
            }
            if (b!=s) {
                count = 0;
                b = s;
                count++;
            } else {
                count++;

            }

        }

    }
}
