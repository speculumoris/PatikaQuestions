package day02Patika;

import java.util.Scanner;

public class ChineseZodiac {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, kalan;
        String zodyakHoroscop = " ";
        System.out.println("Doğum yılınızı giriniz : ");
        year = input.nextInt();
        kalan = year % 12;

        switch (kalan) {
            case 0:
                zodyakHoroscop = "MAYMUN";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 1:
                zodyakHoroscop = "HOROZ";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 2:
                zodyakHoroscop = "KÖPEK";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 3:
                zodyakHoroscop = "DOMUZ";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 4:
                zodyakHoroscop = "FARE";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 5:
                zodyakHoroscop = "ÖKÜZ";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 6:
                zodyakHoroscop = "KAPLAN";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 7:
                zodyakHoroscop = "TAVŞAN";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 8:
                zodyakHoroscop = "EJDERHA";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 9:
                zodyakHoroscop = "YILAN";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 10:
                zodyakHoroscop = "AT";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;
            case 11:
                zodyakHoroscop = "KOYUN";
                System.out.println("Çin Zodyağı burcunuz : " + zodyakHoroscop);
                break;

            default:
                break;
        }
    }
}
