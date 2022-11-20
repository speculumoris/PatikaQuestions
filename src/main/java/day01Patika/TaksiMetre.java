package day01Patika;

import java.util.Scanner;

public class TaksiMetre {
    /*
    Taksimetre Programı
  Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

  Taksimetre KM başına 2.20 TL tutmaktadır.
  Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
  Taksimetre açılış ücreti 10 TL'dir.
     */
    public static void main(String[] args) {
        double kmFiyati=2.20,total,acilisUcreti=10;

        Scanner scan=new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden yaziniz: ");
        int km= scan.nextInt();

        total=km*kmFiyati;
        total+=acilisUcreti;
        total=(total<20)?20:total;

        System.out.println("Taksimetre ucreti: "+total);



    }
}
