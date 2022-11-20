package day02Patika;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String userName, password,changePass,newPassword;

        System.out.println("Kullanıcı Adını Giriniz : ");
        userName= input.nextLine();
        System.out.println("Şifrenizi Giriniz : ");
        password= input.nextLine();
        if (userName.equalsIgnoreCase("Yusuf")) {
            if (password.equals("java")) {
                System.out.println("Hoşgeldiniz..");
            }else {
                System.out.println("Hatalı şifre girdiniz, Şifrenizi sıfırlamak istermisiniz ? (evet / hayır)");
                changePass = input.nextLine();
                if (changePass.equalsIgnoreCase("evet")) {
                    System.out.println("Yeni şifrenizi giriniz : ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("java101")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                } else {
                    System.out.println("iyi gunler");
                }
            }
        }



    }
}
