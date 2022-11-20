package day01Patika;

import java.util.Scanner;

public class UserLoginQ {
    public static void main(String[] args) {


    String userName, password;

    Scanner tara = new Scanner(System.in);
        System.out.println("Enter user name: ");
        userName = tara.nextLine();

        System.out.println("Enter your password: ");
        password = tara.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
        System.out.println("You entered!");
        } else {
            System.out.println("User informations are wrong!");
            System.out.println("Do you want to change your password? (yes or no)");
            String yesOrNo = tara.nextLine();
            if (yesOrNo.equals("yes")) {
                System.out.println("Please enter new password: ");
                String newPassword = tara.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Your new password is not created. Try again!");
                } else
                    System.out.println("Your new password is created..");
            }

        }

    }
}

