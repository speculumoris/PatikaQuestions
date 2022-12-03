package day05patika;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HarmonicAvarage {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=1/numbers[i];
        }
        System.out.println(sum);
        System.out.println(numbers.length/sum);

        mormalAvarage(numbers);


    }
    public static void mormalAvarage(int[] sum){
        System.out.println(Arrays.stream(sum).sum()/ sum.length);//normal avarage
    }
}
