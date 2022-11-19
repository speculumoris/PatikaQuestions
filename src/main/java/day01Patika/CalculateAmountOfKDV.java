package day01Patika;

import java.util.Scanner;

public class CalculateAmountOfKDV {
    public static void main(String[] args) {
        //KDV Tutarı Hesaplayan Program
        //Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran
        // programı yazın.
        //(Not : KDV tutarını 18% olarak alın)

        //KDV'siz Fiyat = 10;
        //
        //KDV'li Fiyat = 11.8;
        //KDV tutarı = 1.8;
        //Ödev
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        double price,rateOfKdv=0.18;

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter amount of price ");
        price=scan.nextDouble();

        if (price>0 &&price<=1000){
            rateOfKdv=0.18;
        } else if (price>=1000) {
            rateOfKdv=0.08;
        }

        double kdvTutar =price * rateOfKdv;
        double kdvliTutar=price+kdvTutar;
        System.out.println("KDV'li tutar = " + kdvliTutar);






    }
}
