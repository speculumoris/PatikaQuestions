package day01Patika;

import java.util.Scanner;

public class AvarageOfLessons {
    //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
    // ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
    //
    //Ödev
    //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
    //
    //Not : If ve Else kullanılmayacak...

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

        if (avarageOfLectures>=60){
            System.out.println("sinifi gecti");
        }else {
            System.out.println("Sinifta kaldi");
        }
    }
}

