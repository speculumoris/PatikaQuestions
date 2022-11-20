package day01Patika;

import java.util.Scanner;

public class Hipotenus {
    /*
    1)Dik Üçgende Hipotenüs Bulan Program
  Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

  Ödev
  Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

  Formül
  Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

  𝑢 = (a+b+c) / 2

  Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci kenari giriniz");
        int kenar1= scan.nextInt();
        System.out.println("ikinci kenari giriniz");
        int kenar2= scan.nextInt();
        System.out.println("ucuncu kenari giriniz");
        int kenar3= scan.nextInt();
        int ucgenCevre=(kenar3+kenar2+kenar1)/2;
        int ucgenAlani=ucgenCevre*(ucgenCevre-kenar1)*(ucgenCevre-kenar1)*(ucgenCevre-kenar3);

        System.out.println("ucgenin cevresi: "+ucgenCevre);
        System.out.println("ucgenin alani: "+ucgenAlani);

        double hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("hipotenus degeri: "+(int)hipotenus);
    }

}
