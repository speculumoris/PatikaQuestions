package day05patika;

import java.util.Arrays;

public class elemanSr {
    //Dizinin boyutu n : 5
    //Dizinin elemanlarını giriniz :
    //1. Elemanı : 99
    //2. Elemanı : -2
    //3. Elemanı : -2121
    //4. Elemanı : 1
    //5. Elemanı : 0
    //Sıralama : -2121 -2 0 1 99
    public static void main(String[] args) {
        int arr[]={99,-2,-2121,1,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
