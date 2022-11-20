package day02Patika;

import java.util.Scanner;

public class PassTheLesson {
    public static void main(String[] args) {
        double math,physics,chemistry,history,turkish,music;
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter math lecture notes");
        math= scan.nextDouble();

        System.out.println("please enter physics lecture notes");
        physics= scan.nextDouble();

        System.out.println("please enter chemistry lecture notes");
        chemistry= scan.nextDouble();

        System.out.println("please enter history lecture notes");
        history= scan.nextDouble();

        System.out.println("please enter turkish lecture notes");
        turkish= scan.nextDouble();

        System.out.println("please enter music lecture notes");
        music= scan.nextDouble();

        double avarageOfLectures=(math+music+physics+chemistry+history+turkish)/7;
        System.out.println("avarage Of Lectures = " + avarageOfLectures);


        if (avarageOfLectures>=55){
            System.out.println("sinifi gecti");
        }else {
            System.out.println("Sinifta kaldi");
        }
    }
}
