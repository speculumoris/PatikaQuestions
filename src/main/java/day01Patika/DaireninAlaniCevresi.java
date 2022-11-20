package day01Patika;

import java.util.Scanner;

public class DaireninAlaniCevresi {
    /*
    3)Dairenin Alanını ve Çevresini Hesaplayan Program
    Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

    Alan Formülü : π * r * r;

    Çevre Formülü : 2 * π * r;

    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

    𝜋 sayısını = 3.14 alınız.

    Formül : (𝜋 * (r*r) * 𝛼) / 360

     */
    public static void main(String[] args) {

        int r;
        double pi=3.14;
        Scanner imp = new Scanner (System.in);
        System.out.print("Dairenin yari capsina giciniz:" );
        r=imp.nextInt();
        double alan =pi * r *r;
        double cevre = 2 * pi *r;

        System.out.println("Dainenin alans : " + alan);
        System.out.println("Dairenin Cevresi: "+ cevre);
        System.out.print("lutfen dairenin parcasinin derecesinni giriniz: ");
        double daireDilimiDerecesi=imp.nextDouble();

        double daireDilimiAlani=(pi*(r*r)*daireDilimiDerecesi)/360;

        System.out.println("daireDiliminin alani: "+daireDilimiAlani);

    }

}
